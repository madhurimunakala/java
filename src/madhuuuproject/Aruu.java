package madhuuuproject;

import java.util.Scanner;

public class Aruu {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		int primearr[]=new int[10];
		int evenarr[]=new int[10];
		int oddarr[]=new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("enter a number:");
			int x=s.nextInt();
			arr[i]=x;
			
		}
 for(int i=0;i<10;i++) {
	 if(arr[i]%2==0) {
		 evenarr[i]=arr[i];
		 System.out.println(evenarr[i]);
	 }
 }
 for(int i=0;i<10;i++){
	 if(arr[i]%2==1){
		 oddarr[i]=arr[i];
		 System.out.println(oddarr[i]);
	 }
 }
 for(int i=0;i<10;i++){
	 int count=0;
  for(int j=1;j<=arr[i];j++) {
   if(arr[i]%j==0){
    count++;
    }
  }
   if(count==2) {
	   int x=0;
    		primearr[x]=arr[i];
    		System.out.println(primearr[x]);
    		x++;
    	}
  }
}
}
