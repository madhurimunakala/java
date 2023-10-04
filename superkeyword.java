public class FirstClass {
	public void Example() {
		System.out.println("FirstClass");
	}

}
public class SecondClass extends FirstClass {
	public void Example() {
		System.out.println("SEcond class");
	}

}
public class ThirdClass extends SecondClass {
	public void Example() {
		
		
		System.out.println("Thirdclass");
		super.Example();
	}
public static void main(String a[]) {
	 ThirdClass ob3=new  ThirdClass();
	 ob3.Example();
	 ob3.Example();
}
}
