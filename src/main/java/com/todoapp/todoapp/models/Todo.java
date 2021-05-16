package com.todoapp.todoapp.models;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @Column(name = "todo_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String title;
    public String description;
    public Timestamp todoCreatedOn;
    public Timestamp todoLastUpdated;
    public String status;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.todoCreatedOn = createdOn;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.todoLastUpdated = lastUpdated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return description;
    }

    public Timestamp getCreatedOn() {
        return todoCreatedOn;
    }

    public Timestamp getLastUpdated() {
        return todoLastUpdated;
    }

    public String getStatus() {
        return status;
    }

}