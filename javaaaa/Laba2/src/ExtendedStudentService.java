import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExtendedStudentService {

    // Метод для отримання студентів з групи, відсортованих за прізвищем і іменем
    public List<Student> getSortedStudentsByLastName(List<Student> students, String groupNumber) {
        return students.stream()
                .filter(student -> student.getGroupNumber().equals(groupNumber))
                .sorted()
                .collect(Collectors.toList());
    }

    // Метод для отримання студентів, народжених після певної дати, відсортованих за прізвищем та іменем
    public List<Student> getSortedStudentsBornAfter(List<Student> students, String date) {
        LocalDate targetDate = LocalDate.parse(date);
        return students.stream()
                .filter(student -> student.getBirthDate().isAfter(targetDate))
                .sorted(Comparator.comparing(Student::getLastName)
                        .thenComparing(Student::getFirstName)
                        .thenComparing(Student::getStudentId))
                .collect(Collectors.toList());
    }

    // Метод для отримання групи з найбільшою кількістю студентів
    public Group getGroupWithMostStudents(List<Group> groups) {
        return groups.stream()
                .max(Comparator.comparingInt(group -> group.getStudents().size()))
                .orElse(new Group("", 0, "", "", "", List.of()));
    }
}
