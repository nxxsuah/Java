package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
* 날짜 : 2026/05/13
* 이름 : 남수아
* 내용 : Java 파일 직렬화, 역직렬화 Serialize 실습
*/
public class DeserializeTest {
	public static void main(String[] args) {
		
		//직렬화를 위한 객체 생성
		Apple apple = new Apple("대한민국", 5000);
		
		//경로 설정
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";
		
		try {
			// 기본 스트림
			FileOutputStream fos = new FileOutputStream(path);
			
			// 직ㅈ렬화를 위한 보조스트림
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//객제 직렬화 (내보내기)
			oos.writeObject(apple);
			
			//스트림해제
			oos.flush();
			oos.close();
			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("프로그램종료...");
	}

}
