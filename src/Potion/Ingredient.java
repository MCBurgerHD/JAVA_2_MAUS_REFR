package Potion;

/**
 * Created: 25.01.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */
public class Ingredient {

    private String ingredient;


    public Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public String toString(){
        return ingredient;
    }

    public String setName(String name) {
        return this.ingredient = name;
    }

    public int power() {
        return this.ingredient.length();
    }
}
