/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.Opstijgterrein;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class OpstijgterreinDao {
    public static ArrayList<Opstijgterrein> getOpstijgterreinen() {
		ArrayList<Opstijgterrein> resultaat = new ArrayList<Opstijgterrein>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Opstijgterrein");
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					Opstijgterrein huidigeOpstijgterrein = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeOpstijgterrein);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}
    
    public static ArrayList<Opstijgterrein> searchOpstijgterrein(String input) {
        ArrayList<Opstijgterrein> resultaat = new ArrayList<Opstijgterrein>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Opstijgterrein WHERE naamEigenaar LIKE ?", new Object[]{input});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Opstijgterrein huidigeOpstijgterrein = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeOpstijgterrein);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

	public static Opstijgterrein getOpstijgterreinById(int id) {
		Opstijgterrein resultaat = null;
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Opstijgterrein where opstijgterreinID = ?", new Object[] { id });
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

	public static int voegOpstijgterreinToe(Opstijgterrein nieuweOpstijgterrein) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO Opstijgterrein (adres, naamEigenaar, email, telNr, grootteTerrein) VALUES (?,?,?,?,?)", new Object[] { nieuweOpstijgterrein.getAdres(), nieuweOpstijgterrein.getNaamEigenaar(), nieuweOpstijgterrein.getEmail(), nieuweOpstijgterrein.getTelNr(), nieuweOpstijgterrein.getGrootteTerrein() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int updateOpstijgterrein(Opstijgterrein nieuweOpstijgterrein) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE Opstijgterrein SET adres = ?, naamEigenaar = ?, email = ?, telNr = ?, grootteTerrein = ? WHERE OpstijgterreinID = ?", new Object[] { nieuweOpstijgterrein.getAdres(), nieuweOpstijgterrein.getNaamEigenaar(), nieuweOpstijgterrein.getEmail(), nieuweOpstijgterrein.getTelNr(), nieuweOpstijgterrein.getGrootteTerrein(), nieuweOpstijgterrein.getOpstijgterreinID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int verwijderOpstijgterrein(int opstijgterreinID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM Opstijgterrein WHERE OpstijgterreinID = ?", new Object[] { opstijgterreinID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int resetAutoIncrement(int newStartValue) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE Opstijgterrein AUTO_INCREMENT = ?;", new Object[] { newStartValue });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	private static Opstijgterrein converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
		return new Opstijgterrein(mijnResultset.getInt("opstijgterreinID"), mijnResultset.getString("adres"), mijnResultset.getString("naamEigenaar"), mijnResultset.getString("email"), mijnResultset.getString("telNr"), mijnResultset.getString("grootteTerrein"));
	}
        
}
