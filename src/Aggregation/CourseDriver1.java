package Aggregation;

public class CourseDriver1 {

    public static void main(String[] args) {
        Textbook textbook = new Textbook("Clean Code",
                "Robert C. Martin", "Pentice Hall");
        Textbook textbook2 = new Textbook("Intro to Programming", "Jon", "Set");

        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Lee", "Franc", "2-1034");

        Course course = new Course("CS3560", instructor, textbook);

        course.setInstructor2(instructor2);
        course.setTextbook2(textbook2);

        course.print();


    }
}
