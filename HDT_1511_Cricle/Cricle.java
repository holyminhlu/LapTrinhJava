
public class Cricle {
	public double bankinh;

	public Cricle(){this.bankinh=1;}
	public Cricle(double bankinh) {
		//super();
		this.bankinh = bankinh;
	}
	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
public double tinhdt(){
	double dientich = 0;
	dientich =Math.PI*bankinh*bankinh;
	System.out.println("Dien tich cua hinh tron co ban kinh "+bankinh+" la: "+dientich);
return dientich;
	}

public double tinhcv(){
	double chubin = 0;
	chubin = 2*Math.PI*bankinh;
	System.out.println("Chu vi cua hinh tron co ban kinh "+bankinh+" la: "+chubin);
return chubin;
	}
}
