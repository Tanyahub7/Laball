import java.util.ArrayList;
import java.util.List;

/**
 * Represents a group of students.
 */
public class Group {
    private final String groupNumber;
    private final int creationYear;
    private final String department;
    private final String curatorFirstName;
    private final String curatorLastName;
    private final List<Student> students;

    private Group(GroupBuilder builder) {
        this.groupNumber = builder.groupNumber;
        this.creationYear = builder.creationYear;
        this.department = builder.department;
        this.curatorFirstName = builder.curatorFirstName;
        this.curatorLastName = builder.curatorLastName;
        this.students = builder.students != null ? new ArrayList<>(builder.students) : new ArrayList<>();
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

    // Getters
    public String getGroupNumber() { return groupNumber; }
    public int getCreationYear() { return creationYear; }
    public String getDepartment() { return department; }
    public String getCuratorFirstName() { return curatorFirstName; }
    public String getCuratorLastName() { return curatorLastName; }
    public List<Student> getStudents() { return new ArrayList<>(students); }

    // Builder class for Group
    public static class GroupBuilder {
        private String groupNumber;
        private int creationYear;
        private String department;
        private String curatorFirstName;
        private String curatorLastName;
        private List<Student> students;

        public GroupBuilder setGroupNumber(String groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public GroupBuilder setCreationYear(int creationYear) {
            this.creationYear = creationYear;
            return this;
        }

        public GroupBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public GroupBuilder setCuratorFirstName(String curatorFirstName) {
            this.curatorFirstName = curatorFirstName;
            return this;
        }

        public GroupBuilder setCuratorLastName(String curatorLastName) {
            this.curatorLastName = curatorLastName;
            return this;
        }

        public GroupBuilder setStudents(List<Student> students) {
            this.students = students;
            return this;
        }

        public Group build() {
            return new Group(this);
        }
    }
}
