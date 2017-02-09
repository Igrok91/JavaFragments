package pattern.structural.adapter;

import java.util.List;

/**
 * Created by innopolis on 18.01.2017.
 */
public interface ISocialWeb {
    List<String> getFriendList(int user_id);
    float getBalance(int userId);
    void addMoney(double money, int user_id);
/*    double getMoney(int user_id, double sum);
    boolean sentToWall(int user_id, String message);*/
}
