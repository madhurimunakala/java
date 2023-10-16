package javaprograms;

public class SynchronizationEx extends Thread{
	public static synchronized void display() {
		
		for(int i=0;i<100;i++) {
			//synchronized(this) {
			System.out.println(i);
			/*synchronized(this) {
			
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			System.out.println("this is example for synchornization");
		}
	}
	
public void run() {
	display();
	
}
public static void main(String a[]) {
	SynchronizationEx ob=new SynchronizationEx();
	SynchronizationEx ob1=new SynchronizationEx();
	ob.start();
	ob1.start();
}
}
