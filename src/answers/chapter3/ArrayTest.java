package answers.chapter3;
import java.util.*;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];
		Scanner s=new Scanner(System.in);
		Array arr=new Array();
		System.out.println("�����б� �̼� ������ ������ �Է��ϼ���(5����):");
		for(int i=0;i<score.length;i++)
			score[i]=s.nextInt();
		for(int i=0;i<score.length;i++)
			System.out.print(score[i]+" ");
		
		System.out.println();
		System.out.println("max:"+arr.maxArray(score));
		System.out.println("min:"+arr.minArray(score));
		
		

	}

}
