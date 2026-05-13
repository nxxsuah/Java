package sub4;

import java.io.File;
import java.io.IOException;

/**
* 날짜 : 2026/05/13
* 이름 : 남수아 
* 내용 : Java File 클래스 실습* 
*/
public class FileTest {
	public static void main(String[] args) {
	
		String source = "C:\\Users\\GGG\\Desktop\\text1.txt"; // 파일
		String target = "C:\\Users\\GGG\\Desktop\\test"; // 디렉토리(폴더 또한 파일로 취급)
		
		//파일 객체 생성
		File file1 = new File(source);
		File file2 = new File(target);
		
		try {
			file1.createNewFile();
			file2.mkdir();
			
			//파일 정보
			System.out.println("file1 존재여부 : " + file1.exists());
			System.out.println("file2 존재여부 : " + file2.exists());
			System.out.println("file1 파일여부 : " + file1.isFile());
			System.out.println("file2 폴더여부 : " + file1.isDirectory());
			System.out.println("file1 파일이름 : " + file1.getName());
			System.out.println("file2 파일이름 : " + file2.getName());
			System.out.println("file1 파일경로 : " + file1.getPath());
			System.out.println("file2 파일경로 : " + file2.getPath());
			System.out.println("file1 절대경로 : " + file1.getAbsolutePath());
			System.out.println("file2 절대경로 : " + file2.getAbsolutePath());
			
			
			//파일삭제
			
			file1.delete();
			file2.delete();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
			
		
	}
	
}
