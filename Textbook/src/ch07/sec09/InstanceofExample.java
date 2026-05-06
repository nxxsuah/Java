package ch07.sec09;

import java.security.DomainCombiner;

public class InstanceofExample {
	//main()메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personinfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		//person이 참조하는 객체가 Student 타입인지 확인 
		
		/* if(person instanceof Studen) {
		 //Student 객체일 경우 강제 타입 변환
		 Sutudent student = (Student) person;
		 //Student 객체만 가지고 있는 필드 및 메소드 사용
		 System.out.println("studentNo:"+ student.studentNo);
		 student.study();
		 } */
		
		//person이 참조하는 객체가 Student 타입일 경우
		//Student 변수에 대입(타입 변환 발생)
		
		if(person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
			}
		}
		
		public static void main(String[] args) {
			Person p1 = new Person("홍길동");
			personinfo(p1);
			
			System.out.println();
			
			
			Person p2 = new Student("김길동", 10);
			personinfo(p2);
				
		}
			
	}

