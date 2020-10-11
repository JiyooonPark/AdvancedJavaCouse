package lecture4;

public class Manager extends Employee {
    int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void increaseSalary() {
        salary *= 1.2;
    }

    @Override
    public void printInfo() {
        System.out.printf("job : %s name : %s salary: %d bonus : %d\n", this.getClass().getSimpleName(), name, salary, bonus);
    }
}
