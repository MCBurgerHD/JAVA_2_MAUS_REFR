package Echo;

/**
 * Created: 12.10.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Echo_3 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        char array[] = new char[args.length];

        for (int i = args.length - 1; i > -1; i--) {
            sb.append(array);
        }
        str = sb.toString();
        System.out.println(str.substring(1) + str.charAt(0));
    }
}

