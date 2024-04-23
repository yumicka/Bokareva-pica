import javax.swing.JOptionPane;

public class piculka {

	public static void main(String[] args) {
		String izvele, vards, adrese;
		int talrun;
		String[] persona = {"Pircejs", "Personāls"};
		
		String[] darbibas = {"Menu", "Iegadies picu", "Mainit savu info", "Iziet no programmas"};
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
				//...
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
			//.......
		}
		
		
		
		
	}

}
