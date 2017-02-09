package pattern.creational.factoryMethod;

/**
 * Created by innopolis on 17.01.2017.
 */
public class funnyCreator extends Creator {

    @Override
    protected Foods createFoods() {
        return new Milk();
    }
}
