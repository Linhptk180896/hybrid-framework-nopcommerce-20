package javaOOP;


public class Topic_07_Getter_Setter {
	public String personName;
	public int personAge;
	public int personPhone; 
	public int personBankAccountAmount;
	
	
	
	public void showPersonInfo() {
		System.out.println(this.personName);
		System.out.println(this.personAge);
		System.out.println(this.personPhone);
		System.out.println(this.personBankAccountAmount);
	}
	
	//Setter
	public void setPersonName(String personName) {
		if (personName ==null || personName=="") {
			throw new IllegalArgumentException("Naem is invalid");
			
		}
		else {
			this.personName = personName;
		}
	}
	
	
	//Getter
	public String getPersonName() {
		return this.personName;
	}

	
	
	protected final int getPersonAge() {
		return personAge;
	}

	
	protected final void setPersonAge(int personAge) {
		if (personAge > 15 && personAge <60) {
			throw new IllegalArgumentException("Tuổi ko hợp lệ");
			
		}
		else {
			this.personAge = personAge;
		}
	}

	protected final int getPersonPhone() {
		return personPhone;
	}

	
	protected final void setPersonPhone(int personPhone) {
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("Sđt bắt đầu = ...");
			
		}else if(personPhone< 10 || personPhone>11) {
			throw new IllegalArgumentException("invalid");
		}
		else {
			this.personPhone = personPhone;	
		}
	}

	
	protected final int getPersonBankAccountAmount() {
		return personBankAccountAmount;
	}

	
	protected final void setPersonBankAccountAmount(int personBankAccountAmount) {
		this.personBankAccountAmount = personBankAccountAmount;
	}
}
	