package javaprograms;

public class ChildClass extends ParentClass {
	public void sub(int a,int b) {
		
		System.out.println("differnce of two numbers  "+(a-b));
	}
	ChildClass(){
		
		super(9);
	}
 public static void main(String a[]) {
	 ChildClass cobj=new ChildClass() ;
	 cobj.add(9,7);
 }
}
