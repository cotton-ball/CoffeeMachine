package controller;

import Ingredient.IngredientManager;
import Money.MoneyManager;
import water.WaterManager;

public class DataManager {
    public static boolean moneyCheck(int coffeePrice){
        if(MoneyManager.userInputMoney.getSum()>=coffeePrice) return true;
        return false;
    }

    public static boolean ingredientCheck(int sugar, int cream, int coffeeMix){
        if(IngredientManager.ingredients.getSugar() >= sugar &&
                IngredientManager.ingredients.getCream() >= cream &&
                IngredientManager.ingredients.getCoffeeMix() >= coffeeMix) return true;
        return false;
    }

    public static boolean waterCheck(int water){
        if(WaterManager.waterTank.getWater()>=water) return true;
        return false;
    }

    public static boolean changeStackCheck(){
        MoneyManager.changeStack.setSum();
        if(MoneyManager.userInputMoney.getSum() <= MoneyManager.changeStack.getSum()) return true;
        return false;
    }

}

