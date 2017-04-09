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
public class CrewAfspraak {
    private int crewAfspraakID, ballonvaartAfspraakID, crewlidID;

    public int getCrewAfspraakID() {
        return crewAfspraakID;
    }

    public void setCrewAfspraakID(int crewAfspraakID) {
        this.crewAfspraakID = crewAfspraakID;
    }

    public int getBallonvaartAfspraakID() {
        return ballonvaartAfspraakID;
    }

    public void setBallonvaartAfspraakID(int ballonvaartAfspraakID) {
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
    }

    public int getCrewlidID() {
        return crewlidID;
    }

    public void setCrewlidID(int crewlidID) {
        this.crewlidID = crewlidID;
    }

    public CrewAfspraak(int crewAfspraakID, int ballonvaartAfspraakID, int crewlidID) {
        this.crewAfspraakID = crewAfspraakID;
        this.ballonvaartAfspraakID = ballonvaartAfspraakID;
        this.crewlidID = crewlidID;
    }

    @Override
    public String toString() {
        return "CrewAfspraak{" + "crewAfspraakID=" + crewAfspraakID + ", ballonvaartAfspraakID=" + ballonvaartAfspraakID + ", crewlidID=" + crewlidID + '}';
    }

    
    
    
}
