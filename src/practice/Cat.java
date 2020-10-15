package practice;

public class Cat extends AnimalAbstract implements Animal {

    Cat(String name, String color, String shape, int age, String kind) {
        super(name, color, shape, age, kind);
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void move() {

    }

    @Override
    public void printFace() {

    }
}
