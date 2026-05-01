package sub3;
/*
 * 날짜 : 2026/04/30
 * 이름 : 남수아
 * 내용 : Java 싱글톤 실습 
 */
public class Calc {
	
	//싱글톤 객체
	private static Calc instance = new Calc(); // public 안하고 getter 하는 이유? 안전하게 하기 우해서?
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {} // 외부에서 객체 생성을 막기 위한 private 생성자	
	// 기능
	public int plus (int x, int y) {
		return x + y;
	}
	public int minus (int x, int y) {
		return x - y;
	}
	public int multi (int x, int y) {
		return x * y;
	}
	public int div (int x, int y) {
		return x / y;
	}

}
