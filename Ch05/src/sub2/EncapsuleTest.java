package sub2;


/**
 * 날짜 : 2026/04/29
 * 이름 : 남수아
 * 내용 : Java 캡슐화 (속성을 숨기고 메소드만 보이게 하는거) 실습
 */
public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		// 객체생성
		Car sonata = new Car("소나타", "흰색", 0); // 생성자 초기화
		Car avante = new Car(); // 생성자 초기화
		
		
		//셋터 초기화
		avante.setBrand("아반테");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		System.out.println("차량명 :" + avante.getBrand());
		System.out.println("차량색 :" + avante.getColor());
		System.out.println("현재속도 :" + avante.getSpeed());
		
		
		//객체 초기화 -> 캡슐화된 속성을 생성자로 초기화
		//sonata.brand = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		//*****속성값 수정
		//sonata.color = "은색";		이렇게 하면 안됨! 아래 처럼 셋터를 받아줘야함! 
		sonata.setColor("은색"); // 안전하게 셋터로 수정! ******************************
		
		sonata.show();
		avante.show();
		
		
		// Account 객체생성
		Account kb = new Account ("국민은행", "110-11-1234","김유신", 15000);
		Account wr = new Account ("우리은행", "101-22-1001","김춘추", 10000);
		
		kb.show();
		wr.show();
		
		//Member 객체생성
		Member 김유신 = new Member ("김유신", 22, false);
		
		김유신.show();
		
		
		/*
		 * 문제2. 아래 요구사항을 충족하는 Movie 클래스를 정의하세요.
		 * <속성>
		 * - title (String) : 영화제목
		 * - Director (String) : 감독 이름
		 * - rating (double) : 영화평점 (0.0 ~ 10.0 사이의 값)
		 * - availableSeats (int) : 예약가능한 좌석 수
		 * 
		 * <생성자>
		 * - 모든 인스턴스 변수를 초기화 하는 생성자
		 * 
		 * <메소드>
		 * reserveSeat()
		 * - 예약가능한 좌석이 있으면 availableSeats를 1 감소시키고 true를 반환
		 * - 예약가능한 좌석이 없으면 false를 반환
		 * 
		 * cancleReservarion()
		 * - availableSeats를 1 증가
		 * 
		 * ShowDetails()
		 * 모든 멤버 변수값을 출력
		 */
		
		
		
	}

}
