package Ingredient;

public class Ingredient {
    int sugar;
    int cream;
    int coffeeMix;

    public Ingredient(int sugar, int cream, int coffeeMix) {
        this.sugar = sugar;
        this.cream = cream;
        this.coffeeMix = coffeeMix;
    }

    public int getSugar() { return sugar; }
    public int getCream() { return cream;}
    public int getCoffeeMix() { return coffeeMix;}
}

