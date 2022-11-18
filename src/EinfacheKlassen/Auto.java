package EinfacheKlassen;

/**
 * Created: 14.12.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Auto {
    private String automarke;
    private boolean motorAn;

    public Auto(String automarke){
        this(automarke, false);
    }

    public Auto(String automarke, boolean motorAn){
        this.automarke = automarke;
        this.motorAn = motorAn;
    }

    public void starten(){
        motorAn = true;
    }

    public void abstellen(){
        motorAn = false;
    }
    @Override
    public String toString(){
        return automarke + ", Motor " + (motorAn ? "an" : "aus");
    }
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW");
        Auto a2 = new Auto("Porsche", true);
        System.out.println(a1);
        a1.starten();
        System.out.println(a1);
        System.out.println(a2);
        a2.abstellen();
        System.out.println(a2);

    }
}

