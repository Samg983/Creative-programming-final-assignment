/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.Piloot;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class PilootDao {

    public static ArrayList<Piloot> getPiloten() {
        ArrayList<Piloot> resultaat = new ArrayList<Piloot>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Piloot");
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Piloot huidigePiloot = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigePiloot);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static ArrayList<Piloot> searchPiloot(String input) {
        ArrayList<Piloot> resultaat = new ArrayList<Piloot>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Piloot WHERE naam LIKE ?", new Object[]{input});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Piloot huidigePiloot = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigePiloot);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static Piloot getPilootById(int id) {
        Piloot resultaat = null;
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Piloot where pilootID = ?", new Object[]{id});
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

    public static int voegPilootToe(Piloot nieuwePiloot) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO Piloot (naam, licentie, adres, email, telNr) VALUES (?,?,?,?,?)", new Object[]{nieuwePiloot.getNaam(), nieuwePiloot.getLicentie(), nieuwePiloot.getAdres(), nieuwePiloot.getEmail(), nieuwePiloot.getTelNr()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int updatePiloot(Piloot nieuwePiloot) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE Piloot SET naam = ?, licentie = ?, adres = ?, email = ?, telNr = ? WHERE pilootID = ?", new Object[]{nieuwePiloot.getNaam(), nieuwePiloot.getLicentie(), nieuwePiloot.getAdres(), nieuwePiloot.getEmail(), nieuwePiloot.getTelNr(), nieuwePiloot.getPilootID()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int verwijderPiloot(int pilootID) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM Piloot WHERE pilootID = ?", new Object[]{pilootID});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int resetAutoIncrement(int newStartValue) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE Piloot AUTO_INCREMENT = ?;", new Object[]{newStartValue});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    private static Piloot converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
        return new Piloot(mijnResultset.getInt("pilootID"), mijnResultset.getString("naam"), mijnResultset.getString("licentie"), mijnResultset.getString("adres"), mijnResultset.getString("email"), mijnResultset.getString("telNr"));
    }
}
