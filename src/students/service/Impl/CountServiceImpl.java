package students.service.Impl;

import students.repository.Group;
import students.service.CountInterface;

public class CountServiceImpl implements CountInterface {
    private final int FIVE = 5;
    private final int TWO = 2;

    @Override
    public int countSuccesfulStudents(Group group){
        int quanStudGroup = group.getStudents().length;
        int countSucStud = 0;

        for (int i = 0; i < quanStudGroup; i++){
            int temp = 0;
            for (int j = 0; j < group.getStudents()[i].getStudentProgress().getMarks().length; j++){
                if(group.getStudents()[i].getStudentProgress().getMarks()[j] == FIVE){
                    temp++;
                    if(temp == group.getStudents()[i].getStudentProgress().getMarks().length){
                        countSucStud++;
                    }
                }
            }
        }
        return countSucStud;
    }

    @Override
    public int countUnsuccesfulStudents(Group group){
        int quanStudGroup = group.getStudents().length;
        int countUnsucStud = 0;

        for (int i = 0; i < quanStudGroup; i++){
            for (int j = 0; j < group.getStudents()[i].getStudentProgress().getMarks().length; j++){
                if(group.getStudents()[i].getStudentProgress().getMarks()[j] <= TWO){
                    countUnsucStud++;
                    break;
                }
            }
        }
        return countUnsucStud;
    }
}
