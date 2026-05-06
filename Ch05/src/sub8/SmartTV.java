package sub8;

public class SmartTV extends Tv implements Internet, Computer { // 인터페이스는 여러개 구현 할 수 있다! 클래스 상속은 1개만 

	@Override
	public void connection() {
		System.out.println("인터넷 접속...");
	}

	@Override
	public void surf() {
		System.out.println("인터넷 탐색");
	}

	@Override
	public void process() {
		System.out.println("SmartTv Processing...");
		
	}

	@Override
	public void save() {
		System.out.println("SmartTv Saved...");
		
	}
	

}
