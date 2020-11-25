package models;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    public Answer(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "text")
    private String text;

    private boolean correct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    public int getId() {
        return id;
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
                "id=" + id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                ", question=" + question +
                '}';
    }

}
