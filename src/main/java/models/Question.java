package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {

    public Question(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    @Column(name = "text")
    private String text;

    private Integer score;

    private boolean active;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> answerList = new ArrayList<>();

    public Integer getRow_id() {
        return row_id;
    }

    public Integer getScore() {
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
                "id=" + row_id +
                ", text='" + text + '\'' +
                ", score=" + score +
                ", active=" + active +
//                ", answerList=" + answerList +
                '}';
    }
}
