package Bibliotheksfunktionen;

/**
 * Created: 6.10.2021
 * @author Maximilian Ertl
 */

public class Bibliotheksfunktionen2 {
    public static void main(String[] args) {
        String line = "This is the Mississippi River";
        int i = 6;
        int position = 0;
        while (i > 0) {
            System.out.println(line.indexOf("s",position));
            position += 4;
            i -= 1;
        }
    }
}
