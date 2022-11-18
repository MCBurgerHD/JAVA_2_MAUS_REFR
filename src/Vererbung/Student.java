package Vererbung;

import java.util.Arrays;

/**
 * Created: 22.02.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Student extends Person {
    private static String pattern = "er";
    private int matrikelnummer;

    public Student(String vorname, String nachname, int matrikelnummer) {
        super(vorname, nachname);
        this.matrikelnummer = matrikelnummer;
    }

    public String getPattern() {
        return pattern;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }


    public static Student[] filterNachname(Student[] studenten, String pattern) {
        int laenge = 0;

        for (int j = 0; j < studenten.length; j++) {
            if (studenten[j].getNachname().contains(pattern)) {
                laenge++;
            }
        }

        Student[] name = new Student[laenge];
        int index = 0;

        for (int i = 0; i < studenten.length; i++) {
            if (studenten[i].getNachname().contains(pattern)) {
                name[index] = studenten[i];
                index++;
            }
        }
        return name;
    }


    public static void main(String[] args) {
        String[] vn = {"Alfred", "Bernd", "Carola", "Dieter", "Erich",
                "Gerda", "Hans", "Jochen", "Karin", "Maike"};

        String[] nn = {"Adler", "Baron", "Claus", "Dimov", "Eliot",
                "Gatti", "Heine", "Jahn", "Kozak", "Miller"};

        int[] mn = {12345, 45671, 23456, 11111, 45667,
                98712, 23456, 65123, 12634, 22222};

        Student[] studenten = new Student[vn.length];

        for (int i = 0; i < vn.length; i++) {
            studenten[i] = new Student(vn[i], nn[i], mn[i]);

        }

        for (int j = 0; j < studenten.length; j++) {
            System.out.println(studenten[j]);
        }

        System.out.println("--------------------------------------------");
        System.out.println(Arrays.toString(filterNachname(studenten, pattern)));
    }
}
