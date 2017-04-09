/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.Crewlid;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class CrewlidDao {

    public static ArrayList<Crewlid> getCrewleden() {
        ArrayList<Crewlid> resultaat = new ArrayList<Crewlid>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Crewlid");
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Crewlid huidigeCrewlid = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeCrewlid);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static ArrayList<Crewlid> searchCrewlid(String input) {
        ArrayList<Crewlid> resultaat = new ArrayList<Crewlid>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Crewlid WHERE naam LIKE ?", new Object[]{input});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Crewlid huidigeCrewlid = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeCrewlid);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static Crewlid getCrewlidById(int id) {
        Crewlid resultaat = null;
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Crewlid where crewlidID = ?", new Object[]{id});
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

    public static int voegCrewlidToe(Crewlid nieuweCrewlid) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO Crewlid (naam, email, telNr) VALUES (?,?,?)", new Object[]{nieuweCrewlid.getNaam(), nieuweCrewlid.getEmail(), nieuweCrewlid.getTelNr()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int updateCrewlid(Crewlid nieuweCrewlid) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE Crewlid SET naam = ?, email = ?, telNr = ? WHERE crewlidID = ?", new Object[]{nieuweCrewlid.getNaam(), nieuweCrewlid.getEmail(), nieuweCrewlid.getTelNr(), nieuweCrewlid.getCrewlidID()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int verwijderCrewlid(int crewlidID) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM Crewlid WHERE crewlidID = ?", new Object[]{crewlidID});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int resetAutoIncrement(int newStartValue) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE Crewlid AUTO_INCREMENT = ?;", new Object[]{newStartValue});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    private static Crewlid converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
        return new Crewlid(mijnResultset.getInt("crewlidID"), mijnResultset.getString("naam"), mijnResultset.getString("email"), mijnResultset.getString("telNr"));
    }
}
