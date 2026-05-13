package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
* 날짜 : 2026/05/13
* 이름 : 남수아
* 내용 : Java 파일 Buffer 실습
*/
public class BufferIOTest {
public static void main(String[] args) {
		
		// 입출력 파일 경로 설정
		String source = "C:\\Users\\GGG\\Desktop\\universe.mp4";
		String target = "C:\\Users\\GGG\\Desktop\\result.mp4";
		
		
		try {
			// 기본스트림 생성
			FileInputStream fis = new FileInputStream(source); // 입력스트림
			FileOutputStream fos = new FileOutputStream(target); // 출력스트림
			
			// 보조스트림(Buffer)
			BufferedInputStream bis = new BufferedInputStream(fis); // 기본 입력스트림 연결
			BufferedOutputStream bos = new BufferedOutputStream(fos); // 기본 출력스트림 연결
			
			
			
			
			
			while (true) {				
				int data = bis.read();				
				if(data == -1) {
					break;
				}	
			
			
			// 문자 변경 - 임시로 출력
			//char ch = (char) data;
			//System.out.println(ch);
			
			// 파일쓰기
			bos.write(data);			
			}
			
			// 스트림 연결 해제
			bis.close();
			bos.flush(); // 버퍼비워내기
			bos.close();
			
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
