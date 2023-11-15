import java.util.Scanner;
public class main_Emp {

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		
		System.out.print("Nhap so luong nhan vien: ");
		int n = cn.nextInt();
		Employee[] ds = new Employee[n+1];
		int k=1;
		for( int i=0; i<n; i++){
		cn.nextLine();
		System.out.print("Nhap ten nhan vien thu "+k+++": ");
		String ten = cn.nextLine();
		System.out.print("\tNhap chuc vu: ");
		String chucvu = cn.nextLine();
		System.out.print("\tNhap he so luong: ");
		double heosoluong = cn.nextDouble();
	
		ds [i] = new Employee(ten,chucvu,heosoluong);
		}
		System.out.print("\tTHONG TIN NHAN VIEN: \n");
		for( int i=0; i<n; i++){
			Employee kk = ds[i];
			kk.tinhLuongCongnhan();
			System.out.println("--------------------------------");
		}
		System.out.print("Nhập tên nhân viên cần xóa: ");
        String tenNV = new Scanner(System.in).nextLine();
        int viTri = -1;
        for (int i = 0; i < n; i++) {
            if (ds[i].getTen().equals(tenNV)) {
                viTri = i;
                break;
            }
        }
        if (viTri != -1) {
            for (int i = viTri; i < n - 1; i++) {
                ds[i] = ds[i + 1];
            }
           ds[n-1] = null;
           n--;
            
            System.out.println("\tDANH SÁCH NHAN VIEN SAO KHI XÓA:");
            for (int i=0; i<n; i++) {
            	Employee kk2 = ds[i];
                if (ds != null) {
                	kk2.tinhLuongCongnhan();
        			System.out.println("--------------------------------");
                }
            }
        } else {
            System.out.println("Không tìm thấy nhân viên có tên " + tenNV);
	}
	}
}