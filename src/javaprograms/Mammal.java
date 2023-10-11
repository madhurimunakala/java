package javaprograms;

public class Mammal implements Animal {
	public void howIMove() {
		System.out.println("by legs or wings");
		
	}
	public void whatIEat() {
		System.out.println("veg or nonveg");
		
	}
public static void main(String a[]) {
	Mammal mobj=new Mammal();
	mobj.howIMove();
	mobj.whatIEat();
}
}
