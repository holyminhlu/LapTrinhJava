
public class ThiSinhKhoiA extends ThiSinh {
	
	private String KhoiA;

	public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi,String mucDoUuTien, String khoiA) {
		super(soBaoDanh, hoTen, diaChi, mucDoUuTien);
		KhoiA = "Khoi A: Toan,Ly,Hoa";
		
		
	}

	public String getKhoiA() {
		return KhoiA;
	}

	public void setKhoiA(String khoiA) {
		KhoiA = khoiA;
	}
	
	@Override
	public void xuatDanhSach() {
        super.xuatDanhSach();
        System.out.println("Khoi Thi Cua Sinh Vien Nay La: "+this.KhoiA);
	}
	
	
}
