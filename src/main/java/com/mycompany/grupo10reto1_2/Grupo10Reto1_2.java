package com.mycompany.grupo10reto1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author RealWering
 */
public class Grupo10Reto1_2 {

    public static void main(String[] args) {

        final String menuPrincipal = """
                                     
                  Bienvenido a nuestra calculadora
                  
                  Digite una opcion Valida:
                  
                  1. Realizar una operacion
                  
                  2. Salir               
                
                  """;
        final String menuOperaciones = """
                                 Selecione la operacion que va a realizar:
                                 
                                 1. Suma
                                 2. Resta
                                 3. Multiplicación
                                 4. División
                                 5. Potencia
                                 6. Raiz Cuadrada
                                 7. Salir                               
                                 
                                 """;
        final String ingresarDato = """
                               Ingrese el un dato para calcular
                               
                               """;
        String opcion;
        String operacion;
        String valor1;
        String valor2;
        boolean val;
        boolean val1;
        double v11;
        double v22;
        double res;

        do {
            opcion = JOptionPane.showInputDialog(null, menuPrincipal, "Menu Calculadora", 1);

        } while (!"1".equals(opcion) && !"2".equals(opcion) && opcion != null);
        if ("1".equals(opcion)) {
            operacion = JOptionPane.showInputDialog(null, menuOperaciones);
            if (operacion.equals("1") | operacion.equals("2") | operacion.equals("3") | operacion.equals("5")
                    | operacion.equals("6")) {
                valor1 = JOptionPane.showInputDialog(null, ingresarDato);
                ClsValidacion validacion = new ClsValidacion();

                val = validacion.esNumero(valor1);
                if (val == true) {
                    double v1 = Double.parseDouble(valor1);
                    valor2 = JOptionPane.showInputDialog(null, ingresarDato);
                    val1 = validacion.esNumero(valor2);
                    double v2 = Double.parseDouble(valor2);
                   
                    ClsCalculadora calc = new ClsCalculadora(v1, v2, operacion);
                    res = calc.operaciones1(v1, v2, operacion);
                    JOptionPane.showMessageDialog(null, "la "+ calc.nomOperacion + " entre " + v1 + " y " 
                            +  v2 + " es = " + res );
                    
                }

                
               

            }

        } else {
            JOptionPane.showMessageDialog(null, "Hasta Pronto");

        }

    }
}
