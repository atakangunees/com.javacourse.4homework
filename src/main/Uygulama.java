package main;

import java.util.Scanner;

public class Uygulama {
	
	static int sayac = 0;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	   Calisan[] calisanlar = new Calisan[5];
		 
		while(true) {
			System.out.println("�al��an eklemek i�in 1");
			System.out.println("�al��anlar� g�r�nt�lemek i�in 2");
			System.out.println("��k�� i�in 3 ");
			System.out.print("L�tfen Bir ��lem Se�iniz: ");
		    int kodlar = input.nextInt();
		                 input.nextLine();
		     
		    if(kodlar == 1) {
		    	
		    	
		    	System.out.print("L�tfen �sim Bilgilerini Giriniz.");
		    	
		    	String isim = input.nextLine();
		    	
		    	System.out.print("L�tfen Soyisim Bilgilerini Giriniz.");
		    	
		    	String soyIsim = input.nextLine();
		    	
		    	System.out.print("L�tfen K�dem Bilgilerini Giriniz.");
		    	
		    	int Kidem = input.nextInt();
		    	input.nextLine();
		    	
		    	Calisan c = new Calisan(isim , soyIsim , Kidem);
		    	
		    	calisanlar[Uygulama.sayac]= c;
		    	Uygulama.sayac++;
		    	
		    	
		    }else if(kodlar == 2) {
		    	
		    	for(int i = 0; i < Uygulama.sayac; i++) {
		    		
		    		calisanlar[i].bilgileriG�ster();
		    	}
		    	
		    	
		    	
		    	
		    }else if(kodlar == 3) {
		    	
		    	System.out.println("�IKI� YAPILIYOR");
		    	
		    	break;
		    	
		    	
		    }else {
		    	
		    	System.err.println("HATALI G�R��");
		    }
		             
		             
		             
		          
		             
		             
		             
		             
		}
		
		
		
		
		
		

	}

}
