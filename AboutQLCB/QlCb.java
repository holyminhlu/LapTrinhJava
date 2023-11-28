package AboutQLCB;
import java.util.ArrayList;

public class QlCb {
	private ArrayList<CanBo> danhSachCanBo;

    public QlCb() {
        danhSachCanBo = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public void timKiemTheoHoTen(String hoTen) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                canBo.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
    }

    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : danhSachCanBo) {
            canBo.hienThiThongTin();
            System.out.println("------------------------");
        }
    }
}
