package com.nopcommerce.data;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import commons.GlobalConstans;

public class UserDataMapper {
@JsonProperty("firstname") //Dùng key của file json
private String firstName;

@JsonProperty("lastname") //Dùng key của file json
private String lastName;

@JsonProperty("date") //Dùng key của file json
private String date;

@JsonProperty("gender") //Dùng key của file json
private String gender;

@JsonProperty("month") //Dùng key của file json
private String month;

@JsonProperty("year")
private String year;

@JsonProperty("emailAddress")
private String emailAddress;

@JsonProperty("password")
private String password;

/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
//

//---------------
//Hàm đọc file json 
public static UserDataMapper getUserData() {
	try { 
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return mapper.readValue(new File(GlobalConstans.PROJECT_PATH + "resources/Data.json"), UserDataMapper.class);
	} catch (Exception e) {
		
		e.printStackTrace();
		return null;
	}
	
	
}
//-------------------


public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getDate() {
	return date;
}

public String getMonth() {
	return month;
}

public String getYear() {
	return year;
}

public String getEmailAddress() {
	return emailAddress;
}

public String getPassword() {
	return password;
}

}
