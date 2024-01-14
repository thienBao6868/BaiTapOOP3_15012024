
public class TroChoi {
	String tenTroChoi;
	int soLuotChoi;
	String theLoai;
	int soManChoi;
	double price;

	public TroChoi(String tenTroChoi, int soLuotChoi, String theLoai, int soManChoi, double price) {
		this.tenTroChoi = tenTroChoi;
		this.soLuotChoi = soLuotChoi;
		this.theLoai = theLoai;
		this.soManChoi = soManChoi;
		this.price = price;
		
	}
	
	public void batdautrochoi() {
		System.out.println("Bắt đầu trò chơi nào ! ");
	}
	public void ketthuctrochoi() {
		System.out.println(" Trò chơi kết thúc ");
	}
	
}
