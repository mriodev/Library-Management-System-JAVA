/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithus.MyFrame;

/**
 *
 * @author Malindu
 */
public class Select extends javax.swing.JFrame {

    /**
     * Creates new form Select
     */
    public Select() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnLib = new javax.swing.JButton();
        btnMem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel11.setText("Select Your Occupation");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnLib.setText("Librarian");
        btnLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibActionPerformed(evt);
            }
        });
        jPanel1.add(btnLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 90, 92));

        btnMem.setText("Member");
        btnMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemActionPerformed(evt);
            }
        });
        jPanel1.add(btnMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 90, 92));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 530, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibActionPerformed
        LibrarianLogin Form = new LibrarianLogin();
        Form.setLocationRelativeTo(null);
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLibActionPerformed

    private void btnMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemActionPerformed
        MemberLogin Form = new MemberLogin();
        Form.setLocationRelativeTo(null);
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMemActionPerformed

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
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLib;
    private javax.swing.JButton btnMem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
