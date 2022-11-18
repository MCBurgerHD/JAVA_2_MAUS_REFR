/**
 * Mitglieder: Jilch, Ertl, Hesseling, Krapfenbauer
 * Datum: 21.06.2022
 **/
package CovidContactTracing;

import java.util.Arrays;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private char gender;
    private Address address;
    private int svn;    //Sozialversicherungsnummer

    private Position position;
    private boolean coronaTestPositive;

    private boolean quarantineDirective = false;

    private int traceNumber=0;
    private String[] trace = new String[1];



    public Person(String firstname, String lastname, int age, char gender, Address address, int svn, Position position, boolean coronaTestPositive) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.svn = svn;
        this.position = position;
        this.coronaTestPositive = coronaTestPositive;
    }

    public void setQuarantineDirective() {
        quarantineDirective = true;
    }

    public boolean getQuarantineDirective() {
        return quarantineDirective;
    }

    public boolean isCoronaTestPositiv() {
        return coronaTestPositive;
    }

    public Position getPosition() {
        return position;
    }

    public String getAddress() {
        return address.toString();
    }

    public String getTraceNames() {

        if(trace == null){return"";}
        StringBuilder sb = new StringBuilder();
        sb.append("Tracing: ");
        for (String i : trace) {
            sb.append(i + (" -> "));
        }
        sb.delete(sb.length()-8,sb.length());
        sb.append(firstname + " " + lastname);
        return sb.toString();
    }

    public void addTraceName(String name) {
        trace[traceNumber] = name;
        traceNumber++;
        trace = Arrays.copyOf(trace, traceNumber+1);

    }

    public static Person validPerson(String line, String regex, boolean showErrors) {
        String[] data = line.split(regex);
        if (data.length != 8) {
            if(showErrors){
                System.out.println("Zu wenige Einträge oder zu viele Einträge in der Zeile!");
            }
            return null;
        }
        if (data[0].equalsIgnoreCase("positive") || data[0].equalsIgnoreCase("negative")) {
            boolean positiv;
            if (data[0].equalsIgnoreCase("positive")) {
                positiv = true;
            } else {
                positiv = false;
            }
            String[] pos = data[1].split(",");
            if (Integer.parseInt(pos[0]) >= 0 && Integer.parseInt(pos[1]) >= 0 && Integer.parseInt(data[2]) > 0) {
                if (data[3].equals("m") || data[3].equals("f")) {
                    String[] address = data[7].split(" ");
                    int zip = Integer.parseInt(address[2]);
                    String street = address[0] + address[1];
                    String city;
                    String state;
                    if (address.length == 5) {
                        city = address[3];
                        state = address[4];
                    } else if (address.length == 6) {
                        city = address[3] + " " + address[4];
                        state = address[5];
                    } else {
                        if(showErrors){
                            System.out.println("Adresse ungültig!");
                        }
                        return null;
                    }
                    return new Person(data[5], data[6], Integer.parseInt(data[4]), data[3].charAt(0), new Address(zip, city, state, street), Integer.parseInt(data[2]), new Position(Integer.parseInt(pos[0]), Integer.parseInt(pos[1])), positiv);
                } else {
                    if(showErrors){
                        System.out.println("Geschlecht ungültig!");
                    }
                    return null;
                }
            } else {
                if(showErrors){
                    System.out.println("Position ungültig!");
                }
                return null;
            }
        } else {
            if(showErrors){
                System.out.println("Testergebnis ungültig! ");
            }
            return null;
        }
    }

    public char getGender() {
        return gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        String ergebnis;
        if (coronaTestPositive) {
            ergebnis = "POSITIV";
        } else {
            ergebnis = "NEGATIV";
        }
        return firstname + " " + lastname + " " + ergebnis;
    }
}
