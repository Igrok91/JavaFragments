package pattern.creational.singleton;

/**
 * Created by innopolis on 28.01.2017.
 */
public class SingletonSimple {
    private  static SingletonSimple instance;

    private SingletonSimple(){

    }
    public SingletonSimple getInstance() {
        if(instance == null) {
            instance = new SingletonSimple();
        }
        return instance;
    }
}
