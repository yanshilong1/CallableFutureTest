package risk;

/*
 * Created by zk on 18-9-15.
 */

public class RiskReview{
    public static UserDao riskReview(String text, ContractType contractType, Party party){
        RiskReviewThread riskReviewThread = new RiskReviewThread(text,contractType,party);
        riskReviewThread.start();
        try {
            riskReviewThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new UserDao(1,1,1,riskReviewThread.getRisks(),riskReviewThread.getSuggestions(),riskReviewThread.getText());
    }
}
