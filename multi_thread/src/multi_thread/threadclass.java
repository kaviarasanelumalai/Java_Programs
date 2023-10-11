package multi_thread;

public class threadclass extends Thread {

	
	public void run()	//thread job
		
		{
			for(int no=1;no<=5;no++) {
				System.out.println("theadclass"+no);
			}
		}

	}


