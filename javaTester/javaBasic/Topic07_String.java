package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic07_String {
	
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "\\browserDrivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		//Length() = lấy ra độ dài chuỗi
		String  schoolName = "Automation FC Test";
		String courseName = "AUTOMATION FC TEST";
		String schoolAddress = "Ho Chi Minh City";
		System.out.println(schoolName.length());
		
		//CharAt() =  Lấy ra 1 ký tự
		System.out.println(schoolName.charAt(4));
		
		//Concat() = nỗi chuỗi -> ít dùng 
		System.out.println("Nối chuỗi: " + schoolAddress.concat(schoolName));
		
		//Equals:  so sánh 2 chuỗi bằng nhau tuyệt đối
		System.out.println("Kiểm tra 2 chuỗi = nhau tuyệt đối " + schoolAddress.equals(schoolName));
		System.out.println("Kiểm tra 2 chuỗi = nhau tuyệt đối " + schoolAddress.equals("Ho Chi Minh City"));
		//IgnoreCase là không phân biệt hoa thường
		System.out.println("Kiểm tra 2 chuỗi = nhau tuyệt đối " + schoolName.equalsIgnoreCase(courseName));
		
		//Start with/End with/Contains
		System.out.println("Có bắt đầu bằng 1 ký tự/chuỗi ký tự " + schoolAddress.startsWith("H"));
		System.out.println("Có chứa 1 ký tự/chuỗi ký tự " + schoolAddress.contains("H"));
		System.out.println("Có chứa 1 ký tự/chuỗi ký tự " + schoolAddress.endsWith("test"));
		
		//Index Of: sẽ tính index của chữ cái "t" trong chuỗi test -> kq là 3
		System.out.println("Lấy index của chuỗi " + schoolAddress.indexOf("Chi"));
		
		
		//subString: tách 1 ký tự, chuỗi ký tự trong chuỗi. Áp dụng thực thế lấy số 24 trong cụm "24 of 132 results"
		System.out.println("Tách 1 ký tự/chuỗi ký tự trong chuỗi: " + schoolName.substring(4));
		System.out.println("Tách 1 ký tự/chuỗi ký tự trong chuỗi: " + schoolName.substring(2,10));
		
		String result = "Viewing 48 of 132 results";
		
		//split: tách chuỗi thành 1 mảng dựa vào ký tự hoặc chuỗi ký tự 
		String results[] = result.split(" "); //tách chuỗi dựa vào dấu cách
		for (String string : results) {
			System.out.println(string);
		}
		System.out.println(results[1]);
		
		// Replace
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);
		
		//parseFloat/parseInt: convert String qua float
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);
		
		//valueOf:  convert từ float về String
		productPrice =String.valueOf(productPriceF);
		System.out.println(productPrice);
		
		//upper case/lower case
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		if (osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
			
		}else {
			Keys key = Keys.COMMAND;
		}
		
		String driverInstanceName = driver.toString();
		System.out.println(driverInstanceName);
		
		
		//trim: cắt khoảng trắng
		String helloWorld = "\r\n        Hello World!\r\n        ";
		System.out.println(helloWorld.trim());
		System.out.println(helloWorld);
		
		//Dynamic locator: 
		//Đại diện cho 1 chuỗi: %s
		// %b, %t, %d
		String dynamicButtonXpath = "//button[@id='%s']";
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "register"));
	}

}
