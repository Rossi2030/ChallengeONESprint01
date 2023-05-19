package ConvertidorDeMonedas;

import javax.swing.JOptionPane;

public class Function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedas pesos = new ConvertirMonedas();
	
	public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null,
		"Elije la moneda a la que deseas convertir", "Monedas", 
		JOptionPane.PLAIN_MESSAGE, null, new Object[]
		{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japones", "De Pesos a Won Sul-Coreano"},
	    "Seleccion")).toString();
		
		switch(opcion) {
		case "De Pesos a Dolar":
		   monedas.ConvertirDePesosADolares(Minput);
		   break;
		case "De Pesos a Euro":
		   monedas.ConvertirDePesosAEuros(Minput);
		   break;
		case "De Pesos a Libras Esterlinas":
		   monedas.ConvertirDePesosALibrasEsterlinas(Minput);
		   break;
		case "De Pesos a Yen Japones":
		   monedas.ConvertirDePesosAYenJapone(Minput);
		   break;
		case "De Pesos a Won Sul-Coreano":
		   monedas.ConvertirDePesosAWonSulCoreano(Minput);
		   break;
		   
		}
	}
	
}
