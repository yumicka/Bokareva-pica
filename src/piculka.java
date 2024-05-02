import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class piculka {
	
	static void izvaditEkrana(String adrese) {
		ImageIcon bilde = new ImageIcon(adrese);
		JFrame fr = new JFrame();
		fr.add(new JLabel(bilde));
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(624, 600);
		fr.pack();
		fr.setVisible(true);
		JOptionPane.showMessageDialog(null, "Nospiediet OK, lai aizvērt un turpināt");
		fr.setVisible(false);
	}
	
	static String KadsVards() {
		String vards = "";
		do {
			vards = (String)JOptionPane.showInputDialog(null, "Jūsu vārds: ");
			if(vards == null)
				vards = "lietotajs";
			}while(vards.length() <3);
		return vards;
	}
	
	static String KadaAdrese() {
		boolean pareizi = false;
		String adrese;
		do {
			adrese = (String) JOptionPane.showInputDialog(null, "Ievādies savu adresi:\n(... iela ...-...)");
			if (adrese.matches(".* iela \\d+-\\d+"))
				pareizi = true;
			else {
				JOptionPane.showMessageDialog(null, "Adrese ievadita nekorekti!"
						+ "\nPareizais variants: {ielas nosaukums} iela {ielas numurs} - {dzivoklis}");
				pareizi = false;
			}
		}while(!pareizi);
		return adrese;
	}
	
	static int KadsTalrun() {
		boolean pareizi = false;
		String telefons;
		do {
			telefons = (String)JOptionPane.showInputDialog("Ievadiet talruni: (bez +371)");
			if (telefons.matches("2\\d{7}"))
				pareizi = true;
			else {
				JOptionPane.showMessageDialog(null, "Telefona nurums ievadts nekorekti!"
						+ "\nTelefona numura nevar būt +371 un mazāk par 8 simboliem");
			}
			
		}while(!pareizi);
		int talrun = Integer.parseInt(telefons);
		return talrun;
	}

	public static void main(String[] args) {
		String izvele, vards, adrese;
		int talrun;
		ArrayList<Object> pasutijumi = new ArrayList<Object>();
		ArrayList<Object> sanemtie = new ArrayList<Object>();
		ArrayList<Object> klients = new ArrayList<Object>();
		
		ImageIcon logo = new ImageIcon("logo.png");
		
		
		String[] darbibas = {"Menu", "Iegadies picu", "Apskatīt pasūtijumus", "Saņemt pasūtijumu", "Saņemtie pasutījumi" ,"Apskatīt savu info", "Mainit savu info",
				"Iziet no programmas"};
		String[] picas = {"Margarita", "Studenta", "Piperoni", "Vistas","BBQ", "Assa pica"};
		JOptionPane.showMessageDialog(null, "Sveiki picas piedages porgramma!", "Sveiki!", JOptionPane.INFORMATION_MESSAGE, logo);
		
			
			vards = KadsVards();
	
			adrese = KadaAdrese();
			
			talrun = KadsTalrun();
			
			klients.add(new Pircejs(vards, adrese, talrun));
			do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izveleties funkciju:", "Izvele",
					JOptionPane.QUESTION_MESSAGE, logo, darbibas, darbibas[0]);
			switch(izvele) {
			
			case "Menu":
				//https://stock.adobe.com/search?k=pizza+png
				int izveleM;
				izveleM = JOptionPane.showOptionDialog(null, "Apskatīt picu", "Pica", JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, picas, picas[0]);
				switch(izveleM) {
				case 0:
					izvaditEkrana("margarita.png");
					break;
				case 1:
					izvaditEkrana("studenta.png");
					break;
				case 2:
					izvaditEkrana("piperoni.png");
					break;
				case 3:
					izvaditEkrana("vistas.png");
					break;
				case 4:
					izvaditEkrana("bbq.png");
					break;
				case 5:
					izvaditEkrana("assa.png");
					break;
				};
				
				break;
			case "Iegadies picu":
				ArrayList<String> sastavdalas = new ArrayList<>();
				String[] picas2 = {"Margarita", "Studenta", "Piperoni", "Vistas","BBQ", "Assa pica", "Sava pica"};
				String[] piedevas = {"Kartupeļi fri", "Dzēriens", "Bez piedevām"};
				String[] izmiers = {"30", "40", "50"};
				String[] jane = {"Jā", "Nē"};
				String[] pasutit = {"Saņemt uz vietas", "Piegādāt"};
				String merce = "", nosaukums = "";
				String izvele1;
				double cena = 3.00;
				int lielums;
				boolean dubsiers = false, piegade = false;
				izvele1 = (String)JOptionPane.showInputDialog(null, "Izvēlieties picu, kuru"
						+ " vēlaties iegādāties:", "Pasūtījumu noformēšana", JOptionPane.QUESTION_MESSAGE, null,
						picas2, picas2[0]);
				if(izvele1 != null) {
				int izvelesIndekss = Arrays.asList(picas2).indexOf(izvele1);
				
				
				if(izvelesIndekss == 0) {
					nosaukums = "Margarita";
					merce = "Tomatu merce";
					sastavdalas.add("Siers");
					cena = cena + 1+1.50;
				}
				if(izvelesIndekss == 1) {
					nosaukums = "Studenta";
					merce = "Tomatu merce";
					sastavdalas.add("Siers");
					sastavdalas.add("Cīsiņi");
					cena = cena + 1+1.50+2;
				}
				
				if(izvelesIndekss == 2) {
					nosaukums = "Piperoni";
					merce = "Tomatu merce";
					sastavdalas.add("Siers");
					sastavdalas.add("Salami");
					sastavdalas.add("Asie pipari");
					cena = cena + 1+1.50+2+1.30;
				}
				
				if(izvelesIndekss == 3) {
					nosaukums = "Vistas";
					merce = "Majonēze";
					sastavdalas.add("Siers");
					sastavdalas.add("Vista");
					sastavdalas.add("Ananasi");
					cena = cena + 1.50+1.20+3+2.10;
				}
				
				if(izvelesIndekss == 4) {
					nosaukums = "BBQ";
					merce = "BBQ merce";
					sastavdalas.add("Siers");
					sastavdalas.add("Vista");
					sastavdalas.add("Ananasi");
					sastavdalas.add("Asie pipari");
					cena = cena+2+1.20+3+2.10+1.30;
				}
				
				if(izvelesIndekss == 5) {
					nosaukums = "Assa pica";
					merce = "Majonēze";
					sastavdalas.add("Siers");
					sastavdalas.add("Asie pipari");
					sastavdalas.add("Cīsiņi");
					sastavdalas.add("Salami");
					cena = cena + 1.50 +1.20+1.30+2+2;
					
				}
				
				if(izvelesIndekss == 6){
					
					nosaukums = "Pašī izveidota";
					
					//sastavdalas izvele
					
					String[] merces = {"Tomatu merce", "BBQ merce", "Majonēze"};
					JCheckBox salami = new JCheckBox("Salami");
					JCheckBox siers = new JCheckBox("Siers");
					JCheckBox vista = new JCheckBox("Vista");
					JCheckBox cisini = new JCheckBox("Сīsiņi");
					JCheckBox ananasi = new JCheckBox("Ananasi");
					JCheckBox pipari = new JCheckBox("Asie pipari");
					JPanel sastIzvele = new JPanel();
					sastIzvele.add(salami);
					sastIzvele.add(siers);
					sastIzvele.add(vista);
					sastIzvele.add(cisini);
					sastIzvele.add(ananasi);
					sastIzvele.add(pipari);
					
					int sastavs = JOptionPane.showOptionDialog(null, sastIzvele, "Izvelies picas sastavdaļas: ",
							JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
					
					if (sastavs  == JOptionPane.OK_OPTION) {
						if (salami.isSelected()) {
							sastavdalas.add("Salami");
							cena = cena + 2;
						}
						if(siers.isSelected()) {
							sastavdalas.add("Siers");
							cena = cena +1.20;
						}
						if(vista.isSelected()) {
							sastavdalas.add("Vista");
							cena = cena + 3;
						}
						if(cisini.isSelected()) {
							sastavdalas.add("Cīsiņi");
							cena = cena + 2;
						}
						if(ananasi.isSelected()) {
							sastavdalas.add("Ananasi");
							cena = cena + 2.10;
						}
						if(pipari.isSelected()) {
							sastavdalas.add("Assie pipāri");
							cena = cena + 1.30;
						}
					}else {
						JOptionPane.showMessageDialog(null, "Pasūtījums atcelts");
						break;
					}
						
					
					//citie picas komponenti
					merce = (String)JOptionPane.showInputDialog(null, "Izvelies merci: ",
							"Pasūtījumu noformēšana", JOptionPane.QUESTION_MESSAGE, null, merces, merces[0]);
					if(merce.equals("Tomatu merce"))
						cena = cena + 1;
					if(merce.equals("BBQ merce"))
						cena = cena + 2;
					if(merce.equals("Majonēze"))
						cena = cena + 1.50;
				}
				
					String diam = (String)JOptionPane.showInputDialog(null, "Picas izmers",
							"Pasūtījumu noformēšana", JOptionPane.QUESTION_MESSAGE, null, izmiers, izmiers[0]);
					lielums = Integer.parseInt(diam);
					if(lielums == 30)
						cena = cena + 1;
					if(lielums == 40)
						cena = cena + 2;
					if(lielums == 50)
						cena = cena + 2.50;
					
					String piedavajums = (String)JOptionPane.showInputDialog(null, "Vai vajag piedevas?",
							"Pasūtījumu noformēšana", JOptionPane.QUESTION_MESSAGE, null, piedevas, piedevas[0]);
					if(piedavajums.equals("Kartupeļi fri"))
						cena = cena + 1.50;
					if(piedavajums.equals("Dzēriens"))
						cena = cena + 1;
					
					int siersJN = JOptionPane.showOptionDialog(null, "Vai vajāg dubulto sieru?", "Pasūtījumu noformēšana",
							JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, jane, jane[0]);
					
					if(siersJN == 0) {
						dubsiers = true;
						cena = cena + 1;
					}else
						dubsiers = false;
					
					int pieg = JOptionPane.showOptionDialog(null, "Kā saņiemsiet pasutījumu?", "Pasūtījumu noformēšana",
							JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pasutit, pasutit[0]);
					if(pieg == 0) {
						piegade = false;
					}
					if(pieg == 1) {
						piegade = true;
						cena = cena + 2; //pievienoju maksajumu par piegadi
					}

					pasutijumi.add(new Pica(nosaukums, lielums, cena, merce, sastavdalas, dubsiers, piedavajums, piegade));
						
						try {
							FileWriter fw = new FileWriter("Picas.txt", true);
							PrintWriter pw = new PrintWriter(fw);
							String saraksts = "";
							
							int lielum = pasutijumi.size();
							saraksts+=((Pircejs)klients.get(0)).info();
							if (!pasutijumi.isEmpty()) {
							    saraksts += ((Pica) pasutijumi.get(lielum-1)).info();
							}
							pw.println(saraksts);
							pw.println();
							pw.close();	
						}catch(IOException e) {
							JOptionPane.showMessageDialog(null, "Radās kļūda saglabājot failā!",
									"Kļūda", JOptionPane.ERROR_MESSAGE);
						}
					
					JOptionPane.showMessageDialog(null, "Pasūtījums ir akceptēts!\nCena: "+cena);
					break;
				
			}else if (izvele1 == null)
				break;
				
			case "Apskatīt pasūtijumus":
				if(pasutijumi.size() > 0) {
					String teksts, str = "";
					try {
						FileReader fr = new FileReader("Picas.txt");
						BufferedReader br = new BufferedReader(fr);
						while((teksts = br.readLine()) != null) {
							str += teksts+" "+"\n";	
						}
						br.close();
						JOptionPane.showMessageDialog(null, str, "Pasutījumi", JOptionPane.INFORMATION_MESSAGE);
						
						
					}catch(IOException e){
						JOptionPane.showMessageDialog(null, "Radās kļūda nolasot faili!", "Kļūda", JOptionPane.ERROR_MESSAGE);
					}
				}else
					JOptionPane.showMessageDialog(null, "Nav nepiegādātu pasūtījumu!",
							"Pasūtijumus nav", JOptionPane.ERROR_MESSAGE);
				break;
				
			case "Saņemt pasūtijumu":
				if(pasutijumi.size() > 0) {
					int izmers = pasutijumi.size() - 1;
					String nosauk = ((Pica)pasutijumi.get(izmers)).getNosaukums();
					String adresik = ((Pircejs)klients.get(0)).getAdrese();
					Object sanemts = pasutijumi.get(izmers);
					pasutijumi.remove(izmers);
					sanemtie.add(sanemts);
					try {
						FileWriter fw = new FileWriter("Sanemtas.txt", true);
						PrintWriter pw = new PrintWriter(fw);
						String saraksts = "";
						
						int lielum = sanemtie.size();
						saraksts+=((Pircejs)klients.get(0)).info();
						if (!sanemtie.isEmpty()) {
						    saraksts += ((Pica) sanemtie.get(lielum-1)).info();
						}
						pw.println(saraksts);
						pw.println();
						pw.close();	
					}catch(IOException e) {
					JOptionPane.showMessageDialog(null, "Radās kļūda saglabājot failā!",
							"Kļūda", JOptionPane.ERROR_MESSAGE);
				}
					
					JOptionPane.showMessageDialog(null, "Pica "+nosauk+ " saņēmta pa adresi: "+adresik, "Prece ir nosutita", JOptionPane.INFORMATION_MESSAGE);
					break;
				}else {
					JOptionPane.showMessageDialog(null, "Nav pasutijumus");
				}
				break;
				
			case "Saņemtie pasutījumi":
				if(sanemtie.size() > 0) {
					
					String teksts, str = "";
					try {
						FileReader fr = new FileReader("Sanemtas.txt");
						BufferedReader br = new BufferedReader(fr);
						while((teksts = br.readLine()) != null) {
							str += teksts+" "+"\n";	
						}
						br.close();
						JOptionPane.showMessageDialog(null, str, "Saņemtie pasutījumi", JOptionPane.INFORMATION_MESSAGE);
						
						
					}catch(IOException e){
						JOptionPane.showMessageDialog(null, "Radās kļūda nolasot faili!", "Kļūda", JOptionPane.ERROR_MESSAGE);
					}
				}else
					JOptionPane.showMessageDialog(null, "Nav piegādātus pasūtījumus!",
							"Pasūtijumus nav", JOptionPane.ERROR_MESSAGE);
				break;
				
			case "Apskatīt savu info":
				String str = "";
				str += ((Pircejs)klients.get(0)).info();
				JOptionPane.showMessageDialog(null, str, "Informacija", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Mainit savu info":
				String[] inform = {"Vards", "Adrese", "Talrunis"};
				izvele = (String)JOptionPane.showInputDialog(null, "Kuru informāciju izmainīt?", "Mainišana",
						JOptionPane.QUESTION_MESSAGE, null, inform, inform[0]);
				int izvelesIndekss = Arrays.asList(inform).indexOf(izvele);
				switch(izvelesIndekss) {
				case 0:
					vards = KadsVards();
					((Pircejs)klients.get(0)).setVards(vards);
					JOptionPane.showMessageDialog(null, "Vards veiksmigi nomainīts!");
					break;
				case 1:
					adrese = KadaAdrese();
					((Pircejs)klients.get(0)).setAdrese(adrese);
					JOptionPane.showMessageDialog(null, "Adrese veiksmigi nomainīta!");
					break;
				case 2:
					talrun = KadsTalrun();
					((Pircejs)klients.get(0)).setTalrunis(talrun);
					JOptionPane.showMessageDialog(null, "Talrunis veiksmigi nomainīts!");
					break;
				}
				
				break;
			case "Iziet no programmas":
				JOptionPane.showMessageDialog(null, "Uz redzešanos!");
				break;
			}
			
			}while(!izvele.equalsIgnoreCase("Iziet no programmas"));
			
		
		
	}

}
