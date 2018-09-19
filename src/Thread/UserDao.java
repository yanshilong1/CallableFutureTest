package Thread;

/**
 * @Author: yanshilong
 * @Date: 18-9-6 下午11:04
 * @Version 1.0
 */
public class UserDao {
    private int userid;
    private  String meaaage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    private String type;
    private int state;
    private String one;
    private  String another;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getMeaaage() {
        return meaaage;
    }

    public void setMeaaage(String meaaage) {
        this.meaaage = meaaage;
    }
}
