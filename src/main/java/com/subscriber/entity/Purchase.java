package com.subscriber.entity;

import javax.persistence.*;

@Entity
@Table(name ="purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "msisdn")
    private int msisdn;

    @Column(name = "timest")
    private String timest;

    public Purchase() {
    }

    public Purchase(int msisdn, String timest) {
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
        return "Purchase{" +
                "id=" + id +
                ", msisdn=" + msisdn +
                ", timest='" + timest + '\'' +
                '}';
    }
}
