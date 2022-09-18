package in.ineuron.one_to_many_association;


//Target Class 
public class Student3 {
	
	private String name;
	private int age;
	private int sid;
	
	//Has-a variables
	private Address3 []address;

	
	//Getters and setters to get and set the values 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Address3[] getAddress() {
		return address;
	}

	public void setAddress(Address3[] address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("************Dispalying student details *******************");
		System.out.println("The name of the student is :: "+name);
		System.out.println("The age of the student is  :: "+age);
		System.out.println("The student id of student is :: "+sid);
		System.out.println("**********************************************************");
		System.out.println("The address of the student are ::");
		for(int i=0;i<address.length;i++)
		{
			
			System.out.println("The pincode is :: "+address[i].getPinNo());
			System.out.println("The door no is  :: "+address[i].getDoorNo());
			System.out.println("The state is :: "+address[i].getState());
			System.out.println("The city is :: "+address[i].getCity());
			System.out.println("The country is::"+address[i].getCountry());
			System.out.println();

		}
		}

}
