package ua.kh.yastrebov.inspector.entity;

import java.io.Serializable;
import java.util.List;

public class Topic implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer topicId;
    
    private String name;
    
    private List<Question> questionList;
    
    public Topic() {
    }

    public Topic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}