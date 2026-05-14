package sub2;



public class ThreadJoinTest {
	public static void main(String[] args) {
		
		ChildThread ct = new ChildThread();
		ct.setName("Child");
		
		ct.start();
		
		try {
		// 자식 스레드가 작업을 마피고 Main Thread 로 합류할 때까지 Main 스레드 대기
			ct.join();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		
		System.out.println("Main Thread 종료...");
		
		
	}

}
