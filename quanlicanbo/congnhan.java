package quanlicanbo;

public class congnhan extends canbo {
	private int bac;

	public congnhan(String ho, String ten, int age, String gt, String diachi,int bac) {
		super(ho, ten, age, gt, diachi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	/* @Override
	public void xuatDanhSach() {
        super.xuatDanhSach();
        System.out.println("Bac cua cong nhan: "+bac);
    }
    */
	@Override
	
	public void xuatDanhSach() {
		super.xuatDanhSach();
		System.out.printf("CONG NHAN BAC: ");
        System.out.printf("%-10s \n", bac);
    }
}