package AboutQLCB;
import java.util.Scanner;
import java.util.ArrayList;
public class mainQLCB {
	public static void main(String[]args) {
	QlCb qlcb = new QlCb();

    CongNhan congNhan = new CongNhan("CongNhan1", 30, "Nam", "Hanoi", 5);
    KySu kySu = new KySu("KySu1", 35, "Nam", "HCM", "CNTT");
    NhanVien nhanVien = new NhanVien("NhanVien1", 25, "Nu", "Da Nang", "Ban hang");

    qlcb.themCanBo(congNhan);
    qlcb.themCanBo(kySu);
    qlcb.themCanBo(nhanVien);

    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        System.out.println("1. Thêm mới cán bộ");
        System.out.println("2. Tìm kiếm theo họ tên");
        System.out.println("3. Hiển thị thông tin danh sách cán bộ");
        System.out.println("4. Thoát");
        System.out.print("Nhập lựa chọn: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Thêm mới cán bộ
                System.out.print("Chọn loại cán bộ (1. Công nhân, 2. Kỹ sư, 3. Nhân viên): ");
                int loaiCanBo = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng trống
                System.out.print("Nhập họ tên: ");
                String ten = scanner.nextLine();
                System.out.print("Nhập tuổi: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập giới tính: ");
                String gioiTinh = scanner.nextLine();
                System.out.print("Nhập địa chỉ: ");
                String diaChi = scanner.nextLine();

                if (loaiCanBo == 1) {
                    System.out.print("Nhập bậc công nhân (1 đến 10): ");
                    int bac = scanner.nextInt();
                    CongNhan newCongNhan = new CongNhan(ten, tuoi, gioiTinh, diaChi, bac);
                    qlcb.themCanBo(newCongNhan);
                } else if (loaiCanBo == 2) {
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganhDaoTao = scanner.nextLine();
                    KySu newKySu = new KySu(ten, tuoi, gioiTinh, diaChi, nganhDaoTao);
                    qlcb.themCanBo(newKySu);
                } else if (loaiCanBo == 3) {
                    System.out.print("Nhập công việc: ");
                    String congViec = scanner.nextLine();
                    NhanVien newNhanVien = new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
                    qlcb.themCanBo(newNhanVien);
                } else {
                    System.out.println("Lựa chọn không hợp lệ");
                }
                break;
            case 2:
                // Tìm kiếm theo họ tên
                scanner.nextLine(); // Đọc bỏ dòng trống
                System.out.print("Nhập họ tên cần tìm: ");
                String tenCanTim = scanner.nextLine();
                qlcb.timKiemTheoHoTen(tenCanTim);
                break;
            case 3:
                // Hiển thị thông tin danh sách cán bộ
                qlcb.hienThiDanhSachCanBo();
                break;
            case 4:
                // Thoát khỏi chương trình
                System.out.println("Chương trình kết thúc.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }
    } while (choice != 4);

    scanner.close();
	}
}
