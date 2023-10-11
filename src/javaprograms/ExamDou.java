package javaprograms;
import java.util.Scanner;
public class ExamDou {
	static Scanner s=new Scanner(System.in);
	//static int y=s.nextInt();
	static void lopp(int x) {
		for(int i=0;i<x;i++) {
			System.out.println(i);
		}
	}
public static void main(String a[]) {
	System.out.println("enter y value");
	 int y=s.nextInt();
	lopp(y);
}
}
