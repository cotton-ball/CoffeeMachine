package Ingredient;

public class IngredientManager {

    public static Ingredient ingredients = new Ingredient(100,100,100);


    public static void sendIngredientForNomalCoffee(){
        ingredients.coffeeMix--;
        ingredients.cream--;
        ingredients.sugar--;
    }

    public static void sendIngredientForBlackCoffee(){
        ingredients.coffeeMix -= 2;
    }
}
