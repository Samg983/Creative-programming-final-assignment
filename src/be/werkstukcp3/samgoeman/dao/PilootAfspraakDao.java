/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.dao;

import be.werkstukcp3.samgoeman.model.PilootAfspraak;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SamGoeman
 */
public class PilootAfspraakDao {

    public static ArrayList<PilootAfspraak> getPilootAfspraken() {
        ArrayList<PilootAfspraak> resultaat = new ArrayList<PilootAfspraak>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from PilootAfspraak");
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    PilootAfspraak huidigePilootAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigePilootAfspraak);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static ArrayList<PilootAfspraak> getPilootAfsprakenByBallonvaartAfspraakId(int id) {
        ArrayList<PilootAfspraak> resultaat = new ArrayList<PilootAfspraak>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from PilootAfspraak where ballonvaartAfspraakID = ?", new Object[]{id});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    PilootAfspraak huidigePilootAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigePilootAfspraak);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static ArrayList<PilootAfspraak> getPilootAfsprakenByPilootId(int id) {
        ArrayList<PilootAfspraak> resultaat = new ArrayList<PilootAfspraak>();
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from PilootAfspraak where pilootID = ?", new Object[]{id});
            if (mijnResultset != null) {
                while (mijnResultset.next()) {
                    PilootAfspraak huidigePilootAfspraak = converteerHuidigeRijNaarObject(mijnResultset);
                    resultaat.add(huidigePilootAfspraak);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }

        return resultaat;
    }

    public static PilootAfspraak getPilootAfspraakById(int id) {
        PilootAfspraak resultaat = null;
        try {
            ResultSet mijnResultset = Database.voerSqlUitEnHaalResultaatOp("SELECT * from PilootAfspraak where pilootAfspraakID = ?", new Object[]{id});
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

    public static int voegPilootAfspraakToe(PilootAfspraak nieuwePilootAfspraak) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("INSERT INTO PilootAfspraak (ballonvaartAfspraakID, pilootID) VALUES (?,?)", new Object[]{nieuwePilootAfspraak.getBallonvaartAfspraakID(), nieuwePilootAfspraak.getPilootID()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int updatePilootAfspraak(PilootAfspraak nieuwePilootAfspraak) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("UPDATE PilootAfspraak SET ballonvaartAfspraakID = ?, pilootID = ? WHERE pilootAfspraakID = ?", new Object[]{nieuwePilootAfspraak.getBallonvaartAfspraakID(), nieuwePilootAfspraak.getPilootID(), nieuwePilootAfspraak.getPilootAfspraakID()});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int verwijderPilootAfspraak(int pilootAfspraakID) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM PilootAfspraak WHERE pilootAfspraakID = ?", new Object[]{pilootAfspraakID});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int verwijderPilootAfspraakByBallonvaartAfspraakId(int ballonvaartAfspraakId) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM PilootAfspraak WHERE ballonvaartAfspraakId = ?", new Object[]{ballonvaartAfspraakId});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }
    
    public static int verwijderPilootAfspraakByPilootId(int pilootId) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("DELETE FROM PilootAfspraak WHERE pilootId = ?", new Object[]{pilootId});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    public static int resetAutoIncrement(int newStartValue) {
        int aantalAangepasteRijen = 0;
        try {
            aantalAangepasteRijen = Database.voerSqlUitEnHaalAantalAangepasteRijenOp("ALTER TABLE PilootAfspraak AUTO_INCREMENT = ?;", new Object[]{newStartValue});
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Foutafhandeling naar keuze
        }
        return aantalAangepasteRijen;
    }

    private static PilootAfspraak converteerHuidigeRijNaarObject(ResultSet mijnResultset) throws SQLException {
        return new PilootAfspraak(mijnResultset.getInt("pilootAfspraakID"), mijnResultset.getInt("ballonvaartAfspraakID"), mijnResultset.getInt("pilootID"));
    }
}
