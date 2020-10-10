package lecture2;

public class Student {
    String nation, name, major;
    int age;

    Student(String nation, String name){
        this.nation = nation;
        this.name = name;
    }
    Student(String nation, String name, String major){
        this(nation, name);
        this.major = major;
    }
    Student(String nation, String name, String major, int age){
        this(nation, name, major);
        this.age = age;
    }
    public void printInfo(){
        System.out.printf("nation : %s name : %s major : %s age : %d\n", nation, name, major, age);
    }
}
