package javaBasic;

public class Topic02_CastingReference {
	
		public String studentName;
		
		public String getStudentName() {
			return  studentName;
		}
		
		public void setStudentName (String studentName) {
			this.studentName = studentName;
		}
		
		public void showStudentName () {
			System.out.println("Student Name = " + studentName);
		}
		
		public static void main(String[] args) {
			Topic02_CastingReference firstStudent = new Topic02_CastingReference();
			Topic02_CastingReference secondStudent = new Topic02_CastingReference();
			
			firstStudent.setStudentName("Pham Thi Khanh Linh");
			firstStudent.setStudentName("Nguyen van B");
			
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
		//Ep kieu
		firstStudent = secondStudent;
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
		secondStudent.setStudentName("Dao M Dam");
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
			
		}
}


