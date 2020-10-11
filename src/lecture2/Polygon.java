package lecture2;

public class Polygon {
    int width, height;
    String type;
    double size;

    Polygon(String type, int width, int height){
        this(type, width);
        this.height = height;
    }

    Polygon(String type, int width){
        this.type = type;
        this.width = width;
        this.height = width;
    }
    
    public void calculateSize(int width){
        size = width*width;
    }
    public void calculateSize(int width, int height){
        if(type.equals( "triangle")){
            size = width * height *0.5;
        }
        else{
            size = width * height ;
        }
    }
    public void printResult(){
        System.out.printf("%s width : %d height : %d \n",type ,width, height);
        System.out.printf("size of %s  is : %4.1f",type, size);
    }

}
