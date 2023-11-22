package AboutCompany;

public class BasePlusCommissionEmployee extends CommissionEmployee {
		private double baseSalary; 	//luong co ban

		public BasePlusCommissionEmployee(String firstName, String lastName,
				String socialSecurityNumber) {
			super(firstName, lastName, socialSecurityNumber);
			this.baseSalary = 0;
		}

		public double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(double baseSalary) {
			this.baseSalary = baseSalary;
		}
	@Override
		public double earnings() {
			return getBaseSalary() + super.earnings();
		}
}
