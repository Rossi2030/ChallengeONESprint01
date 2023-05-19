package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemp {

	ConvertirTemperaturas temperatura = new ConvertirTemperaturas();
	
	public void ConvertirTemperaturas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null,
		"Elije la temperatura a la que deseas convertir", "Temperaturas", 
		JOptionPane.PLAIN_MESSAGE, null, new Object[]
		{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine"},
	    "Seleccion")).toString();
		
		switch(opcion) {
		case "De Celsius a Fahrenheit":
		    temperatura.ConvertirDeCelsiusAFahrenheit(Minput);
		   break;
		case "De Celsius a Kelvin":
			temperatura.ConvertirDeCelsiusAkelvin(Minput);
		   break;
		case "De Celsius a Rankine":
			temperatura.ConvertirDeCelsiusARankine(Minput);
		   break;
		}
	}
}
