/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.CrewAfspraak;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class CrewAfspraakDao {
    public static ArrayList<CrewAfspraak> getCrewAfspraken() {
		ArrayList<CrewAfspraak> resultaat = new ArrayList<CrewAfspraak>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from CrewAfspraak");
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					CrewAfspraak huidigeCrewAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeCrewAfspraak);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}
    
    public static ArrayList<CrewAfspraak> getCrewAfsprakenByBallonvaartAfspraakId(int id) {
		ArrayList<CrewAfspraak> resultaat = new ArrayList<CrewAfspraak>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from CrewAfspraak where ballonvaartAfspraakID = ?", new Object[] { id });
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					CrewAfspraak huidigeCrewAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeCrewAfspraak);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}
    
    public static ArrayList<CrewAfspraak> getCrewAfsprakenByCrewlidId(int id) {
		ArrayList<CrewAfspraak> resultaat = new ArrayList<CrewAfspraak>();
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from CrewAfspraak where crewlidId = ?", new Object[] { id });
			if (mijnResultset != null) {
				while (mijnResultset.next()) {
					CrewAfspraak huidigeCrewAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
					resultaat.add(huidigeCrewAfspraak);
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}

		return resultaat;
	}

	public static CrewAfspraak getCrewAfspraakById(int id) {
		CrewAfspraak resultaat = null;
		try {
			ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from CrewAfspraak where crewAfspraakID = ?", new Object[] { id });
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
        
       
	public static int voegCrewAfspraakToe(CrewAfspraak nieuweCrewAfspraak) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO CrewAfspraak (ballonvaartAfspraakID, crewlidID) VALUES (?,?)", new Object[] { nieuweCrewAfspraak.getBallonvaartAfspraakID(), nieuweCrewAfspraak.getCrewlidID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int updateCrewAfspraak(CrewAfspraak nieuweCrewAfspraak) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE CrewAfspraak SET ballonvaartAfspraakID = ?, crewlidID = ? WHERE crewAfspraakID = ?", new Object[] { nieuweCrewAfspraak.getBallonvaartAfspraakID(), nieuweCrewAfspraak.getCrewlidID(), nieuweCrewAfspraak.getCrewAfspraakID() });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	public static int verwijderCrewAfspraak(int crewAfspraakID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM CrewAfspraak WHERE crewAfspraakID = ?", new Object[] { crewAfspraakID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int verwijderCrewAfspraakByBallonvaartAfspraakId(int ballonvaartAfspraakID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM CrewAfspraak WHERE ballonvaartAfspraakID = ?", new Object[] { ballonvaartAfspraakID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int verwijderCrewAfspraakByCrewlidId(int crewlidID) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM CrewAfspraak WHERE crewlidID = ?", new Object[] { crewlidID });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}
        
        public static int resetAutoIncrement(int newStartValue) {
		int aantalAangepasteRijen = 0;
		try {
			aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE CrewAfspraak AUTO_INCREMENT = ?;", new Object[] { newStartValue });
		} catch (SQLException ex) {
			ex.printStackTrace();
			// Foutafhandeling naar keuze
		}
		return aantalAangepasteRijen;
	}

	private static CrewAfspraak converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
		return new CrewAfspraak(mijnResultset.getInt("crewAfspraakID"), mijnResultset.getInt("ballonvaartAfspraakID"), mijnResultset.getInt("crewlidID"));
	}
}
