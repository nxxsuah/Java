package sub6;
/* 
 * 날짜 : 2026/05/06
 * 이름 : 남수아
 * 내용 : Java 다형성 실습  
 */
public class PolyTest {
	public static void main(String[] args) {
		
		//다형성을 활용한 객체생성
		Animal a1 = new Tiger(); //참조변수의 타입을 부모클래스로 선언 --> 업캐스팅: 다형성의 코드 표현
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt ();
		a2.hunt ();
		a3.hunt ();
		
		// 다운캐스팅 ?
		Tiger tiger = (Tiger)a1; // 명시적 형변환
		Eagle eagle = (Eagle)a2;
		Shark shark = (Shark)a3;
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		//타입확인 연산 : a1이 Tiger를 지칭하는게 맞는지 물어보는 연산
		if (a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 객체입니다");
		} else if (a1 instanceof Eagle) {
			System.out.println("a1은 Eagle 객체입니다");
		} else if (a1 instanceof Shark) {
			System.out.println("a1은 shark 객체입니다");
		}	
		
		// 다형성 예제
		/* 
		1) Pet 클래스를 정의하세요.
		 - 클래스 내용은 아래 내용을 참고해 작성하세요.
		2) Pet 클래스를 상속받는 Dog, Cat 클래스를 정의하시오.
		- Dog, Cat 클래스는 makeSound()메서드를 재정의 하세요.
		- Dog는 멍멍 출력
		- Cat은 야옹 출력
		3) Main 클래스에서 Dog, Cat 객체를 생성하고 정적메서드 PrintSound() 를 정의하세요.
		- main() 메서드에서 PrintSound() 메서드를 호출하시오.
		- printSound() Dog, Cat 객체를 인자로 받는 매개변수를 선언하세요.
		- printSound()는 매개변수를 이용해 Dog, Cat의 makeSOund()를 호출하세요
		*/
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		printsound(dog);
		printsound(cat);
		
	}

	public static void printsound(Pet p) { // 다형성을 메서드 매개변수에 활용
		p.makeSound();
	}
}
