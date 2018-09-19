package Thread4;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午3:51
 * @Version 1.0
 */
public class Test {
    public FanDao doRun(UserDao userDao){
        final Thread4.FanDao[] fanDao = {new FanDao()};

        Runnable run=new Runnable() {
            @Override
            public void run() {
              fanDao[0] =new Find().FindJiekuan(userDao);

            }
        };
        WorkThreadPool.pool.submit(run);

        return fanDao[0];

    }
}
