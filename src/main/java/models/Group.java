package models;

import javax.persistence.*;

@Entity
@Table(name = "group")
public class Group {

    public Group(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int row_id;

    @Column(name = "name")
    private String name;

    private Integer year;

    private Integer semester;

    public Integer getRow_id() {
        return row_id;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + row_id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", semester=" + semester +
                '}';
    }
}
