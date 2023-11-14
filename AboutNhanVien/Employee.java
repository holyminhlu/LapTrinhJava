package AboutNhanVien;

public class Employee {
	private String honv, tennv;
	private int ngaysinh, thangsinh, namsinh;
	private int ngaybd, thangbd, nambd;
	
public Employee() {
}
public Employee( String honv, String tennv,int ngaysinh, int thangsinh, int namsinh,int ngaybd,int thangbd, int nambd) {
	this.honv = honv;
	this.tennv = tennv;
	
	if( namsinh >= 0 && namsinh <= 2050) {
		this.namsinh = namsinh;
			}else { this.namsinh = 0; }
	if( nambd >= 0 && nambd <= 2050) {
		this.nambd = nambd;
			}else { this.nambd = 0; }
	
	if( thangsinh >= 1 && thangsinh <= 12 ) {
		this.thangsinh = thangsinh;
			}else { this.thangsinh = 0; }
	if( thangbd >= 1 && thangbd <= 12 ) {
		this.thangbd = thangbd;
			}else { this.thangbd = 0; }
	
	if(ngaysinh >= 1 && ngaysinh <= 31) {
		this.ngaysinh = ngaysinh;
			}else { this.ngaysinh=0; }
	if( ngaybd >= 1 && ngaybd <= 31 ) {
		this.ngaybd = ngaybd;
			}else { this.ngaybd = 0; }
	
}
public String getHonv() {
	return honv;
}
public void setHonv(String honv) {
	this.honv = honv;
}
public String getTennv() {
	return tennv;
}
public void setTennv(String tennv) {
	this.tennv = tennv;
}
public int getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(int ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public int getThangsinh() {
	return thangsinh;
}
public void setThangsinh(int thangsinh) {
	this.thangsinh = thangsinh;
}
public int getNamsinh() {
	return namsinh;
}
public void setNamsinh(int namsinh) {
	this.namsinh = namsinh;
}
public int getNgaybd() {
	return ngaybd;
}
public void setNgaybd(int ngaybd) {
	this.ngaybd = ngaybd;
}
public int getThangbd() {
	return thangbd;
}
public void setThangbd(int thangbd) {
	this.thangbd = thangbd;
}
public int getNambd() {
	return nambd;
}
public void setNambd(int nambd) {
	this.nambd = nambd;
}
public void xuatNv() {
	System.out.println("Ten nhan vien: "+this.honv+" "+this.tennv);
	System.out.println("Ngay sinh nhan vien: "+this.ngaysinh+"/"+this.thangsinh+"/"+this.namsinh);
	System.out.println("Ngay bat dau lam: "+this.ngaybd+"/"+this.thangbd+"/"+this.nambd);
}
}
