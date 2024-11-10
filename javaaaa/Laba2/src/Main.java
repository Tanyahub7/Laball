import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення екземплярів студентів
        Student student1 = new Student("Тарас", "Шевченко", "2007-01-15", "S001", "Група 101");
        Student student2 = new Student("Олена", "Бджілка", "2007-02-20", "S002", "Група 101");
        Student student3 = new Student("Андрій", "Шевченко", "2007-03-10", "S003", "Група 101");
        Student student4 = new Student("Роман", "Герасименко", "2007-05-25", "S004", "Група 102");
        Student student5 = new Student("Марія", "Петренко", "2007-04-05", "S005", "Група 102");

        // Створення екземплярів груп
        Group group1 = new Group("Група 101", 2023, "Комп'ютерні науки", "Олександр", "Іванов",
                new ArrayList<>(Arrays.asList(student1, student2, student3)));
        Group group2 = new Group("Група 102", 2023, "Електроніка", "Наталія", "Петрівна",
                new ArrayList<>(Arrays.asList(student4, student5)));

        // Створення списку студентів і груп
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        List<Group> groups = Arrays.asList(group1, group2);

        // Приклад використання сервісів
        StudentService studentService = new StudentService();
        GroupService groupService = new GroupService();
        ExtendedStudentService extendedStudentService = new ExtendedStudentService();

        System.out.println("Сортування студентів за прізвищем:");
        studentService.sortStudentsByLastName(students).forEach(System.out::println);

        System.out.println("\nСтуденти, народжені після 2007-02-01:");
        studentService.getStudentsBornAfter(students, "2007-02-01").forEach(System.out::println);

        System.out.println("\nСтуденти групи 101, відсортовані за прізвищем:");
        extendedStudentService.getSortedStudentsByLastName(students, "Група 101").forEach(System.out::println);

        System.out.println("\nСтуденти, народжені після 2007-02-01, відсортовані за прізвищем:");
        extendedStudentService.getSortedStudentsBornAfter(students, "2007-02-01").forEach(System.out::println);
    }
}
