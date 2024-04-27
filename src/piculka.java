import java.awt.Component;
import java.awt.Image;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

	public static void main(String[] args) {
		String izvele, vards, persvards, adrese, telefons;
		String[] persona = {"Pircejs", "Personāls"};
		
		String[] darbibas = {"Menu", "Iegadies picu", "Apskatīt savu info", "Mainit savu info", "Iziet no programmas"};
		String[] picas = {"Margarita", "Studenta", "Piperoni", "Vistas","BBQ", "Assa pica"};
		JOptionPane.showMessageDialog(null, "Sveiki picas piedages porgramma!");
		izvele = (String)JOptionPane.showInputDialog(null, "Kas jūs esat?",
				"Reģistrācija", JOptionPane.QUESTION_MESSAGE,
				null, persona, persona[0]);
		
		if(izvele == "Pircejs") {
			do {
			vards = (String)JOptionPane.showInputDialog(null, "Jūsu vārds: ");
			}while(vards.length() <3);
			
			boolean pareizi = false;
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
			
			pareizi = false;
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
			Pircejs pirc = new Pircejs(vards, adrese, talrun);
			do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izveleties funkciju:", "Izvele",
					JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
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
				//...
				break;
			case "Mainit savu info":
				//...
				break;
			case "Iziet no programmas":
				JOptionPane.showMessageDialog(null, "Uz redzešanos!");
				break;
			}
			
			}while(!izvele.equalsIgnoreCase("Iziet no programmas"));
			
			
		}else if(izvele == "Personāls") {
			persvards = (String)JOptionPane.showInputDialog(null, "Ievadiet savu vardu: ");
			//šeit būs fails ar vardiem, kuram pieļauti izmantot personala funkcijas un salidzinašana)
		}
		
		
		
		
	}

}
