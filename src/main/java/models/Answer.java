package models;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    public Answer(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="row_id")
    private int row_id;

    @Column(name = "text")
    private String text;

    private boolean correct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    public Integer getRow_id() {
        return row_id;
    }

    public String getText() {
        return text;
    }

    public Question getQuestion(){
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + row_id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                ", question=" + question +
                '}';
    }

}
