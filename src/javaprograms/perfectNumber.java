package javaprograms;

import java.util.Scanner;

public class perfectNumber {
	Scanner s=new Scanner(System.in);
	int x=6;
	int arr[]=new int[x];
	int c=0;
	public int[] getFactors() {
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				
				arr[c]=i;
				c++;
			}
		}
		return arr;
}
int sum=0;
public int sumFac(int a[]){
	for(int i=1;i<=a.length;i++) {
		sum=sum+arr[i];
	}
	return sum;
	}
public void display(int total) {
	if(total==x) {
		System.out.println("perfect number");
	}
	else {
		System.out.println("not perfect number");
	}
	
}
public static void main(String a[]) {
	System.out.println("enter num");
	perfectNumber obj=new perfectNumber();

	int ar[]=obj.getFactors();
	int s=obj.sumFac(ar);
	obj.display(s);
 
}
}