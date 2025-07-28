package multithreading;

public class Test extends Thread {
	
	String str="Aadi and Java \n----\n";
	
	public void run() {
		
		char ch[]=str.toCharArray();
		
	for (int i=0;i<ch.length;i++) 
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.print(ch[i]);
	}
	
}


public static void main(String[]args) throws InterruptedException {
	Test t1=new Test();
	t1.start();
	
	t1.join();
	
	 Test2 t2=new Test2();
	t2.start();
			
			
}
 static class Test2 extends Thread{
	 String name="Subscribe Now";
	 public void run() {
		 char c[]=name.toCharArray();
		 for (int i=0;i<c.length;i++)
		 { try {
			Thread.sleep(1000);
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		
			 System.out.print(c[i]);
		 }
	 }
 }
}
 
 