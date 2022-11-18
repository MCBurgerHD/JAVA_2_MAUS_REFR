package Speaker;

/**
 * Created: 24.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker[] array = new Speaker[100];
        int maxausfuren = 0;
        for (int i = 0; i < 100; i++) {
            double random = Math.random();
            if (random == 0.5 && maxausfuren < 5) {
                array[i] = new Person("Muted");
                maxausfuren++;
            }
            if (random <= 0.3) {
                array[i] = new Person("Hallo");
            }
            if (random > 0.3 && random <= 0.6) {
                array[i] = new Dog("Bark");
            }
            if (random > 0.6) {
                array[i] = new Cat("Meow");
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j].toString());
        }
    }
}
