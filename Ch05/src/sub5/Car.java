package sub5;

public class Car {

	// private에서 protected 접근권한을 변경해서 자식클래스가 접근하도록 허용 
	protected String name;
	protected String color;
	protected int speed;
	
	// 생성자 (속성초기화)
	public Car (String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// 기능
	public void speedUP(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("속도 : " + this.speed);
	}
	
}
