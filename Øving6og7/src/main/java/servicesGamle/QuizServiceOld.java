package servicesGamle;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/question/")
public class QuizServiceOld {
    Map<Integer, QuizServiceOld> questionsList = new Hashtable<Integer, QuizServiceOld>();
    private static String question, answerA, answerB, answerC, answerD, correctAnswer;


    public QuizServiceOld(String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer){
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public static void main(String[] args) {
        Map<Integer, QuizServiceOld> questionsList = new Hashtable<Integer, QuizServiceOld>();
        question = "what";
        answerA = "a";
        answerB = "beautiful";
        answerC = "day";
        answerD = "!";
        correctAnswer = "D";

        //Creating QuizServices
        QuizServiceOld q1 = new QuizServiceOld(question, answerA, answerB, answerC, answerD, correctAnswer);
        //Adding QuizServices to questionsList
        questionsList.put(1, q1);
        //Traversing questionsList
        for (Map.Entry<Integer, QuizServiceOld> entry : questionsList.entrySet()) {
            int key = entry.getKey();
            QuizServiceOld q = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(q.question + "\n" + q.answerA + "\n" + q.answerB + "\n" + q.answerC + "\n" + q.answerD + "\n\nCorrect answer: " + q.correctAnswer);
        }
    }



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getQuestion() {
        return QuizServiceOld.question;
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void setQuestion(String newQuestion) {
        question = newQuestion;
    }
}