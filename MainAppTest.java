package one_to_many_associations;

public class MainAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.seteId(10);
		emp1.seteName("sachin");
		emp2.seteId(18);
		emp2.seteName("virat");
		emp3.seteId(45);
		emp3.seteName("rohit");
		Employee []k= new Employee[3];
		k[0]=emp1;
		k[1]=emp2;
		k[2]=emp3;
		
		Departement departement = new Departement();
		departement.setDeptNo(1234);
		departement.setDeptName("BCCI");
		departement.setDeptLoaction("DUBAI");
		departement.setEmployee(k);
		departement.disp();
		
	}

}
