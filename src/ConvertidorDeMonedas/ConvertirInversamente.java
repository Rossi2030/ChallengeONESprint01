package ConvertidorDeMonedas;

import javax.swing.JOptionPane;

public class ConvertirInversamente {

	public void ConvertirDeDolaresAPesos(double valor) {
		double pesosMoneda = valor * 209.49;
		JOptionPane.showMessageDialog(null, "$ " + pesosMoneda + " Pesos");
	}
	
	public void ConvertirDeEurosAPesos(double valor) {
		double pesosMoneda = valor * 226.45;
		JOptionPane.showMessageDialog(null, "$ " + pesosMoneda + " Pesos");
	}
	
	public void ConvertirDeLibrasEsterlinasAPesos(double valor) {
		double pesosMoneda = valor * 257.47;
		JOptionPane.showMessageDialog(null, "$ " + pesosMoneda + " Pesos");
	}
	
	public void ConvertirDeYenJaponeAPesos(double valor) {
		double pesosMoneda = valor * 1.57;
		JOptionPane.showMessageDialog(null, "$ " + pesosMoneda + " Pesos");
	}
	
	public void ConvertirDeWonSulCoreanoAPesos(double valor) {
		double pesosMoneda = valor * 0.16;
		JOptionPane.showMessageDialog(null, "$ " + pesosMoneda + " Pesos");
	}
}
