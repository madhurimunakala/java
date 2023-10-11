package madhuuuproject;

import java.util.Scanner;

public class Ten {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter lower number:");
		int x=s.nextInt();
		System.out.println("enter upper number:");
		int y=s.nextInt();
		for(int i=x;i<=y;i++){
			 int count=0;
		  for(int j=1;j<=i;j++) {
		   if(i%j==0){
		    count++;
		    }
		  }
		   if(count==2) {
			
		    		
		   System.out.println(i);
		    
		    }
		  }
		
	}

}
