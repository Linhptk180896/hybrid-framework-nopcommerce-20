package javaOOP;

public class Topic_08_OverLoading {
	int firstNumber;
	int secondNumber;
	//Overloading Constructor
	public  Topic_08_OverLoading() {
		System.out.println(this.firstNumber + this.secondNumber);
		
	}
	public  Topic_08_OverLoading(int number) {
		number = this.firstNumber + this.secondNumber;
		System.out.println(number);
		
	}
}
