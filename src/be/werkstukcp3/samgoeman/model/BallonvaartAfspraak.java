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
public class BallonvaartAfspraak {
    private int ballonvaartAfspraakID, aantalPassagiers, opstijgterreinID, ballonID;
    private String datum; 

    public int getBallonvaartAfspraakID() {
        return ballonvaartAfspraakID;
    }

    public void setBallonvaartAfspraakID(int ballonvaartAfspraakID) {
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        this.aantalPassagiers = aantalPassagiers;
    }

    public int getOpstijgterreinID() {
        return opstijgterreinID;
    }

    public void setOpstijgterreinID(int opstijgterreinID) {
        this.opstijgterreinID = opstijgterreinID;
    }

    public int getBallonID() {
        return ballonID;
    }

    public void setBallonID(int ballonID) {
        this.ballonID = ballonID;
    }

    public BallonvaartAfspraak(int ballonvaartAfspraakID, String datum, int aantalPassagiers, int opstijgterreinID, int ballonID) {
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
        this.datum = datum;
        this.aantalPassagiers = aantalPassagiers;
        this.opstijgterreinID = opstijgterreinID;
        this.ballonID = ballonID;
    }

    @Override
    public String toString() {
        return "Ballonvaart afspraak " + ballonvaartAfspraakID;
    }

    
}
