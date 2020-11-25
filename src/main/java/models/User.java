package models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String first_name;

    private String last_name;

    private String middle_name;

    private String login;

    private String password_hash;

    @OneToOne(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private int group_id;

    private int role_id;

}
