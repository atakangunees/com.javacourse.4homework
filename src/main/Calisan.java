package main;

public class Calisan {
	
	private String isim;
	private String soyIsim;
	private int maas;
	private int kidem;
	
	private static int birinciKidemMaas = 10000;
	private static int ikinciKidemMaas = 15000;
	private static int ucuncuKidemMaas= 20000;
	
	public Calisan() {
		
		
	}
	
	public Calisan(String isim, String soyIsim, int kidem) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.kidem = kidem;
		
		setKidem(kidem);
		
				
	}
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoy�sim() {
		return soyIsim;
	}
	public void setSoy�sim(String soy�sim) {
		this.soyIsim = soy�sim;
	}
	public int getMaas() {
		return maas;
	}
	
	public int getKidem() {
		return kidem;
	}
	public void setKidem(int kidem) {
		this.kidem = kidem;
		
		if( kidem == 1) {
			this.maas = Calisan.birinciKidemMaas;
			
			System.out.println(birinciKidemMaas);
		}
		if(kidem == 2) {
			this.maas = Calisan.ikinciKidemMaas;
			System.out.println(ikinciKidemMaas);
		}
		if(kidem == 3) {
			this.maas = Calisan.ucuncuKidemMaas;
			
			System.out.println(ucuncuKidemMaas);
	}
  }
	public void bilgileriG�ster() {
		
		
		System.out.println("�sim: " + this.isim + "\n"
				          +"Soyisim: " + this.soyIsim + "\n"
				          +"K�dem: " +  this.kidem + "\n"
				          +"Maa�: " + this.maas);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
