package services;

import java.util.Date;

/**
 * Created by Karol on 24-Nov-2017 at 10:58:51.
 */
public class Session {
    private String nickname;
    private Date loggedOn;

    public Session() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getLoggedOn() {
        return loggedOn;
    }

    public void setLoggedOn(Date loggedOn) {
        this.loggedOn = loggedOn;
    }
}
