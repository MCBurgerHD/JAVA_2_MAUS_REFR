package AbstrakteKlassen;

/**
 * Created: 26.04.2022
 * @author Maximilian Ertl
 */

public class FigurMain {
    public static void main(String[] args) {
        char []art = {'k', 'q', 'q', 'q', 'k', 'q', 'k', 'k', 'q', 'q'};
        double []len =  {3.8, 3.6, 2.5, 1.2, 4.5, 3.7, 4.5, 5.2, 3.8, 1.5};
        int index = 0;

        if (art.length == len.length) {
            for (int i = 0; i < art.length; i++) {
                if (art[index] == 'k') {
                    Figur2D kreis = new Kreis();
                }
                else if (art[index] == 'q') {
                    Figur2D quadrat = new Quadrat();
                }
                else {
                    System.out.println("Ungueltig");
                }
            }
        }
    }
}
