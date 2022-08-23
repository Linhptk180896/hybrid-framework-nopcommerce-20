package javaOOP;

public class CarOOP {
	private String carCompany;
	private String carType;
	private String fuelType;
	private float mileAge;
	private double carPrice;
	
	
	protected CarOOP(String carCompany, String carType, String fuelType, float mileAge, double carPrice) {
		super();
		this.carCompany = carCompany;
		this.carType = carType;
		this.fuelType = fuelType;
		this.mileAge = mileAge;
		this.carPrice = carPrice;
	}


	protected final String getCarCompany() {
		return carCompany;
	}

	
	protected final void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	
	protected final String getCarType() {
		return carType;
	}

	
	protected final void setCarType(String carType) {
		this.carType = carType;
	}

	
	protected final String getFuelType() {
		return fuelType;
	}

	
	protected final void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	
	protected final float getMileAge() {
		return mileAge;
	}

	
	protected final void setMileAge(float mileAge) {
		this.mileAge = mileAge;
	}

	
	protected final double getCarPrice() {
		return carPrice;
	}

	
	protected final void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	
	protected void showCarInfo() {
		System.out.println("Car Company " + getCarCompany());
		System.out.println("Car Type " + getCarType());
		System.out.println("Fuel Type " + getFuelType());
		System.out.println("Mile Age " + getMileAge());
		System.out.println("Price " + getCarPrice());
		
	}

	public static void main(String[] args) {
		CarOOP honda = new CarOOP("Honda", "City", "Petrol", 150f, 50000d);
		honda.showCarInfo();
		CarOOP toyota = new CarOOP("Toyota", "Camry", "Diessel", 200f, 60000d);
		toyota.showCarInfo();

	}

}
