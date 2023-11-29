package AboutQLCB;
import java.util.Scanner;
import java.util.ArrayList;
public class main_QLCB {
	public static void main(String[]args) {
	QLCB qlcb = new QLCB();

    Scanner scanner = new Scanner(System.in);
    int luachon;

    do {
    	System.out.println("+------------------------------------------------+");
        System.out.println("+	1. Thêm mới cán bộ                       +");
        System.out.println("+	2. Tìm kiếm theo họ tên                  +");
        System.out.println("+	3. Hiển thị thông tin danh sách cán bộ   +");
        System.out.println("+	4. Xoa thong tin can bo                  +");
        System.out.println("+	5. Thoat                                 +");
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
                    CongNhan newCongNhan = new CongNhan(ho, ten, age, gt, diaChi, bac);
                    qlcb.themCanBo(newCongNhan);
                } else if (loaiCanBo == 2) {
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganhDaoTao = scanner.nextLine();
                    KySu newKySu = new KySu(ho, ten, age, gt, diaChi, nganhDaoTao);
                    qlcb.themCanBo(newKySu);
                } else if (loaiCanBo == 3) {
                    System.out.print("Nhập công việc: ");
                    String congViec = scanner.nextLine();
                    NhanVien newNhanVien = new NhanVien(ho, ten, age, gt, diaChi, congViec);
                    qlcb.themCanBo(newNhanVien);
                } else {
                    System.out.println("Lựa chọn không hợp lệ");
                }
                break;
            case 2:
                scanner.nextLine();
                System.out.print("Nhập họ tên cần tìm: ");
                String tenCanTim = scanner.nextLine();
                qlcb.timKiemTheoHoTen(tenCanTim);
                break;
            case 3:
                scanner.nextLine();
                System.out.print("Nhập họ tên cần xoa: ");
                String tencanxoa = scanner.nextLine();
                qlcb.xoaTheoHoTen(tencanxoa);
                break;
            case 4:
            	System.out.printf("********************DANH SACH CAN BO********************\n");
                qlcb.hienThiDanhSachCanBo();
                break;
            case 5: 
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