package quanlicanbo;
import java.util.ArrayList;
import java.util.Scanner;

public class qlcb {
	private ArrayList<canbo> danhSachCanBo = new ArrayList<canbo>();
    Scanner cc = new Scanner(System.in);

    public void themCanBo(canbo canBo) {
        danhSachCanBo.add(canBo);
    }

    public void timKiemTheoHoTen(String hoTen) {
        for (canbo canBo : danhSachCanBo) {
            if (canBo.getTen().equalsIgnoreCase(hoTen)) {
                canBo.xuatDanhSach();
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }
    
    public void xoaTheoHoTen(String hoTen) {
        for (canbo canBo : danhSachCanBo) {
            if (canBo.getTen().equalsIgnoreCase(hoTen)) {
            	System.out.println("Da xoa thong tin can bo: " + hoTen);
                danhSachCanBo.remove(canBo);
                return;
            }

        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }

    public void suaThongTinCanBo(String hoTen) {
    	for (canbo canBo : danhSachCanBo) {
            if (canBo.getTen().equalsIgnoreCase(hoTen)) {
                // Hiển thị thông tin cán bộ trước khi sửa đổi
                System.out.println("Thông tin cán bộ trước khi sửa đổi:");
                canBo.xuatDanhSach();
                // Nhập thông tin mới từ người dùng
                System.out.println("Nhập thông tin mới cho cán bộ:");
                System.out.print("Họ: ");
                String newHo = cc.nextLine();
                System.out.print("Tên: ");
                String newTen = cc.nextLine();
                System.out.print("Tuổi: ");
                int newAge = cc.nextInt();
                System.out.print("Gioi Tính: ");
                String newGt = cc.nextLine();
                System.out.print("Dia Chi: ");
                String newDiaChi = cc.nextLine();
                cc.nextLine(); // Đọc bỏ dòng new line từ trước

                // Cập nhật thông tin cán bộ
                canBo.setHo(newHo);
                canBo.setTen(newTen);
                canBo.setAge(newAge);
                canBo.setGt(newGt);
                canBo.setDiachi(newDiaChi);

                // Hiển thị thông tin cán bộ sau khi sửa đổi
                System.out.println("Thông tin cán bộ sau khi sửa đổi:");
                canBo.xuatDanhSach();

                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }
    
    public void xoaToanBoDanhSach() {
    	int chaccu;
    	do {
    	    	System.out.println("+------------------------------------------------+");
    	        System.out.println("+	1. XOA, Chac chan.                       +");
    	        System.out.println("+	2. Quay Xe, Khong Xoa                    +");
    	    	System.out.println("+------------------------------------------------+");
    	    	System.out.println("BAN CO CHAC CHAN MUON XOA TOAN BO DANH SACH CAN BO ?");
    	    	chaccu = cc.nextInt();
    	    	cc.nextLine();
    	switch ( chaccu ) {
    		case 1:
    				for (canbo cbA : danhSachCanBo) {
    					System.out.println("Da xoa toan bo danh sach !!! ");
    					danhSachCanBo.removeAll(danhSachCanBo);
    					return;
    					}
    		case 2: 
                System.out.println("Huy Thao Tac Xoa");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
    	}
    }while (chaccu != 2);
        cc.close();
}
    public void hienThiDanhSachCanBo() {
        for (canbo canBo : danhSachCanBo) {
            canBo.xuatDanhSach();
        }
    }
}