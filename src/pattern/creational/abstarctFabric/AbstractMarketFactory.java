package pattern.creational.abstarctFabric;

/**
 * Created by innopolis on 17.01.2017.
 */
public interface AbstractMarketFactory {
    Foods deliveryFoods();
    Tech importTech();
    Weapon importWeapon();
    Jewely importJewly();

}
