package EinundAusgabe;

import java.util.Scanner;

public class EinundAusgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatur in Fahrenheit angeben : ");
        double fahrenheit = scanner.nextDouble();
        double celsius = Math.round(5.0 / 9 * (fahrenheit - 32));
        double celsius_2 = 5 / 9.0 * (fahrenheit - 32);
        System.out.println("In Celsius : " + celsius);
        System.out.printf("In Celsius : %.2f",celsius_2);
    }
}
