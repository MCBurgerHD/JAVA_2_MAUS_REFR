package Barplot;

import java.util.Scanner;

/**
 * Created: 23.11.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Barplot {
    /**
     *
     * @param c das darzustellende Zeichen
     * @param n Anzahl
     * @return Text bestehend aus n Zeichen c
     */
    public static String repeat(char c, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static String drawLabel(String label, int length){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(label.charAt(i));
        }
        String s = sb.toString();
        return s;
    }
    public static String drawBar(String label, int valueInt){
        String balken = null;
        if (valueInt < 0){
            return null;
        }
        else {
            for (int i = 0; i < valueInt; i++) {
                balken += "#";
            }
        }
        return balken;
    }
    public static String drawBar(String label, double valueDouble){
        String balken = null;
        if (valueDouble < 0.0) {
            return null;
        }
        else {
            int valuegreundet = (int) Math.round(valueDouble);
            for (int i = 0; i < valuegreundet*30; i++) {
                balken += "#";
            }
        }
            return balken;
    }

    public static void main(String[] args) {
        System.out.print("Laenge Label : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.print("Laenge Label : ");
        Scanner scanner2 = new Scanner(System.in);
        String label = scanner2.next();
        System.out.print("Laenge Int : ");
        Scanner scanner3 = new Scanner(System.in);
        int valueInt = scanner3.nextInt();
        System.out.print("Laenge Double : ");
        Scanner scanner4 = new Scanner(System.in);
        double valueDouble = scanner4.nextInt();
    }
}
