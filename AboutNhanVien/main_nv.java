package AboutNhanVien;
import java.util.Scanner;
import java.util.Calendar;
public class main_nv {

	public static void main(String[] args) {
	Scanner nv = new Scanner(System.in);
	Calendar st = Calendar.getInstance();
	////
	System.out.print("Nhap so luong nhan vien: ");
    int soluong = nv.nextInt();
    Employee[] ds = new Employee[soluong+1];
    ////
    int k = 1; int l=1;
	
	for( int i=0; i<soluong; i++) {
	System.out.println("\tTHONG TIN NHAN VIEN THU "+k+++":");
	nv.nextLine();
	
	System.out.print("Nhap ho nhan vien: ");
	    String honv = nv.nextLine();
	System.out.print("Nhap ten nhan vien: ");
	    String tennv = nv.nextLine();
	    
	System.out.print("Nhap ngay sinh nhan vien: ");
	    int ngaysinh = nv.nextInt();
	    while( ngaysinh < 1 || ngaysinh > 31 ) {
	    	System.out.print("Nhap ngay sinh nhan vien sai !!! Nhap lai: ");
	    	 ngaysinh = nv.nextInt();
	    }  
	    	st.set(Calendar.DAY_OF_MONTH,ngaysinh);
	    	
	System.out.print("Nhap thang sinh nhan vien: ");
	    int thangsinh = nv.nextInt();
	    while( thangsinh < 1 || thangsinh > 12 ) {
	    	System.out.print("Nhap thang sinh nhan vien sai !!! Nhap lai: ");
	    	 thangsinh = nv.nextInt();
	    } 
	    	st.set(Calendar.MONTH,thangsinh);
	    	
	System.out.print("Nhap nam sinh nhan vien: ");
	    int namsinh = nv.nextInt();
	    while( namsinh < 2000 || namsinh > 2050 ) {
	    	System.out.print("Nhap nam sinh nhan vien sai !!! Nhap lai: ");
	    	 namsinh = nv.nextInt();
	    } 
	    	st.set(Calendar.YEAR,namsinh);
	    	
	System.out.println("\tTHONG TIN NGAY BAT DAU LAM CUA NHAN VIEN THU "+l+++":");
	
	System.out.print("Nhap ngay bat dau lam nhan vien: ");
		int ngaybd = nv.nextInt();
		while( ngaybd < 1 || ngaybd > 31 ) {
	    	System.out.print("Nhap ngay bat dau sai !!! Nhap lai: ");
	    	 ngaybd = nv.nextInt();
	    } 
			st.set(Calendar.DAY_OF_MONTH,ngaybd);
			
	System.out.print("Nhap thang bat dau lam nhan vien: ");
		int thangbd = nv.nextInt();
		while( thangbd < 1 || thangbd > 12 ) {
	    	System.out.print("Nhap thang bat dau sai !!! Nhap lai: ");
	    	 thangbd = nv.nextInt();
	    } 
			st.set(Calendar.MONTH,thangbd);
			
	System.out.print("Nhap nam bat dau lam nhan vien: ");
		int nambd = nv.nextInt();
		while( nambd < 2000 || nambd > 2050 || nambd < namsinh ) {
	    	System.out.print("Nhap nam bat dau sai !!! Nhap lai: ");
	    	 nambd = nv.nextInt();
	    } 
			st.set(Calendar.YEAR,nambd);
	
	ds[i] = new Employee(honv, tennv, ngaysinh, thangsinh, namsinh, ngaybd, thangbd, nambd);
		}
	System.out.println("\n----------------------------------------");
	System.out.print("\tDU LIEU VE NHAN VIEN VUA NHAP: \n");
	for(Employee xuat: ds) {
		System.out.print("\n----------------------------------------\n");
		if( xuat != null ) 
		xuat.xuatNv();	
		System.out.print("\n----------------------------------------\n");
	}
	}
}
