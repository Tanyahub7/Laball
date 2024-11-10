import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    // Метод для сортування студентов по фаміліїї
    public List<Student> sortStudentsByLastName(List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()))
                .collect(Collectors.toList());
    }

    // Метод для отримання студентів по номеру групи
    public List<Student> getStudentsByGroupNumber(List<Student> students, String groupNumber) {
        return students.stream()
                .filter(student -> student.getGroupNumber().equals(groupNumber))
                .collect(Collectors.toList());
    }

    // Метод для отримання студентів, які народились після певної дати
    public List<Student> getStudentsBornAfter(List<Student> students, LocalDate date) {
        return students.stream()
                .filter(student -> student.getBirthDate().isAfter(date))
                .collect(Collectors.toList());
    }
}
