package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
* 날짜 : 2026/05/13
* 이름 : 남수아
* 내용 : Java 파일 입출력 실습
*/
public class FileIOTest {
	public static void main(String[] args) {
		
		// 입출력 파일 경로 설정
		String source = "C:\\Users\\GGG\\Desktop\\test1.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test2.txt";
		
		// 스트림 생성
		try {
			FileInputStream fis = new FileInputStream(source); // 입력스트림
			FileOutputStream fos = new FileOutputStream(target); // 출력스트림
			
			while (true) {
				
				int data = fis.read();
				
				if(data == -1) {
					break;
				}
			
			
			
			// 문자 변경 - 임시로 출력
			//char ch = (char) data;
			//System.out.println(ch);
			
			// 파일쓰기
			fos.write(data);
			
			}
			
			// 스트림 연결 해제
			fis.close();
			fos.close();
			
			
			
			} catch (FileNotFoundException e) {			
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
		
		
			System.out.println("프로그램 종료...");
	}

}
