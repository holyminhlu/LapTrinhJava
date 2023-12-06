import java.util.ArrayList;
import java.util.Scanner;
public class TuyenSinh {		
		private ArrayList<ThiSinh> tuyensinh = new ArrayList<ThiSinh>();
		Scanner cc = new Scanner(System.in);
	    public void themThiSinh(ThiSinh thisinh) {
	        tuyensinh.add(thisinh);
	    }	    
	    public void hienThiThongTinThiSinh() {
	        for (ThiSinh ts : tuyensinh) {
	            ts.xuatDanhSach();
	        }
	    }	    
	    public void timKiemTheoSoBaoDanh(String sbd) {
	        for (ThiSinh ts : tuyensinh) {
	            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
	            	System.out.println("Tim thay thi sinh co So Bao Danh: " + sbd);
	                ts.xuatDanhSach();
	                return;
	            }
	        }
	        System.out.println("Không tìm thấy thi sinh co So Bao Danh: " +sbd);
	    }
	    
	    public void xoaTheoSoBaoDanh(String sbd) {
	        for (ThiSinh ts : tuyensinh) {
	            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
	            	System.out.println("Da xoa sinh vien co So Bao Danh: " + sbd);
	                tuyensinh.remove(ts);
	                return;
	            }
	        }
	        System.out.println("Không tìm thấy thi sinh co So Bao Danh: " +sbd);
	    }
	    
	    public void xoaToanBoDanhSach() {
	        for (ThiSinh ts : tuyensinh) {	        
	            	System.out.println("XOA TOAN BO DANH SACH THI SINH THANH CONG!!!");
	                tuyensinh.removeAll(tuyensinh);
	                return;
	        }
	    }
	    public void suaTheoSoBaoDanh( String sbd ) {
		      for (ThiSinh ts : tuyensinh) {	        
		    	  if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
		            	System.out.println("Thong tin Thi sinh truoc khi chinh sua:");
		                ts.xuatDanhSach();
		                System.out.println("Cap nhat lai thong tin Thi sinh: ");
		                System.out.print("So Bao Danh: ");
		                String newSoBaoDanh = cc.nextLine();
		                System.out.print("Họ Tên: ");
		                String newHoTen = cc.nextLine();		             
		                System.out.print("Dia Chi: ");
		                String newDiaChi = cc.nextLine();
		                System.out.print("Muc Do Uu Tien ( Kv1, Kv2, Kv3 ): ");
		                String newMucDoUuTien = cc.nextLine();		               		                
		                // Cập nhật thông tin thi sinh
		                ts.setSoBaoDanh(newSoBaoDanh);
		                ts.setHoTen(newHoTen);
		                ts.setDiaChi(newDiaChi);
		                ts.setMucDoUuTien(newMucDoUuTien);		               
		                // Hiển thị thông tin cán bộ sau khi sửa đổi
		                System.out.println("Thông tin cán bộ sau khi sửa đổi:");
		                ts.xuatDanhSach();
		                return;
		            }
		      }		   
		  System.out.println("Không tìm thấy thi sinh co So Bao Danh: " +sbd); 	  		   		    
	 }
}
