package test3;
class Student {
	public static int studentId; // 클래스 변수! = static 으로 해줘야함
	private String studentName;
	private String major;
	private int grade;
	
public Student(String studentName, String major, int grade){
	this.studentId++;
	this.studentName = studentName;
	this.major = major;
	this.grade = grade;
	}

public void studentInfo() {
	System.out.println("---------------");
	System.out.println("학번 : "+studentId);
	System.out.println("이름 : "+studentName);
	System.out.println("전공 : "+major);
	System.out.println("학년 : "+grade);
	}	
}


public class Test04 {

	public static void main(String[] args) {
		
		
		Student.studentId = 20201000; // 클래스 타입으로 직접 접근하고있음을 알수있다
		
		Student kim = new Student ("김유신","국문과", 1);
		kim.studentInfo();
		
		Student lee = new Student ("이순신","경영학과", 2);
		lee.studentInfo();
		
		Student lim = new Student ("임꺽정","컴퓨터공학과", 3);
		lim.studentInfo();
		
	}
}