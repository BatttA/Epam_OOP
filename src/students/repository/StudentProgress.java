package students.repository;

public class StudentProgress {
    private int[] marks = new int[4];

    public StudentProgress(int mark1, int mark2, int mark3, int mark4){
        this.marks[0] = mark1;
        this.marks[1] = mark2;
        this.marks[2] = mark3;
        this.marks[3] = mark4;
    }

    public int[] getMarks(){
        return marks;
    }
}
