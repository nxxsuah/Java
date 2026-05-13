package test5;


class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@override
	public String toString() {
		return "Apple [country=" + country + ", price = " + price +"]";
	}
			
}

class Banana {
	private String country;
	private int price;
		
	public Banana(String
				
		@Override
		???????????????????????????

	}



class Grape {
	private String country;
	private int price;
	
	??????????????????????

	@Override
	???????????????????????????

}

public class Test05 {
	
	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}
	
	public static void showInfo(_____________ fruit) {
		if(fruit _______Apple) {
			Apple apple = ________
			System.out.println(apple);
			
		}else if(fruit ___________Banana) {
			Banana banana = ___________
			System.out.println(banana);
			
		}else if(fruit ___________Grape) {
			Grape grape = ___________
			System.out.println(grape);
		}
	}
}