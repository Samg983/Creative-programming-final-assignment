/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.swing;

import be.werkstukcp3.samgoeman.model.Crewlid;
import be.werkstukcp3.samgoeman.model.Design;

/**
 *
 * @author SamGoeman
 */
public class DetailsDialogCrewlid extends javax.swing.JDialog {

    /**
     * Creates new form DetailsDialogCrewlid
     */
    public DetailsDialogCrewlid(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        this.getContentPane().setBackground(Design.currentColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNaam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCrewlidID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAfsluiten = new javax.swing.JButton();
        txtTelNr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        txtEmail.setEnabled(false);

        jLabel1.setText("Email");

        txtNaam.setEnabled(false);

        jLabel5.setText("Naam");

        txtCrewlidID.setEnabled(false);

        jLabel6.setText("Crewlid ID");

        btnAfsluiten.setText("Afsluiten");
        btnAfsluiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfsluitenActionPerformed(evt);
            }
        });

        txtTelNr.setEnabled(false);

        jLabel2.setText("Telefoonnummer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(txtCrewlidID, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtNaam, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail)
                    .addComponent(jLabel1)
                    .addComponent(btnAfsluiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelNr))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCrewlidID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnAfsluiten)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfsluitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfsluitenActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAfsluitenActionPerformed

    public void showDialog() {
        this.setVisible(true);
    }

    public void setCrewlid(Crewlid weerTeGevenCrewlid) {
        String klantID = Integer.toString(weerTeGevenCrewlid.getCrewlidID());

        this.txtCrewlidID.setText(klantID);
        this.txtNaam.setText(weerTeGevenCrewlid.getNaam());
        this.txtEmail.setText(weerTeGevenCrewlid.getEmail());
        this.txtTelNr.setText(weerTeGevenCrewlid.getTelNr());

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
            java.util.logging.Logger.getLogger(DetailsDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsDialogCrewlid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                DetailsDialogCrewlid dialog = new DetailsDialogCrewlid(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCrewlidID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtTelNr;
    // End of variables declaration//GEN-END:variables
}
