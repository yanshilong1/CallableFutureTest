package Thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * @Author: yanshilong
 * @Date: 18-9-19 下午11:56
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
      UserDao userDao=new UserDao();
      userDao.setMeaaage("贷款方：_____________\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　借款方：_____________\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　一、借款用途\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　二、借款金额\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　借款方向贷款方借款人民币__________元。\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　三、借款利息\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　自支用贷款之日起，按实际支用数计算利息，并计算复利。在合同规定的借款期内，年利为_____%.借款方如果不按期归还款，逾期部分加收利率_____%.\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　四、借款期限\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　借款方保证从_____年_____月起至_____年_____月止，按本合同规定的利息偿还借款。贷款逾期不还的部分，贷款方有权限期追回贷款。\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　五、保证条款\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　（一）借款方用__________________做抵押，到期不能归还贷款方的贷款，贷款方有权处理抵押品。借款方到期如数归还贷款的，抵押权消灭。\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　（二）借款方必须按照借款合同规定的用途使用借款，不得挪作他用，不得用借款进行违法活动。\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　（三）借款方必须按合同规定的期限还本付息。\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　（四）乙方还款保证人____________，为确保本契约的履行，愿与乙方负连带返还借款本息的责任。\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　六、合同争议的解决方式\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　双方协商解决，解决不成，同意提交_______区人民法院（选择性条款不得违反地域管辖和级别管辖，可选择原告、被告、标的物、合同签订地、合同履行地）\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　七、本合同自__________________生效。本合同一式两份，双方各执一份，合同文本具有同等法律效力。\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　甲方（签字、盖章）______________ 　　乙方（签字、盖章）______________\\n\" +\n" +
              "                \"\\n\" +\n" +
              "                \"　　合同签订日期______________ 　　合同签订日期______________");


      CallableFuture future=new CallableFuture();

        try {
            UserDao return1=future.doCallabkefuture(userDao);



            System.out.println(return1.getType());





        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
