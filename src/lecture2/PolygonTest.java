package lecture2;

import java.util.Scanner;

public class PolygonTest {
    public static void main (String [] args){
        Polygon p = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the shape? [triangle, square, rectangle]");
        String type = scanner.next();

        switch(type){
            case "triangle":
                p = new Polygon(type, 10, 30);
                p.calculateSize(p.width, p.height);
                break;
            case "rectangle":
                p = new Polygon(type, 10, 40);
                p.calculateSize(p.width, p.height);
                break;
            case "square":
                p = new Polygon(type, 15);
                p.calculateSize(p.width);
                break;
        }
        p.printResult();



    }
}
