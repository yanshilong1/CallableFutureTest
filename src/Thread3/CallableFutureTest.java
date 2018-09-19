package Thread3;


import java.util.concurrent.*;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午1:44
 * @Version 1.0
 */
public class CallableFutureTest {
    public static void main(String[] args) {

        ExecutorService threadpool=Executors.newSingleThreadExecutor();
     // MyCallable mycallable1=new MyCallable();
        Future<Integer> future1=threadpool.submit(new Callable<Integer>() {


            @Override
            public Integer call() throws Exception {

                return 121212;
            }
        });
        threadpool.shutdown();
        try {
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}

        //public class CallableAndFuture2 {
//    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
//        Future<Integer> future = threadPool.submit(new Callable<Integer>() {
//            public Integer call() throws Exception {
//                Thread.sleep(2000);
//                return new Random().nextInt(100);
//            }
//        });
//        threadPool.shutdown();
//        try {
//            System.out.println(future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//    }
//}
