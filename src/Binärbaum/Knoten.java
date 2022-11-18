package Binärbaum;

import java.io.Serializable;

public class Knoten implements Serializable{
    public String daten;
    public Knoten links, rechts;
    public int grad, xPos , yPos;

    /**
     * Klasse  Konstruktor
     */
    Knoten(String n,int g,int x,int y) {
        daten = n;
        links = null;
        rechts = null;
        grad = g;
        xPos = x;
        yPos = y;
    }
}