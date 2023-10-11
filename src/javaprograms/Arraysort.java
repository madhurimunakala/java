package javaprograms;
import java.util.Scanner;
public class Arraysort {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int arr[]=new int[x];
	public int[] getarray()
	{
		
		for(int i=0;i<x;i++) {
			System.out.println("enter a number");
			int read=s.nextInt();
			arr[i]=read;
		}
		return arr;
	}
public void Display(int a[]) {
	for(int i=0;i<a.length;i++) {
	
		System.out.println(a[i]);
}
}
public static void main(String ar[]) {
	System.out.println("enter a size");
		
Arraysort obj=new Arraysort();
int arr2[]=obj.getarray();
obj.Display(arr2);

}
}