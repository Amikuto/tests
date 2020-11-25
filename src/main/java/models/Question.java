package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    public Question(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "text")
    private String text;

    private int score;

    private boolean active;

    @OneToMany(mappedBy = "answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> answerList;

    public Integer getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public String getText() {
        return text;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public void addAnswer(Answer answer){
        answer.setQuestion(this);
        answerList.add(answer);
    }

    public void removeAnswer(Answer answer){
        answerList.remove(answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", score=" + score +
                ", active=" + active +
                ", answerList=" + answerList +
                '}';
    }
}
