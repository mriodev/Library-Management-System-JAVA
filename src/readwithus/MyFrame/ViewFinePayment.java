/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithus.MyFrame;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malindu
 */
public class ViewFinePayment extends javax.swing.JFrame {
                       String MID,No_of_Book,No_of_Day,Return_Date,Fine,Amount;
    /**
     * Creates new form ViewFinePayment
     */
    public ViewFinePayment() {
        initComponents();
        MIDComb();
        LoadTable ();
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
        MIDComb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MIDComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ID" }));
        MIDComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDCombActionPerformed(evt);
            }
        });
        jPanel1.add(MIDComb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 193, 29));

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel9.setText("View Fine Payment");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel3.setText("Member ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 940, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/background.jpg"))); // NOI18N
        jLabel2.setName("5"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1050, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIDCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDCombActionPerformed
        String mid = this.MIDComb.getSelectedItem().toString();
        DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("Member ID");
         dm.addColumn("No_of_Book");
         dm.addColumn("No_of_Days");
         dm.addColumn("Return_Date");
         dm.addColumn("Fine");
         dm.addColumn("Amount");
         
         
         String Query = "SELECT * FROM `borrow` WHERE `MID` ='" + mid + "' ";
         
        DBConnect.DBconnect();
         
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                MID = rs.getString("MID");
                No_of_Book = rs.getString("No_of_Book");
                No_of_Day = rs.getString("No_of_Days");
                Return_Date = rs.getString("Return_Date");
                Fine = rs.getString("Fine");
                Amount = rs.getString("Amount");
                
                 dm.addRow(new String[]{MID ,No_of_Book,No_of_Day,Return_Date,Fine,Amount});
             
             
            }
             this.jTable1.setModel(dm);
             
           DBConnect.con.close();
             
         
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_MIDCombActionPerformed
 private void MIDComb()
    { 
        
        try 
 
        {  
            String Query = ("SELECT * FROM member;");
            DBConnect.DBconnect();
            Statement st = DBConnect.con.prepareStatement(Query); 
            ResultSet rs = st.executeQuery(Query);
            while(rs.next())
            {      
               MID=rs.getString("MID");
               MIDComb.addItem(MID);
               
               
            }
         
	 } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex);    
	 }      
}
 
 
 void LoadTable ()
     {
         DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("Member ID");
         dm.addColumn("No_of_Book");
         dm.addColumn("No_of_Days");
         dm.addColumn("Return_Date");
         dm.addColumn("Fine");
         dm.addColumn("Amount");
         
         String Query = "SELECT * FROM `borrow` ";
         
        DBConnect.DBconnect();
         
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                MID = rs.getString("MID");
                No_of_Book = rs.getString("No_of_Book");
                No_of_Day = rs.getString("No_of_Days");
                Return_Date = rs.getString("Return_Date");
                Fine = rs.getString("Fine");
                Amount = rs.getString("Amount");
                
                 dm.addRow(new String[]{MID ,No_of_Book,No_of_Day,Return_Date,Fine,Amount});
             
            }
             this.jTable1.setModel(dm);
             
           DBConnect.con.close();
             
         
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
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
            java.util.logging.Logger.getLogger(ViewFinePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFinePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFinePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFinePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFinePayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox MIDComb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
