package Aggregation;

public class CourseDriver1 {

    public static void main(String[] args) {
        Textbook textbook = new Textbook("Clean Code",
                "Robert C. Martin", "Pentice Hall");
        Textbook textbook2 = new Textbook("Intro to Programming", "Jon", "Set");

        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Lee", "Franc", "2-1034");

        Course course = new Course("CS3560", instructor, textbook);

        course.print();

        System.out.println();
        System.out.println("Instructor #2 Info:");
        System.out.println("Name: " + instructor2.getFirstName() + " " + instructor2.getLastName());
        System.out.println("Office Number: " + instructor2.getOfficeNumber());

        System.out.println();
        System.out.println("Textbook #2 info:");
        System.out.println("Title: " + textbook2.getTitle());
        System.out.println("Author: " + textbook2.getAuthor());
        System.out.println("Publisher: " + textbook2.getPublisher());

    }
}
