import java.util.ArrayList;

public class Pica {
	//atributi
	private int lielums;
	private String piedevas, merce;
	private boolean dubSiers;
	private ArrayList<String> sastavdalas;
	//konstruktors
	public Pica(int lielums, String merce, ArrayList<String> sastavdalas, boolean dubSiers, String piedevas) {
		this.lielums = lielums;
		this.merce = merce;
		this.sastavdalas = sastavdalas;
		this.dubSiers = dubSiers;
		this.piedevas = piedevas;	
	}
}
