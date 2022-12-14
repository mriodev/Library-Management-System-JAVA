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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import readwithus.LHome;

/**
 *
 * @author Malindu
 */
public class Author extends javax.swing.JInternalFrame {
 String AuthorID,Fname, Lname,NIC, AdL1,AdL2, contact1,contact2;
    /**
     * Creates new form Author1
     */
    public Author() {
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
        txtADL2 = new javax.swing.JTextField();
        txtADL1 = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtFName = new javax.swing.JTextField();
        txtCNo2 = new javax.swing.JTextField();
        txtCNo1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtADL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 193, 29));
        jPanel1.add(txtADL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 193, 29));
        jPanel1.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 193, 29));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 193, 29));
        jPanel1.add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 193, 29));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel4.setText("Author ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel5.setText("NIC no");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel7.setText("Address line 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel12.setText("Address line 1");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel13.setText("Alt. Contact No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel8.setText("Contact No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel11.setText(" Author Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 255, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/BackButton.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 40));

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
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 130, 40));

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 130, 40));

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
        jTable1.setCellSelectionEnabled(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowSelectionAllowed(true);
        jTable1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 840, 140));

        btnUpdate.setBackground(new java.awt.Color(204, 102, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, 40));

        btnDelete.setBackground(new java.awt.Color(239, 33, 33));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 130, 40));
        jPanel1.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 193, 29));
        jPanel1.add(txtCNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 193, 29));
        jPanel1.add(txtCNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 193, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 940, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 930, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            AuthorID = this.txtID.getText();
            String Query = "SELECT * ,ContactNo1, ContactNo2 FROM author"
            + " INNER JOIN author_contact ON author.AID = author_contact.AID WHERE author.AID = '"+AuthorID+"' ";
            DBConnect.DBconnect();

            try
            {
                Statement st = DBConnect.con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                while(rs.next()){
                    this.txtFName.setText(rs.getString("FirstName"));
                    this.txtLName.setText(rs.getString("LastName"));
                    this.txtNIC.setText(rs.getString("NIC"));
                    this.txtADL1.setText(rs.getString("AddressL1"));
                    this.txtADL2.setText(rs.getString("AddressL2"));
                    this.txtCNo1.setText(rs.getString("ContactNo1"));
                    this.txtCNo2.setText(rs.getString("ContactNo2"));

                }
                SearchTable ();
                DBConnect.con.close();

            }  catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtIDKeyPressed

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
        if(this.txtID.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null, "Please Insert ID");
        }
        else if (this.txtFName.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Last Name");
        }
        else if (this.txtLName.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert First Name");
        }
        else if (this.txtADL1.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Address Line 1");
        }
        else if (this.txtADL2.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Address Line 2");
        }
        else if (this.txtCNo1.getText().isEmpty()==true && this.txtCNo2.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert one or more Contact No");
        }
        else
        {
             
            String regex = "^\\+?[0-9.()-]{10,25}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(contact1 );
             Matcher matcher1 = pattern.matcher(contact1 );
             if(matcher.matches() && matcher1.matches())
             {
            AuthorID = this.txtID.getText();
            Fname = this.txtFName.getText();
            Lname = this.txtLName.getText();
            NIC = this.txtNIC.getText();
            AdL1 = this.txtADL1.getText();
            AdL2 = this.txtADL2.getText();
            contact1 = this.txtCNo1.getText();
            contact2= this.txtCNo2.getText();

            DBConnect.DBconnect();
            try{
                Statement st = DBConnect.con.createStatement();
                st.executeUpdate("INSERT INTO `author` VALUES('"+AuthorID+"','"+Fname+"','"+Lname+"','"+NIC+"','"+AdL1+"','"+AdL2+"')");
                st.executeUpdate("INSERT INTO `author_contact` VALUES('"+AuthorID+"','"+contact1+"','"+contact2+"')");
                 st.executeUpdate("INSERT INTO `book_author` VALUES(null,'"+AuthorID+"')");
                JOptionPane.showMessageDialog(null, "Data Insert Successfully");
                LoadTable();
                ClearData();
                DBConnect.con.close();
            }catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);

            }
             }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        AuthorID = this.txtID.getText();
        Fname = this.txtFName.getText();
        Lname = this.txtLName.getText();
        NIC = this.txtNIC.getText();
        AdL1 = this.txtADL1.getText();
        AdL2 = this.txtADL2.getText();
        contact1 = this.txtCNo1.getText();
        contact2= this.txtCNo2.getText();

        DBConnect.DBconnect();
        try{
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate("UPDATE `author` SET `FirstName` ='"+Fname+"', `LastName` = '"+Lname+"', "
                + "`NIC`= '"+NIC+"', `AddressL1`= '"+AdL1+"', `AddressL2`= '"+AdL2+"' WHERE `AID`= '"+AuthorID+"'");
            st.executeUpdate("UPDATE `author_contact` SET `ContactNo1` ='"+contact1+"',"
                + " `ContactNo2` = '"+contact2+"' WHERE `AID`= '"+AuthorID+"'");
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
            LoadTable();
            ClearData();
            DBConnect.con.close();
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        AuthorID = this.txtID.getText();
        DBConnect.DBconnect();

        try{
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate("DELETE FROM `author` WHERE `AID`= '"+AuthorID+"' ");
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
            LoadTable();
            ClearData();
            DBConnect.con.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
 void ClearData(){
        this.txtID.setText("");
        this.txtFName.setText("");
        this.txtLName.setText("");
        this.txtNIC.setText("");
        this.txtADL1.setText("");
        this.txtADL2.setText("");
        this.txtCNo1.setText("");
        this.txtCNo2.setText("");
        LoadTable ();
    }
    void SearchTable (){
        AuthorID = this.txtID.getText();
        DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("AID");
         dm.addColumn("FirstName");
         dm.addColumn("LastName");
         dm.addColumn("NIC");
         dm.addColumn("AddressL1");
         dm.addColumn("AddressL2");
         dm.addColumn("ContactNo1");
         dm.addColumn("ContactNo2");
         
         String Query = "SELECT * ,ContactNo1, ContactNo2 FROM author INNER JOIN author_contact ON author.AID = author_contact.AID WHERE author.AID = '"+AuthorID+"'  ";
         
        DBConnect.DBconnect();
         
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                String AID = rs.getString("AID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                String NIC = rs.getString("NIC");
                String AddressL1 = rs.getString("AddressL1");
                String AddressL2 = rs.getString("AddressL2");
                String ContactNo1 = rs.getString("ContactNo1");
                String ContactNo2 = rs.getString("ContactNo2");
                
                 dm.addRow(new String[]{AID, FirstName, LastName, NIC, AddressL1,AddressL2,ContactNo1,ContactNo2});
             
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
         dm.addColumn("Author ID");
         dm.addColumn("FirstName");
         dm.addColumn("LastName");
         dm.addColumn("NIC");
         dm.addColumn("Address Line 1");
         dm.addColumn("Address Line 2");
         dm.addColumn("Contact No");
         dm.addColumn("ContactNo");
         String Query = "SELECT * ,ContactNo1, ContactNo2 FROM author "
                 + "INNER JOIN author_contact ON author.AID = author_contact.AID ";
        DBConnect.DBconnect();
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             while(rs.next()){
                String AID = rs.getString("AID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                NIC = rs.getString("NIC");
                String AddressL1 = rs.getString("AddressL1");
                String AddressL2 = rs.getString("AddressL2");
                String ContactNo1 = rs.getString("ContactNo1");
                String ContactNo2 = rs.getString("ContactNo2");
                
                 dm.addRow(new String[]{AID, FirstName, LastName, NIC, AddressL1,AddressL2,ContactNo1,ContactNo2});
             
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtADL1;
    private javax.swing.JTextField txtADL2;
    private javax.swing.JTextField txtCNo1;
    private javax.swing.JTextField txtCNo2;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtNIC;
    // End of variables declaration//GEN-END:variables
}
