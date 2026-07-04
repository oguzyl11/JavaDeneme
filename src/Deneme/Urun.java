package Deneme;

public class Urun {
	String ad;
	double fiyat;
	Urun(){
		ad = "bilinmiyor";
		fiyat = 0 ;
		
	}
	Urun(String isim){
		ad = isim;
	}
	Urun(String isim, double tutar){
		ad = isim;
		fiyat = tutar;
	}
	void bilgiGoster() {
		System.out.println(ad+"  "+fiyat);
	}

}
