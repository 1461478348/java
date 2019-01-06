package advance;

public class MaiPiao {
	
	public static Integer[] Ticket() {
		Integer[] anArry = new Integer[100];
		for(int i=0; i<100; i++) {
			anArry[i] = i+1;
			
		}
		return anArry;
		
	}
	 static int len = Ticket().length-1;
	 static int last = Ticket().length-1;
	 static Integer [] tic = Ticket();
	

	
	public synchronized static void mai(int a) {
		
		if(a <= len) {
			while(a >0) {
				System.out.println(Ticket()[len--]);
				tic[last--] = null;
				a--;
			}
			
		}
	
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		Runnable s = new Runnable() {
			
			@Override
			public void run() {
				mai(5);
				
			}
		};
		Runnable s2 = new Runnable() {
					
					@Override
					public void run() {
						mai(5);
						
					}
		};
				
		Thread t = new Thread(s);
		Thread t2 = new Thread(s2);
		t.start();
		t2.start();
		t.join();
		t2.join();
		
		System.out.println("------------------------");
		
		for(int i=0; i<tic.length;i++) {
			System.out.println( tic[i]);
		}
		
	

	}

}
