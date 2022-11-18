/**
 * Mitglieder: Jilch, Ertl, Hesseling, Krapfenbauer
 * Datum: 21.06.2022
 **/
package CovidContactTracing;

public class Address {
    private int zip;
    private String City;
    private String State;
    private String Street;

    public Address(int zip, String city, String state, String street) {
        if (Double.isFinite(zip) && zip >= 1000 && zip <= 9999) {
            this.zip = zip;
        }
        City = city;
        State = state;
        Street = street;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getStreet() {
        return Street;
    }

    public String toString(){
        return getStreet() + " " + getZip() + " " + getCity() + getState();
    }
}
