package Thread2;

import java.util.concurrent.Callable;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午2:26
 * @Version 1.0
 */
public class Task1 implements Callable<UserDao> {
       UserDao user;
    Task1 (UserDao user) {
        this.user=user;
    }
    @Override
    public UserDao call() throws Exception {

        String message=user.getMeaaage();


        return user;
    }
}
