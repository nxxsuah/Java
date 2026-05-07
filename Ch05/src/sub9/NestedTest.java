package sub9;

/*
 * 날짜 : 2026/05/07
 * 이름 : 남수아	
 * 내용 : Java 중첩클래스 - 내부클래스, 익명 객체 Nested Class 실습
 */ 


// 외부 클래스
class Outer {
	private int x;
	
	public Outer(int x) {
	this.x = x;
	
	}

	public void show() {
		System.out.println("Outer x :" + x);
	}
}
	
	//내부클래스
	class Inner {
	
	private int x;
	
	public Inner(int x) {
		this.x = x;
	}
	
	public void show() {
		System.out.println("Inner x :" + x);
	}

public class NestedTest {
	
	public static void main(String[] args) {
		
		//외부객체생성
		Outer out = new Outer(1);
		out.show();
		
		Inner inn = new Inner(2);
		
	}
		
	}

}
