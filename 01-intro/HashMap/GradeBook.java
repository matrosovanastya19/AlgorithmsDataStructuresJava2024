import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Student> students;

    public GradeBook() {
        this.students = new HashMap<>();
    }

    // Метод для добавления студента
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    // Метод для удаления студента по ID
    public void removeStudent(String id) {
        students.remove(id);
    }

    // Метод для поиска студента по ID
    public Student findStudent(String id) {
        return students.get(id);
    }

    // Метод для вывода всех студентов и их оценок
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the grade book.");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }
}
