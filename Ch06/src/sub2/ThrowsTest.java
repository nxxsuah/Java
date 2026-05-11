package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * 날짜 : 2026/05/11
 * 이름 : 남수아
 * 내용 : Java Throws 메서드에서 예외 던지기 실습 
 */
public class ThrowsTest {
	
	public static void main(String[] args) {
		//최종적으로 예외를 처리
		try {
			
		
		method1();
		
		} catch (InputMismatchException e) {
			System.out.println("예외발생1");
		} catch (Exception e) {
			System.out.println("예외발생2");
		}
		
		
		System.out.println("프로그램 정상 종료...");
				
	}
	
	public static void method1() throws InputMismatchException, ArithmeticException {
		
			// method2 에서 발생하는 Exceptional method1 을 호출하는 쪽으로 던집
			method2();
		
		
	}
	
	public static void method2() throws InputMismatchException, ArithmeticException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int number = scan.nextInt(); // 숫자입력
		
		int result  = 10 / number;		
		
		
		System.out.println("number : " + number);
	}

}
