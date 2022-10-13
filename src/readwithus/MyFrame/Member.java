/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithus.MyFrame;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import readwithus.LHome;

/**
 *
 * @author Malindu
 */
public class Member extends javax.swing.JInternalFrame {
 String MID, FirstName,LastName,AddressL1,AddressL2 ,NICNo, Gender,DOB,Password,contact1, contact2;
    /**
     * Creates new form Member
     */
    public Member() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RBF = new javax.swing.JRadioButton();
        RBM = new javax.swing.JRadioButton();
        txtAddressL2 = new javax.swing.JTextField();
        txtAddressL1 = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtMID = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtLName = new javax.swing.JTextField();
        txtContact1 = new javax.swing.JTextField();
        txtContact2 = new javax.swing.JTextField();
        psw = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(RBF);
        RBF.setText("Female");
        jPanel1.add(RBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        buttonGroup1.add(RBM);
        RBM.setText("Male");
        jPanel1.add(RBM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));
        jPanel1.add(txtAddressL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 193, 29));
        jPanel1.add(txtAddressL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 193, 29));
        jPanel1.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 193, 29));

        txtMID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 193, 29));
        jPanel1.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 193, 29));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel4.setText("Member ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel5.setText("NIC no");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel7.setText("Address line 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel12.setText("Address line 1");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jCheckBox1.setText("Show Passowrd");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, -1, 29));

        jButton7.setBackground(new java.awt.Color(0, 255, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 40));

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("New");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 130, 40));

        BtnSave.setBackground(new java.awt.Color(51, 153, 255));
        BtnSave.setForeground(new java.awt.Color(255, 255, 255));
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 130, 40));

        btnDelete.setBackground(new java.awt.Color(239, 33, 33));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 130, 40));

        btnUpdate.setBackground(new java.awt.Color(204, 102, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 130, 40));

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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 840, 140));

        jDateChooser1.setDateFormatString("MMM /d / yyyy");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 193, 29));
        jPanel1.add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 193, 29));
        jPanel1.add(txtContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 193, 29));
        jPanel1.add(txtContact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 193, 29));
        jPanel1.add(psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 193, 29));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel13.setText("Alt. Contact No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel9.setText("Contact No");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel8.setText("Date of birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel11.setText("Member Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 910, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMIDKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            MID = this.txtMID.getText();
            String Query = "SELECT * ,ContactNo1, ContactNo2 FROM member"
            + " INNER JOIN member_contact ON member.MID = member_contact.MID WHERE member.MID = '"+MID+"' ";
            DBConnect.DBconnect();

            try
            {
                Statement st = DBConnect.con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                while(rs.next()){
                    this.txtFName.setText(rs.getString("FirstName"));
                    this.txtLName.setText(rs.getString("LastName"));
                    this.txtNIC.setText(rs.getString("NIC_No"));
                    this.txtAddressL1.setText(rs.getString("AddressL1"));
                    this.txtAddressL2.setText(rs.getString("AddressL2"));
                    if(rs.getString("Gender").equalsIgnoreCase("Male"))
                    {
                        this.RBM.setSelected(true);

                    }

                    else
                    {
                        this.RBF.setSelected(true);
                    }
                    this.jDateChooser1.setDate(rs.getDate("DOB"));
                    this.psw.setText(rs.getString("Password"));
                    this.txtContact1.setText(rs.getString("ContactNo1"));
                    this.txtContact2.setText(rs.getString("ContactNo2"));
                }
                SearchTable ();
                DBConnect.con.close();

            }  catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
    }//GEN-LAST:event_txtMIDKeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            psw.setEchoChar((char)0);
        }else
        {
            psw.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        LHome form = new LHome();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ClearData();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        if(this.txtMID.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null, "Please Insert ID");
        }
        else if (this.txtFName.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert First Name");
        }
        else if (this.txtLName.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Last Name");
        }
        else if (this.jDateChooser1.getDate()== null)
        {
            JOptionPane.showMessageDialog(null,  "Please Choose Date of Birth");
        }
        else if (this.txtNIC.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert NIC Number");
        }
        else if (this.txtAddressL1.getText().isEmpty()==true || this.txtAddressL2.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Addrees");
        }
        else if (this.txtContact1.getText().isEmpty()==true && this.txtContact2.getText().isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert one or more Contact No");
        }
        else if (this.psw.getPassword().length ==0)
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Password");
        }
        else
        {
            
            String regex = "^\\+?[0-9.()-]{10,25}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(contact1 );
             Matcher matcher1 = pattern.matcher(contact1 );
             if(matcher.matches() && matcher1.matches())
             {
                 
            MID = this.txtMID.getText();
            FirstName = this.txtFName.getText();
            LastName = this.txtLName.getText();
            NICNo = this.txtNIC.getText();
            AddressL1 = this.txtAddressL1.getText();
            AddressL2 = this.txtAddressL2.getText();
            if(this.RBM.isSelected()==true){
                Gender = "Male";
            }else if(this.RBF.isSelected()==true){
                Gender = "Female";
            }else{
                Gender = "null";
                JOptionPane.showMessageDialog(null, "Please Select Gender Option");
            }
            SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
            DOB = Date.format(this.jDateChooser1.getDate());
            Password = String.valueOf(this.psw.getPassword());
            contact1 =this.txtContact1.getText();
            contact2 =this.txtContact2.getText();
            DBConnect.DBconnect();
            try{
                Statement st = DBConnect.con.createStatement();
                st.executeUpdate("INSERT INTO `member` VALUES('"+MID+"','"+FirstName+"','"+LastName+"','"+AddressL1+"',"
                    + "'"+AddressL2+"','"+Gender+"','"+DOB+"','"+NICNo+"','"+Password+"')");
                st.executeUpdate("INSERT INTO `member_contact` VALUES('"+MID+"','"+contact1+"','"+contact2+"')");
                JOptionPane.showMessageDialog(null, "Data Insert Successfully");
                LoadTable ();
                ClearData();
                DBConnect.con.close();
            }catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);

            }
             }
             else
             {
                JOptionPane.showMessageDialog(null, "Please Insert Valid Phone Number"); 
             }

        }

    }//GEN-LAST:event_BtnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
       MID = this.txtMID.getText();
        DBConnect.DBconnect();
        

        try{
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate("DELETE  FROM member MID ='"+MID+"' ");
           
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
            ClearData();
            LoadTable ();  
           
            
            
            DBConnect.con.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        MID = this.txtMID.getText();
        FirstName = this.txtFName.getText();
        LastName = this.txtLName.getText();
        NICNo = this.txtNIC.getText();
        SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
        DOB = Date.format(this.jDateChooser1.getDate());
        Password = String.valueOf(this.psw.getPassword());
        AddressL1 = this.txtAddressL1.getText();
        AddressL2 = this.txtAddressL2.getText();
        contact1 = this.txtContact1.getText();
        contact2= this.txtContact2.getText();

        DBConnect.DBconnect();
        try{
            Statement st = DBConnect.con.createStatement();
            st.executeUpdate("UPDATE `member` SET `FirstName` ='"+FirstName+"', `LastName` = '"+LastName+"', "
                + "`NIC_No`= '"+NICNo+"', `AddressL1`= '"+AddressL1+"', "
                + "`AddressL2`= '"+AddressL2+"' WHERE `MID`= '"+MID+"'");
            st.executeUpdate("UPDATE `member_contact` SET `ContactNo1` ='"+contact1+"',"
                + " `ContactNo2` = '"+contact2+"' WHERE `MID`= '"+MID+"'");
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
            SearchTable ();
            ClearData();
            DBConnect.con.close();
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    void SearchTable (){
         MID = this.txtMID.getText();
        DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("MID");
         dm.addColumn("FirstName");
         dm.addColumn("LastName");
         dm.addColumn("AddressL1");
         dm.addColumn("AddressL2");
         dm.addColumn("Gender");
         dm.addColumn("DOB");
         dm.addColumn("NIC_No");
         dm.addColumn("Password");
          dm.addColumn("ContactNo1");
         dm.addColumn("ContactNo2");
         
         String Query = "SELECT * ,ContactNo1, ContactNo2 FROM member "
                 + "INNER JOIN member_contact ON member.MID = member_contact.MID WHERE member.MID = '"+MID+"'  ";
         
        DBConnect.DBconnect();
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             while(rs.next()){
                MID = rs.getString("MID");
                FirstName = rs.getString("FirstName");
                LastName = rs.getString("LastName");
                AddressL1 = rs.getString("AddressL1");
                AddressL2 = rs.getString("AddressL2");
                Gender = rs.getString("Gender");
                DOB = rs.getString("DOB");
                NICNo = rs.getString("NIC_No");
                Password = rs.getString("Password");
                contact1 = rs.getString("ContactNo1");
                contact2 = rs.getString("ContactNo2");
                
                 dm.addRow(new String[]{MID, FirstName, LastName, AddressL1,
                     AddressL2,Gender, DOB, NICNo,Password,contact1,contact2});
             
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
         dm.addColumn("Member ID");
         dm.addColumn("FirstName");
         dm.addColumn("LastName");
         dm.addColumn("AddressL1");
         dm.addColumn("AddressL2");
         dm.addColumn("Gender");
         dm.addColumn("DOB");
         dm.addColumn("NIC_No");
         dm.addColumn("Contact No");
         dm.addColumn("Contact No");
         dm.addColumn("Password");
         
         String Query = "SELECT * ,ContactNo1, ContactNo2 FROM member "
                 + "INNER JOIN member_contact ON member.MID = member_contact.MID ";
         
        DBConnect.DBconnect();
         
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                MID = rs.getString("MID");
                FirstName = rs.getString("FirstName");
                LastName = rs.getString("LastName");
                AddressL1 = rs.getString("AddressL1");
                AddressL2 = rs.getString("AddressL2");
                Gender = rs.getString("Gender");
                DOB = rs.getString("DOB");
                NICNo = rs.getString("NIC_No");
                contact1 = rs.getString("ContactNo1");
                contact2 = rs.getString("ContactNo2");
                Password = rs.getString("Password");
                
                 dm.addRow(new String[]{MID, FirstName, LastName, AddressL1, AddressL2,Gender, DOB, NICNo,contact1,contact2,Password});
             
             
            }
             this.jTable1.setModel(dm);
             
           DBConnect.con.close();
             
         
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
     }
    
    void ClearData(){
        this.txtMID.setText("");
        this.txtFName.setText("");
        this.txtLName.setText("");
        this.txtNIC.setText("");
        this.txtAddressL1.setText("");
        this.txtAddressL2.setText("");
        this.psw.setText("");
         this.txtContact1.setText("");
         this.txtContact2.setText("");
        this.buttonGroup1.clearSelection();
        LoadTable ();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JRadioButton RBF;
    private javax.swing.JRadioButton RBM;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField psw;
    private javax.swing.JTextField txtAddressL1;
    private javax.swing.JTextField txtAddressL2;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMID;
    private javax.swing.JTextField txtNIC;
    // End of variables declaration//GEN-END:variables
}
