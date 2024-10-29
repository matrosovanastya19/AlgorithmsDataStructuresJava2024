import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<Integer> grades;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Grades: " + grades;
    }
}
