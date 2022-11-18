package Potion;

/**
 * Created: 25.01.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Potion {

    private int stir;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;

    public Potion(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }


    public int stir(){
        stir++;
        return stir;
    }

    public boolean isReady() {
        if (stir >= 5) {
            return true;
        }
        else
            return false;
    }

    public int power(){
        if (isReady()) {
            return this.ingredient1.power() + this.ingredient2.power() + this.ingredient3.power() * 2;
        }
        else
            return this.ingredient1.power() + this.ingredient2.power() + this.ingredient3.power();
    }


    public String toString() {
        return "Ingredient : " + this.ingredient1 + ", " +  this.ingredient2 + ", " + this.ingredient3 + "\nPower : " + power() +  "\nReady : " + isReady() + "\n";
    }

    public  static  void  main (String [] args) {
        //  Zutaten  werden  erstellt
        Ingredient  ingredient1 = new  Ingredient("Toad");
        Ingredient  ingredient2 = new  Ingredient("Lizard");
        Ingredient  ingredient3 = new  Ingredient("Spider");
        // set  name of  ingredient1  to "Fly"
        ingredient1.setName("Fly");

        //  Zaubertrank  wird  mit 2 Zutaten  erstellt
        Potion  potion = new  Potion(ingredient1 , ingredient2 , ingredient3);
        //  Zaubertrank  wird  dreimal  umgerührt
        potion.stir();
        potion.stir();
        potion.stir();
        //  Information  ̈uber  den  Zaubertrank  wird  ausgegeben
        System.out.println(potion.toString());
        //  Ingredients: Fly , Lizard , Spider
        // Power: 15
        // Ready: no

        //  Zaubertrank  wird  noch  zwei  mal  umger ̈uhrt
        potion.stir();
        potion.stir();
        //  Informationen  ̈uber  Zaubertrank  wird  erneut  ausgegeben
        System.out.println(potion.toString());
        //  Ingredients: Fly , Lizard , Spider
        // Power: 30
        // Ready: yes
    }
}
