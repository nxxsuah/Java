package sub1;

public class Member {
	
	// 속성
	String name;
	int age;
	boolean isActive;
	
	// 기능
	public void activate() {
		isActive=true;
	} 
	public void deactivate() {
		isActive=false;
	} 
	public boolean isAdult() {
		if (age >= 20) {
			return true;
		}else {
			return false;
		}
		
	} 
	public void show() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :"+ age);
		System.out.println("활성여부 :"+ isActive);
	
	} 
	
	
	

}
