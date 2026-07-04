package Deneme;

public class Main {
	public static void main(String[] args) {
		Kisi o1 = new Kisi("Oğuz",18);
		Kisi o2 = new Kisi("Ahmet",20);
		o1.bilgiGoster();
		o2.bilgiGoster();
		Urun a1 = new Urun();
		Urun a2 = new Urun("Ali");
		Urun a3 = new Urun("Ahmet",300);
		a1.bilgiGoster();
		a2.bilgiGoster();
		a3.bilgiGoster();
		
		Ogrenci.okulAdi = "Mehmet Doğan Fen Lisesi";
		Ogrenci b1 = new Ogrenci (948 , "Oğuz");
		Ogrenci b2 = new Ogrenci (132 , "Oğuz Yıldırım");
		Ogrenci b3 = new Ogrenci (200 , "Oğuzhan");
		b1.bilgiGoster();
		b2.bilgiGoster();
		b3.bilgiGoster();
		
		Calisan c1 = new Calisan (200);
		Calisan c2 = new Calisan (400);
		Calisan c3 = new Calisan (500);
		c1.bilgiGoster();
		c2.bilgiGoster();
		c3.bilgiGoster();
		

		
		
	
		
	}

}
