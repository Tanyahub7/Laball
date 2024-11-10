import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final String studentId;
    private final String groupNumber;

    public Student(String firstName, String lastName, String birthDate, String studentId, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.parse(birthDate); // Перетворення у LocalDate
        this.studentId = studentId;
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student other) {
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        int birthDateComparison = this.birthDate.compareTo(other.birthDate);
        if (birthDateComparison != 0) {
            return birthDateComparison;
        }

        return this.studentId.compareTo(other.studentId); // Додаткове порівняння за studentId
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", studentId='" + studentId + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

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

    public String getGroupNumber() {
        return groupNumber;
    }
}
