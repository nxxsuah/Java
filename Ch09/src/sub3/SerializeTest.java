package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
* 이름 : 남수아 역직렬화 deserialize 실습
*/
public class SerializeTest {
	public static void main(String[] args) {
				
		//경로 설정
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";
		
		try {
			// 기본 스트림
			FileInputStream fis = new FileInputStream(path);
			
			// 직ㅈ렬화를 위한 보조스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객제 역직렬화 (내보내기)
			Apple apple = (Apple) ois.readObject();
			
			//객체확인
			apple.show();
			
			//스트림해제
			ois.close();
			fis.close();			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("프로그램종료...");
	}

}
