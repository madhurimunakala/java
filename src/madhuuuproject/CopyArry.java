package madhuuuproject;

public class CopyArry {
public static void main(String a[]) {
	int arr[]= {30,2,3,4,45};
	int arr2[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr2[i]=arr[i];
	}
	for(int i=arr2.length-1;i>=0;i--) {
		System.out.println(arr2[i]);
	}
}
}
