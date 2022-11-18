package Datentypen;

public class Datentypen {
        public static void main(String[] args) {
            int n = 1000000000;     // eine Milliarde
            System.out.println("Integer Min : " + Integer.MIN_VALUE + "Integer Max : " + Integer.MAX_VALUE);
            System.out.println("Long Min : " + Long.MIN_VALUE + "Long Max : " + Long.MAX_VALUE);
            System.out.println("Double Min : " + Double.MIN_VALUE + "Double Max : " + Double.MAX_VALUE);
            System.out.println("Short Min : " + Short.MIN_VALUE + "Short Max : " + Short.MAX_VALUE);




            System.out.println("Eine Milliarde:  " + n);
            System.out.println("Zwei Milliarden: " + (n + n));
            System.out.println("Drei Milliarden: " + ((long)n + n + n));
        }
    }

