
package javaprograms;

public class TypeCast {
	public void typecas() {
		int t=10;
		int s=10;
		float x=10;
		Float y=new Float(10.0);
		Integer i=new Integer(10);
		Integer j=new Integer(10);
		if(i==j) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String a[]) {
		TypeCast obj=new TypeCast();
		obj.typecas();
	}

}


