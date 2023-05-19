package ConvertidorDeMonedas;

import javax.swing.JOptionPane;

public class Function2 {
	
	    ConvertirInversamente inverso = new ConvertirInversamente();
		
		public void ConvertirInversamente (double Minput) {
			String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda a la que deseas convertir", "Monedas", 
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
			{"De Dolar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japones a Pesos", "De Won Sul-Coreano a Pesos"},
		    "Seleccion")).toString();
			
			switch(opcion) {
			case "De Dolar a Pesos":
				inverso.ConvertirDeDolaresAPesos(Minput);
			   break;
			case "De Euro a Pesos":
				inverso.ConvertirDeEurosAPesos(Minput);
			   break;
			case "De Libras Esterlinas a Pesos":
				inverso.ConvertirDeLibrasEsterlinasAPesos(Minput);
			   break;
			case "De Yen Japones a Pesos":
				inverso.ConvertirDeYenJaponeAPesos(Minput);
			   break;
			case "De Won Sul-Coreano a Pesos":
				inverso.ConvertirDeWonSulCoreanoAPesos(Minput);
			   break;
			}
		}
	}

