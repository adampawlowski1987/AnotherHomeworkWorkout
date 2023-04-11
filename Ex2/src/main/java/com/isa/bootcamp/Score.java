package com.isa.bootcamp;

public class Score {

    private Task scoreTask;

    private Student scoreStudent;

    private int scorePoints;

    private String  feedback;


    public Task getScoreTask() {
        return scoreTask;
    }

    public void setScoreTask(Task scoreTask) {
        this.scoreTask = scoreTask;
    }

    public Student getScoreStudent() {
        return scoreStudent;
    }

    public void setScoreStudent(Student scoreStudent) {
        this.scoreStudent = scoreStudent;
    }

    public int getScorePoints() {
        return scorePoints;
    }

    public void setScorePoints(int scorePoints) {
        this.scorePoints = scorePoints;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Score(Task scoreTask, Student scoreStudent, int scorePoints, String feedback) {
        this.scoreTask = scoreTask;
        this.scoreStudent = scoreStudent;
        this.scorePoints = scorePoints;
        this.feedback = feedback;
    }
}
