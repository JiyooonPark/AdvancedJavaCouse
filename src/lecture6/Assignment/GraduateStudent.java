package lecture6.Assignment;
//1876166 박지윤 과제 6주차
public class GraduateStudent extends Student{
    public GraduateStudent(String name) {
        super(name);
    }

    @Override
    public void computeGrade() {
        //System.out.println(getGrade());
        if(getScore()>=80) setGrade("통과");
        else setGrade("과락");
    }
}
