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
	public String getSoyÝsim() {
		return soyIsim;
	}
	public void setSoyÝsim(String soyÝsim) {
		this.soyIsim = soyÝsim;
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
	public void bilgileriGöster() {
		
		
		System.out.println("Ýsim: " + this.isim + "\n"
				          +"Soyisim: " + this.soyIsim + "\n"
				          +"Kýdem: " +  this.kidem + "\n"
				          +"Maaþ: " + this.maas);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
