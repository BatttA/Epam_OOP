package students.service;

import students.entity.Student;
import students.repository.Group;

public interface MarksCalculationInterface {
    double averStudentMark(Student student);

    double averGroupMark(Group group);
}
