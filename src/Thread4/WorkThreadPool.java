package Thread4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午3:47
 * @Version 1.0
 */
public class WorkThreadPool {
    public static ExecutorService pool = Executors.newCachedThreadPool();

    public void dowork(Runnable runnable) {
        pool.execute(runnable);
        //  pool.submit(runnable);

    }

}

