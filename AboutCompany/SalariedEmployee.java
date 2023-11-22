package AboutCompany;

public  class SalariedEmployee extends Employee{
	private double weekySalary; 	//lương hàng tuần

	public SalariedEmployee(String firstName, String lastName,
			String socialSecurityNumber, double weekySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weekySalary = weekySalary;
	}

	public double getWeekySalary() {
		return weekySalary;
	}

	public void setWeekySalary(double weekySalary) {
		this.weekySalary = weekySalary;
	}
@Override
	public double earnings() {
		return weekySalary*4;
}
@Override
public void outputInformation() {
	System.out.println("Ten Nhan Vien: "+getFirstName()+" "+getLastName());
	System.out.println("So bao hiem xa hoi (Social Security Number ): "+getSocialSecurityNumber());
}
}
