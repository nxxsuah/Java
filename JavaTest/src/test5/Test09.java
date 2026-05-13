package test5;

class Orange {
	private String country;
	private int price;
	
		_____________________
	
		____________________________________
	}


public class Test09 {
	public static void main(String[] args) {
		________ list1 = new ArrayList<>();
		list1.add(new Orange("파주", 3000));
		list1.add(new Orange("수원", 3000));
		
		________ list2 = new ArrayList<>();
		list2.add(new Orange("청주", 3000));
		list2.add(new Orange("충주", 3000));
		
		________ list3 = new ArrayList<>();
		list3.add(new Orange("밀양", 3000));
		list3.add(new Orange("함안", 3000));

		_____________ map = new HashMap<>();

		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		List <Orange> list = map. ____________
		Orange orange = list. __________
		orange.show();
		
		map.______________
		map._______________
	}
}