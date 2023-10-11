package javaprograms;

public class FirstThread extends Thread {
   public void run(){
	   System.out.println("this is a run method ");
   }
   public FirstThread() {
	   System.out.println("firstthread constructor");
	   System.out.println("it's a constructot");
	   
   }
   public static void main(String a[]) {
	   FirstThread ft1=new FirstThread();
	   FirstThread ft2=new FirstThread();
	   //ft1.run();
	   ft1.start();
	   //ft2.start();
	   System.out.println("Default thread priority of Thread 1: " + ft1.getPriority());
	   System.out.println("Default thread priority of Thread 2: " + ft2.getPriority());
	   ft1.setPriority(MAX_PRIORITY);
	   ft2.setPriority(MIN_PRIORITY);
	   System.out.println("Default thread priority of Thread 1: " + ft1.getPriority());
	   System.out.println("Default thread priority of Thread 2: " + ft2.getPriority());
	  /* System.out.println("\n" + Thread.currentThread().getName());
	      System.out.println("Default thread priority of Main Thread: " + Thread.currentThread().getPriority());
	      Thread.currentThread().setPriority(MAX_PRIORITY);
	      System.out.println("The maximum thread priority of Main Thread is: " + Thread.currentThread().getPriority());*/
   }
}
