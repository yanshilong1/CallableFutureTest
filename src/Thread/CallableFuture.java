package Thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午11:43
 * @Version 1.0
 */
public class CallableFuture {

    public UserDao doCallabkefuture(UserDao user) throws ExecutionException, InterruptedException {
        ArrayList<UserDao> arrayList1=new ArrayList(1);
        ArrayList<UserDao> arrayList2=new ArrayList(1);
       UserDao ruserDao=new UserDao();
        ExecutorService executor = Executors.newCachedThreadPool();

        Task1 task1=new Task1(user);//创建人物
       // FutureTask<UserDao> futureTask1=new FutureTask<UserDao>(task1);
        //节返回之
        FutureTask<UserDao> futureTask1=new FutureTask<UserDao>(task1);

        executor.submit(futureTask1);
        executor.shutdown();
        executor.shutdownNow();

        System.out.println("已经提交完毕");
        try {
            //人物1=============================================================
            System.out.println("返回之是 "+futureTask1.get());
            UserDao userDao1=futureTask1.get();
            if (userDao1.getState()==1){
            arrayList1.add(userDao1);}

          //2==================================================








            ruserDao=(UserDao) arrayList1.get(0);






        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }






        return ruserDao;
    }

}
