package sample;

/**
 * Created by micha on 7/9/2017.
 */
public class Quiz {

    private String question;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private int answer;

    public Quiz(String question, String a1, String a2, String a3, String a4, int correctAnswer) {
        this.question = question;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.answer = correctAnswer;
    }
}
