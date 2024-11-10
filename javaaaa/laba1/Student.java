import java.time.LocalDate;
import java.util.Objects;

/**
 * Представляє студента з особистою інформацією.
 */
public class Student {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate; // Змінено на LocalDate
    private final String studentId;

    public Student(String firstName, String lastName, LocalDate birthDate, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +  // LocalDate за замовчуванням форматуватиме дату
                ", studentId='" + studentId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(birthDate, student.birthDate) &&
                Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, studentId);
    }

    // Геттери для доступу до полів
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getStudentId() {
        return studentId;
    }
}
