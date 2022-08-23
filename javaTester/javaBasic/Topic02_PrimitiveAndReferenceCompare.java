package javaBasic;

public class Topic02_PrimitiveAndReferenceCompare {
	int number = 8;
	
	public static void main(String[] args) {
		int x = 5; //--> 1 vùng nhớ cho biến x = 5
		
		int y = x; // --> 1 vùng nhớ mới cho biến y = x = 5 
		
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		y = 10; //--> y tạo ra 1 vùng nhớ mới riêng biệt =10. Nên khi y cập nhật giá trị mới thì y không liên quan đến x nữa
		System.out.println("x = " + x); //-> x = 5
		System.out.println("y = " + y); //-> y = 10. y tạo ra 1 vùng nhớ mới riêng biệt =10. Nên khi y cập nhật giá trị mới thì y không liên quan đến x nữa
				
//----------------------------------------------
		Topic02_PrimitiveAndReferenceCompare firstVariable = new Topic02_PrimitiveAndReferenceCompare();
		Topic02_PrimitiveAndReferenceCompare secondVariable = firstVariable;
				
		System.out.println("Before = " + firstVariable.number);
		System.out.println("Before = " + secondVariable.number);
		
		secondVariable.number = 10;
		System.out.println("After = " + firstVariable.number); //--> Sẽ có giá trị = 10 do cùng tham chiếu tới 1 vùng nhớ là number
		System.out.println("After = " + secondVariable.number); //--> Sẽ có giá trị = 10 
		//-------------
		Topic02_PrimitiveAndReferenceCompare first1Variable = new Topic02_PrimitiveAndReferenceCompare();
		Topic02_PrimitiveAndReferenceCompare second2Variable = new Topic02_PrimitiveAndReferenceCompare();
		
		System.out.println("Before = " + first1Variable.number);
		System.out.println("Before = " + second2Variable.number);
	
		second2Variable.number = 10;
		System.out.println("After = " + first1Variable.number); //--> Sẽ có giá trị = 8 do KHÔNG cùng tham chiếu tới 1 vùng nhớ vói second2Variable
		System.out.println("After = " + second2Variable.number); //--> Sẽ có giá trị = 10 

	}

}
