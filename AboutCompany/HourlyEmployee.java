package AboutCompany;

public class HourlyEmployee extends Employee {
		private double wage;  //luong
		private double hours;   // gio lam
		
	public HourlyEmployee(String firstName, String lastName,
				String socialSecurityNumber) {
			super(firstName, lastName, socialSecurityNumber);
			this.wage = 0;
			this.hours = 0;
		}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	//@Override
	public double earnings() {
		if( hours < 40 ){
			return wage*hours;
		}else{
			return (wage * hours)*1.5;
		}
	}

}
