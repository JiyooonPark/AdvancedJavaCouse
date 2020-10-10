package lecture6.Assignment;
//1876166 박지윤 과제 6주차

import java.util.Scanner;

public class StudentTest {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int score, type;
        System.out.print("학생유형 입력 (학부생=1, 대학원생=2): ");
        type = scanner.nextInt();
        System.out.print("이름 입력: ");
        name = scanner.next();
        System.out.print("점수 입력: ");
        score = scanner.nextInt();
        UndergraduateStudent ud = new UndergraduateStudent(name);
        GraduateStudent gd = new GraduateStudent(name);
        if(type ==1){
            ud.setScore(score);
            ud.setType(type);
            ud.computeGrade();
            System.out.println(ud.showInfo());
        }
        else {
            gd.setScore(score);
            gd.setType(type);
            gd.computeGrade();
            System.out.println(gd.showInfo());
        }


    }
}
