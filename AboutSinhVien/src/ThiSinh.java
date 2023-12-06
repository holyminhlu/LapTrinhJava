
public class ThiSinh {
	private String SoBaoDanh;
	private String HoTen;
	private String DiaChi;
	private String MucDoUuTien;  
	
	public ThiSinh(String soBaoDanh, String hoTen, String diaChi,String mucDoUuTien) {
		SoBaoDanh = soBaoDanh;
		HoTen = hoTen;
		DiaChi = diaChi;
		MucDoUuTien = mucDoUuTien;
	}

	public String getSoBaoDanh() {
		return SoBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		SoBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getMucDoUuTien() {
		return MucDoUuTien;
	}

	public void setMucDoUuTien(String mucDoUuTien) {
		MucDoUuTien = mucDoUuTien;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s%-30s%-25s%-25s", "SBD: "+SoBaoDanh, "HOTEN: "+HoTen, "DIACHI: "+DiaChi, "MUCDOUUTIEN: "+MucDoUuTien);
	}
	public void xuatDanhSach() {
        System.out.printf("%-20s%-30s%-25s%-25s", "SBD: "+SoBaoDanh, "HOTEN: "+HoTen, "DIACHI: "+DiaChi, "MUCDOUUTIEN: "+MucDoUuTien);
	}
}
