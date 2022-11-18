/**
 * Mitglieder: Jilch, Ertl, Heseling, Krapfenbauer
 * Datum: 21.06.2022
 **/
package CovidContactTracing;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        Person[] per = readPersonFile("Resources/ContactListTestData1");
        for (Person p : per) {

            System.out.println(p);

        }
    }

    private String regex = " ";

    public static Person[] readPersonFile(String filename) {
        int anzahl = 0;
        Person[] personArray = new Person[100];
        try {

            File f = new File(filename);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String str = s.nextLine();
                personArray[anzahl] = Person.validPerson(str, ";", false);
                if (personArray[anzahl] != null) {
                    anzahl++;
                }

                if (personArray.length == anzahl) {
                    personArray = Arrays.copyOf(personArray, anzahl + 1);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden. ");
        }
        return Arrays.copyOf(personArray, anzahl);
    }
}
