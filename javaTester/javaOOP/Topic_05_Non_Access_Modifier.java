package javaOOP;

public class Topic_05_Non_Access_Modifier {
	//static variable/method
	static String BROWSER = "Chrome";
	
	//Non static
	String serverName = "testing";
	
	//final: không được phép gán lại giá trị 
	final String colorCar = "red";

	public static void main(String[] args) {
		//Biến static có thể được gọi ra dùng luôn trong hàm static
		System.out.println(BROWSER);
		
		Topic_05_Non_Access_Modifier topic = new Topic_05_Non_Access_Modifier();
		System.out.println(topic.serverName);	
		
	}
	
	//Define 1 class = final -> thì không class nào được kế thừa final class - nhưng lại cho khởi tạo 	
	//Define 1 class = abstract -> Thì không cho khởi tạo class - nhưng cho kế thừa

}
