package lecture4;

public class CompanyTest {
    public static void main(String [] args){
        Employee e = new Employee("rachel", 300);
        Manager m = new Manager("monica", 400, 45);
        Executive p = new Executive("phibie", 600, 70, 200);

        int year =2020;
        int endYear = 2030;

        for(int i=year; i<endYear; i++){
            printInfo(e, m, p, i);
        }
    }
    public static void printInfo(Employee e, Manager m, Executive p, int year){
        e.increaseSalary();
        m.increaseSalary();
        p.increaseSalary();
        System.out.printf("=================%d===================\n", year);
        e.printInfo();
        m.printInfo();
        p.printInfo();
    }
}
