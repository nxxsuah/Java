package sub1;
/**
* 날짜 : 2026/05/12
* 이름 : 남수아
* 내용 : Java 제네릭 Generic 실습
*/
public class GenericTest {
	
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 5000);
		Banana banana = new Banana("일본", 30000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(apple);
		System.out.println(appleBox.getFruit());
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(banana);
		System.out.println(bananaBox.getFruit());
		
		
		
	}

}
