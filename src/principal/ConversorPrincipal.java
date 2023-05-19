package principal;

import javax.swing.JOptionPane;

import ConversorDeTemperatura.FunctionTemp;

import ConvertidorDeMonedas.Function;
import ConvertidorDeMonedas.Function2;

public class ConversorPrincipal {

	public static void main(String[] args) {

		Function monedas = new Function();
		
		FunctionTemp temperatura = new FunctionTemp();
		
		Function2 inverso = new Function2();
		
		
		boolean flag = true;
		
		while(flag) {
			
			Object opcion1 = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Monedas Inverso", "Conversor de Temperatura"}, "Seleccion").toString();
			
			String opcion = opcion1.toString();
			switch(opcion) {
			
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Cantidad de dinero que deseas convertir: ");
				
			     if(ValidarNumero(input)) {
				
			    	 double Minput = Double.parseDouble(input);
			    	 monedas.ConvertirMonedas(Minput);
			    	 
			    	 int respuesta = JOptionPane.showConfirmDialog(null, "¿Quiere realizar otra conversion?");
			    	 if(JOptionPane.OK_OPTION == respuesta) {
			    		 System.out.println("Presione opcion Afirmativa");
			    	 } else {
			    		 flag = false;
			    		 JOptionPane.showMessageDialog(null, "Finalizo el Programa");
			    	 }
			    	  
			     }
			     
			     break;
			     
			case "Conversor de Monedas Inverso":
				String input1 = JOptionPane.showInputDialog("Cantidad de dinero que deseas convertir: ");
				
			     if(ValidarNumero(input1)) {
				
			    	 double Minput2 = Double.parseDouble(input1);
			    	 inverso.ConvertirInversamente(Minput2);
			    	 
			    	 int respuesta = JOptionPane.showConfirmDialog(null, "¿Quiere realizar otra conversion?");
			    	 if(JOptionPane.OK_OPTION == respuesta) {
			    		 System.out.println("Presione opcion Afirmativa");
			    	 } else {
			    		 flag = false;
			    		 JOptionPane.showMessageDialog(null, "Finalizo el Programa");
			    	 }
			    	  
			     }
			     
			     break;
			    	   
			    	   
			    	   case "Conversor de Temperatura":
			    	   input = JOptionPane.showInputDialog("Valor de la temperatura para convertir: ");
			    	   if(ValidarNumero(input) == true) {
			    		   double Minput2 = Double.parseDouble(input);
			    		   temperatura.ConvertirTemperaturas(Minput2);
			    		   
			    		   int respuesta = 0;
			    		   respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			    		   if((respuesta == 0) && (ValidarNumero(input) == true)) {   
			    		   } else {
			    			   flag = false;
			    			   JOptionPane.showMessageDialog(null, "Finalizo el Programa");
			    		   }
			    	   } else {
			    		   JOptionPane.showMessageDialog(null, "Valor invalido");
			    	   }
			    	   
			    	   break;
			     }
			}
	}
	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}


}
