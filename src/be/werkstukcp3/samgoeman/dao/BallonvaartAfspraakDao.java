/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.BallonvaartAfspraak;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class BallonvaartAfspraakDao {

    public static ArrayList<BallonvaartAfspraak> getBallonvaartAfspraken() {
        ArrayList<BallonvaartAfspraak> resultaat = new ArrayList<BallonvaartAfspraak>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from BallonvaartAfspraak");
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    BallonvaartAfspraak huidigeBallonvaartAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeBallonvaartAfspraak);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static ArrayList<BallonvaartAfspraak> getBallonvaartAfsprakenByBallonId(int id) {
        ArrayList<BallonvaartAfspraak> resultaat = new ArrayList<BallonvaartAfspraak>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from BallonvaartAfspraak where ballonID = ?", new Object[]{id});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    BallonvaartAfspraak huidigeBallonvaartAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeBallonvaartAfspraak);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static ArrayList<BallonvaartAfspraak> getBallonvaartAfsprakenByOpstijgterreinId(int id) {
        ArrayList<BallonvaartAfspraak> resultaat = new ArrayList<BallonvaartAfspraak>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from BallonvaartAfspraak where opstijgterreinID = ?", new Object[]{id});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    BallonvaartAfspraak huidigeBallonvaartAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigeBallonvaartAfspraak);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static BallonvaartAfspraak getBallonvaartAfspraakById(int id) {
        BallonvaartAfspraak resultaat = null;
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from BallonvaartAfspraak where ballonvaartAfspraakID = ?", new Object[]{id});
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

    public static BallonvaartAfspraak getBallonvaartAfspraakByBallonId(int id) {
        BallonvaartAfspraak resultaat = null;
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from BallonvaartAfspraak where ballonvaartAfspraakID = ?", new Object[]{id});
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

    public static int voegBallonvaartAfspraakToe(BallonvaartAfspraak nieuweBallonvaartAfspraak) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO BallonvaartAfspraak (datum, aantalPassagiers, opstijgterreinID, ballonID) VALUES (?,?,?,?)", new Object[]{nieuweBallonvaartAfspraak.getDatum(), nieuweBallonvaartAfspraak.getAantalPassagiers(), nieuweBallonvaartAfspraak.getOpstijgterreinID(), nieuweBallonvaartAfspraak.getBallonID()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int updateBallonvaartAfspraak(BallonvaartAfspraak nieuweBallonvaartAfspraak) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE BallonvaartAfspraak SET datum = ?, aantalPassagiers = ?, opstijgterreinID = ?, ballonID = ? WHERE ballonvaartAfspraakID = ?", new Object[]{nieuweBallonvaartAfspraak.getDatum(), nieuweBallonvaartAfspraak.getAantalPassagiers(), nieuweBallonvaartAfspraak.getOpstijgterreinID(), nieuweBallonvaartAfspraak.getBallonID(), nieuweBallonvaartAfspraak.getBallonvaartAfspraakID()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int verwijderBallonvaartAfspraak(int ballonvaartAfspraakID) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM BallonvaartAfspraak WHERE ballonvaartAfspraakID = ?", new Object[]{ballonvaartAfspraakID});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int resetAutoIncrement(int newStartValue) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE BallonvaartAfspraak AUTO_INCREMENT = ?;", new Object[]{newStartValue});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    private static BallonvaartAfspraak converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
        return new BallonvaartAfspraak(mijnResultset.getInt("ballonvaartAfspraakID"), mijnResultset.getString("datum"), mijnResultset.getInt("aantalPassagiers"), mijnResultset.getInt("opstijgterreinID"), mijnResultset.getInt("ballonID"));
    }
}
