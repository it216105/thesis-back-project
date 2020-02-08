package com.back.thesis.database.Back.end.store.database.dto;

import javax.persistence.Column;
import java.util.List;

public class Thesis {
    private long id;
    private String firstName;
    private String lastName;
    private String teacher;
    private String type;
    private String subject;
    private List<String> keyWords;

    public Thesis() {
    }

    public Thesis(long id, String firstName, String lastName, String teacher, String type, String subject, List<String> keyWords) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacher = teacher;
        this.type = type;
        this.subject = subject;
        this.keyWords = keyWords;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }
}
