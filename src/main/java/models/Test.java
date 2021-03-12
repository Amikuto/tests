package models;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test {

    public Test(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;


}
