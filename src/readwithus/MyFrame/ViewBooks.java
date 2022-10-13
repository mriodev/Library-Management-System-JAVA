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
public class ViewBooks extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewBooks
     */
    public ViewBooks() {
        initComponents();
        LoadTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 830, 210));

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel9.setText("View Book ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 4, 930, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 930, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void LoadTable()
    {
         
        DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("ISBN");
         dm.addColumn("Title");
         dm.addColumn("Category");
         dm.addColumn("Author FirstName");
         dm.addColumn("Author LastName");
         
         String Query = "SELECT * FROM book INNER JOIN book_author ON book.ISBN = book_author.ISBN INNER JOIN author ON author.AID = book_author.AID   ";
         
        DBConnect.DBconnect();
         
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                String ISBN = rs.getString("ISBN");
                String Title = rs.getString("Title");
                String Category = rs.getString("Category");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                
                 dm.addRow(new String[]{ISBN, Title, Category, FirstName, LastName});
             
            }
             this.jTable1.setModel(dm);
             
           DBConnect.con.close();
             
         
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Books form = new Books();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}