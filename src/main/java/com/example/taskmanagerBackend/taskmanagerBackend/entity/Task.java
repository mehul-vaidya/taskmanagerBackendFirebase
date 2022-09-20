package com.example.taskmanagerBackend.taskmanagerBackend.entity;

public class Task {

    private Long id;
    private String text;
    private String day;
    private Boolean reminder;

    public Task() {
    }
    public Task(String text, String day, Boolean reminder) {
        this.text = text;
        this.day = day;
        this.reminder = reminder;
    }
    public Task(Long id, String text, String day, Boolean reminder) {
        this.id = id;
        this.text = text;
        this.day = day;
        this.reminder = reminder;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }

    public Boolean getReminder() {
        return reminder;
    }
    public void setReminder(Boolean reminder) {
        this.reminder = reminder;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", day='" + day + '\'' +
                ", reminder=" + reminder +
                '}';
    }
}
