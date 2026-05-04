package sub4;

//부모의 필드(속성)과 기능을 물려받은 클래스임을 표시하는 키워드 extends
public class Sedan extends Car{
	
	private int cc; // 배기량
	
	
	// 속성, 생성자 (부모의 속성, 생성자를 호출해 오는 메서드 = super ();
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); 
		this.cc = cc;
		}

	public void drive () {
		System.out.println("Sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.show(); // super는 생략 가능함! 그래서 show(); 이렇게 적어도됨
	}
	
	
}
