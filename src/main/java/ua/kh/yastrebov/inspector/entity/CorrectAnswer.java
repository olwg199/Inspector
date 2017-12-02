package ua.kh.yastrebov.inspector.entity;

import java.io.Serializable;

public class CorrectAnswer implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer correctAnswerId;
    
    private Question question;
    
    private String answer;
    
    public CorrectAnswer(){
    }

    public CorrectAnswer(Question question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}