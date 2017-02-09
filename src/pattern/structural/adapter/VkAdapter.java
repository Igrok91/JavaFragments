package pattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by innopolis on 18.01.2017.
 */
public class VkAdapter implements ISocialWeb {
    @Override
    public List<String> getFriendList(int user_id) {
      return getFriendsVK();
    }

    private List<String> getFriendsVK() {
        List<String> friends = getFriendsVK();
        List<String> result = new ArrayList<>(friends.size());
        for (String f : friends){
            f  =  f.substring(0, f.indexOf("_"));
            result.add(f);
        }
        return result ;

    }

    @Override
    public float getBalance(int userId) {
        return getVKBalance(userId)/getCurrencyCourse();
    }

    public float getVKBalance(int userId) {
        return 100;
    }

    float getCurrencyCourse(){
        return 60;
    }

    @Override
    public void addMoney(double money, int user_id) {
        float result = (float) money *(1 - getMarj());
        addMoneyVK(user_id,result);
    }

    public void addMoneyVK(double money, float user_id) {

    }

    float getMarj() {
        return 0.11f;
    }

/*    @Override
    public double getMoney(int user_id, double sum) {
        return 0;
    }

    @Override
    public boolean sentToWall(int user_id, String message) {
        return false;
    }*/
}
