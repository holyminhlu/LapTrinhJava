import java.util.Scanner;
public class mainThiSinh {

	private static final String KhoiA = null;
	private static final String KhoiB = null;
	private static final String KhoiC = null;

	public static void main(String[] args) {
		
		TuyenSinh tuyensinh = new TuyenSinh();
		Scanner scanner = new Scanner(System.in);
	    int luachon;

	    do {
	    	System.out.println("+------------------------------------------------+");
	        System.out.println("+	1. Thêm mới Thi Sinh                     +");
	        System.out.println("+	2. Tim Kiem Theo So Bao Danh             +");
	        System.out.println("+	3. Hien Thi Thong Tin Va Khoi Thi        +");
	        System.out.println("+	4. Xoa Thi Sinh Theo So Bao Danh         +");
	        System.out.println("+	5. Xoa Toan Bo Danh Sach                 +");
	        System.out.println("+	6. Sua Thong Tin Thi Sinh Theo SBD       +");
	        System.out.println("+	7. EXIT PROGRAM                          +");
	    	System.out.println("+------------------------------------------------+");
	        System.out.print("\tNhập lựa chọn: ");
	        luachon = scanner.nextInt();
	     switch (luachon) {
		case 1:
			 scanner.nextLine();
			 System.out.print("Chọn Khoi Thi (1.Khoi A, 2.Khoi B, 3.Khoi C): ");
             int loaiThiSinh = scanner.nextInt();
             while( loaiThiSinh <=0 || loaiThiSinh > 3){
            	 System.out.println("Nhap sai Khoi Thi, Vui Long  Nhap Lai !!!");
            	 System.out.print("Chọn Khoi Thi (1.Khoi A, 2.Khoi B, 3.Khoi C): ");
                 loaiThiSinh = scanner.nextInt();
             }
             scanner.nextLine();
             System.out.print("Nhap So Bao Danh Sinh Vien: ");
             String SoBaoDanh = scanner.nextLine();
             
             System.out.print("Nhap Ho Ten Thi Sinh: ");
             String HoTen = scanner.nextLine();
             
             System.out.print("Nhap Dia Chi Sinh Vien: ");
             String DiaChi = scanner.nextLine();
             
             System.out.print("Nhập Muc Do Uu Tien ( Kv1, Kv2, Kv3 ): ");
             String MucDoUuTien = scanner.nextLine();

             if (loaiThiSinh == 1) {             
                 ThiSinhKhoiA newtsA = new ThiSinhKhoiA(SoBaoDanh, HoTen, DiaChi, MucDoUuTien, KhoiA);
                 tuyensinh.themThiSinh(newtsA);
             } else if (loaiThiSinh == 2) {
                 ThiSinhKhoiB newtsB = new ThiSinhKhoiB(SoBaoDanh, HoTen, DiaChi, MucDoUuTien, KhoiB);
                 tuyensinh.themThiSinh(newtsB);
             } else if (loaiThiSinh == 3) {
                 ThiSinhKhoiC newtsC = new ThiSinhKhoiC(SoBaoDanh, HoTen, DiaChi, MucDoUuTien, KhoiC);
                 tuyensinh.themThiSinh(newtsC);
             } 
             break;
		case 2:
			scanner.nextLine();
			System.out.print("Nhap so bao danh can tim: ");
			String timtheoSBD = scanner.nextLine();
			tuyensinh.timKiemTheoSoBaoDanh(timtheoSBD);
			break;
		case 3:
			System.out.printf("DANH SACH THI SINH\n");
            tuyensinh.hienThiThongTinThiSinh();
			break;
		case 4:
			scanner.nextLine();
			System.out.print("Nhap so bao danh can XOA: ");
			String xoatheoSBD = scanner.nextLine();
			tuyensinh.xoaTheoSoBaoDanh(xoatheoSBD);
			break;
		case 5:
			scanner.nextLine();
			int conchim;
		    	System.out.println("+------------------------------------------------+");
		        System.out.println("+	1. TOI SE XOA TOAN BO DANH SACH          +");
		        System.out.println("+	2. TOI SUY NGHI LAI ROI                  +");
		        System.out.println("+	3. EXIT                                  +");
		    	System.out.println("+------------------------------------------------+");
		        System.out.print("\tNhập lựa chọn: ");
		        conchim	 = scanner.nextInt();
		     if( conchim == 1){
		    	scanner.nextLine();
		    	System.out.println("DA XOA TOAN BO DANH SACH");
	            tuyensinh.xoaToanBoDanhSach();
		     }else if( conchim == 2 ){
		    	 scanner.nextLine();
		    	 System.out.println("Khong xoa thi thoi ");
		     }else if( conchim == 3 ){
		    	 break;
		     }
		     break;
		case 6:
			scanner.nextLine();
			System.out.print("Nhap so bao danh thi sinh can chinh sua: ");
			String suaTheoSBD = scanner.nextLine();
			tuyensinh.suaTheoSoBaoDanh(suaTheoSBD);
			break;
		case 7:
			System.out.println("Program Finished");
			break;
			
	    default:
            System.out.println("Lựa chọn không hợp lệ");
            break;
	     }
	   } while (luachon != 7);
	    scanner.close();
	}
}