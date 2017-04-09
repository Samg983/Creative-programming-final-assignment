/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.Sponsor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class SponsorDao {
     public static ArrayList<Sponsor> getSponsors() {
		ArrayList<Sponsor> resultaat = new ArrayList<Sponsor>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Sponsor");
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					Sponsor huidigeSponsor = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeSponsor);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}

	public static Sponsor getSponsorById(int id) {
		Sponsor resultaat = null;
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Sponsor where sponsorID = ?", new Object[] { id });
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

	public static int voegSponsorToe(Sponsor nieuweSponsor) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO Sponsor (naam, email, telNr) VALUES (?,?,?)", new Object[] { nieuweSponsor.getNaam(), nieuweSponsor.getEmail(), nieuweSponsor.getTelNr() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int updateSponsor(Sponsor nieuweSponsor) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE Sponsor SET naam = ?, email = ?, telNr = ? WHERE sponsorID = ?", new Object[] { nieuweSponsor.getNaam(), nieuweSponsor.getEmail(), nieuweSponsor.getTelNr(), nieuweSponsor.getSponsorID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int verwijderSponsor(int sponsorID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM Sponsor WHERE sponsorID = ?", new Object[] { sponsorID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int resetAutoIncrement(int newStartValue) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE Sponsor AUTO_INCREMENT = ?;", new Object[] { newStartValue });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	private static Sponsor converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
		return new Sponsor(mijnResultset.getInt("sponsorID"), mijnResultset.getString("naam"), mijnResultset.getString("email"), mijnResultset.getString("telNr"));
	}
}
