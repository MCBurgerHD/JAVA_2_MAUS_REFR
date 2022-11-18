package Bibliotheksfunktionen;

/**
 * Created: ${Date}
 * @author Maximilian Ertl ($User)
 */

public class Bibliotheksfunktionen {
    public static void main(String[] args) {
        String line = "Java ist ieressant";
        System.out.println(line);
        System.out.println(line.charAt(0));
        System.out.println(line.charAt(line.length()-1));
        System.out.println(line.indexOf("ist"));
        int anfangIst = line.indexOf("ist");
        int endeIst = line.indexOf(" interessant");
        System.out.println(line.substring(anfangIst,endeIst));
    }
}