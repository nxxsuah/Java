package sub6;
/* 
 * 날짜 : 2026/05/06
 * 이름 : 남수아
 * 내용 : Java 다형성 실습  
 */
public class PolyTest {
	public static void main(String[] args) {
		
		//다형성을 활용한 객체생성
		Animal tiger = new Tiger(); //참조변수의 타입을 부모클래스로 선언 --> 업캐스팅: 다형성의 코드 표현
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt ();
		eagle.hunt ();
		eagle.hunt ();
		
		
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
