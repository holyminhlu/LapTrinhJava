package AboutQLCB;
import java.util.ArrayList;

public class QLCB {
	private ArrayList<CanBo> danhSachCanBo = new ArrayList<CanBo>();
    

    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public void timKiemTheoHoTen(String hoTen) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getTen().equalsIgnoreCase(hoTen)) {
                canBo.xuatDanhSach();
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }
    
    public void xoaTheoHoTen(String hoTen) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getTen().equalsIgnoreCase(hoTen)) {
            	System.out.println("Da xoa thong tin can bo: " + hoTen);
                danhSachCanBo.remove(canBo);
                return;
            }

        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }

    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : danhSachCanBo) {
            canBo.xuatDanhSach();
        }
    }
}