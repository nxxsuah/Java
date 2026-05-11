package sub3;
/**
* 날짜 : 2026/05/11
* 이름 : 남수아
* 내용 : Java 기본 내장클래스 실습 - String Builder  잦은 문자열 변경으로 메모리 낭비가 생길 때 buffer 를 만든다?
*/
public class StringBuilderTest {
	public static void main(String[] args) {
		
		// String 객체의 특성인 불변성 (immutable)으로 인한 메모리가 낭비 됨
		String str = "Java";
		System.out.println("str : " + str);
		
		str += "Programming";
		System.out.println("str : " + str);
		
		// StringBuilder로 메모리 절약할 수있음
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb : " + sb.hashCode());
		
		sb.append("Programming");
		System.out.println("sb : " + sb.hashCode());		
		
	}

}
