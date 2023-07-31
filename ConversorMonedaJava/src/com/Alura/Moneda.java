package com.Alura;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Moneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opciones[] = {"Soles a Euros", "Soles a Dolares", "Soles a libras esterlinas", "Soles a Yen", "Soles a Won"};
		
		String cambio = (String) JOptionPane.showInputDialog(null, 
				"Elije la moneda a la que deseas convertir tu dinero",
				"Conversor de Moneda",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		boolean continuarPrograma = true;
		double soles = 0;
		DecimalFormat df = new DecimalFormat("#.00");
		do {
			String cantidad = JOptionPane.showInputDialog(null, "Ingrese cantidad de dinero que deseas convertir:",0);
			try {
				soles = Double.parseDouble(cantidad);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no valido");
			}

			if (cambio.equals("Soles a Euros")) {
				double euros = soles / 3.95;
				JOptionPane.showMessageDialog(null, "Tienes €" + df.format(euros) + " Euros.");
			} else if (cambio.equals("Soles a Dolares")) {
				double dolares = soles / 3.62;
				JOptionPane.showMessageDialog(null, "Tienes $" + df.format(dolares) + " Dolares.");
			} else if (cambio.equals("Soles a libras esterlinas")) {
				double libras = soles / 4.65;
				JOptionPane.showMessageDialog(null, "Tienes £" + df.format(libras) + " Libras esterlinas");
			} else if (cambio.equals("Soles a Yen")) {
				double yen = soles / 0.025;
				JOptionPane.showMessageDialog(null, "Tienes ¥" + df.format(yen) + " Yenes.");
			} else if (cambio.equals("Soles a won")) {
				double won = soles / 0.0028;
				JOptionPane.showMessageDialog(null, "Tienes ₩" + df.format(won) + " Wones.");
			}

			int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
				continuarPrograma = false;
				JOptionPane.showMessageDialog(null, "Programa finalizado");
			}
		}while(continuarPrograma == true);
	}

}
