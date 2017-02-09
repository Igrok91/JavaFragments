package pattern.creational.abstarctFabric.nested;

import pattern.creational.abstarctFabric.Tech;

/**
 * Created by innopolis on 17.01.2017.
 */
public class ContinentTech extends Tech {
    private boolean  isSale;

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }
}
