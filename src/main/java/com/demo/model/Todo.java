package com.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class Todo {

    private int id;
    @Size(min=6,message="Enter atleast six characters")
//    @Email(message="Please Enter valid email")
    private String desc;
    private String user;
//    @Future(message="Please select future date")
    private Date targetDate;

    private boolean done;

    public Todo(){

    }
    public Todo(int id, String user, String desc, Date targetDate, boolean done) {
        this.id = id;
        this.desc = desc;
        this.user = user;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", user='" + user + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
