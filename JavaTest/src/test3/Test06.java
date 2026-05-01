package test3;

class Adder {
	//싱글톤 객체 (instance) <-관례적인 이름 
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	// 생성자 오버로드
	// 싱글톤은 private
	private Adder() {} 
	
	private Adder(int value) {
		y += value;
	}
	private int x;.
	
	
	
	
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}

	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}

	public static void add(Adder a2) {
		a2.x += 10; // . 은 참조 연산자 / . 앞에 있는건 객체임을 알수있음 Adder 의 속성
	}

	
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}

	public void show() {
		System.out.println("----------");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	
}

public class Test06 {
	
	public static void main(String[] args) {
		Adder a1 = Adder.getInstance();
				
		a1.add(1, 2);
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();

		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1, 3);
		a1.show();
	}
}