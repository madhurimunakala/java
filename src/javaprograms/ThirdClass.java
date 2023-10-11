package javaprograms;

public class ThirdClass extends SecondClass {
	public void Example() {
		
		
		System.out.println("Thirdclass");
		super.Example();
	}
public static void main(String a[]) {
	 ThirdClass ob3=new  ThirdClass();
	 ob3.Example();
	 ob3.firstExample();
}
}
