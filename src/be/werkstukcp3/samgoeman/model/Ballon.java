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
public class Ballon {
    private int ballonID;
    private String naam, immatriculatie;

    public int getBallonID() {
        return ballonID;
    }

    public void setBallonID(int ballonID) {
        this.ballonID = ballonID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getImmatriculatie() {
        return immatriculatie;
    }

    public void setImmatriculatie(String immatriculatie) {
        this.immatriculatie = immatriculatie;
    }

    public Ballon(int ballonID, String naam, String immatriculatie) {
        this.ballonID = ballonID;
        this.naam = naam;
        this.immatriculatie = immatriculatie;
    }

    @Override
    public String toString() {
        return naam;
    }
    
    
}
