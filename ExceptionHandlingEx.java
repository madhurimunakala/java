package javaprograms;

import java.io.IOException;

public class ExceptionHandledEx {
static int number=23;

static public void expection_ex() {
	try{
		int denominater=0;
		throw new DateoutOfRangeException("date exception");
		//throw new IOException();
	//System.out.println(number/denominater);
	//System.out.println("text1");
	//throw new IOException();
	
	}
	catch(DateoutOfRangeException r) {
		r.printStackTrace();
		System.out.println("date out of range Exception");
		
		
	}
	
	/*catch(IOException e) {
		e.printStackTrace();
		System.out.println("there is some IO exception");
	}*/
	catch(ArithmeticException m) {
		m.printStackTrace();
		System.out.println("there is a arithmeticexception");
		}
	
	}
public static void main(String a[]) {
	System.out.println("text0");
	expection_ex();
	
}
}
