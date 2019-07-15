package students.service;

import students.repository.Group;

public interface CountInterface {
    int countSuccesfulStudents(Group group);

    int countUnsuccesfulStudents(Group group);
}
