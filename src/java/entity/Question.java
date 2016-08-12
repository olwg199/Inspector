package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Integer questionId;
    
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;
    
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    
    @Column(name = "content")
    private String content;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    private List<CorrectAnswer> correctAnswerList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
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