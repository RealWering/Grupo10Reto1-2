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

    public boolean divisionCero(String strnum) {
        if (strnum.equals("0")) {
            return false;
        }
        return true;
    }

    public boolean EstaEnMenu(String strnum) {
        if (strnum == null) {
            return false;
        }
        try {
            double nu = Double.parseDouble(strnum);
        } catch (NumberFormatException nfe) {
            return false; 
        }
            int nu1 = Integer.parseInt(strnum);
            if (nu1 < 8 && nu1 > 0) {
                return true;
            }
            return false;
        }

    }
