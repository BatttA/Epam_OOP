package students.entity;

import students.repository.StudentProgress;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private StudentProgress studentProgress;

    public Student(int id, String firstName, String lastName, int mark1, int mark2, int mark3, int mark4) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentProgress = new StudentProgress(mark1, mark2, mark3, mark4);
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

    public StudentProgress getStudentProgressProgress() {
        return studentProgress;
    }

    @Override
    public String toString() {
        return "Student" +
                "ID: " + id +
                ", Имя: " + firstName +
                ", Фамилия: " + lastName;
    }
}
