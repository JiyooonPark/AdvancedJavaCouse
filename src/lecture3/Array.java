package lecture3;

import java.util.Arrays;

public class Array {
    int grade[] = new int[5];
    Array(int[] grade){
        for(int i=0; i<5; i++){
            this.grade[i]=grade[i];
        }
    }
    public int maxArray(){
        Arrays.sort(grade);
        return grade[4];
    }
    public int minArray(){
        Arrays.sort(grade);
        return grade[0];
    }


}
