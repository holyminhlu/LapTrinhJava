package quanlicanbo;

public class kysu extends canbo {
	private String nganhDaoTao;

	public kysu(String ho, String ten, int age, String gt, String diachi, String nganhDaoTao) {
		super(ho, ten, age, gt, diachi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	/* @Override
	public void xuatDanhSach() {
        super.xuatDanhSach();
        System.out.println("Nganh dao tao: "+nganhDaoTao);
    }  */
	@Override
	public void xuatDanhSach() {
		super.xuatDanhSach();
		System.out.printf("KY SU NGANH: ");
        System.out.printf("%-10s \n", nganhDaoTao);
    }
}