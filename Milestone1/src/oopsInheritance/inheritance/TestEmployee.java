package oopsInheritance.inheritance;
class GetSet extends Employee{
GetSet(String VariableName){
	this.VariableName=VariableName;
	
}
GetSet(double AnnualSalary, int year,String InsuranceNumber){
	this.AnnualSalary=AnnualSalary;
	this.year=year;
	this.Insurancenumber=InsuranceNumber;
}
	void getPerson() {
		System.out.println("Member variable name: "+VariableName);
	}
	void getEmp() {
		System.out.println("Annual Salary is : "+AnnualSalary);
		System.out.println("year the employee started to work : "+year);
		System.out.println("The National insurance number : "+Insurancenumber);
	}
	
	
}
	public class TestEmployee {
		public static void main(String args[]) {
			GetSet gs1=new GetSet("Mouni");
			GetSet gs2=new GetSet(100000, 2021, "WTN3");
			gs1.getPerson();
			gs2.getEmp();
		}

}
