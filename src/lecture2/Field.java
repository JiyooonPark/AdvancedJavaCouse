package lecture2;

public class Field {
    int num;
    String str;
    char c;
    Field(){

    };
    void printField(){
        System.out.printf("num : %d str : %s c: %c", num, str, c);
    }
    public static void main(String [] args){
        Field f = new Field();
        f.printField();
    }
}
//field 값은
// int =0;
//str : null;
// c :
//로 초기화됨