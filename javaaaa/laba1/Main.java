import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Оновлено для використання LocalDate
        Student student1 = new Student("Тарас", "Шевченко", LocalDate.of(2007, 1, 15), "S001");
        Student student2 = new Student("Олена", "Бджілка", LocalDate.of(2007, 2, 20), "S002");
        Student student3 = new Student("Андрій", "Шевченко", LocalDate.of(2007, 3, 10), "S003");
        Student student4 = new Student("Роман", "Герасименко", LocalDate.of(2007, 5, 25), "S004");
        Student student5 = new Student("Марія", "Петренко", LocalDate.of(2007, 4, 5), "S005");

        Group group1 = new Group.GroupBuilder()
                .setGroupNumber("Група 101")
                .setCreationYear(2023)
                .setDepartment("Комп'ютерні науки")
                .setCuratorFirstName("Олександр")
                .setCuratorLastName("Іванов")
                .setStudents(Arrays.asList(student1, student2, student3))
                .build();

        Group group2 = new Group.GroupBuilder()
                .setGroupNumber("Група 102")
                .setCreationYear(2023)
                .setDepartment("Електроніка")
                .setCuratorFirstName("Наталія")
                .setCuratorLastName("Петрівна")
                .setStudents(Arrays.asList(student4, student5))
                .build();

        Group group3 = new Group.GroupBuilder()
                .setGroupNumber("Група 103")
                .setCreationYear(2024)
                .setDepartment("Математика")
                .setCuratorFirstName("Петро")
                .setCuratorLastName("Сидоренко")
                .build();

        Group group4 = new Group.GroupBuilder()
                .setGroupNumber("Група 104")
                .setCreationYear(2023)
                .setDepartment("Біологія")
                .setStudents(List.of(student1))
                .build();

        // Виведення інформації про всі групи
        System.out.println("Інформація про групу 1:");
        System.out.println(group1);
        System.out.println("\nІнформація про групу 2:");
        System.out.println(group2);
        System.out.println("\nІнформація про групу 3:");
        System.out.println(group3);
        System.out.println("\nІнформація про групу 4:");
        System.out.println(group4);
    }
}
