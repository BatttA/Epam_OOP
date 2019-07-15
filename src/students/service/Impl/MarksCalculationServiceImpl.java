package students.service.Impl;

import students.entity.Student;
import students.repository.Group;
import students.service.MarksCalculationInterface;

public class MarksCalculationServiceImpl implements MarksCalculationInterface {
    @Override
    public double averStudentMark(Student student) {
        double averMark = 0;
        double allMarks = 0;
        double quanMarks = student.getStudentProgress().getMarks().length;

        for (int i = 0; i < quanMarks; i++) {
            allMarks += student.getStudentProgress().getMarks()[i];
        }
        averMark = allMarks / quanMarks;
        return averMark;
    }

    @Override
    public double averGroupMark(Group group) {
        double averMarkGroup = 0;
        double allMarks = 0;
        double quanStudGroup = group.getStudents().length;

        for (int i = 0; i < quanStudGroup; i++) {
            allMarks += averStudentMark(group.getStudents()[i]);
        }
        averMarkGroup = allMarks / quanStudGroup;
        return averMarkGroup;
    }
}
