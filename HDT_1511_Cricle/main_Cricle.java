import java.util.Scanner;
public class main_Cricle {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		double bankinh;
		System.out.print("\nNhap vao ban kinh hinh tron can tinh: ");
		bankinh = nhap.nextDouble();
		Cricle ht = new Cricle(bankinh);
		System.out.print("\n*********************************");
		System.out.print("\n\t * 1.Tinh chu vi ");
		System.out.print("\n\t * 2.Tih dien tich ");
		System.out.print("\n*********************************\n");
		System.out.print("Nhap vao so: ");
		int n = nhap.nextInt();
		switch (n) {
		case 1:
			ht.tinhcv();
			break;
		case 2:
			ht.tinhdt();
			break;
		default:
			break;
		}
	}

}
