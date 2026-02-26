package students.kennethedelin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Student s1 = new Student(1, "Jordan", "Smith", "jordan.smith@email.com", 2, 3.8);

        Student s2 = new Student(2, "Marcus", "Brown", "marcus.brown@email.com", 1, 2.9);

        Student s3 = new Student(3, "Ava", "Johnson", "ava.johnson@email.com", 3, 3.6);


        Instructor i1 = new Instructor(100, "Dr.", "Kenneth", "dr.rivera@email.com", "Computer Science");

        Instructor i2 = new Instructor(101, "Prof.", "Edelin", "prof.lee@email.com", "Mathematics");


        i1.addStudent(s1);
        i1.addStudent(s2);


        i1.createAnnouncement("Midterm next Friday. Study Chapters 1-5.");

        i1.printRoster();

        System.out.println();


        ArrayList<Person> people = new ArrayList<>();

        people.add(s1);

        people.add(s2);

        people.add(s3);

        people.add(i1);

        people.add(i2);


        for (Person p : people) {

            System.out.println(p.getSummary());
        }
    }
}