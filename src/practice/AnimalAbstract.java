package practice;

public class AnimalAbstract {
    String name, color, shape, kind, character;
    int age;

    AnimalAbstract(String name, String color, String shape, int age, String kind){
        this.name = name;
        this.color = color;
        this.shape = shape;
        this.age = age;
        this.kind = kind;
    }
    void setCharacter(String character){
        this.character = character;
    }
    public void printInfo() {
        System.out.printf("[%s] is a [%s] who looks [%s] and is [%d] \n", name, kind, shape, age);
        System.out.println(character);
    }


}
