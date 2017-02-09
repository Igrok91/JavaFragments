package pattern.creational.singleton;

/**
 * Created by innopolis on 28.01.2017.
 */
public class Singelton {

    private Singelton() {}
    static class Nested{
        private static final Singelton instance = new Singelton();
    }
    public Singelton getInstatnce() {
        return Nested.instance;
    }
}
