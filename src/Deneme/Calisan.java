package Deneme;

public class Calisan {
	int sicilNo;
	static int toplamCalisanSayisi;
	Calisan(int sicilNo){
		this.sicilNo = sicilNo;
		toplamCalisanSayisi++;
		
	}
	void bilgiGoster() {
		System.out.println(this.sicilNo+"  "+toplamCalisanSayisi);
	}

	
}
