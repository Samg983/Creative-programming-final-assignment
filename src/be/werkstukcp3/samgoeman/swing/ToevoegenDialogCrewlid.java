/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.swing;

import be.werkstukcp3.samgoeman.model.Check;
import be.werkstukcp3.samgoeman.model.Crewlid;
import be.werkstukcp3.samgoeman.model.Design;
import java.awt.Color;

/**
 *
 * @author SamGoeman
 */
public class ToevoegenDialogCrewlid extends javax.swing.JDialog {

    public enum Resultaat {
        GEANNULEERD,
        TOEGEVOEGD
    }

    private Resultaat formulierResultaatCrewlid;
    private String emailadres;

    /**
     * Creates new form ToevoegenDialogCrewlid
     */
    public ToevoegenDialogCrewlid(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Design.currentColor);
    }

    public Resultaat showDialog() {
        this.setVisible(true);
        return this.formulierResultaatCrewlid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNaam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAnnuleren = new javax.swing.JButton();
        btnToevoegen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTelNr = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        txtNaam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNaamKeyReleased(evt);
            }
        });

        jLabel5.setText("Naam");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        jLabel1.setText("Email");

        btnAnnuleren.setText("Afsluiten");
        btnAnnuleren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerenActionPerformed(evt);
            }
        });

        btnToevoegen.setText("Toevoegen");
        btnToevoegen.setEnabled(false);
        btnToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToevoegenActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefoonnummer");

        jLabel18.setText("*");

        jLabel19.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(txtNaam)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAnnuleren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnToevoegen, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(txtTelNr))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnToevoegen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnnuleren)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerenActionPerformed
        this.formulierResultaatCrewlid = Resultaat.GEANNULEERD;
        this.setVisible(false);
    }//GEN-LAST:event_btnAnnulerenActionPerformed

    private void btnToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToevoegenActionPerformed
        this.formulierResultaatCrewlid = Resultaat.TOEGEVOEGD;
        this.setVisible(false);
    }//GEN-LAST:event_btnToevoegenActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        emailadres = txtEmail.getText();

        if (!(Check.checkEmail(emailadres))) {
            txtEmail.setForeground(Color.white);
            txtEmail.setBackground(Color.red);
        } else {
            txtEmail.setForeground(Color.black);
            txtEmail.setBackground(Color.white);
        }
        checkFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNaamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNaamKeyReleased
        if (!(Check.notEmpty(txtNaam.getText()))) {
            txtNaam.setBackground(Color.red);
        } else {
            txtNaam.setBackground(Color.white);
        }

        checkFields();
    }//GEN-LAST:event_txtNaamKeyReleased

    public Crewlid getIngevuldCrewlid() {
        return new Crewlid(0, this.txtNaam.getText(), this.txtEmail.getText(), this.txtTelNr.getText());
    }

    public Resultaat getFormulierResultaatCrewlid() {
        return this.formulierResultaatCrewlid;
    }

    private void checkFields() {
        if (Check.notEmpty(txtNaam.getText()) && Check.checkEmail(txtEmail.getText())) {
            btnToevoegen.setEnabled(true);
        } else {
            btnToevoegen.setEnabled(false);
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
            java.util.logging.Logger.getLogger(ToevoegenDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToevoegenDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToevoegenDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToevoegenDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                ToevoegenDialogCrewlid dialog = new ToevoegenDialogCrewlid(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnAnnuleren;
    private javax.swing.JButton btnToevoegen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtTelNr;
    // End of variables declaration//GEN-END:variables
}
