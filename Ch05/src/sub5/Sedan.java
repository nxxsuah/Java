package sub5;

//부모의 필드(속성)과 기능을 물려받은 클래스임을 표시하는 키워드 extends
public class Sedan extends Car{
	
	private int cc; // 배기량
	private final int MAX_SPEED = 200;
	
	// 속성, 생성자 (부모의 속성, 생성자를 호출해 오는 메서드 = super ();
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); 
		this.cc = cc;
		}
	
	@Override
	public void speedUP(int speed) {
		// 부모클래스에 있는 speedUp을 자식클래스에 맞게 재정의
		//speedUp + Ctrl space 한 다음에 지우고 재정의 해야함!! 
		this.speed += speed;		
		if(speed > MAX_SPEED) {
			this.speed = MAX_SPEED;			
		}
		
	}
	
	
	

	public void drive () {
		System.out.println("Sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.show(); // super는 생략 가능함! 그래서 show(); 이렇게 적어도됨
	}
	
	
}
