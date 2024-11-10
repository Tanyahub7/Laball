import java.util.List;

public class Group implements Comparable<Group> {
    private final String groupNumber;
    private final int creationYear;
    private final String department;
    private final String curatorFirstName;
    private final String curatorLastName;
    private final List<Student> students;

    public Group(String groupNumber, int creationYear, String department, String curatorFirstName, String curatorLastName, List<Student> students) {
        this.groupNumber = groupNumber;
        this.creationYear = creationYear;
        this.department = department;
        this.curatorFirstName = curatorFirstName;
        this.curatorLastName = curatorLastName;
        this.students = students;
    }

    @Override
    public int compareTo(Group other) {
        return this.groupNumber.compareTo(other.groupNumber);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber='" + groupNumber + '\'' +
                ", creationYear=" + creationYear +
                ", department='" + department + '\'' +
                ", curatorFirstName='" + curatorFirstName + '\'' +
                ", curatorLastName='" + curatorLastName + '\'' +
                ", students=" + students +
                '}';
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getDepartment() {
        return department;
    }

    public String getCuratorFirstName() {
        return curatorFirstName;
    }

    public String getCuratorLastName() {
        return curatorLastName;
    }

    public List<Student> getStudents() {
        return students;
    }
}
