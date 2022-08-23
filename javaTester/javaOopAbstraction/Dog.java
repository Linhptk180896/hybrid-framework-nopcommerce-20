package javaOopAbstraction;

public class Dog implements IAnimal, ICity{
	//Implement  không mang ra để sử dụng được luôn 
	//Phải viết lại mới dùng được 
	//Khác với knowledge của kế thừa
	//Kế thừa lấy ra dùng được luôn

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String setAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAddress(String Address) {
		// TODO Auto-generated method stub
		
	}
	

}
