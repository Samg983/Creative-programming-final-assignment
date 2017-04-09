/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.SponsorContract;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class SponsorContractDao {
    public static ArrayList<SponsorContract> getSponsorContracten() {
		ArrayList<SponsorContract> resultaat = new ArrayList<SponsorContract>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from SponsorContract");
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					SponsorContract huidigeSponsorContract = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeSponsorContract);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}

	public static SponsorContract getSponsorContractById(int id) {
		SponsorContract resultaat = null;
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from SponsorContract where sponsorContractID = ?", new Object[] { id });
			if (mijnResultset != null) {
				mijnResultset.first();
				resultaat = converteerHuidigeRijNaarObject(mijnResultset);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}
        
       

	public static int voegSponsorContractToe(SponsorContract nieuweSponsorContract) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO SponsorContract (ballonID, sponsorID) VALUES (?,?)", new Object[] { nieuweSponsorContract.getBallonID(), nieuweSponsorContract.getSponsorID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int updateSponsorContract(SponsorContract nieuweSponsorContract) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE SponsorContract SET ballonID = ?, sponsorID = ? WHERE sponsorContractID = ?", new Object[] { nieuweSponsorContract.getBallonID(), nieuweSponsorContract.getSponsorID(), nieuweSponsorContract.getSponsorContractID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int verwijderSponsorContract(int sponsorContractID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM SponsorContract WHERE sponsorContractID = ?", new Object[] { sponsorContractID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int resetAutoIncrement(int newStartValue) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE SponsorContract AUTO_INCREMENT = ?;", new Object[] { newStartValue });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	private static SponsorContract converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
		return new SponsorContract(mijnResultset.getInt("sponsorContractID"), mijnResultset.getInt("ballonID"), mijnResultset.getInt("sponsorID"));
	}
}
