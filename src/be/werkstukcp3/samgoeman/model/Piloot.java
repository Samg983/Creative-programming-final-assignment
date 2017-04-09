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
public class Piloot {
    private int pilootID;
    private String naam, licentie, adres, email, telNr;

    public int getPilootID() {
        return pilootID;
    }

    public void setPilootID(int pilootID) {
        this.pilootID = pilootID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLicentie() {
        return licentie;
    }

    public void setLicentie(String licentie) {
        this.licentie = licentie;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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

    public Piloot(int pilootID, String naam, String licentie, String adres, String email, String telNr) {
        this.pilootID = pilootID;
        this.naam = naam;
        this.licentie = licentie;
        this.adres = adres;
        this.email = email;
        this.telNr = telNr;
    }

    @Override
    public String toString() {
        return "Piloot " + pilootID + ", " + naam;
    }
    
    
}
