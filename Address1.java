package in.ineuron.one_to_many_association;


//Dependent class 
public class Address1 {

	
	private int pinNo;
	private int doorNo;
	private String state;
	private String city;
	private String country;
	
	//performing constructor injection
	public Address1(int pinNo, int doorNo, String state, String city, String country) {
		super();
		this.pinNo = pinNo;
		this.doorNo = doorNo;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	
	//getters and setters to get and set the values 
	

	public int getPinNo() {
		return pinNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
}
