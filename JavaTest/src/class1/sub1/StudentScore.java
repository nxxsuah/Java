package class1.sub1;

public class StudentScore {
	
	// 필드 선언 (속성)
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	//생성자 선언
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}	
	
	// 메소드	
		
		public void updateScore (double newScore) {
			
			if(newScore <= 100) {
				this.score = newScore;
				System.out.println("점수 수정 완료");
			} else {
				System.out.println("잘못된 점수 입력");
			}
						
		}	
		
		public double getScore() {
			return score;
		}
		
		public void printStudentInfo() {
			System.out.println("학생이름 :" + this.studentName);
			System.out.println("학생 ID :" + this.studentId);
			System.out.println("과목 :" + this.subject);
			System.out.println("점수 :" + this.score);
		}
	
}
