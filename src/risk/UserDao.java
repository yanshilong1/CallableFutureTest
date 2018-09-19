package risk;

/*
 * Created by zk on 18-9-16.
 */

import java.util.ArrayList;

public class UserDao {
    private int shencha;
    private int pizhu;
    private int increase;
    private ArrayList riskList;
    private ArrayList suggestionList;
    private String text;
    public UserDao(int shencha, int pizhu, int increase, ArrayList riskList, ArrayList suggestionList,String text) {
        this.shencha = shencha;
        this.pizhu = pizhu;
        this.increase = increase;
        this.riskList = riskList;
        this.suggestionList = suggestionList;
        this.text=text;
    }

    public int getShencha() {
        return shencha;
    }

    public int getPizhu() {
        return pizhu;
    }

    public int getIncrease() {
        return increase;
    }

    public ArrayList getRiskList() {
        return riskList;
    }

    public ArrayList getSuggestionList() {
        return suggestionList;
    }

    public String getText() {
        return text;
    }
}
