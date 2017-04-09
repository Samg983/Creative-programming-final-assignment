/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.model;

/**
 *
 * @author SamGoeman
 */
public class Opstijgterrein {
    private int opstijgterreinID;
    private String adres, naamEigenaar, email, telNr, grootteTerrein;

    public int getOpstijgterreinID() {
        return opstijgterreinID;
    }

    public void setOpstijgterreinID(int opstijgterreinID) {
        this.opstijgterreinID = opstijgterreinID;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNaamEigenaar() {
        return naamEigenaar;
    }

    public void setNaamEigenaar(String naamEigenaar) {
        this.naamEigenaar = naamEigenaar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public String getGrootteTerrein() {
        return grootteTerrein;
    }

    public void setGrootteTerrein(String grootteTerrein) {
        this.grootteTerrein = grootteTerrein;
    }

    public Opstijgterrein(int opstijgterreinID, String adres, String naamEigenaar, String email, String telNr, String grootteTerrein) {
        this.opstijgterreinID = opstijgterreinID;
        this.adres = adres;
        this.naamEigenaar = naamEigenaar;
        this.email = email;
        this.telNr = telNr;
        this.grootteTerrein = grootteTerrein;
    }

    @Override
    public String toString() {
        return "Opstijgterrein " + opstijgterreinID + " " + naamEigenaar;
    }
    
    
}
