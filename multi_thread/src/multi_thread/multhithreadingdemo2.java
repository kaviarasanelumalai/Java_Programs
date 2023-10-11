package multi_thread;

public class multhithreadingdemo2 {

	public static void main(String[] args) {
		threadclass tc =new threadclass(); 
		tc.start();
		System.out.println(tc.getId());
		  System.out.println(tc.getName());
		  System.out.println(tc.getPriority());
		  System.out.println(tc.isDaemon());
		  System.out.println(tc.isAlive());
      
		  threadclass tc1 =new threadclass(); 
			tc1.start();
			System.out.println(tc1.getId());
			  System.out.println(tc1.getName());
			  System.out.println(tc1.getPriority());
			  System.out.println(tc1.isDaemon());
			  System.out.println(tc1.isAlive());
	      
		
		for(int no=1;no<=5;no++) {
			System.out.println("multhithreadingdemo"+no);
		}
		
	}

}
