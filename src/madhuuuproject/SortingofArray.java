package madhuuuproject;
import java.util.Scanner;
public class SortingofArray {
	Scanner s=new Scanner(System.in);
	public int arrsize=s.nextInt();
	int[] arr=new int[arrsize];
	public int[] arr_read() {
		for(int i=0;i<arrsize;i++) {
			System.out.println("enter a arr element");
			int r=s.nextInt();
			arr[i]=r;
		}
		return arr;
	}
	public int[] sortArray(int arr2[]) {
		int tem=0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]>arr2[j]) {
					tem=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=tem;
				}
				
			}
			
		}
		return arr2;
	}
		public static void main(String a[]) {
			System.out.println("enter arr size");
			SortingofArray object=new SortingofArray();
			int arr2[]=object.arr_read();
			int arr3[]=object.sortArray(arr2);
			/***for(int i=0;i<arr3.length;i++) {
			 *
				System.out.println(arr3[i]);
			}***/
			int n=arr3.length;
			System.out.println("min of arr"+arr3[0]);
			System.out.println("max of arr"+arr3[n-1]);
			
			
			
		}
	
	

}
