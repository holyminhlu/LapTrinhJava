package quanlicanbo;

public class nhanvien extends canbo {
	private String congViec;

	public nhanvien(String ho, String ten, int age, String gt, String diachi, String congViec) {
		super(ho, ten, age, gt, diachi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	/* @Override
	public void xuatDanhSach() {
        super.xuatDanhSach();
        System.out.println("Cong viec nhan vien: "+congViec);
    }  */
	@Override
	public void xuatDanhSach() {
		super.xuatDanhSach();
		System.out.printf("NHAN VIEN: ");
        System.out.printf("%-10s \n", congViec);
    }
}