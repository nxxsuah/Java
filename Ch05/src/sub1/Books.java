package sub1;

public class Books {
	
	String title;
	String author;
	int copies;
	
	public boolean borrowBook() {
		
		if(copies > 0) {
			copies --;
			return true;
			
		}else {
			return false; 
			}
		}
		
	public void returnBook() {
		copies++;
	}
	public void show() {
		System.out.println("책제목 :"+ this.title);
		System.out.println("책저자 :"+ this.author);
		System.out.println("이용가능한 부수 :"+ this.copies);
	}
		
		


}
