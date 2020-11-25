package models;

import javax.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule {

    public Schedule(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "duration")
    private int duration;

    private String start_dt;

    private String start_time;

    private String end_dt;

    private String end_time;

    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Test test;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;
}
