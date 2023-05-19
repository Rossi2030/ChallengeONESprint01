package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {

	public void ConvertirDeCelsiusAFahrenheit(double valor) {
		double celsiusTemparatura = valor * 1.8;
		celsiusTemparatura = (double) Math.round(celsiusTemparatura + 32);
		JOptionPane.showMessageDialog(null, "Temperatura " + celsiusTemparatura + " Fahrenheit");
	}
	
	public void ConvertirDeCelsiusAkelvin(double valor) {
		double celsiusTemparatura = valor + 273.15;
		JOptionPane.showMessageDialog(null, "Temperatura " + celsiusTemparatura + " Kelvin");
	}
	
	public void ConvertirDeCelsiusARankine(double valor) {
		double celsiusTemparatura = valor *9/5;
		celsiusTemparatura = (double) Math.round(celsiusTemparatura + 491.67);
		JOptionPane.showMessageDialog(null, "Temperatura " + celsiusTemparatura + " Rankine");
	}
	
}
