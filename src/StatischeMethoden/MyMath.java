package StatischeMethoden;

import java.util.Scanner;

/**
 * Created: 9.11.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class MyMath {
    public static void main(String[] args) {
        System.out.print("1.Zahl eingeben : ");
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        System.out.print("2.Zahl eingeben : ");
        Scanner scanner2 = new Scanner(System.in);
        int zahl2 = scanner2.nextInt();
        System.out.print("3.Zahl eingeben : ");
        Scanner scanner3 = new Scanner(System.in);
        int zahl3 = scanner3.nextInt();
        int max = 0;
        if (zahl > zahl2) {
            max = zahl;
        }
        if (zahl2 > zahl) {
            max = zahl2;
        }
        if (zahl3 > max){
            max = zahl3;
        }
        else{
            System.out.print(max);
        }
    }
}
