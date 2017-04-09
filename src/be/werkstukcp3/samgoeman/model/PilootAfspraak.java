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
public class PilootAfspraak {
    private int pilootAfspraakID, ballonvaartAfspraakID, pilootID;

    public int getPilootAfspraakID() {
        return pilootAfspraakID;
    }

    public void setPilootAfspraakID(int pilootAfspraakID) {
        this.pilootAfspraakID = pilootAfspraakID;
    }

    public int getBallonvaartAfspraakID() {
        return ballonvaartAfspraakID;
    }

    public void setBallonvaartAfspraakID(int ballonvaartAfspraakID) {
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
    }

    public int getPilootID() {
        return pilootID;
    }

    public void setPilootID(int pilootID) {
        this.pilootID = pilootID;
    }

    public PilootAfspraak(int pilootAfspraakID, int ballonvaartAfspraakID, int pilootID) {
        this.pilootAfspraakID = pilootAfspraakID;
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
        this.pilootID = pilootID;
    }

    @Override
    public String toString() {
        return "PilootAfspraak{" + "pilootAfspraakID=" + pilootAfspraakID + ", ballonvaartAfspraakID=" + ballonvaartAfspraakID + ", pilootID=" + pilootID + '}';
    }

    
    
}
