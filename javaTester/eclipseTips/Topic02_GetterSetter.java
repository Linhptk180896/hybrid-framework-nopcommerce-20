package eclipseTips;

public class Topic02_GetterSetter {
	private String carName;
	private String carType;
	private String carColor;
	private String carMachine;
	

	
	public static void main(String[] args) {
		Topic02_GetterSetter topic02 = new Topic02_GetterSetter();
		
	}


//--> Generate getters setter
	/**
	 * @return the carColor
	 */
	public final String getCarColor() {
		return carColor;
	}



	/**
	 * @return the carName
	 */
	public final String getCarName() {
		return carName;
	}


	/**
	 * @param carName the carName to set
	 */
	public final void setCarName(String carName) {
		this.carName = carName;
	}


	/**
	 * @param carColor the carColor to set
	 */
	public final void setCarColor(String carColor) {
		this.carColor = carColor;
	}

//--> Generate toString được dùng khi cần log ra có những giá trị gì bên trong -> Thường là dev sẽ dùng	

	@Override
	public String toString() {
		return "Topic02_GetterSetter [carName=" + carName + ", carType=" + carType + "]";
	}

//--> Generate constructor 
//public Topic02_GetterSetter(String carName) {
//	super();
//	this.carName = carName;
//}



}


	

	
	


