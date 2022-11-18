package Echo;
import java.util.Random;

/**
 * Created: 12.10.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Arrays {
    public static void main(String[] args) {
        int randomZahl;
        Random random = new Random();
        int [] groesse = new int[100];
        for (int i = 0; i < (groesse.length); i++) {
            randomZahl = random.nextInt(10000-1000)+1000;
            groesse[i] = randomZahl;
        }
        int min = groesse[0];
        int max = groesse[0];
        for (int i : groesse) {
            if (i < min){
                min = i;
            }
            else;
            max = i;
        }
        System.out.println("Max : "+max);
        System.out.print("Min : " + min);
    }
}
