package lecture6.Assignment;
//1876166 박지윤 과제 6주차

public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name) {
        super(name);
    }

    @Override
    public void computeGrade() {
        if(getScore()>=70) setGrade("통과");
        else setGrade("과락");
    }
}
