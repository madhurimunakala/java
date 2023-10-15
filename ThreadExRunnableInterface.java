package javaprograms;

public class ThreadExRunnableInterface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is example for runnable interface");
	}
	
public static void main(String a[]) {
	ThreadExRunnableInterface ft2=new ThreadExRunnableInterface();
	
	//ft2.start();
   Thread t1=new Thread(ft2);
   
   Thread t2=new Thread(ft2,"ThreadExRunnableInterface");
   t1.start();
   t2.start();
   System.out.println(t1.getName());
   System.out.println(t2.getName());
   System.out.println("Default thread priority of Thread 1: " + t1.getPriority());
   System.out.println("Default thread priority of Thread 2: " + t2.getPriority());
   
   
}
}
