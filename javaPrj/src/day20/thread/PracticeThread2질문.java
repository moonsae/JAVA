package day20.thread;

public class PracticeThread2질문 {	
	
 
	
	public static void main(String[] args) {
		try {
			 			
			ThreadAcorn t  = new ThreadAcorn();
			t.start();
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ThreadAcorn extends Thread {
	static int num;
	@Override
	public void run() {
		
		try {
			for (  num = 0; num < 9; num++) {				
				System.out.println(num+1  +"기수 start");
				ThreadAcornEnd  end = new ThreadAcornEnd();
				end.start();
				sleep(100);				 
				System.out.println( (num+1) +  " 번째 기수가 수료 완료했습니다.");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

class ThreadAcornEnd extends Thread {	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
				System.out.println( (ThreadAcorn.num+1)+  "번째 기수는 현재 수료까지 " + (10  - i) + "일 남았습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 
	}
	
}
