package students.kennethedelin;

import java.util.ArrayList;

public class School {

    private ArrayList<Student> students;

    private ArrayList<Instructor> instructors;

    public School() {

        this.students = new ArrayList<>();

        this.instructors = new ArrayList<>();
    }

    public void addStudent(Student student) {

        if (student == null) return;

        students.add(student);
    }

    public void addInstructor(Instructor instructor) {

        if (instructor == null) return;

        instructors.add(instructor);
    }

    public void printDirectory() {

        System.out.println("=== SCHOOL DIRECTORY ===");

        System.out.println("\nStudents:");

        for (Student s : students) {

            System.out.println(" - " + s.getSummary());
        }

        System.out.println("\nInstructors:");

        for (Instructor i : instructors) {

            System.out.println(" - " + i.getSummary());
        }

        System.out.println("========================");
    }
}