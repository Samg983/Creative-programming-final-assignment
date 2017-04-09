/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.KlantAfspraak;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class KlantAfspraakDao {
    public static ArrayList<KlantAfspraak> getKlantAfspraken() {
		ArrayList<KlantAfspraak> resultaat = new ArrayList<KlantAfspraak>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from KlantAfspraak");
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					KlantAfspraak huidigeKlantAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeKlantAfspraak);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}
    
    public static ArrayList<KlantAfspraak> getKlantAfsprakenByBallonvaartAfspraakId(int id) {
		ArrayList<KlantAfspraak> resultaat = new ArrayList<KlantAfspraak>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from KlantAfspraak where ballonvaartAfspraakID = ?", new Object[] { id });
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					KlantAfspraak huidigeKlantAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeKlantAfspraak);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}
    
    public static ArrayList<KlantAfspraak> getKlantAfsprakenByKlantId(int id) {
		ArrayList<KlantAfspraak> resultaat = new ArrayList<KlantAfspraak>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from KlantAfspraak where klantID = ?", new Object[] { id });
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					KlantAfspraak huidigeKlantAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeKlantAfspraak);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}

	public static KlantAfspraak getKlantAfspraakById(int id) {
		KlantAfspraak resultaat = null;
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from KlantAfspraak where klantAfspraakID = ?", new Object[] { id });
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

	public static int voegKlantAfspraakToe(KlantAfspraak nieuweKlantAfspraak) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO KlantAfspraak (ballonvaartAfspraakID, klantID) VALUES (?,?)", new Object[] { nieuweKlantAfspraak.getBallonvaartAfspraakID(), nieuweKlantAfspraak.getKlantID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int updateKlantAfspraak(KlantAfspraak nieuweKlantAfspraak) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE KlantAfspraak SET ballonvaartAfspraakID = ?, klantID = ? WHERE klantAfspraakID = ?", new Object[] { nieuweKlantAfspraak.getBallonvaartAfspraakID(), nieuweKlantAfspraak.getKlantID(), nieuweKlantAfspraak.getKlantAfspraakID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int verwijderKlantAfspraak(int klantAfspraakID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM KlantAfspraak WHERE klantAfspraakID = ?", new Object[] { klantAfspraakID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int verwijderKlantAfspraakByKlantId(int klantId) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM KlantAfspraak WHERE klantId = ?", new Object[] { klantId });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int verwijderKlantAfspraakByBallonvaartAfspraakId(int ballonvaartAfspraakID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM KlantAfspraak WHERE ballonvaartAfspraakID = ?", new Object[] { ballonvaartAfspraakID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int resetAutoIncrement(int newStartValue) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE KlantAfspraak AUTO_INCREMENT = ?;", new Object[] { newStartValue });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	private static KlantAfspraak converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
		return new KlantAfspraak(mijnResultset.getInt("klantAfspraakID"), mijnResultset.getInt("ballonvaartAfspraakID"), mijnResultset.getInt("klantID"));
	}
}
