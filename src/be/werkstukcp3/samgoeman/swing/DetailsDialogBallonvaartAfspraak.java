/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.swing;

import be.werkstukcp3.samgoeman.dao.BallonDao;
import be.werkstukcp3.samgoeman.dao.CrewAfspraakDao;
import be.werkstukcp3.samgoeman.dao.CrewlidDao;
import be.werkstukcp3.samgoeman.dao.KlantAfspraakDao;
import be.werkstukcp3.samgoeman.dao.KlantDao;
import be.werkstukcp3.samgoeman.dao.OpstijgterreinDao;
import be.werkstukcp3.samgoeman.dao.PilootAfspraakDao;
import be.werkstukcp3.samgoeman.dao.PilootDao;
import be.werkstukcp3.samgoeman.model.Ballon;
import be.werkstukcp3.samgoeman.model.BallonvaartAfspraak;
import be.werkstukcp3.samgoeman.model.CrewAfspraak;
import be.werkstukcp3.samgoeman.model.Crewlid;
import be.werkstukcp3.samgoeman.model.Design;
import be.werkstukcp3.samgoeman.model.Klant;
import be.werkstukcp3.samgoeman.model.KlantAfspraak;
import be.werkstukcp3.samgoeman.model.Opstijgterrein;
import be.werkstukcp3.samgoeman.model.Piloot;
import be.werkstukcp3.samgoeman.model.PilootAfspraak;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author SamGoeman
 */
public class DetailsDialogBallonvaartAfspraak extends javax.swing.JDialog {

    private DefaultListModel<Crewlid> mijnCrewleden;
    private DefaultListModel<Piloot> mijnPiloten;
    private DefaultListModel<Klant> mijnKlanten;

    /**
     * Creates new form DetailsDialogBallonvaartAfspraak
     */
    public DetailsDialogBallonvaartAfspraak(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        this.getContentPane().setBackground(Design.currentColor);
        
        mijnCrewleden = new DefaultListModel<Crewlid>();
        lstCrewlid.setModel(mijnCrewleden);

        mijnPiloten = new DefaultListModel<Piloot>();
        lstPiloot.setModel(mijnPiloten);

        mijnKlanten = new DefaultListModel<Klant>();
        lstKlant.setModel(mijnKlanten);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAfsluiten = new javax.swing.JButton();
        txtAantalPassagiers = new javax.swing.JTextField();
        lblPiloot = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPiloot = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCrewlid = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        lblCrewlid = new javax.swing.JLabel();
        lblBallon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKlant = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        txtOpstijgterrein = new javax.swing.JTextField();
        txtBallon = new javax.swing.JTextField();
        txtBallonvaartAfspraakID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnAfsluiten.setText("Afsluiten");
        btnAfsluiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfsluitenActionPerformed(evt);
            }
        });

        txtAantalPassagiers.setEnabled(false);

        lblPiloot.setText("Piloot");

        jLabel1.setText("Aantal passagiers");

        lstPiloot.setEnabled(false);
        jScrollPane2.setViewportView(lstPiloot);

        lstCrewlid.setEnabled(false);
        jScrollPane3.setViewportView(lstCrewlid);

        jLabel2.setText("Opstijgterrein");

        lblCrewlid.setText("Crewlid");

        lblBallon.setText("Ballon");

        jLabel3.setText("Klanten");

        txtDatum.setEnabled(false);

        lstKlant.setEnabled(false);
        jScrollPane1.setViewportView(lstKlant);

        jLabel5.setText("Datum (dd/mm/jjjj)");

        txtOpstijgterrein.setEnabled(false);

        txtBallon.setEnabled(false);

        txtBallonvaartAfspraakID.setEnabled(false);

        jLabel4.setText("BallonvaartAfspraakID");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAfsluiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAantalPassagiers, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBallonvaartAfspraakID))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDatum, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtOpstijgterrein, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBallon)
                                .addComponent(txtBallon, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPiloot)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCrewlid)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBallonvaartAfspraakID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAantalPassagiers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOpstijgterrein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBallon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBallon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblPiloot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCrewlid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(btnAfsluiten)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfsluitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfsluitenActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAfsluitenActionPerformed

    public void showDialog() {
        this.setVisible(true);
    }

    public void setBallonvaartAfspraak(BallonvaartAfspraak weerTeGevenBallonvaartAfspraak) {
        String BallonvaartAfspraakId = Integer.toString(weerTeGevenBallonvaartAfspraak.getBallonvaartAfspraakID());
        String aantalPassagiers = Integer.toString(weerTeGevenBallonvaartAfspraak.getAantalPassagiers());
        this.txtBallonvaartAfspraakID.setText(BallonvaartAfspraakId);
        this.txtDatum.setText(weerTeGevenBallonvaartAfspraak.getDatum());
        this.txtAantalPassagiers.setText(aantalPassagiers);

        Opstijgterrein geselecteerdOpstijgterrein = OpstijgterreinDao.getOpstijgterreinById(weerTeGevenBallonvaartAfspraak.getOpstijgterreinID());
        this.txtOpstijgterrein.setText(geselecteerdOpstijgterrein.getAdres());

        Ballon geselecteerdeBallon = BallonDao.getBallonById(weerTeGevenBallonvaartAfspraak.getBallonID());
        this.txtBallon.setText(geselecteerdeBallon.getNaam());

        //set crewleden
        ArrayList<CrewAfspraak> geselecteerdeCrewAfspraken = CrewAfspraakDao.getCrewAfsprakenByBallonvaartAfspraakId(weerTeGevenBallonvaartAfspraak.getBallonvaartAfspraakID());

        mijnCrewleden.clear();
        for (CrewAfspraak afspraak : geselecteerdeCrewAfspraken) {
            Crewlid geselecteerdCrewlid = CrewlidDao.getCrewlidById(afspraak.getCrewlidID());
            mijnCrewleden.addElement(geselecteerdCrewlid);
        }

        //set piloten
        mijnPiloten.clear();

        ArrayList<PilootAfspraak> geselecteerdePilootAfspraken = PilootAfspraakDao.getPilootAfsprakenByBallonvaartAfspraakId(weerTeGevenBallonvaartAfspraak.getBallonvaartAfspraakID());

        for (PilootAfspraak afspraak : geselecteerdePilootAfspraken) {
            Piloot geselecteerdePiloot = PilootDao.getPilootById(afspraak.getPilootID());
            mijnPiloten.addElement(geselecteerdePiloot);
        }

        //set klanten
        mijnKlanten.clear();

        ArrayList<KlantAfspraak> geselecteerdeKlantAfspraken = KlantAfspraakDao.getKlantAfsprakenByBallonvaartAfspraakId(weerTeGevenBallonvaartAfspraak.getBallonvaartAfspraakID());

        for (KlantAfspraak afspraak : geselecteerdeKlantAfspraken) {
            Klant geselecteerdeKlant = KlantDao.getKlantById(afspraak.getKlantID());
            mijnKlanten.addElement(geselecteerdeKlant);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetailsDialogBallonvaartAfspraak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsDialogBallonvaartAfspraak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsDialogBallonvaartAfspraak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsDialogBallonvaartAfspraak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailsDialogBallonvaartAfspraak dialog = new DetailsDialogBallonvaartAfspraak(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfsluiten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBallon;
    private javax.swing.JLabel lblCrewlid;
    private javax.swing.JLabel lblPiloot;
    private javax.swing.JList lstCrewlid;
    private javax.swing.JList lstKlant;
    private javax.swing.JList lstPiloot;
    private javax.swing.JTextField txtAantalPassagiers;
    private javax.swing.JTextField txtBallon;
    private javax.swing.JTextField txtBallonvaartAfspraakID;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtOpstijgterrein;
    // End of variables declaration//GEN-END:variables
}
