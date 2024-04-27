import java.util.ArrayList;

public class Pica {
	//atributi
	private int lielums;
	private String piedevas, merce, nosaukums;
	private boolean dubSiers, piegade;
	private ArrayList<String> sastavdalas;
	//konstruktors
	public Pica(String nosaukums, int lielums, String merce, ArrayList<String> sastavdalas, boolean dubSiers, String piedevas, boolean piegade) {
		this.nosaukums = nosaukums;
		this.lielums = lielums;
		this.merce = merce;
		this.sastavdalas = sastavdalas;
		this.dubSiers = dubSiers;
		this.piedevas = piedevas;
		this.piegade = piegade;
	}
	
	public String getNosaukums() {
		return nosaukums;
	}
	public int getLielums() {
		return lielums;
	}
	
	public String getMerce() {
		return merce;
	}
	
	public String getSastavdalas(){
		String str = "";
		for(int i = 0; i<sastavdalas.size(); i++) {
			str += sastavdalas.get(i)+" | ";
		}
		return str;
	}
	
	public String getDubSiers() {
		if(dubSiers == true)
			return "Jā";
		else
			return "Nē";
	}
	
	public String getPiedevas() {
		return piedevas;
	}
	
	public String getPiegade() {
		if(piegade == true)
			return "Uz vietas";
		else
			return "Piegade uz noradito adresi";
	}
	
	public String info() {
	    return "Picas nosaukums: "+getNosaukums()+
	    		"\nPicas sastavdaļas: "+getSastavdalas()+
	    		"\nPicas merce: "+getMerce()+
	    		"\nPicas izmērs: "+getLielums()+"cm"
	    		+"\nDubultais siers: "+getDubSiers()+
	    		"\nPiedevas: "+getPiedevas()+
	    		"\nSaņemšana: "+getPiegade();
	  }
}
