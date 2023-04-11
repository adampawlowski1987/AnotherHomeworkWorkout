package com.isa.bootcamp;

public class Task {

    private int taskNumber;

    private String taskContent;

    private int maxScore;

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public Task(int taskNumber, int maxScore) {
        this.taskNumber = taskNumber;
        this.maxScore = maxScore;
    }
}
