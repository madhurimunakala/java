package javaprograms;

public class ParentClass {
	int i,j;
	public void add(int a,int b) {
		System.out.println("addition of two numbers "+(a+b));
	}
	ParentClass(){
		System.out.println("hihello");
	}
	ParentClass(int i){
		super();
	System.out.println(i);	
	}
	public static void main(String a[]) {
		 ChildClass cobj=new ChildClass() ;
		 ParentClass obj=new ParentClass(9);
		 obj.add(5,2);
	 }
}


