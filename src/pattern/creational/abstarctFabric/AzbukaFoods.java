package pattern.creational.abstarctFabric;

import java.util.Random;

/**
 * Created by innopolis on 17.01.2017.
 */
public class AzbukaFoods extends Foods {
    private double veryPrice;

    public double getVeryPrice() {
        return veryPrice;
    }

    public void setVeryPrice(double veryPrice) {
        this.veryPrice = veryPrice;
    }

    public void setRandomPrice(){
        Random random = new Random();
        this.veryPrice = random.nextDouble();
    }
}
