
public class ThiSinhKhoiB extends ThiSinh {
	
	private String KhoiB;

	public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi,String mucDoUuTien, String khoiA) {
		super(soBaoDanh, hoTen, diaChi, mucDoUuTien);
		
		KhoiB = "Khoi B: Toan,Sinh,Hoa";
		
		
	}

	public String getKhoiB() {
		return KhoiB;
	}

	public void setKhoiB(String khoiB) {
		KhoiB = khoiB;
	}
	
	@Override
	public void xuatDanhSach() {
        super.xuatDanhSach();
        System.out.println("Khoi Thi Cua Sinh Vien Nay La: "+this.KhoiB);
	}
	
}
