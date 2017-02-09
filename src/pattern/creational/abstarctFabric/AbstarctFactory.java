package pattern.creational.abstarctFabric;

/**
 * Created by innopolis on 17.01.2017.
 */
public class AbstarctFactory implements AbstractMarketFactory {
    @Override
    public Foods deliveryFoods() {
        return new AzbukaFoods();
    }

    @Override
    public Tech importTech() {
        return new AzbukaTech();
    }

    @Override
    public Weapon importWeapon() {
        return new AzbukaWeapon();
    }

    @Override
    public Jewely importJewly() {
        return null;
    }
}
