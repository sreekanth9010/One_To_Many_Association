package in.ineuron.one_to_many_association;



public class MainTestApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address1 []address = new Address1[2];
		address[0]=new Address1(515411,262,"Andhra Pradesh","Anantapur","India");
		address[1]=new Address1(515465,175,"Andhra Pradesh","Anantapur","India");
		
		
Student1 student = new Student1("Sreekanth",22,11705009,address);
		
		student.display();
		
	}

}
