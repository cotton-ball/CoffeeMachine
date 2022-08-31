package water;

public class Water {
    public int water;
    public int temperature = 100;

    public Water(int water, int temperature) {
        this.water = water;
        this.temperature = temperature;
    }

    public int getWater() {return water;}
    public int getTemperature() {return temperature;}

}
