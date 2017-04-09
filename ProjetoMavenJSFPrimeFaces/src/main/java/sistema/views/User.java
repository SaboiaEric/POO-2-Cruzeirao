package sistema.views;

import java.io.Serializable;

public class User implements Serializable {

	private String ClubName;

	private String DirectorClub;

	private Integer AgeClub;

	private String street;

	private String city;

	private String postalCode;

	private String info;

	private String email;

	private String phone;


	
	public String getClubName() {
		return ClubName;
	}

	public void setClubName(String clubName) {
		ClubName = clubName;
	}

	public String getDirectorClub() {
		return DirectorClub;
	}

	public void setDirectorClub(String directorClub) {
		DirectorClub = directorClub;
	}

	public Integer getAgeClub() {
		return AgeClub;
	}

	public void setAgeClub(Integer ageClub) {
		AgeClub = ageClub;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}