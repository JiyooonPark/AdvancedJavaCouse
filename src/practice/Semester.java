package practice;

import java.util.Scanner;

public class Semester {
    private static final int MAX_COURSES = 9;
    int year, sem, course;
    String courses[];
    double grades[];
    double GPA;
    Scanner scanner = new Scanner(System.in);

    Semester(int year, int sem){
        this.year = year;
        this.sem = sem;
        courses = new String[MAX_COURSES];
        grades = new double[MAX_COURSES];
    }
    void setcourses(){
        System.out.println("how many courses did you take this semester?");
        course = scanner.nextInt();
        for(int i=0; i<course ; i++){
            System.out.print("course "+ (i+1)+" : ");
            courses[i] = scanner.nextLine();
        }
    }
    void setgrades(){
        for(int i=0; i<course; i++){
            System.out.printf("%d : %s's grade : ", i+1, courses[i]);
            grades[i] = scanner.nextDouble();
        }
    }
    void calculateGPA(){
        double total=0;
        for(int i=0; i<course; i++){
            total += grades[i];
        }
        GPA = total/course;
    }
    void printInfo(){
        System.out.printf("%d - %d : \n", year, sem);
        for(int i=0; i<course; i++){
            System.out.println(courses[i] +" : "+grades[i]);
        }
        System.out.println("GPA : "+GPA);
    }
}
