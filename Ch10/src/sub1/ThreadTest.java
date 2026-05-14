package sub1;
/*
 * 날짜 : 2026/05/14
 * 이름 : 남수아
 * 내용 : Java 스레드 Thread 실습
 */

public class ThreadTest {
	
	public static void main(String[] args) {
		
		//스레드 객체 생성
		ChildThread ct1 = new ChildThread();
		ChildThread ct2 = new ChildThread();
		
		ct1.setName("Child1");
		ct2.setName("Child2");
		
		ct1.run();
		ct2.run();
		
		
		
		System.out.println("Main Thread 종료...");
	}

}
