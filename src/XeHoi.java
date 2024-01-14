
public class XeHoi {
	String hangSanXuat;
	int namSanXuat;
	String dongXe;
	String mauXe;
	String nhienLieu;
	String kieuDang;
	double soKmDaDi;
	String hopSo;
	String soVin;
	int xiLanh;
	
	public XeHoi (String hangSanXuat,int namSanXuat, String dongXe, String mauXe, String nhienLieu, String kieuDang, double soKmDaDi, String hopSo, String soVin,int xiLanh) {
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.dongXe = dongXe;
		this.mauXe = mauXe;
		this.nhienLieu = nhienLieu;
		this.kieuDang = kieuDang;
		this.soKmDaDi = soKmDaDi;
		this.hopSo = hopSo;
		this.soVin = soVin;
		this.xiLanh = xiLanh;
	};
	
	public void hienthithongtinxe () {
		System.out.println("Hãng sản xuất : " + this.hangSanXuat);
		System.out.println("Năm sản xuất : " + this.namSanXuat);
		System.out.println("Dòng xe  : " + this.dongXe);
		System.out.println("Mẫu Xe : " + this.mauXe);
		System.out.println("Nhiên liệu : " + this.nhienLieu);
		System.out.println("Kiểu dáng  : " + this.kieuDang);
		System.out.println("Số km đã đi  : " + this.soKmDaDi);
		System.out.println("Hợp số  : " + this.hopSo);
		System.out.println("Số Vin  : " + this.soVin);
		System.out.println("Số Xi Lanh   : " + this.xiLanh);
		
		
	};
	
}
