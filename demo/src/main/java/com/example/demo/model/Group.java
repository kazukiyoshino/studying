package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="group")
public class Group {

    @Id
    @Column(name = "group_id")
    @SequenceGenerator(name = "seq_group", sequenceName = "seq_group")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_group")
    private int id;

    private String name;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="group")
    private List<Member> members;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
