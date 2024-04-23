import javax.swing.JOptionPane;

public class piculka {

	public static void main(String[] args) {
		//https://stock.adobe.com/search?k=pizza+png
		
		String izvele, vards, persvards, adrese;
		int talrun;
		String[] persona = {"Pircejs", "Personāls"};
		
		String[] darbibas = {"Menu", "Iegadies picu", "Mainit savu info", "Iziet no programmas"};
		String[] picas = {"Margarita", "Studenta","Piperoni", "Vistas","BBQ", "Assa pica"};
		JOptionPane.showMessageDialog(null, "Sveiki picas piedages porgramma!");
		izvele = (String)JOptionPane.showInputDialog(null, "Kas jūs esat?",
				"Reģistrācija", JOptionPane.QUESTION_MESSAGE,
				null, persona, persona[0]);
		
		if(izvele == "Pircejs") {
			vards = (String)JOptionPane.showInputDialog(null, "Jūsu vārds: ");
			adrese = (String) JOptionPane.showInputDialog(null, "Ievādies savu adresi: ");
			talrun = Integer.parseInt(JOptionPane.showInputDialog("Ievadiet talruni:"));
			Pircejs pirc = new Pircejs(vards, adrese, talrun);
			do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izveleties funkciju:", "Izvele",
					JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			switch(izvele) {
			
			case "Menu":
				JOptionPane.showOptionDialog(null, "Apskatīt picu", "Pica", 0, 2, null, picas, picas[0]);
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
			//šeit būs fails ar vardiem, kuram pieļauti izmantot personala funkcijas un salidzinašana
		}
		
		
		
		
	}

}
