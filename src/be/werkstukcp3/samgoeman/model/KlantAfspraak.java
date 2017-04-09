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
public class KlantAfspraak {
    private int klantAfspraakID, ballonvaartAfspraakID, klantID;

    public int getKlantAfspraakID() {
        return klantAfspraakID;
    }

    public void setKlantAfspraakID(int klantAfspraakID) {
        this.klantAfspraakID = klantAfspraakID;
    }

    public int getBallonvaartAfspraakID() {
        return ballonvaartAfspraakID;
    }

    public void setBallonvaartAfspraakID(int ballonvaartAfspraakID) {
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
    }

    public int getKlantID() {
        return klantID;
    }

    public void setKlantID(int klantID) {
        this.klantID = klantID;
    }

    public KlantAfspraak(int klantAfspraakID, int ballonvaartAfspraakID, int klantID) {
        this.klantAfspraakID = klantAfspraakID;
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
        this.klantID = klantID;
    }

    @Override
    public String toString() {
        return "KlantAfspraak{" + "klantAfspraakID=" + klantAfspraakID + ", ballonvaartAfspraakID=" + ballonvaartAfspraakID + ", klantID=" + klantID + '}';
    }

    
    
    
}
