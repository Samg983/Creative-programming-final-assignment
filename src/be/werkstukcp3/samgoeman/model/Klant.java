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
public class Klant {
    private int klantID;
    private String naam, betaald, email, telNr;

    public int getKlantID() {
        return klantID;
    }

    public void setKlantID(int klantID) {
        this.klantID = klantID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBetaald() {
        return betaald;
    }

    public void setBetaald(String betaald) {
        this.betaald = betaald;
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

    public Klant(int klantID, String naam, String betaald, String email, String telNr) {
        this.klantID = klantID;
        this.naam = naam;
        this.betaald = betaald;
        this.email = email;
        this.telNr = telNr;
    }

    @Override
    public String toString() {
        return naam;
    }
    
    
}
