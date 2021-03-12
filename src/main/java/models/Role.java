package models;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    public Role(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    @Column(name = "name")
    private String name;

    public Integer getRow_id() {
        return row_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + row_id +
                ", name='" + name + '\'' +
                '}';
    }
}
