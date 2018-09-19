package risk;

/*
 * Created by zk on 18-9-16.
 */

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        UserDao userDao= RiskReview.riskReview("萨大王的阿中介大的阿的的阿的,四大的房屋大卫大43545,地方价4354355元,的发送买卖协议的三分大赛不一致阿四大,sdsd过户sdada房产asdasdsad交付asdasd",ContractType.SecondHandHousingSales,Party.A);
//
        ArrayList risks = userDao.getRiskList();
        ArrayList suggestions = userDao.getSuggestionList();
        for (Object risk : risks) {
            System.out.println("风险是： "+risk);
        }
        for (Object suggestion : suggestions) {
            System.out.println("建议是： "+suggestion);
        }
        System.out.println(userDao.getText());

//        Pattern pattern = Pattern.compile(".*中介.*房屋.*价.*元.*买卖协议.*不一致.*");
//        Matcher matcher = pattern.matcher("萨大王的阿中介大的阿的的阿的,四大的房屋大卫大43545,地方价4354355元,的发送买卖协议的三分大赛不一致阿四大.\n萨大王的阿中介大的阿的的阿的,四大的房屋大卫大43545,地方价4354355元,的发送买卖协议的三分大赛不一致阿四大");
//        if (matcher.find()){
//            String[] regexx = (".*中介.*房屋.*价.*元.*买卖协议.*不一致.*").split("[.][*]");
//            pattern = Pattern.compile("[^.，。,]*"+regexx[regexx.length-1]+"[^.，。,]*");
////            System.out.println("[^.，。,]*"+regexx[regexx.length-1]+"[^.，。,]*");
//            matcher = pattern.matcher("萨大王的阿中介大的阿的的阿的,四大的房屋大卫大43545,地方价4354355元,的发送买卖协议的三分大赛不一致阿四大.\n萨大王的阿中介大的阿的的阿的,四大的房屋大卫大43545,地方价4354355元,的发送买卖协议的三分大赛不一致阿四大");
//            if (matcher.find()){
//                System.out.println(matcher.group());
//                System.out.println();
//                String newText = matcher.replaceAll(matcher.group()+"hello");
//                System.out.println(newText);
//                System.out.println();
//                System.out.println("萨大王的阿中介大的阿的的阿的,四大的房屋大卫大43545,地方价4354355元,的发送买卖协议的三分大赛不一致阿四大.\n萨大王的阿中介大的阿的的阿的,四大的房屋大卫大43545,地方价4354355元,的发送买卖协议的三分大赛不一致阿四大");
//            }
//        }
    }
}
