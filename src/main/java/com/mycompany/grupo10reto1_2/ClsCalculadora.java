package com.mycompany.grupo10reto1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ClsCalculadora {

    
    double valor1;
    double valor2;
    String operando;
    String nomOperacion;

    public ClsCalculadora() {

    }

    public ClsCalculadora(double valor1, double valor2, String operando) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operando = operando;
    }

    public ClsCalculadora(double Valor1,String operando) {
        this.valor1 = Valor1;
    }

    public double operaciones1(double valor1, double valor2, String operando) {

        switch (operando) {
            case "1": {
                double resultado = valor1 + valor2;
                nomOperacion = "suma";
                return resultado;
                
            }
            case "2": {
                double resultado = valor1 - valor2;
                nomOperacion = "resta";
                return resultado;
            }
            case "3": {
                double resultado = valor1 * valor2;
                nomOperacion = "producto";
                 return resultado;
            }
            
            case "5": {
                double resultado = Math.pow(valor1, valor2);
                nomOperacion = "potencia";
                return resultado;
            
            }
            default:
                break;

        }
        return 0;
    }
    
    public double operaciones2(double valor1, double valor2, String operando) {

        
                double resultado = valor1 / valor2;
                nomOperacion = "Division";
                return resultado;
                
            
    }
    public double operaciones3(double valor1, String operando) {

        
                double resultado = Math.sqrt(valor1);
                nomOperacion = "Raiz Cuadrada";
                return resultado;
                
            
    }
    
}