package ASCIIArt;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created: 30.11.2021
 * @author Maximilian Ertl
 */

public class ASCIIArt {
    public static void main(String[] args) {
        String[] files = new String[]{"resources/bild1.ascii", "resources/bild2.ascii", "resources/bild3.ascii"};
        for (int i = 0; i < 3; i++) {
            Scanner fromFile = null;
            File filename = new File(files[i]);
            try {
                fromFile = new Scanner(filename);
            } catch (FileNotFoundException e) {
                System.err.println("File not found: " + files[i]);
                return;
            }
            String zeile2 = fromFile.nextLine();
            int laenge2 = zeile2.length();
            int zahl = 1;
            while (fromFile.hasNextLine()) {
                String line = fromFile.nextLine();
                int laenge = line.length();
                if (laenge != laenge2) {
                    System.out.println(filename.getName() + " Error");
                    return;
                } else {
                    zahl++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(filename.getName());
            sb.append(" ok " + laenge2 + " " + zahl);
            System.out.println(sb.toString());
            fromFile.close();
        }
    }
}
