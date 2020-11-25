package models;

import javax.persistence.*;

@Entity
@Table(name = "student_answer")
public class StudentAnswer {

    public StudentAnswer(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
