package javaOOP;

public class Topic_03_Method {
	
	void showCarName() {
		System.out.println("Huyndai Tucson");
	}
	
	
	static void showCarColor() {
		System.out.println("White");
	}
	
	
	public static void main(String[] args) {
		//Hàm static thì gọi trong 1 hàm static khác được 
		showCarColor(); //-> hàm này thì  gọi ra được, nhưng không gọi dược hàm showCarName
		
		//Gọi qua instance/object
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarName(); 
		showCarColor(); //Trong class thì gọi luôn như này 
		Topic_03_Method.showCarColor(); //Ngoài class thì gọi như này 
		
	}

}
