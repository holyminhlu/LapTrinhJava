
public class Employee {
	private String ten;
	private String chucvu;
	private double heosoluong;
	public Employee(){}
	public Employee(String ten, String chucvu, double heosoluong) {
		//super();
		this.ten = ten;
		this.chucvu = chucvu;
		this.heosoluong = heosoluong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public double getMucluong() {
		return heosoluong;
	}
	public void setMucluong(double mucluong) {
		this.heosoluong = mucluong;
	}
public void tinhLuongCongnhan(){
	double luongcb = 1500000;
	double luongcn = luongcb*this.heosoluong;
	System.out.println("Ho ten: "+this.ten);
	System.out.println("Chuc vu: "+this.chucvu);
	System.out.println("Luong cua NHAN VIEN la: "+luongcn+" VND");
}
}

