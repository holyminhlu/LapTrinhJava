package quanlicanbo;
import java.util.Scanner;
public class main_qlcb {
	public static void main(String[]args) {
	qlcb ql = new qlcb();

    Scanner scanner = new Scanner(System.in);
    int luachon;

    do {
    	System.out.println("+------------------------------------------------+");
        System.out.println("+	1. Thêm mới cán bộ                       +");
        System.out.println("+	2. Tìm kiếm theo họ tên                  +");
        System.out.println("+	3. Xoa thong tin can bo                  +");
        System.out.println("+	4. Hien thi danh sach cac cac bo         +");
        System.out.println("+	5. Xoa Toan Bo Danh Sach !!!             +");
        System.out.println("+	6. Sua Thong Tin Can Bo                  +");
        System.out.println("+	7. Thoat                                 +");
    	System.out.println("+------------------------------------------------+");
        System.out.print("\tNhập lựa chọn: ");
        luachon = scanner.nextInt();

        switch (luachon) {
            case 1:
                System.out.print("Chọn loại cán bộ (1. Công nhân, 2. Kỹ sư, 3. Nhân viên): ");
                int loaiCanBo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập họ: ");
                String ho = scanner.nextLine();
                System.out.print("Nhập tên: ");
                String ten = scanner.nextLine();
                System.out.print("Nhập tuổi: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập giới tính: ");
                String gt = scanner.nextLine();
                System.out.print("Nhập địa chỉ: ");
                String diaChi = scanner.nextLine();

                if (loaiCanBo == 1) {             
                    System.out.print("Nhập bậc công nhân (1 đến 10): ");
                    int bac = scanner.nextInt();
                    congnhan newCongNhan = new congnhan(ho, ten, age, gt, diaChi, bac);
                    ql.themCanBo(newCongNhan);
                } else if (loaiCanBo == 2) {
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganhDaoTao = scanner.nextLine();
                    kysu newKySu = new kysu(ho, ten, age, gt, diaChi, nganhDaoTao);
                    ql.themCanBo(newKySu);
                } else if (loaiCanBo == 3) {
                    System.out.print("Nhập công việc: ");
                    String congViec = scanner.nextLine();
                    nhanvien newNhanVien = new nhanvien(ho, ten, age, gt, diaChi, congViec);
                    ql.themCanBo(newNhanVien);
                } else {
                    System.out.println("Lựa chọn không hợp lệ");
                }
                break;
            case 2:
                scanner.nextLine();
                System.out.print("Nhập họ tên cần tìm: ");
                String tenCanTim = scanner.nextLine();
                ql.timKiemTheoHoTen(tenCanTim);
            case 3:
                scanner.nextLine();
                System.out.print("Nhập họ tên cần xoa: ");
                String tencanxoa = scanner.nextLine();
                ql.xoaTheoHoTen(tencanxoa);
            case 4:
            	//scanner.nextLine();
            	System.out.printf("DANH SACH CAN BO TRONG CONG TY\n");
                ql.hienThiDanhSachCanBo();

            case 5: 
            	scanner.nextLine();
            	ql.xoaToanBoDanhSach();
            case 6:
            	scanner.nextLine();
                System.out.print("Nhập họ tên cần chinh sua: ");
                String tenCanSua = scanner.nextLine();
                ql.xoaTheoHoTen(tenCanSua);           
            case 7:
                System.out.println("Chương trình kết thúc.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }
    } while (luachon != 4);
    scanner.close();
	}
}