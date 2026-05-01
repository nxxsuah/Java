package sub3;
/*
 * 날짜 : 2026/04/30
 * 이름 : 남수아
 * 내용 : Java 클래스 변수, 클래스 매서드 실습
 *  
 */

class Increment {
	public int num1;
	public static int num2; // num2 = 클래스 변수(정적변수)!!  static은 변수의 타입 앞에 위치해야함
	
	public Increment() {
		
		num1++;
		num2++;
		
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		
	}
	
}





public class StaticTest {
	
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		

		//클래스 변수는 객체 생성 없이 직접 접근 가능
		//Increament.num1 = 1; // 인스턴스 속성이기 때문에 객체로 접근해야함
		inc1.num1 = 1;
		inc2.num1 = 2;
		inc3.num1 = 3;
		
		Increment.num2 = 2; //  클래스 변수 정적변수 이기 때문에 클래스 타입으로 접근 가능이렇게 가능함 (Static)
		inc1.num2 = 1;
		inc2.num2 = 2;
		inc3.num2 = 3;
		
		
		//Car 객체 생성 및 초기화
		Car sonata = new Car("소나타", 0);
		Car avante = new Car("아반테", 0);
		Car toyota = new Car("토요타", 0);
		
		System.out.println("전체차량수: "+ Car.totalCar()); // 클래스 메서드 호출
		sonata.show();
		avante.show();
		toyota.show();
		
		
		// 싱글톤 객체 예제
		Calc c1 = Calc.getInstance(); // 싱글톤에 private 해둔 객체 가져오기  - Calc c1 = new Calc(); 이렇게 못함!  
		Calc c2 = Calc.getInstance();
		
		System.out.println("덧셈:" + c1.plus(2, 3));
		System.out.println("뺄셈:" + c2.minus(2, 3));
		System.out.println("곱셈:" + c2.multi(5, 7));
		
		
	}

}
