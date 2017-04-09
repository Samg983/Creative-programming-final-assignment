/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.model;

import be.werkstukcp3.samgoeman.dao.SponsorDao;

/**
 *
 * @author SamGoeman
 */
public class SponsorContract {
    private int sponsorContractID, ballonID, sponsorID;

    public int getSponsorContractID() {
        return sponsorContractID;
    }

    public void setSponsorContractID(int sponsorContractID) {
        this.sponsorContractID = sponsorContractID;
    }

    public int getBallonID() {
        return ballonID;
    }

    public void setBallonID(int ballonID) {
        this.ballonID = ballonID;
    }

    public int getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(int sponsorID) {
        this.sponsorID = sponsorID;
    }

    public SponsorContract(int sponsorContractID, int ballonID, int sponsorID) {
        this.sponsorContractID = sponsorContractID;
        this.ballonID = ballonID;
        this.sponsorID = sponsorID;
    }

    @Override
    public String toString() {
        Sponsor sponsor = SponsorDao.getSponsorById(this.sponsorID);
        return "Sponsor contract " +  sponsorContractID + " " + sponsor.getNaam();
    }

    
   
    
}
