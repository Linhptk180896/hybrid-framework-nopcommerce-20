package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
//--> Global variables: có thể chỉ khai báo mà không gán giá trị cho biến global variable
	static int number;
	String address;
	public static void main(String[] args) //--> Nếu không có static tại hàm main này thì không chạy đc
	{
//--> Local varibale: phải khai báo và gán giá trị cho biến local variable
	int studentNumber=0;
	
	System.out.println(number); //--> In ra được biến number trong hàm static thì bắt buộc phải khai báo biến là static
	//--> biến address không có static thì phải new 1 object ra và gọi biến address thông qua object đó
	Topic_02_Data_Type topic = new Topic_02_Data_Type();
	System.out.println(topic.address);		
	
	//--> Biến student number là biến local nên có thể gọi trực tiếp
	System.out.println(studentNumber);
	}

	
//--------------------Data type-------------
// Primitive type/value type: kiểu nguyên thủy
	
	byte bNumber;
	
	short sNumber;
	 
	int iNumber; //--> Hay sử dụng
	
	long lNumber = 65000; //--> Hay sử dụng
	
	//--> 
	
	float fNumber = 15.98f; //--> Hay sử dụng. Đây là kiểu số thực, dùng để chứa những số có dấu phẩy động
	
	double dNumber = 15.98d; //--> Đây là kiểu số thực, dùng để chứa những số có dấu phẩy động
	
	char cChar = 'a'; //--> char chỉ biểu diễn cho 1 ký tự. Nếu khai báo char cChar = 'ab' thì là sai
	
	 
	boolean bStatus = true; //--> Hay sử dụng
	
// Reference Type: Tham chiếu
	//String
		String addresses = "Hồ chí minh";
				
	// Array: 1 tập hợp chứa nhiều dữ liệu có cùng 1 kiểu. Không đc nhét nhiều kiểu dữ liệu vào mảng
	String[] studentAddress = {addresses, "Ha Noi", "Da Nang"};
	Integer[] studentNumber = {15, 20, 25};
	
	
	//Class
	Topic_02_Data_Type topic;
	
	//Interface
	WebDriver driver;
	
	//Object: có thể convert qua kiểu dữ liệu khác. 
	Object aObject;
	
	//Collection
	//List/Set/Queue/Map
	List<WebElement> hompageLinks = driver.findElements(By.tagName("a")); //--> List lưu trùng
	Set<String> allWindows = driver.getWindowHandles(); //--> Set không lưu trùng
	List<String> productName = new ArrayList<String>();
	
// Tham chiêu và nguyên thủy khác nhau
	//1. Nguyên thủy sẽ không có cái function đi theo: ví dụ viết int. thì không thấy funtion nào đi theo. 
	//Nhưng biến address là kiểu tham chiếu thì khi addresses. sẽ có funtion đi theo
	
	public void clickToelement() {
		addresses.trim();
		driver.findElement(By.xpath(address));
		topic.clickToelement();
		
	//2.Khác nhau về lưu trữ dữ liệu
		//+ Bộ nhớ RAM chia làm 2 loại: Stak và Heap. 
		//++ Stack: sẽ lưu các Biến và dạng Nguyên thủy
		//++ Heap: lưu dạng Tham chiếu 
		Topic_02_Data_Type topic = new Topic_02_Data_Type();
		topic.address = "Hà nội"; //-> Biến topic sẽ nằm ở Stack còn giá trị "Hà nôi" sẽ nằm ở Heap. topic.adress đang tham chiếu tới vùng nhớ ở Heap
		int x = 5; //-> Biến x đang tự tạo ra 1 vùng nhớ ở Stack
	}
	
}
