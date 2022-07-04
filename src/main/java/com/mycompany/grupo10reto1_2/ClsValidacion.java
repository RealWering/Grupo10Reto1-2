package com.mycompany.grupo10reto1_2;

/**
 *
 * @author user
 */
public class ClsValidacion {

    public ClsValidacion() {
    }

    public boolean esNumero(String strnum) {
        if (strnum == null) {
            return false;
        }
        try {
            double nu = Double.parseDouble(strnum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;

    }

}
