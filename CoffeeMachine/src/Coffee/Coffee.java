package Coffee;

import Ingredient.Ingredient;

public class Coffee extends Ingredient {
    int water;
    int price;
    String typeOfCoffee;


    public Coffee(int sugar, int cream, int coffeeMix, int water, int price, String typeOfCoffee) {
        super(sugar, cream, coffeeMix);
        this.water = water;
        this.price = price;
        this.typeOfCoffee = typeOfCoffee;
    }

    public void setWater(int water) { this.water = water;}
    public void setPrice(int price) {this.price = price;}
    public void setTypeOfCoffee(String typeOfCoffee) {this.typeOfCoffee = typeOfCoffee;}
    public int getWater() {return water;}
    public int getPrice() {return price;}
    public String getTypeOfCoffee() {return typeOfCoffee;}
}
