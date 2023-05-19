package ConvertidorDeMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirDePesosADolares(double valor) {
		double dolarMoneda = valor * 0.0049;
		JOptionPane.showMessageDialog(null, "$ " + dolarMoneda + " Dolares");
	}
	
	public void ConvertirDePesosAEuros(double valor) {
		double euroMoneda = valor * 0.0044;
		JOptionPane.showMessageDialog(null, "Є " + euroMoneda + " Euros");
	}
	
	public void ConvertirDePesosALibrasEsterlinas(double valor) {
		double librasEsterlinasMoneda = valor * 0.0039;
		JOptionPane.showMessageDialog(null, "£ " + librasEsterlinasMoneda + " Libras Esterlinas");
	}
	
	public void ConvertirDePesosAYenJapone(double valor) {
		double yenJaponesMoneda = valor * 0.64;
		JOptionPane.showMessageDialog(null, "¥ " + yenJaponesMoneda + " Yen Japones");
	}
	
	public void ConvertirDePesosAWonSulCoreano(double valor) {
		double WonSulCoreanoMoneda = valor * 6.24;
		JOptionPane.showMessageDialog(null, "₩ " + WonSulCoreanoMoneda + " Won sul-coreano");
	}
	
}
