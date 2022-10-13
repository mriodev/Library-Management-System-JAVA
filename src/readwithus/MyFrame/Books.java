/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithus.MyFrame;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import readwithus.LHome;

/**
 *
 * @author Malindu
 */
public class Books extends javax.swing.JInternalFrame {
public String isbn,Title, Cate,Quntity, pric, purchaseDate;
    /**
     * Creates new form Books1
     */
    public Books() {
        initComponents();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txttitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcategory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtquentity = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel9.setText("Book Details");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel1.setText("ISBN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtISBNKeyPressed(evt);
            }
        });
        jPanel1.add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 193, 29));
        jPanel1.add(txttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 193, 29));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel3.setText("Title");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel4.setText("Category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));
        jPanel1.add(txtcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 193, 29));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel12.setText("Purchase Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));
        jPanel1.add(txtquentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 193, 29));

        jDateChooser1.setDateFormatString("MMM /d / yyyy");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 193, 29));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 193, 29));

        jButton7.setBackground(new java.awt.Color(0, 255, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 130, 40));

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("New");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 130, 40));

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 130, 40));

        jTable1.setAutoCreateRowSorter(true);
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 840, 130));

        btnUpdate.setBackground(new java.awt.Color(204, 102, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, 40));

        btnDelete.setBackground(new java.awt.Color(239, 33, 33));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -16, 940, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -5, 940, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtISBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyPressed

        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            isbn = this.txtISBN.getText();
            String Query = "SELECT * ,Purchase_Date, Quantity FROM book "
            + "INNER JOIN book_purchase ON book.ISBN = book_purchase.ISBN WHERE book.ISBN = '"+isbn+"' ";
            DBConnect.DBconnect();

            try
            {
                Statement st = DBConnect.con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                while(rs.next()){
                    this.txttitle.setText(rs.getString("Title"));
                    this.txtcategory.setText(rs.getString("Category"));
                    this.txtprice.setText(rs.getString("Price"));
                    this.txtquentity.setText(rs.getString("Quantity"));
                    this.jDateChooser1.setDate(rs.getDate("Purchase_Date"));
                }
                SearchTable ();
                DBConnect.con.close();

            }  catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtISBNKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        LHome form = new LHome();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ClearData();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(this.txtISBN.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null, "Please Insert ISBN");
        }
        else if (this.txttitle.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Title");
        }
        else if (this.txtcategory.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Category");
        }
        else if (this.txtquentity.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Quentity");
        }
        else if (this.jDateChooser1.getDate()== null)
        {
            JOptionPane.showMessageDialog(null,  "Please Choose Purchese Date ");
        }
        else if (this.txtprice.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Price");
        }
        else
        {
            isbn = this.txtISBN.getText();
            Title = this.txttitle.getText();
            Cate = this.txtcategory.getText();
            pric = this.txtprice.getText();
            SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
            purchaseDate = Date.format(this.jDateChooser1.getDate());
            Quntity = this.txtquentity.getText();
            DBConnect.DBconnect();
            try{
                Statement st = DBConnect.con.createStatement();
                st.executeUpdate("INSERT INTO `book` VALUES('"+isbn+"','"+Title+"','"+Cate+"','"+pric+"')");
                st.executeUpdate("INSERT INTO `book_purchase` VALUES('"+isbn+"','"+purchaseDate+"','"+Quntity+"')");
                st.executeUpdate("INSERT INTO `book_author` VALUES('"+isbn+"',null)");
                JOptionPane.showMessageDialog(null, "Data Insert Successfully");
                LoadTable ();
                ClearData();
                DBConnect.con.close();
            }catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);

            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        isbn = this.txtISBN.getText();
        Title = this.txttitle.getText();
        Cate = this.txtcategory.getText();
        SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
        purchaseDate = Date.format(this.jDateChooser1.getDate());
        pric = this.txtprice.getText();
        Quntity = this.txtquentity.getText();
        DBConnect.DBconnect();
        try{
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate("UPDATE `book` SET `Title`='"+Title+"', `Category`= '"+Cate+"',"
                + "`Purchase_Date`='"+purchaseDate+"',`Price`='"+pric+"' WHERE `ISBN`='"+isbn+"'");
            st.executeUpdate("UPDATE `book_purchase` SET `Purchase_Date` ='"+purchaseDate+"',"
                + " `Quantity` = '"+Quntity+"' WHERE `ISBN`= '"+isbn+"'");
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
            SearchTable ();
            ClearData();
            DBConnect.con.close();
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);

        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        isbn = this.txtISBN.getText();

        DBConnect.DBconnect();

        try{
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate("DELETE FROM `book` WHERE `ISBN`= '"+isbn+"' ");
            st.executeUpdate("DELETE FROM `book_purchase` WHERE `ISBN`= '"+isbn+"' ");
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
            LoadTable ();
            ClearData();
            DBConnect.con.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
void ClearData(){
        this.txtISBN.setText("");
        this.txttitle.setText("");
        this.txtcategory.setText("");
        this.txtquentity.setText("");
        this.jDateChooser1.setDate(null);
        this.txtprice.setText("");
        LoadTable ();
    }
     
    void SearchTable (){
         isbn = this.txtISBN.getText();
        DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("ISBN");
         dm.addColumn("Title");
         dm.addColumn("Category");
         dm.addColumn("Price");
         dm.addColumn("PurchaseDate");
         dm.addColumn("Quantity");
         
         String Query = "SELECT * ,PurchaseDate, Quantity FROM book "
                 + "INNER JOIN book_purchase ON book.ISBN = book_purchase.ISBN WHERE book.ISBN = '"+isbn+"'  ";
         
        DBConnect.DBconnect();
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                String ISBN = rs.getString("ISBN");
                String Title = rs.getString("Title");
                String Category = rs.getString("Category");
                String Price = rs.getString("Price");
                String PurchaseDate = rs.getString("Purchase_Date");
                String Quantity = rs.getString("Quantity");
                
                 dm.addRow(new String[]{ISBN, Title, Category, Price, PurchaseDate,Quantity});
            }
             this.jTable1.setModel(dm);
             
           DBConnect.con.close();
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }
    void LoadTable ()
     {
         DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("ISBN");
         dm.addColumn("Title");
         dm.addColumn("Category");
         dm.addColumn("Price");
         dm.addColumn("PurchaseDate");
         dm.addColumn("Quantity");
         
         
         String Query = "SELECT * Purchase_Date, Quantity FROM book "
                 + "INNER JOIN book_purchase ON book.ISBN = book_purchase.ISBN";
         
        DBConnect.DBconnect();
         
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                String ISBN = rs.getString("ISBN");
                String Title = rs.getString("Title");
                String Category = rs.getString("Category");
                String Price = rs.getString("Price");
                String PurchaseDate = rs.getString("Purchase_Date");
                String Quantity = rs.getString("Quantity");
                
                 dm.addRow(new String[]{ISBN, Title, Category, Price, PurchaseDate,Quantity});
             
             
            }
             this.jTable1.setModel(dm);
             
           DBConnect.con.close();
             
         
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquentity;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}
