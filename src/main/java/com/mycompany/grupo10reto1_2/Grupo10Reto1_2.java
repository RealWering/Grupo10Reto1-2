package com.mycompany.grupo10reto1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author RealWering
 */
public class Grupo10Reto1_2 {

    public static void main(String[] args) {
        String opcion;
        ClsMenus menu = new ClsMenus();
        do {
            opcion = JOptionPane.showInputDialog(null, menu.menuPrincipal, "Menu Calculadora", 1);

        } while (!"1".equals(opcion) && !"2".equals(opcion) && opcion != null);
        String a;
        do {
            if (opcion.equals("1")) {
                a = menu.logica();
                if (a.equals("7")) {
                    JOptionPane.showMessageDialog(null, "Hasta Pronto","Salida",1);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Hasta Pronto","Salida",1);
                return;
            }
        } while (!a.equals("7"));
        menu.logica();
    }
}
