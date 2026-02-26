package students.kennethedelin;

import java.util.ArrayList;

public class Instructor extends Person {

    private String department;

    private ArrayList<Student> assignedStudents;


    public Instructor(int id, String firstName, String lastName, String email, String department) {

        super(id, firstName, lastName, email);

        this.department = department;

        this.assignedStudents = new ArrayList<>();
    }

    public String getDepartment() {

        return department;
    }

    public void createAnnouncement(String message) {

        System.out.println("[Announcement from " + getFullName() + "] " + message);

    }

    public void addStudent(Student student) {

        if (student == null) return;

        assignedStudents.add(student);
    }

    public void printRoster() {

        System.out.println(getFullName() + "'s Roster:");

        for (Student s : assignedStudents) {

            System.out.println("  - " + s.getFullName()

                    + " | Grade Level: " + s.getGradeLevel()

                    + " | GPA: " + String.format("%.1f", s.getGpa()));
        }
    }

    @Override
    public String getSummary() {

        return "[Instructor] " + getFullName()

                + " | Department: " + department;
    }
}