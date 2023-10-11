package madhuuuproject;
import java.util.Scanner;
public class linearsearch {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter a number");
			int x=s.nextInt();
			arr[i]=x;
		}
		System.out.println("enter searching element");
		int val=s.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==val) {
				System.out.println(val+" element is in the index of "+i);
				}
			else {
			
				System.out.println("not");
			
			}
			}
		
			
		
		
		
		
}

}
