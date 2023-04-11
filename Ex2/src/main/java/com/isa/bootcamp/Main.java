package com.isa.bootcamp;

public class Main {

    public static void main(String[] args) {

Student student1 = new Student("Andrzej", "Kowalski");
Student student2 = new Student("Monika", "Wilczak");

Task task1 = new Task(1,5);
Task task2 = new Task(2, 4);


Score score1 = new Score(task1, student1, task1.getMaxScore(), "Zadanie wykonano bardzo dobrze" );
Score score2 = new Score(task2, student2, task2.getMaxScore(), "zadanie wykonno poprawnie" );

        System.out.println(score1.getScoreStudent().getName() + " "
                + score1.getScoreStudent().getSurname()
                + " otrzymał " + score1.getScorePoints()
                + " za zadanie  + " + score1.getScoreTask().getTaskNumber()
                + " " + score1.getFeedback());

        System.out.println(score2.getScoreStudent().getName() + " "
                + score2.getScoreStudent().getSurname()
                + " otrzymał " + score2.getScorePoints()
                + " za zadanie  + " + score2.getScoreTask().getTaskNumber()
                + " " + score2.getFeedback());
    }
}
