package ua.kh.yastrebov.inspector.entity;

import java.io.Serializable;

public class IncorrectAnswer implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer incorrectAnswerId;
    
    private Question question;
    
    private String answer;
    
    public IncorrectAnswer(){
    }

    public IncorrectAnswer(Question question, String answer) {
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