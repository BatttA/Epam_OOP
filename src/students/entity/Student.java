package students.entity;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private StudentProgress studentProgress;

    public Student(int id, String firstName, String lastName, StudentProgress studentProgress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentProgress = studentProgress;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentProgress getStudentProgress() {
        return studentProgress;
    }

    @Override
    public String toString() {
        return "Student" +
                "ID: " + id +
                ", Имя: " + firstName +
                ", Фамилия: " + lastName +
                ", " + studentProgress;
    }
}
