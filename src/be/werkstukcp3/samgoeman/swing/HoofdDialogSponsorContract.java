/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.swing;

import be.werkstukcp3.samgoeman.dao.BallonDao;
import be.werkstukcp3.samgoeman.dao.BallonvaartAfspraakDao;
import be.werkstukcp3.samgoeman.dao.SponsorContractDao;
import be.werkstukcp3.samgoeman.dao.SponsorDao;
import be.werkstukcp3.samgoeman.model.Ballon;
import be.werkstukcp3.samgoeman.model.BallonvaartAfspraak;
import be.werkstukcp3.samgoeman.model.Design;
import be.werkstukcp3.samgoeman.model.Sponsor;
import be.werkstukcp3.samgoeman.model.SponsorContract;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SamGoeman
 */
public class HoofdDialogSponsorContract extends javax.swing.JDialog {

    private DefaultListModel<SponsorContract> mijnModel;

    /**
     * Creates new form HoofdFormulierBallon
     */
    public HoofdDialogSponsorContract(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        this.getContentPane().setBackground(Design.currentColor);

        mijnModel = new DefaultListModel<SponsorContract>();
        lstSponsorContract.setModel(mijnModel);
        lstSponsorContract.setSelectionMode(0x0);
        updateSponsorContractLijst();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstSponsorContract = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        btnAfsluiten = new javax.swing.JButton();
        btnToevoegen = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        btnWijzigen = new javax.swing.JButton();
        btnVerwijderen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lstSponsorContract.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstSponsorContract.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstSponsorContractValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstSponsorContract);

        jLabel1.setText("Sponsor contracten:");

        btnAfsluiten.setText("Afsluiten");
        btnAfsluiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfsluitenActionPerformed(evt);
            }
        });

        btnToevoegen.setText("Toevoegen");
        btnToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenActionPerformed(evt);
            }
        });

        btnDetails.setText("Details");
        btnDetails.setEnabled(false);
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnWijzigen.setText("Wijzigen");
        btnWijzigen.setEnabled(false);
        btnWijzigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWijzigenActionPerformed(evt);
            }
        });

        btnVerwijderen.setText("Selectie verwijderen");
        btnVerwijderen.setEnabled(false);
        btnVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerwijderenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(412, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnToevoegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerwijderen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWijzigen, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAfsluiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnToevoegen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWijzigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerwijderen)))
                .addGap(18, 18, 18)
                .addComponent(btnAfsluiten)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateSponsorContractLijst() {
        mijnModel.clear();
        ArrayList<SponsorContract> lijstVanSponsorContracten = SponsorContractDao.getSponsorContracten();
        for (SponsorContract huidigSponsorContract : lijstVanSponsorContracten) {
            mijnModel.addElement(huidigSponsorContract);
        }
    }

    public void showDialog() {
        this.setVisible(true);
    }

    private void btnAfsluitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfsluitenActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAfsluitenActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        SponsorContract weerTeGevenSponsorContract = (SponsorContract) lstSponsorContract.getSelectedValue();
        DetailsDialogSponsorContract detailsSponsorContract = new DetailsDialogSponsorContract(this, true);
        detailsSponsorContract.setSponsorContract(weerTeGevenSponsorContract);
        detailsSponsorContract.showDialog();
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void lstSponsorContractValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstSponsorContractValueChanged
        if (lstSponsorContract.isSelectionEmpty()) {
            btnVerwijderen.setEnabled(false);
            btnWijzigen.setEnabled(false);
            btnDetails.setEnabled(false);
        } else {
            btnVerwijderen.setEnabled(true);
            btnWijzigen.setEnabled(true);
            btnDetails.setEnabled(true);
        }
    }//GEN-LAST:event_lstSponsorContractValueChanged

    private void btnToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenActionPerformed
        ToevoegenDialogSponsorContract toevoegDialogBallon = new ToevoegenDialogSponsorContract(this, true);

        ToevoegenDialogSponsorContract.Resultaat mijnResultaatToevoegenBallon = toevoegDialogBallon.showDialog();

        if (mijnResultaatToevoegenBallon == ToevoegenDialogSponsorContract.Resultaat.TOEGEVOEGD) {
            Ballon opgehaaldBallon = toevoegDialogBallon.getIngevuldBallon();
            BallonDao.voegBallonToe(opgehaaldBallon);

            Sponsor opgehaaldSponsor = toevoegDialogBallon.getIngevuldSponsor();
            SponsorDao.voegSponsorToe(opgehaaldSponsor);

            ArrayList<Ballon> lijstBallonnen = BallonDao.getBallonnen();
            Ballon lastBallon = (Ballon) lijstBallonnen.get(lijstBallonnen.size() - 1);

            ArrayList<Sponsor> lijstSponsors = SponsorDao.getSponsors();
            Sponsor lastSponsor = (Sponsor) lijstSponsors.get(lijstSponsors.size() - 1);

            SponsorContract nieuwSponsorContract = new SponsorContract(0, lastBallon.getBallonID(), lastSponsor.getSponsorID());
            SponsorContractDao.voegSponsorContractToe(nieuwSponsorContract);
            updateSponsorContractLijst();
        }

    }//GEN-LAST:event_btnToevoegenActionPerformed

    private void btnWijzigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWijzigenActionPerformed
        SponsorContract teWijzigenSponsorContract = (SponsorContract) lstSponsorContract.getSelectedValue();

        BewerkenDialogSponsorContract bewerkDialogSponsorContract = new BewerkenDialogSponsorContract(this, true);

        bewerkDialogSponsorContract.setTeBewerkenSponsorContractID(teWijzigenSponsorContract.getSponsorContractID());

        BewerkenDialogSponsorContract.Resultaat mijnResultaatBewerkenSponsorContract = bewerkDialogSponsorContract.showDialog();

        if (mijnResultaatBewerkenSponsorContract == BewerkenDialogSponsorContract.Resultaat.TOEGEVOEGD) {
            SponsorContract opgehaaldSponsorContract = bewerkDialogSponsorContract.getIngevuldSponsorContract();
            SponsorContractDao.updateSponsorContract(opgehaaldSponsorContract);

            Ballon opgehaaldeBallon = bewerkDialogSponsorContract.getIngevuldBallon();
            BallonDao.updateBallon(opgehaaldeBallon);

            Sponsor opgehaaldeSponsor = bewerkDialogSponsorContract.getIngevuldSponsor();
            SponsorDao.updateSponsor(opgehaaldeSponsor);

            updateSponsorContractLijst();
        }
    }//GEN-LAST:event_btnWijzigenActionPerformed

    private void btnVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwijderenActionPerformed
        SponsorContract geselecteerdSponsorContract = (SponsorContract) lstSponsorContract.getSelectedValue();

        int resultaat = JOptionPane.showConfirmDialog(null, "Indien u dit contract verwijdert, verwijdert u ook de ballon en sponsor.", "Opgepast!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resultaat == JOptionPane.YES_OPTION) {

            Ballon geselecteerdeBallon = BallonDao.getBallonById(geselecteerdSponsorContract.getBallonID());

            ArrayList<BallonvaartAfspraak> lijstBallonvaartAfspraken = BallonvaartAfspraakDao.getBallonvaartAfsprakenByBallonId(geselecteerdeBallon.getBallonID());

            if (lijstBallonvaartAfspraken.isEmpty()) {
                SponsorContractDao.verwijderSponsorContract(geselecteerdSponsorContract.getSponsorContractID());
                SponsorContractDao.resetAutoIncrement(geselecteerdSponsorContract.getSponsorContractID());

                BallonDao.verwijderBallon(geselecteerdeBallon.getBallonID());
                BallonDao.resetAutoIncrement(geselecteerdSponsorContract.getBallonID());

                Sponsor geselecteerdeSponsor = SponsorDao.getSponsorById(geselecteerdSponsorContract.getSponsorID());
                SponsorDao.verwijderSponsor(geselecteerdeSponsor.getSponsorID());
                SponsorDao.resetAutoIncrement(geselecteerdeSponsor.getSponsorID());

            } else {
                JOptionPane.showMessageDialog(null, "Onmogelijk te verwijderen \n\rBallon wordt nog gebruikt in een ballonvaart afspraak", "Error!", JOptionPane.ERROR_MESSAGE);
            }

        }
        updateSponsorContractLijst();

    }//GEN-LAST:event_btnVerwijderenActionPerformed

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
            java.util.logging.Logger.getLogger(HoofdDialogSponsorContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoofdDialogSponsorContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoofdDialogSponsorContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoofdDialogSponsorContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                HoofdDialogSponsorContract dialog = new HoofdDialogSponsorContract(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnToevoegen;
    private javax.swing.JButton btnVerwijderen;
    private javax.swing.JButton btnWijzigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstSponsorContract;
    // End of variables declaration//GEN-END:variables
}
