package lecture3;

import java.util.Scanner;

public class User {
    static int MAX_PEOPLE = 10;
    static String list[][] = new String [MAX_PEOPLE][2];
    static int index =0;
    static Scanner scanner=new Scanner(System.in);
    User(){

    }
    static void showMenu(){
        while(true){
            System.out.println("==============================");
            System.out.println("1. 회원가입\n2. 회원조회\n3. 종료");
            System.out.println("==============================");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    addUser();
                    break;
                case 2:
                    printUsers();
                    break;
                case 3:
                    return;
            }
        }

    }
    static void addUser(){
        System.out.println("id : ");

        String id = scanner.next();
        System.out.println("pw : ");
        String pw = scanner.next();
        add(id, pw);
    }
    static void add(String id, String pw){
        if(index<MAX_PEOPLE){
            list[index][0] = id;
            list[index++][1] = pw;
        }
        else{
            System.out.println("정원 초과! 입력할 수 없습니다.");
        }
    }
    static void printUser(int th){
        System.out.printf("[ %s %s ] \n", list[th][0], list[th][1]);
    }
    static void printUsers(){
        for(int i=0; i<index; i++){
            printUser(i);
        }
        System.out.printf("총 회원수는 %d명입니다. \n", index);
    }

}
