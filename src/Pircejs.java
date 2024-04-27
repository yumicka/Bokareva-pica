
public class Pircejs {
//atributi
	private String vards, adrese;
	private int talrunis;
	public Pircejs(String vards, String adrese, int talrunis) {
		this.vards = vards;
		this.adrese = adrese;
		this.talrunis = talrunis;	
	}
	
	public String getVards() {
		return vards;
	}
	
	public String getAdrese() {
		return adrese;
	}
	
	public int getTalrunis() {
		return talrunis;
	}
	
	public String info() {
		return "Adresāts: "+getVards()+
				"\nAdrese: "+getAdrese()+
				"\nTalrunis: +371"+getTalrunis()+"\n";
	}
}
