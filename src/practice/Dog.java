package practice;

public class Dog extends AnimalAbstract implements Animal{
    String breed;

    Dog(String name, String color, String shape, int age, String kind) {
        super(name, color, shape, age, kind);
    }
    void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println("woof");
    }

    @Override
    public void move() {

    }

    @Override
    public void printInfo() {
        sound();
        printFace();
    }

    @Override
    public void printFace() {
        System.out.println("\uD83D\uDC15 ");
    }
    public static void main(String [] args){
        Dog dog = new Dog("buddy", "white", "cutie", 5, "poodle");
        dog.printInfo();
    }
}
