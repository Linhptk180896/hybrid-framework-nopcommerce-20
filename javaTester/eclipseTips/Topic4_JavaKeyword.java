package eclipseTips;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import commons.IPage2;
import commons.Page;

//public abstract class Topic4_JavaKeyword {
//
//	public abstract void setDriver(); //--> 1. Abstract  method sẽ không có phần thân
//
//	//2.Default(phạm vi trong package) liên quan đến access modifier đi với 3. protected(thông qua tính chất kế thừa) - 4.public(phạm vi qua tất cả package-class đều có thể truy cập đc) -  5.private (Chỉ trong class mới dùng đc)
//
//}


 public class  Topic4_JavaKeyword extends Page implements IPage2 {
	 // Biến global
	 WebDriver driver;
	@Test 
	public void TC() {
		//Biến local
		WebDriver driver = null;
		System.out.println(driver instanceof WebDriver);
		driver.get("");
		this.driver.get("");
	}
	 
 } //--> 5. một class chỉ được kết thừa 1 class - nhưng được implement nhiều interface
 
 //--> 6. Throws/throw: ví dụ khi dùng thread.sleep thì nó sẽ vứt ra exception
 //--> 7. double/byte/long/int/float: kiểu dũ liệu
 //--> 8. instance of: dùng để  kiểm tra xem 1 biến có thuộc vào kiểu dữ liệu đó hay không? ví dụ: System.out.println(driver instanceof WebDriver);
 //--> 9. return: dùng khi hàm cần láy dữ liệu ra thì dùng return
 //--> 10. this: trong trường hợp biên local hoặc global giống nhau thì dùng this.biến golobal để phân biệt. ví dụ 
// driver.get(""); 
// this.driver.get("");
 
 
 
 
 
 
 
 
 