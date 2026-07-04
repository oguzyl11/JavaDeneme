package Deneme;

public class Bilet {
	int biletNo;
	String yolcuAdi;
	static int sonBiletNo;
	Bilet ( String yolcuAdi){
		
		this.yolcuAdi = yolcuAdi;
		sonBiletNo++;
		this.biletNo = sonBiletNo;
	
	}
	void bilgiGoster() {
		System.out.println(this.biletNo+" "+this.yolcuAdi);
		
	}
	
	
	
	

}
