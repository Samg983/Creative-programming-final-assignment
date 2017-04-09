/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.Ballon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class BallonDao {

    public static ArrayList<Ballon> getBallonnen() {
        ArrayList<Ballon> resultaat = new ArrayList<Ballon>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Ballon");
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Ballon huidigeBallon = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeBallon);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }
    
    public static ArrayList<Ballon> searchBallon(String input) {
        ArrayList<Ballon> resultaat = new ArrayList<Ballon>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Ballon WHERE naam LIKE ?", new Object[]{input});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    Ballon huidigeBallon = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeBallon);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static Ballon getBallonById(int id) {
        Ballon resultaat = null;
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from Ballon where ballonID = ?", new Object[]{id});
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
    
    

    public static int voegBallonToe(Ballon nieuweBallon) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO Ballon (naam, immatriculatie) VALUES (?,?)", new Object[]{nieuweBallon.getNaam(), nieuweBallon.getImmatriculatie()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int resetAutoIncrement(int newStartValue) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE Ballon AUTO_INCREMENT = ?;", new Object[]{newStartValue});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int updateBallon(Ballon nieuweBallon) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE Ballon SET naam = ?, immatriculatie = ? WHERE ballonID = ?", new Object[]{nieuweBallon.getNaam(), nieuweBallon.getImmatriculatie(), nieuweBallon.getBallonID()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int verwijderBallon(int ballonID) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM Ballon WHERE ballonID = ?", new Object[]{ballonID});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    private static Ballon converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
        return new Ballon(mijnResultset.getInt("ballonID"), mijnResultset.getString("naam"), mijnResultset.getString("immatriculatie"));
    }
}
