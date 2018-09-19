package Thread3;

import java.util.concurrent.Callable;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午1:47
 * @Version 1.0
 */
public class MyCallable implements Callable {

    private String name;

    MyCallable(String name) {
        this.name = name;
    }

    public Object call() throws Exception {
        return name + "任务返回的内容";
    }

}
