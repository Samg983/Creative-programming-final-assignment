/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.Klant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class KlantDao {
    public static ArrayList<Klant> getKlanten() {
		ArrayList<Klant> resultaat = new ArrayList<Klant>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Klant");
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					Klant huidigeKlant = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeKlant);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}
    
    public static ArrayList<Klant> searchKlant(String input) {
        ArrayList<Klant> resultaat = new ArrayList<Klant>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Klant WHERE naam LIKE ?", new Object[]{input});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Klant huidigeKlant = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeKlant);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

	public static Klant getKlantById(int id) {
		Klant resultaat = null;
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Klant where klantID = ?", new Object[] { id });
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

	public static int voegKlantToe(Klant nieuweKlant) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO Klant (naam, betaald, email, telNr) VALUES (?,?,?,?)", new Object[] { nieuweKlant.getNaam(), nieuweKlant.getBetaald(), nieuweKlant.getEmail(), nieuweKlant.getTelNr() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int updateKlant(Klant nieuweKlant) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE Klant SET naam = ?, betaald = ?, email = ?, telNr = ? WHERE klantID = ?", new Object[] { nieuweKlant.getNaam(), nieuweKlant.getBetaald(), nieuweKlant.getEmail(), nieuweKlant.getTelNr(), nieuweKlant.getKlantID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int verwijderKlant(int klantID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM Klant WHERE klantID = ?", new Object[] { klantID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int resetAutoIncrement(int newStartValue) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE Klant AUTO_INCREMENT = ?;", new Object[] { newStartValue });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	private static Klant converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
		return new Klant(mijnResultset.getInt("klantID"), mijnResultset.getString("naam"), mijnResultset.getString("betaald"), mijnResultset.getString("email"), mijnResultset.getString("telNr"));
	}
}
