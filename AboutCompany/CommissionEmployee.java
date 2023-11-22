package AboutCompany;

public class CommissionEmployee extends Employee {
		private double grossSales;	//Tổng doanh thu
		private double commissionRate; 	//tỷ lệ hoa hồng
		
	public CommissionEmployee(String firstName, String lastName,
				String socialSecurityNumber) {
			super(firstName, lastName, socialSecurityNumber);
			this.grossSales = 0;
			this.commissionRate = 0;
		}
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public double earnings() {
		return grossSales*(commissionRate/100);
	}

}
