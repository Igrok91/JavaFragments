package pattern.creational.abstarctFabric.nested;

import pattern.creational.abstarctFabric.*;

/**
 * Created by innopolis on 17.01.2017.
 */
public class ContinentFactory implements AbstractMarketFactory {
    @Override
    public Foods deliveryFoods() {
        return null;
    }

    @Override
    public Tech importTech() {
        return null;
    }

    @Override
    public Weapon importWeapon() {
        return null;
    }

    @Override
    public Jewely importJewly() {
        return null;
    }
}
