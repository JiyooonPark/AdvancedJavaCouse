package practice.p1022;
import java.util.*;

public class chapter2 {
    int pages;
    chapter2(){
        System.out.print("chapter 2 starting");
        pages = 0;
    }
    chapter2(int pages){
        this.pages = pages;
    }
    void setPages(int pages){
        this.pages = pages;
    }
    void print_info(){
        System.out.print("there are "+pages+" pages in this chapter\n");
    }
    public static void main(String[]args){
        chapter2 c = new chapter2(10);
        c.print_info();
        c.setPages(19);
        c.print_info();

        Scanner scanner = new Scanner(System.in);
        int pages = scanner.nextInt();
        c.setPages(pages);
        c.print_info();
    }
}
