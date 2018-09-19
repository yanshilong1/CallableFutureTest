package Thread2;

import java.util.concurrent.*;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午2:25
 * @Version 1.0
 */
public class CallableFutureTest {



        public static void main(String[] args) {
            UserDao userDao = null;
            //第一种方式
            ExecutorService executor = Executors.newCachedThreadPool();
            Task task = new Task();
            Task1 task1=new Task1(userDao);
            Task2 task2=new Task2();

            FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
           // FutureTask<UserDao> futureTask1=new FutureTask<UserDao>(task1);
            //FutureTask<FanDao> futureTask2=new FutureTask((Callable) task2);



         //   executor.submit(futureTask1);
            executor.submit(futureTask);
            executor.shutdown();

            //第二种方式，注意这种方式和第一种方式效果是类似的，只不过一个使用的是ExecutorService，一个使用的是Thread
        /*Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        Thread thread = new Thread(futureTask);
        thread.start();*/


            System.out.println("主线程在执行任务");

            try {
                System.out.println("task运行结果"+futureTask.get());
            //    System.out.println("task1------"+futureTask1.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            System.out.println("所有任务执行完毕");
        }
    }
    class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println("子线程在进行计算");
           // Thread.sleep(3000);
            int sum = 0;
            for(int i=0;i<100;i++)
                sum += i;
            return sum;
        }
    }

