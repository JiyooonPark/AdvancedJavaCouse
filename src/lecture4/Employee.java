package lecture4;

public class Employee {
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public void increaseSalary(){
        salary *=1.3;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void printInfo(){
        System.out.printf("job : %s name : %s salary: %d \n", this.getClass().getSimpleName(), name, salary);
    }
}
