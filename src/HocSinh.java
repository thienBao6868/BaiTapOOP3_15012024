
public class HocSinh {
	String hoTen;
	int tuoi;
	double diemToan;
	double diemLy;
	double diemHoa;
	
	public HocSinh(String hoTen, int tuoi, double diemToan, double diemLy, double diemHoa) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	public double diemtb() {
		double diemTb = (this.diemToan + this.diemLy + this.diemHoa)/3;
		return diemTb;
	}
}
