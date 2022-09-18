package in.ineuron.one_to_many_association;

public class MainSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Address3 []address3 = new Address3[2];
			address3[0]= new Address3();
		address3[0].setDoorNo(262);
		address3[0].setPinNo(515411);
		address3[0].setCountry("India");
		address3[0].setState("Andhra Pradesh");
		address3[0].setCity("Anantapur");
	
		address3[1]= new Address3();
		
		address3[1].setDoorNo(175);
		address3[1].setPinNo(515465);
		address3[1].setCountry("India");
		address3[1].setState("Andhra Pradesh");
		address3[1].setCity("Anantapur");
		
		

		
		Student3 student3 = new Student3();
		student3.setName("Sreekanth");
		student3.setAge(22);
		student3.setSid(11705009);
		student3.setAddress(address3);;
		student3.display();
	}

}
