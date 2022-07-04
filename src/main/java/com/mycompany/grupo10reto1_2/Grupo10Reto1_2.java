package com.mycompany.grupo10reto1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author RealWering
 */
public class Grupo10Reto1_2 {

    public static void main(String[] args) {
        final String ingresarDato1 = """
                               Ingrese el primer valor valido para calcular
                               (debe ser numerico)                               
                               """;
        final String ingresarDato2 = """
                               Ingrese el segundo valor  valido para calcular
                               (debe ser numerico)                               
                               """;

        final String divisioncero = """
                               Está realizando una division, 
                                    el divisor no puede ser 0
                                    digite otro valor                              
                               """;
        String opcion;
        String operacion;
        String valor1;
        String valor2;
        boolean valcero;
        boolean val;
        boolean val1;
        

        double res;

        ClsMenus menu = new ClsMenus();
        ClsValidacion validacion = new ClsValidacion();

        do {
            opcion = JOptionPane.showInputDialog(null, menu.menuPrincipal, "Menu Calculadora", 1);

        } while (!"1".equals(opcion) && !"2".equals(opcion) && opcion != null);
        if ("1".equals(opcion)) {

            do {
                operacion = JOptionPane.showInputDialog(null, menu.menuOperaciones);
                val = validacion.esNumero(operacion);
                val1= validacion.EstaEnMenu(operacion);

            } while (val == false|val1==false);          
            

            if (operacion.equals("1") | operacion.equals("2") | operacion.equals("3") | operacion.equals("5")) {

                do {
                    valor1 = JOptionPane.showInputDialog(null, ingresarDato1);
                    val = validacion.esNumero(valor1);
                } while (val == false);
                double v1 = Double.parseDouble(valor1);
                do {
                    valor2 = JOptionPane.showInputDialog(null, ingresarDato2);
                    val1 = validacion.esNumero(valor2);
                } while (val1 == false);
                double v2 = Double.parseDouble(valor2);

                ClsCalculadora calc = new ClsCalculadora(v1, v2, operacion);
                res = Math.round(calc.operaciones1(v1, v2, operacion)*100.0)/100.0;
                
                JOptionPane.showMessageDialog(null, "la " + calc.nomOperacion + " entre " + v1 + " y "
                        + v2 + " es = " + res);

            } else if (operacion.equals("4")) {
                do {
                    valor1 = JOptionPane.showInputDialog(null, ingresarDato1);
                    val = validacion.esNumero(valor1);
                } while (val == false);
                double v1 = Double.parseDouble(valor1);
                do {
                    valor2 = JOptionPane.showInputDialog(null, ingresarDato2);
                    val1 = validacion.esNumero(valor2);
                } while (val1 == false);
                valcero = validacion.divisionCero(valor2);
                while (valcero == false) {
                    valor2 = JOptionPane.showInputDialog(null, divisioncero);
                    valcero = validacion.divisionCero(valor2);
                }

                double v2 = Double.parseDouble(valor2);

                ClsCalculadora calc = new ClsCalculadora(v1, v2, operacion);
                res = Math.round(calc.operaciones2(v1, v2, operacion)*100.0)/100.0;
                JOptionPane.showMessageDialog(null, "la " + calc.nomOperacion + " entre " + v1 + " y "
                        + v2 + " es = " + res);
            } else if (operacion.equals("6")) {
                do {
                    valor1 = JOptionPane.showInputDialog(null, ingresarDato1);
                    val = validacion.esNumero(valor1);
                } while (val != true);
                double v1 = Double.parseDouble(valor1);

                ClsCalculadora calc = new ClsCalculadora(v1, operacion);
                res = Math.round(calc.operaciones3(v1, operacion)*100.0)/100.0;
                JOptionPane.showMessageDialog(null, "la " + calc.nomOperacion + " de " + v1 + " es = " + res);

            } JOptionPane.showMessageDialog(null, "Hasta Pronto");
        } else {
            JOptionPane.showMessageDialog(null, "Hasta Pronto");
        }
    }
}
