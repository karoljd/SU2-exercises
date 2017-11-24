package services;

/**
 * Created by Karol on 21-Nov-2017 at 09:04:18.
 */
public class Quiz {
    private String name;
    private String startTime;
    private int numOfQuestion;
    private int key;

    public Quiz() {}

    public Quiz(String name, String startTime, int numOfQuestion, int key) {
        this.name = name;
        this.startTime = startTime;
        this.numOfQuestion = numOfQuestion;
        this.key = key;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getNumOfQuestion() {
        return numOfQuestion;
    }

    public void setNumOfQuestion(int numOfQuestion) {
        this.numOfQuestion = numOfQuestion;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
