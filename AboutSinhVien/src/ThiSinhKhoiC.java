
public class ThiSinhKhoiC extends ThiSinh {
		private String KhoiC;

		public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi,
				String mucDoUuTien, String khoiC) {
			super(soBaoDanh, hoTen, diaChi, mucDoUuTien);
			KhoiC = "Khoi C: Van, Su, Dia";				
		}

		public String getKhoiC() {
			return KhoiC;
		}

		public void setKhoiC(String khoiC) {
			KhoiC = khoiC;
		}	
		
		@Override
		public void xuatDanhSach() {
	        super.xuatDanhSach();
	        System.out.println("Khoi Thi Cua Sinh Vien Nay La: "+this.KhoiC);
		}
}
