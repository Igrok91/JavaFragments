package pattern.creational.factoryMethod.bakery;

import pattern.creational.factoryMethod.Bread;
import pattern.creational.factoryMethod.Creator;
import pattern.creational.factoryMethod.Foods;

/**
 * Created by innopolis on 17.01.2017.
 */
public class MyBakery extends Creator{
    @Override
    protected Foods createFoods() {
        return new Bread();
    }
}
