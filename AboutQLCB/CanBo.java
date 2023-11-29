package AboutQLCB;

public class CanBo {
	private String ho;
	private String ten;
	private int age;
	private String gt;
	private String diachi;
	public CanBo(String ho, String ten, int age, String gt, String diachi) {
		this.ho = ho;
		this.ten = ten;
		this.age = age;
		this.gt = gt;
		this.diachi = diachi;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGt() {
		return gt;
	}
	public void setGt(String gt) {
		this.gt = gt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	/*  public void xuatDanhSach() {
        System.out.println("Ho & Ten: " + ho + ten);
        System.out.println("Tuoi: "+age);
        System.out.println("Gio tinh: "+gt);
        System.out.println("Dia chi: "+diachi);
    }   */
	@Override
	public String toString() {
		return String.format("%-20s%-10s%-10s%-15s%-15s", ho, ten, age, gt, diachi);
	}
	public void xuatDanhSach() {
        System.out.printf("%-15s%-10s%-10s%-15s%-15s", ho, ten, age, gt, diachi);
    }
	
}
