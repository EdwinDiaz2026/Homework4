package Aggregation;

public class Course {
    private String courseName;
    private Instructor instructor1;
    private Instructor instructor2;
    private Textbook textbook1;
    private Textbook textbook2;

    public Course(String courseName, Instructor instructor1, Textbook textbook1) {
        this.courseName = courseName;
        this.instructor1 = instructor1;
        this.textbook1 = textbook1;
    }

    public void setInstructor1(Instructor instructor1) {
        this.instructor1 = instructor1;
    }

    public void setInstructor2(Instructor instructor2) {
        this.instructor2 = instructor2;
    }

    public void setTextbook1(Textbook textbook1) {
        this.textbook1 = textbook1;
    }

    public void setTextbook2(Textbook textbook2) {
        this.textbook2 = textbook2;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Instructor getInstructor1() {
        return this.instructor1;
    }

    public Instructor getInstructor2() {
        return this.instructor2;
    }

    public Textbook getTextbook1() {
        return this.textbook1;
    }

    public Textbook getTextbook2() {
        return this.textbook2;
    }

    public void print() {
        System.out.println("Course: " + getCourseName() +
                ". Instructor #1: " + instructor1.getFirstName() + " " + instructor1.getLastName() +
                ". Instructor #2: " + instructor2.getFirstName() + " " + instructor2.getLastName() + ".");
        System.out.println("Textbook #1: " + textbook1.getTitle() + " by " + textbook1.getAuthor() + " published by "
                + textbook1.getPublisher());
        System.out.println("Textbook #2: " + textbook2.getTitle() + " by " + textbook2.getAuthor() + " published by "
                + textbook2.getPublisher());
    }
}
