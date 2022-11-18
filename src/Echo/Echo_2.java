package Echo;

/**
 * Created: 12.10.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Echo_2 {
    public static void main(String[] args) {
        String str = "dies ist ein test";
        StringBuilder sb = new StringBuilder();
        String[] getrennt = str.split(" ");

        for (int i = getrennt.length-1; i > -1; i--) {
            System.out.print(getrennt[i] + " ");
        }

    }
}
