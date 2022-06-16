package main;

import java.util.Scanner;

public class Uygulama {
	
	static int sayac = 0;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	   Calisan[] calisanlar = new Calisan[5];
		 
		while(true) {
			System.out.println("Çalýþan eklemek için 1");
			System.out.println("Çalýþanlarý görüntülemek için 2");
			System.out.println("Çýkýþ için 3 ");
			System.out.print("Lütfen Bir Ýþlem Seçiniz: ");
		    int kodlar = input.nextInt();
		                 input.nextLine();
		     
		    if(kodlar == 1) {
		    	
		    	
		    	System.out.print("Lütfen Ýsim Bilgilerini Giriniz.");
		    	
		    	String isim = input.nextLine();
		    	
		    	System.out.print("Lütfen Soyisim Bilgilerini Giriniz.");
		    	
		    	String soyIsim = input.nextLine();
		    	
		    	System.out.print("Lütfen Kýdem Bilgilerini Giriniz.");
		    	
		    	int Kidem = input.nextInt();
		    	input.nextLine();
		    	
		    	Calisan c = new Calisan(isim , soyIsim , Kidem);
		    	
		    	calisanlar[Uygulama.sayac]= c;
		    	Uygulama.sayac++;
		    	
		    	
		    }else if(kodlar == 2) {
		    	
		    	for(int i = 0; i < Uygulama.sayac; i++) {
		    		
		    		calisanlar[i].bilgileriGöster();
		    	}
		    	
		    	
		    	
		    	
		    }else if(kodlar == 3) {
		    	
		    	System.out.println("ÇIKIÞ YAPILIYOR");
		    	
		    	break;
		    	
		    	
		    }else {
		    	
		    	System.err.println("HATALI GÝRÝÞ");
		    }
		             
		             
		             
		          
		             
		             
		             
		             
		}
		
		
		
		
		
		

	}

}
