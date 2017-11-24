package services;

/**
 * Created by Karol on 13-Sep-2017 at 09:27:35.
 */
public class Player {
    private String nickname;
    private int points;

    public Player(){}

    public Player(String nickname, int points) {
        this.nickname = nickname;
        this.points = points;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickName) {
        this.nickname = nickName;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}