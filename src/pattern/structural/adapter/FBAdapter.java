package pattern.structural.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by innopolis on 18.01.2017.
 */
public class FBAdapter implements ISocialWeb{
    @Override
    public List<String> getFriendList(int user_id) {
        return getFbFriends(user_id);
    }

    public List<String> getFbFriends(int user_id) {
        Map<Integer,String> mapFb = getData();
        List<String> list = new ArrayList<>();

        for(Map.Entry<Integer,String> entry : mapFb.entrySet()) {
            if(entry.getKey().intValue() == user_id && !entry.getValue().isEmpty() && getBalance(user_id) > 0) {
                list.add(entry.getValue());
            }
        }
        return list;
    }

    private boolean Auth(int user_id, Map<Integer, String> mapFb) {
        return false;
    }

    private Map<Integer,String> getData() {
        Map<Integer,String> mapFb = new HashMap<>();
        mapFb.put(1, "igor");
        mapFb.put(2, "");
        return  mapFb;
    }



    @Override
    public float getBalance(int userId) {
        return getFBBalance(userId)/getCurrencyCourse();
    }

    public float getFBBalance(int userId) {
        return 100;
    }

    float getCurrencyCourse(){
        return 60;
    }

    @Override
    public void addMoney(double money, int user_id) {
        float result = (float) money *(1 - getMarj());
        addMoneyFB(user_id,result);
    }

    public void addMoneyFB(double money, float user_id) {

    }

    float getMarj() {
        return 0.1f;
    }
}
