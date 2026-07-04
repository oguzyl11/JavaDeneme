package Deneme;

public class Ogrenci {
	int no ;
	String ad;
	static String okulAdi;
	
	Ogrenci(int numara,String isim){
	no = numara ;
	ad = isim ;
	}
	void bilgiGoster() {
		System.out.println(no+"  "+ad+"  "+okulAdi);
	}
	
	
}

