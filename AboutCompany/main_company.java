package AboutCompany;
import java.util.Scanner;
public class main_company {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String firstName = sc.nextLine();
		System.out.print("Last Name: ");
		String lastName = sc.nextLine();
		System.out.print("Social Security Number: ");
		String socialSecurityNumber = sc.nextLine();
		System.out.print("Week salary: ");
		double weekySalary = sc.nextDouble();
		System.out.print("WAGE an Hours: ");
		double wage = sc.nextDouble();
		System.out.print("HOURS: ");
		double hours = sc.nextDouble();
		System.out.print("Tong Doanh Thu ( GrossSales ): ");
		double grossSales = sc.nextDouble();
		System.out.print("Ti le hoa hong ( CommissionRate ):");
		double commissionRate = sc.nextDouble();
		System.out.print("Luong co ban ( Basic Salary ):");
		double baseSalary = sc.nextDouble();
		
		Employee ps = new SalariedEmployee(firstName,lastName,socialSecurityNumber,weekySalary);
		HourlyEmployee ps2 = new HourlyEmployee(firstName,lastName,socialSecurityNumber);
		CommissionEmployee ps3 = new CommissionEmployee(firstName, lastName, socialSecurityNumber);
		BasePlusCommissionEmployee ps4 = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber);
		
		ps2.setWage(wage);
		ps2.setHours(hours);
		ps3.setGrossSales(grossSales);
		ps3.setCommissionRate(commissionRate);
		ps4.setBaseSalary(baseSalary);
		
		ps.outputInformation();
		System.out.println("Luong tren thang: "+ps.earnings());
		System.out.println("Luong theo gio: "+ps2.earnings());
		System.out.println("Luong theo hoa hong: "+ps3.earnings());
		System.out.println("Luong co ban theo hoa hong: "+ps4.earnings());
	}

}
