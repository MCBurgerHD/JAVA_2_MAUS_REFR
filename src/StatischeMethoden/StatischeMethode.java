package StatischeMethoden;

import java.util.Scanner;

/**
 * Created: 9.11.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class StatischeMethode {
    public static void main(String[] args) {
        System.out.print("Text eingeben : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
    }
        public static String sperrSchrift(String s){
            StringBuilder sb = new StringBuilder();
            StringBuilder alterString = new StringBuilder();
            for (int i = 0; i < s.length()-1; i++) {
                sb.append(alterString.charAt(i));
            }
            String insperrschrift = sb.toString();
            System.out.print(insperrschrift);
            return insperrschrift;
        }
}
