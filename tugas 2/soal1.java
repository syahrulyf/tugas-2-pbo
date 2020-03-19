public class soal1{
	String nim,nama,jurusan,fakultas;

	public soal1(){
	nim = "13020180017";
	nama = "Syahrul";
	}
	public soal1(String jurusan, String fakultas){
	this.jurusan = jurusan;
	this.fakultas = fakultas;
	}
	public static void main(String[] args){
	soal1 data = new soal1();
	soal1 data2 = new soal1("Teknik Informatika","Ilmu Komputer");
	System.out.println("Nim = "+data.nim);
	System.out.println("Nama = "+data.nama);
	System.out.println("Jurusan = "+data2.jurusan);
	System.out.println("Fakultas = "+data2.fakultas);
	}
}