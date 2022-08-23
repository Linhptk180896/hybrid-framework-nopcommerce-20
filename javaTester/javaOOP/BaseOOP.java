package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseOOP {
	public long shortTimeout = 15;
	protected long longTimeout = 45;
	//Nếu chuyển thành private long longTimeout thì không truy cập đc
	WebDriver driver;
	
	public void setImplicitWait(WebDriver driver) {
		//Nếu không set super thì nó sẽ gọi vào biến longTimeout của class Topic_06
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS); 
	}
	//Có private constructor
	private BaseOOP() {
		System.out.println("Constructor của class cha");}
		
	public BaseOOP(String name) {
		System.out.println("Constructor của class cha " + name);}
		
	public BaseOOP(int number) {
		System.out.println("Constructor của class cha " + number);
		
}
	public static void main(String[] args) {
		

	}

}
