/**
 * Mitglieder: Jilch, Ertl, Hesseling, Krapfenbauer
 * Datum: 21.06.2022
 **/
package CovidContactTracing;

import java.util.Arrays;
import java.util.Random;

public class ContactTracing {
    public static int xyMin = 0;
    public static int xyMax = 10;
    public static String splittingRegex = ";";
    public static String splittingPositionRegex = ",";
    public static String splittingAddressRegex = " ";
    private static String filename = "./Resources/ContactListTestData1";

    public static void main(String[] args) {
        Random rand = new Random();
        Person[] persons = ReadData.readPersonFile(ContactTracing.filename);
        for (Person s:getAllPersonsFromArrayPositiveNegative(persons,false)
             ) {
            System.out.println(s.getFirstname());
        }
    }

    public static Person[] getAllPersonsFromArrayPositiveNegative(Person[] persons, boolean posNeg) {
        Person[] personArrayNew = new Person[persons.length];
        int anzahl = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].isCoronaTestPositiv() == posNeg) {
                personArrayNew[anzahl] = persons[i];
                anzahl++;
            }
        }
        return Arrays.copyOf(personArrayNew, anzahl);
    }

    private static void printList(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p.toString());
        }

    }

    private static int printQuarantineArray(Person[] persons) {
        int anzahl = 0;
        for (Person p : persons) {
            if (p.getQuarantineDirective() == true) {
                System.out.println(p.getFirstname() + " " + p.getLastname());
                anzahl++;
            }
        }
        return anzahl;
    }


    private static boolean personIsAlreadyInArray(Person personToFind, Person[] list) {
        for (int i = 0; i < list.length; i++) {
            if (personToFind == list[i]) {
                return true;
            }
        }
        return false;
    }
}
