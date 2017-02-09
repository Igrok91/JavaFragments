package pattern.creational.abstarctFabric.nested;

import pattern.creational.abstarctFabric.Weapon;

/**
 * Created by innopolis on 17.01.2017.
 */
public class ContinentWeapon extends Weapon {
    private int safety;

    public int getSafety() {
        return safety;
    }

    public void setSafety(int safety) {
        this.safety = safety;
    }
}
