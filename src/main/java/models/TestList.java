package models;

import javax.persistence.*;

@Entity
@Table(name = "test_list")
public class TestList {

    public TestList(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
}
