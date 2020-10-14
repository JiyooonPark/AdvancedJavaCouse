package practice;

public class SemesterTest {
    public static void main(String []args){
        Semester s = new Semester(2020, 1);
        s.setcourses();
        s.setgrades();
        s.calculateGPA();
        s.printInfo();
    }
}
