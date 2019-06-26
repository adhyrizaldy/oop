Class Mobil{

	//variabel
	String warna;
	int tahunProduksi;

	//Method2 atau tingkah laku
	void isiData (String warna, int tahunProduksi){
		warna = warnaMobil;
		tahunProduksi = tahunProduksiMobil;
	}

	String ambilWarna(){
		return warna;
	}

	int ambilTahunProduksi(){
		return tahunProduksi;
	}

}

public class KelasMobil2{
	public static void main (String[] args){
		//Bikin objek baru
		Mobil mobilku = new Mobil();

		//Mengisi variabel instan
		mobilku.isiData("merah", 2003);

		//Menampilkan isi variabel instan
		System.out.prinln("warna : " + mobilku.ambilWarna());

		System.out.println("Tahun : " + mobilku.ambilTahunProduksi());
	}
}