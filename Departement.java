package one_to_many_associations;
//Target class
public class Departement {
		private int deptNo;
		private String deptName;
		private String deptLocation;
		private Employee []employees;
		
		//getters and setters
		public int getDeptNo() {
			return deptNo;
		}
		
		public void setDeptNo(int deptNo) {
			this.deptNo = deptNo;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getDeptLoaction() {
			return deptLocation;
		}
		public void setDeptLoaction(String deptLoaction) {
			this.deptLocation = deptLoaction;
		}
		public Employee[] getEmployee() {
			return employees;
		}
		public void setEmployee(Employee[] employees) {
			this.employees = employees;
		}
		
		public void disp()
		{
			System.out.println("*********DISPLAYING DEPARTEMENT DETAILS**********");
			System.out.println("Departement no is:   "+deptNo);
			System.out.println("Departement name is: "+deptName);
			System.out.println("Departement Location  is:  "+deptLocation);
			
			System.out.println();
			
			System.out.println("*******DISPLAYING EMPLOYEE DETAILS *******");
			System.out.println();
			for(Employee employee:employees)
			{
				System.out.println("the employee id  is:   "+employee.geteId());
				System.out.println("the employee name   is:  "+employee.geteName());
				System.out.println();
			}
			



		}
		
		
}
