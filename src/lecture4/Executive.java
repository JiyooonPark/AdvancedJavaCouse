package lecture4;

public class Executive extends Manager{
    int stock;

    Executive(String name, int salary, int bonus, int stock) {
        super(name, salary, bonus);
        this.stock = stock;
    }

    @Override
    public void increaseSalary() {
        salary *= 1.1;
    }

    @Override
    public void printInfo() {
        System.out.printf("job : %s name : %s salary: %d bonus : %d stock : %d\n", this.getClass().getSimpleName(), name, salary, bonus, stock);

    }
}
