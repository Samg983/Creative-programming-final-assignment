/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.model;

import java.awt.event.KeyEvent;

/**
 *
 * @author SamGoeman
 */
public class Check {

    private static String[] gesplitsteDatum;

    public static boolean notEmpty(String field) {
        return !field.isEmpty() && field.length() > 0;
    }

    public static boolean checkEmail(String email) {
        if (notEmpty(email)) {
            if (email.contains("@")) {
                if (email.indexOf("@") < email.length() - 4) {
                    if (email.endsWith(".be") || email.endsWith(".com") || email.endsWith(".nl")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkMax5Passagiers(String passagiers) {
        boolean resultaat = false;
        if (notEmpty(passagiers)) {
            if (!(Integer.parseInt(passagiers) > 5)) {
                return true;
            }
        }
        return false;
    }

    public static boolean onlyNumberCheck(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
       
        //Wanneer er een letter ingetypt wordt, dan zal het evt geconsumed worden, met andere woorden, het event wordt niet uitgevoerd
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_COMMA)) {
            evt.consume();
        } else {
            return true;
        }
        return false;
    }

    public static boolean checkDatum(String datum) {
        if (notEmpty(datum)) {
            if (datum.contains("/")) {
                gesplitsteDatum = datum.split("/");
                if (gesplitsteDatum.length == 3) {
                    if (gesplitsteDatum[0].length() == 2 && gesplitsteDatum[1].length() == 2 && gesplitsteDatum[2].length() == 4) {
                        if (Integer.parseInt(gesplitsteDatum[0]) <= 31 && Integer.parseInt(gesplitsteDatum[1]) <= 12 && Integer.parseInt(gesplitsteDatum[2]) <= 2020 && Integer.parseInt(gesplitsteDatum[2]) >= 2017) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkImmatriculatie(String field) {

        if (notEmpty(field)) {
            if (field.contains("-")) {
                String[] gesplitstImmatriculatie = field.split("-");
                if (gesplitstImmatriculatie.length == 2) {
                    if ((gesplitstImmatriculatie[0].equals("oo") || gesplitstImmatriculatie[0].equals("OO")) && gesplitstImmatriculatie[1].length() == 3) {
                        if (gesplitstImmatriculatie[1].startsWith("b") || gesplitstImmatriculatie[1].startsWith("B")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
