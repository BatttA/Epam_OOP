package students.repository;

import students.entity.Student;

public class Group {
    private Student[] students;


    public Group(int groupQuan) {
        this.students = new Student[groupQuan];
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public Student[] getStudents() {
        return students;
    }
}
