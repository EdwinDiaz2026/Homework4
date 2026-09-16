package Aggregation;

public class Course {
    private String courseName;
    private final Instructor instructor;
    private final Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void print() {
        System.out.println("Course: " + getCourseName() +
                ". Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                ". Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor() +
                ". Publisher: " + textbook.getPublisher());
    }
}
