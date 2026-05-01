package sub1;
/*
 * 날짜 : 2026/04/29
 * 이름 : 남수아
 * 내용 : Java 클래스 기본 실습
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		//객체생성 (class로 object를 여러개 만들수있음)
		Car sonata = new Car();  // Car <- 변수를 선언해야하는데 타입은 개발자가 직접 정의했다고 해서 '사용자 정의 타입'
		
		//객체 초기화
		sonata.brand = "소나타"; // . 이 나오면 참조하라는 연산자
		sonata.color = "white";
		sonata.speed = 0;
		
		//객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//생성, 초기화, 활용
		Car avante = new Car();
		avante.brand = "아반테";
		avante.color = "black";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		// Account 객체생성 및 초기화
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.id = "110-11-1234";
		kb.name = "김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.show();
		
		/*
		 * <출력>
		 * 은행명 : 우리은행
		 * 계좌번호 : 101-22-1001
		 * 입금주: 김춘추
		 * 현재잔액 : 15000
		 */
		
		Account wr = new Account();
		
		wr.bank = "우리은행";
		wr.id="101-22-1001";
		wr.name="김춘추";
		wr.balance = 10000;
		
		wr.deposit(5000);
		wr.show();
		
	

		
		/*
		 * 문제1. 아래 요구사랑을 충족하는 Book 클래스를 정의하세요.
		 * <속성>
		 * -title (String): 책제목
		 * -author (String): 저자이름
		 * -copies (int): 이용 가능한 복사본 수
		 * 
		 * <매서드>
		 * borrowBook()
		 * - 이용가능한 복사본이 있으면 copies를 1감소시키고 true를 반환
		 * - 이용가능한 복사본이 없으면 false를 반환
		 * 
		 * returnBook()
		 * -copies를 1증가
		 * 
		 * show()
		 * -모든 속성값을 출력
		 */
		
		//Book 객제 생성
		
		Books javaBook = new Books();
		javaBook.title="이것이 자바다";
		javaBook.author="신용권";
		javaBook.copies=3;
		
		
		boolean result = javaBook.borrowBook();
		if(result) {
			System.out.println("대출성공!!!");
			javaBook.show();
		}else {
			System.out.println("대출실패!!!");
			javaBook.returnBook();
			javaBook.show();
		}
		
		//Member 객체생성및 초기화
		Member kim = new Member();
		kim.name = "김유신";
		kim.age = 22;
		kim.isActive = false;
		
		kim.activate();
		
		boolean isAdult = kim.isAdult();
		
		if(isAdult) {
			kim.show();
			System.out.println("성인입니다.");
		}else {
			kim.show();
			System.out.println("미성년자입니다.");
		}
		
		
	}

}
