package com.subscriber.entity;

import javax.persistence.*;

@Entity
@Table(name ="subscripton")
public class Subscripton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "msisdn")
    private int msisdn;

    @Column(name = "timest")
    private String timest;

    public Subscripton() {
    }

    public Subscripton(int msisdn, String timest) {
        this.msisdn = msisdn;
        this.timest = timest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public String getTimest() {
        return timest;
    }

    public void setTimest(String timest) {
        this.timest = timest;
    }

    @Override
    public String toString() {
        return "Subscripton{" +
                "id=" + id +
                ", msisdn=" + msisdn +
                ", timest='" + timest + '\'' +
                '}';
    }
}
