package ua.kh.yastrebov.inspector.entity;

import java.io.Serializable;
import java.util.List;

public class Question implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer questionId;
    
    private Topic topic;
    
    private Author author;
    
    private String content;
    
    private List<CorrectAnswer> correctAnswerList;
    
    private List<IncorrectAnswer> incorrectAnswerList;
    
    public Question(){
    }

    public Question(Topic topic, Author author, String content, List<CorrectAnswer> correctAnswerList, List<IncorrectAnswer> incorrectAnswerList) {
        this.topic = topic;
        this.author = author;
        this.content = content;
        this.correctAnswerList = correctAnswerList;
        this.incorrectAnswerList = incorrectAnswerList;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<CorrectAnswer> getCorrectAnswerList() {
        return correctAnswerList;
    }

    public void setCorrectAnswerList(List<CorrectAnswer> correctAnswerList) {
        this.correctAnswerList = correctAnswerList;
    }

    public List<IncorrectAnswer> getIncorrectAnswerList() {
        return incorrectAnswerList;
    }

    public void setIncorrectAnswerList(List<IncorrectAnswer> incorrectAnswerList) {
        this.incorrectAnswerList = incorrectAnswerList;
    }
}