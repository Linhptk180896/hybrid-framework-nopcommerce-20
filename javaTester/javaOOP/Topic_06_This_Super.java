package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Topic_06_This_Super extends BaseOOP{
	private int firstNumber;
	private int secondNumber;
	public long shortTimeout ;
	public long longTimeout ;
	WebDriver driver;
	//this chỉ dùng trong phạm vi class hiện tại, không ra ngoài
	
//	public Topic_06_This_Super() {
//		this(10, 20); 
	//Dùng this để gọi từ constructor này qua constructor khác thì dòng this phải đứng đầu tiên 
//		
//	}
	
	public Topic_06_This_Super() {
		//Dùng super có giá trị khi nó có thể 
		//lựa chọn hàm constructor của class cha
		
		super(25);
			System.out.println("Constructor của class con");
			
	}
	//Khi 1 class con kế thừa 1 class cha. Class cha có constructor thì con 
	//cũng phải có constructor và gọi qua 1 constructor nào đó của cha
	public  Topic_06_This_Super(int firstNumber, int secondNumber) {
		super(10);
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	public void sumNumber() {
		System.out.println(this.firstNumber + this.secondNumber);
	}
	public void showNumber() {
		this.sumNumber();
	}
	
	public static void main(String[] args) {

	
		Topic_06_This_Super topic = new Topic_06_This_Super();
//		Topic_06_This_Super topic06= new  Topic_06_This_Super(15,7);
//		
//		topic06.sumNumber();
//		topic06.showNumber();
//		
		
	}
	public void clickToElement() {
		//Không dùng super sẽ gọi qua hàm ở class con hiện tại 
	setImplicitWait(driver);
	//Dùng super sẽ gọi qua hàm ở class cha
	super.setImplicitWait(driver);
	
	}
	
	public void setImplicitWait(WebDriver driver) {
		//Nếu không set super thì nó sẽ gọi vào biến longTimeout của class Topic_06
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS); 
	}
	
	public void setImplicitWaitSuper(WebDriver driver) {
		//Nếu  set super thì nó sẽ gọi vào biến longTimeout của class cha BaseOOP 
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(shortTimeout, TimeUnit.SECONDS); 
	}
	
}
