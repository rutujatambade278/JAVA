package Core_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<Student> {

    private Long id;
    private String name;

    public Student(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId().compareTo(s2.getId());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student stu1 = new Student(11L, "Rutuja");
        Student stu2 = new Student(12L, "Neha");
        Student stu3 = new Student(10L, "Sejal");

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        System.out.println("Before sorting: " + students);

        // Sorting using Comparator
        Collections.sort(students, new Student(0L, null));

        System.out.println("After sorting: " + students);
    }
}
