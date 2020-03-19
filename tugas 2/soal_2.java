public class soal_2{
	public int ttldetik = 13020180;
	private int detik = ttldetik%60;
	private int menit = (ttldetik/60)%60;
	private int ttlmenit = ttldetik/60;
	private int jam = (ttlmenit/60)%24;
	
	public static void main(String[] args){
		soal_2 Waktu = new soal_2();
		System.out.println(Waktu.jam+":"+Waktu.menit+":"+Waktu.detik);
	}
}