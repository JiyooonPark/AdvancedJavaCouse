package practice;

public class AnimalAbstract {
    String name, kind, character;

    AnimalAbstract(String name,  String kind, String character){
        this.name = name;
        this.kind = kind;
        this.character = character;
    }
    void setCharacter(String character){
        this.character = character;
    }
    public void printInfo() {
        System.out.printf("[%s] is a [%s] who looks [%s] and is [%d] \n", name, kind);
        System.out.println(character);
    }


}
