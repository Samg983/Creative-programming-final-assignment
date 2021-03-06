/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.swing;

import be.werkstukcp3.samgoeman.dao.CrewAfspraakDao;
import be.werkstukcp3.samgoeman.dao.CrewlidDao;
import be.werkstukcp3.samgoeman.model.CrewAfspraak;
import be.werkstukcp3.samgoeman.model.Crewlid;
import be.werkstukcp3.samgoeman.model.Design;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SamGoeman
 */
public class HoofdDialogCrewlid extends javax.swing.JDialog {

    private DefaultListModel<Crewlid> mijnModel;

    /**
     * Creates new form HoofdFormulierCrewlid
     */
    public HoofdDialogCrewlid(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        this.getContentPane().setBackground(Design.currentColor);

        mijnModel = new DefaultListModel<Crewlid>();
        lstCrewlid.setModel(mijnModel);
        lstCrewlid.setSelectionMode(0x0);
        updateCrewledenLijst();
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
        lstCrewlid = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        btnAfsluiten = new javax.swing.JButton();
        btnToevoegen = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        btnWijzigen = new javax.swing.JButton();
        btnVerwijderen = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lstCrewlid.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstCrewlid.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCrewlidValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCrewlid);

        jLabel1.setText("Crewlid:");

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

        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputKeyReleased(evt);
            }
        });

        jLabel2.setText("Zoek crewlid");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnToevoegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerwijderen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWijzigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))))
                    .addComponent(jLabel1)
                    .addComponent(btnAfsluiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnToevoegen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWijzigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerwijderen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAfsluiten)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateCrewledenLijst() {
        mijnModel.clear();
        ArrayList<Crewlid> lijstVanCrewliden = CrewlidDao.getCrewleden();
        for (Crewlid huidigCrewlid : lijstVanCrewliden) {
            mijnModel.addElement(huidigCrewlid);
        }
    }

    public void showDialog() {
        this.setVisible(true);
    }

    private void btnAfsluitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfsluitenActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAfsluitenActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        Crewlid weerTeGevenCrewlid = (Crewlid) lstCrewlid.getSelectedValue();
        DetailsDialogCrewlid detailsCrewlid = new DetailsDialogCrewlid(this, true);
        detailsCrewlid.setCrewlid(weerTeGevenCrewlid);
        detailsCrewlid.showDialog();
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void lstCrewlidValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCrewlidValueChanged
        if (lstCrewlid.isSelectionEmpty()) {
            btnVerwijderen.setEnabled(false);
            btnWijzigen.setEnabled(false);
            btnDetails.setEnabled(false);
        } else {
            btnVerwijderen.setEnabled(true);
            btnWijzigen.setEnabled(true);
            btnDetails.setEnabled(true);
        }
    }//GEN-LAST:event_lstCrewlidValueChanged

    private void btnToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenActionPerformed
        ToevoegenDialogCrewlid toevoegDialogCrewlid = new ToevoegenDialogCrewlid(this, true);

        ToevoegenDialogCrewlid.Resultaat mijnResultaatToevoegenCrewlid = toevoegDialogCrewlid.showDialog();

        if (mijnResultaatToevoegenCrewlid == ToevoegenDialogCrewlid.Resultaat.TOEGEVOEGD) {
            Crewlid opgehaaldCrewlid = toevoegDialogCrewlid.getIngevuldCrewlid();
            CrewlidDao.voegCrewlidToe(opgehaaldCrewlid);
            updateCrewledenLijst();
        }

    }//GEN-LAST:event_btnToevoegenActionPerformed

    private void btnWijzigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWijzigenActionPerformed
        Crewlid teWijzigenCrewlid = (Crewlid) lstCrewlid.getSelectedValue();

        BewerkenDialogCrewlid bewerkDialogCrewlid = new BewerkenDialogCrewlid(this, true);

        bewerkDialogCrewlid.setTeBewerkenCrewlidID(teWijzigenCrewlid.getCrewlidID());

        BewerkenDialogCrewlid.Resultaat mijnResultaatBewerkenCrewlid = bewerkDialogCrewlid.showDialog();

        if (mijnResultaatBewerkenCrewlid == BewerkenDialogCrewlid.Resultaat.TOEGEVOEGD) {
            Crewlid opgehaaldCrewlid = bewerkDialogCrewlid.getIngevuldCrewlid();
            CrewlidDao.updateCrewlid(opgehaaldCrewlid);
            updateCrewledenLijst();
        }
    }//GEN-LAST:event_btnWijzigenActionPerformed

    private void btnVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwijderenActionPerformed
        Crewlid geselecteerdCrewlid = (Crewlid) lstCrewlid.getSelectedValue();
        ArrayList<CrewAfspraak> mijnCrewAfspraken = CrewAfspraakDao.getCrewAfsprakenByCrewlidId(geselecteerdCrewlid.getCrewlidID());

        if (!mijnCrewAfspraken.isEmpty()) {
            int resultaat = JOptionPane.showConfirmDialog(null, "Er hangen afspraken aan dit crewlid, weet u zeker dat u dit crewlid wilt verwijderen?", "Opgepast!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resultaat == JOptionPane.YES_OPTION) {
                CrewAfspraakDao.verwijderCrewAfspraakByCrewlidId(geselecteerdCrewlid.getCrewlidID());
                CrewlidDao.verwijderCrewlid(geselecteerdCrewlid.getCrewlidID());
                CrewlidDao.resetAutoIncrement(geselecteerdCrewlid.getCrewlidID());

            }
        } else {
            int resultaat = JOptionPane.showConfirmDialog(null, "Weet u zeker dat u dit crewlid wilt verwijderen?", "Opgepast!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resultaat == JOptionPane.YES_OPTION) {
                CrewlidDao.verwijderCrewlid(geselecteerdCrewlid.getCrewlidID());
                CrewlidDao.resetAutoIncrement(geselecteerdCrewlid.getCrewlidID());
            }

        }
        updateCrewledenLijst();
    }//GEN-LAST:event_btnVerwijderenActionPerformed

    private void txtInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyReleased
        String input = "%" + txtInput.getText() + "%";
        ArrayList<Crewlid> lijstVanCrewleden = CrewlidDao.searchCrewlid(input);
        mijnModel.clear();

        if (!lijstVanCrewleden.isEmpty()) {
            for (Crewlid huidigCrewlid : lijstVanCrewleden) {
                mijnModel.addElement(huidigCrewlid);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Geen crewleden gevonden");
        }

    }//GEN-LAST:event_txtInputKeyReleased

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
            java.util.logging.Logger.getLogger(HoofdDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoofdDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoofdDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoofdDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                HoofdDialogCrewlid dialog = new HoofdDialogCrewlid(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstCrewlid;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
