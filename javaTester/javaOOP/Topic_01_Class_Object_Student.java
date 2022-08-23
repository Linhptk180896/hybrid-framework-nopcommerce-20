package javaOOP;

public class Topic_01_Class_Object_Student {
	private String studentName;
	private int studentId;
	private float knowledgePoint;
	private float practicePoint;
	
	
	public final String getStudentName() {
		return studentName;
	}

	
	public final void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public final int getStudentId() {
		return studentId;
	}

	
	public final void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	public final float getKnowledgePoint() {
		return knowledgePoint;
	}

	
	public final void setKnowledgePoint(float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	public final float getPracticePoint() {
		return practicePoint;
	}

	
	public final void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	public float getAveragePoint(){
		return ((this.knowledgePoint + this.practicePoint *2)/3);
	}
	public void showStudentInfo() {
		System.out.println("Student Name: " + getStudentName());
		System.out.println("Student ID: " + getStudentId());
		System.out.println("Student Knowledge Point: " + getKnowledgePoint());
		System.out.println("Student Practice Point: " + getPracticePoint());
	}
	
	public static void main(String[] args) {
		Topic_01_Class_Object_Student student = new Topic_01_Class_Object_Student();
		student.setStudentName("Linh");
		student.setStudentId(123456);
		student.setKnowledgePoint(9.9f);
		student.setPracticePoint(8.8f);
		student.showStudentInfo();
		
	}
}
