package day20.Ex;

 

public  class Intrrupt예제2 {
	public static void main(String[] args)  	{		 
 
		//스레드 실행 요청 ,스레드시작됨
		MyThread5 th1 = new MyThread5();
		th1.start();		
		
		//시간지연을 시키기 위해 추가된 코드 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {		 
			e.printStackTrace();
		}			 	
		th1.interrupt();    // th1 스레드에  interrupt() 발생시킨다.
	}
}




class MyThread5 extends Thread {	
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			 
				try {
					sleep(2000);
					System.out.println( "2초간 잠자는 중 !!!!!");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(" 자고 있는데 깨어남 !!!! ");
					//인터럽트 발생시 종료하겠다 작업을 종료하고 돌아감 .. 추가된 코드 !!!!
					return;
				}	
				
				
				if( isInterrupted()){
					System.out.println("깨어남");
					return;
				}
				
		}
	}
}