public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр GradeBook
        GradeBook gradeBook = new GradeBook();

        // Добавляем студентов
        Student student1 = new Student("001", "Ivan");
        student1.addGrade(85);
        student1.addGrade(90);
        gradeBook.addStudent(student1);

        Student student2 = new Student("002", "Maria");
        student2.addGrade(75);
        student2.addGrade(80);
        gradeBook.addStudent(student2);

        // Вывод всех студентов
        System.out.println("All students:");
        gradeBook.displayAllStudents();

        // Поиск студента по ID
        System.out.println("\nFinding student with ID '001':");
        Student foundStudent = gradeBook.findStudent("001");
        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        // Удаление студента
        System.out.println("\nRemoving student with ID '002'.");
        gradeBook.removeStudent("002");

        // Вывод всех студентов после удаления
        System.out.println("\nAll students after removal:");
        gradeBook.displayAllStudents();
    }
}

