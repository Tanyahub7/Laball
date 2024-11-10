import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student.Builder()
                .setFirstName("Тарас")
                .setLastName("Шевченко")
                .setBirthDate(LocalDate.of(2007, 1, 15))
                .setStudentId("S001")
                .setGroupNumber("Група 101")
                .build();

        Student student2 = new Student.Builder()
                .setFirstName("Олена")
                .setLastName("Бджілка")
                .setBirthDate(LocalDate.of(2007, 2, 20))
                .setStudentId("S002")
                .setGroupNumber("Група 101")
                .build();

        // Створити  список студентiв
        List<Student> students = Arrays.asList(student1, student2);

        // Створити обэкт StudentService
        StudentService studentService = new StudentService();

        // Приклад виклику методу getStudentsBornAfter с LocalDate
        System.out.println("\nСтуденти, які народились після 2007-02-01:");
        studentService.getStudentsBornAfter(students, LocalDate.of(2007, 2, 1))
                .forEach(System.out::println);
    }
}
