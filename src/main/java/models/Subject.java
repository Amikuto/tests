package models;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

    public Subject(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + row_id +
                ", name='" + name + '\'' +
                '}';
    }
}
