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
public class Sponsor  {
    private int sponsorID;
    private String naam, email, telNr;

    public int getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(int sponsorID) {
        this.sponsorID = sponsorID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
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

    public Sponsor(int sponsorID, String naam, String email, String telNr) {
        this.sponsorID = sponsorID;
        this.naam = naam;
        this.email = email;
        this.telNr = telNr;
    }

    @Override
    public String toString() {
        return "Sponsor "  + naam;
    }
    
    
}
