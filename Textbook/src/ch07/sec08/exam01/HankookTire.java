package ch07.sec08.exam01;

public class HankookTire extends Tire {
	
	
	@Override
	public void roll() { //roll 쓰면 오버라이딩 할 수 있는 기능이 보여짐! 
		 System.out.println("한국 타이어가 회전합니다");
	}
	
}
