package water;

public class WaterManager {
    public static Water waterTank = new Water(100,100);

    void makeCoffee(){
        waterTank.water --;
    }
}
