/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithus.MyFrame;

import java.awt.Desktop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import readwithus.LHome;
import readwithus.MyFrame.*;

/**
 *
 * @author Malindu
 */
public class Borrowed extends javax.swing.JInternalFrame {
 String isbn,MID,LID, BorrowDate,ReturnDate, DueDate,No_of_Day,No_of_Book,Quntity, Amount;
    /**
     * Creates new form Borrowed1
     */
    public Borrowed() {
        initComponents();
        ISBNComb();
        MIDComb();
        LIDComb();
        LoadTable ();
        Date date = new Date();
        jDateChooser1.setDate(date);
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
        jLabel1 = new javax.swing.JLabel();
        ISBNComb = new javax.swing.JComboBox();
        MIDComb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NOBCombo = new javax.swing.JComboBox();
        txtstoke = new javax.swing.JTextField();
        LIDComb = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtNoDay = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        btnBorrowe = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel1.setText("ISBN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        ISBNComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ISBN" }));
        ISBNComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNCombActionPerformed(evt);
            }
        });
        jPanel1.add(ISBNComb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 193, 29));

        MIDComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ID" }));
        jPanel1.add(MIDComb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 193, 29));

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel9.setText("Borrow Book");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel3.setText("Member ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel4.setText("Borrowed Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel6.setText("Due Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel7.setText("No of Books");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel8.setText("No of Days");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel12.setText("Available Books");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        NOBCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "1", "2" }));
        NOBCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOBComboActionPerformed(evt);
            }
        });
        jPanel1.add(NOBCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 193, 29));
        jPanel1.add(txtstoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 193, 29));

        LIDComb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ID" }));
        jPanel1.add(LIDComb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 193, 29));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel13.setText("Librarian ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 840, 150));

        jDateChooser3.setDateFormatString("MMM /d / yyyy");
        jPanel1.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 193, 29));

        jDateChooser1.setDateFormatString("MMM /d / yyyy");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 193, 29));
        jPanel1.add(txtNoDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 193, 29));

        btnReturn.setBackground(new java.awt.Color(204, 102, 0));
        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/ReturnButton.jpg"))); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 130, 40));

        btnBorrowe.setBackground(new java.awt.Color(0, 153, 153));
        btnBorrowe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBorrowe.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrowe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/BorrowButton.jpg"))); // NOI18N
        btnBorrowe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorroweActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrowe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 130, 40));

        jButton5.setBackground(new java.awt.Color(0, 255, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/BackButton.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 130, 40));

        btnNew.setBackground(new java.awt.Color(51, 51, 255));
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/NewButton.jpg"))); // NOI18N
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/readwithus/images/background.jpg"))); // NOI18N
        jLabel2.setName("5"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 930, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 920, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ISBNCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNCombActionPerformed
        isbn = this.ISBNComb.getSelectedItem().toString();
        String query = "SELECT Quantity FROM book_purchase WHERE ISBN='" + isbn + "' ;";
        DBConnect.DBconnect();
        try {

            Statement st = DBConnect.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                this.txtstoke.setText(rs.getString("Quantity"));

            }
            DBConnect.con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ISBNCombActionPerformed

    private void NOBComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOBComboActionPerformed
        Date();
        NoOfDay();
        qty();

    }//GEN-LAST:event_NOBComboActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        Return form = new Return();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnBorroweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorroweActionPerformed
        if( this.ISBNComb.getSelectedItem().equals("SELECT ISBN"))
        {
            JOptionPane.showMessageDialog(null,  "Please Select ISBN ");
        }
        else if (this.MIDComb.getSelectedItem().equals("SELECT ID"))
        {
            JOptionPane.showMessageDialog(null,  "Please Select Member ID");
        }
        else if (this.LIDComb.getSelectedItem().equals("SELECT ID"))
        {
            JOptionPane.showMessageDialog(null,  "Please Select Librarian ID");
        }
        else if (this.NOBCombo.getSelectedItem().equals("Select"))
        {
            JOptionPane.showMessageDialog(null,  "Please Insert Number of Book");
        }
        else
        {
            isbn =  this.ISBNComb.getSelectedItem().toString();
            MID =  this.MIDComb.getSelectedItem().toString();
            LID =  this.LIDComb.getSelectedItem().toString();
            SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
            BorrowDate = Date.format(this.jDateChooser1.getDate());
            No_of_Book = this.NOBCombo.getSelectedItem().toString();
            DueDate = Date.format(this.jDateChooser3.getDate());
            No_of_Day = this.txtNoDay.getText();
            Quntity = this.txtstoke.getText();
            DBConnect.DBconnect();
            try{
                Statement st = DBConnect.con.createStatement();
                st.executeUpdate("INSERT INTO `borrow` VALUES('"+isbn+"','"+MID+"','"+LID+"',"
                    + "'"+BorrowDate+"','"+DueDate+"','"+No_of_Book+"','"+No_of_Day+"',null,null,null)");
                st.executeUpdate("UPDATE `book_purchase` SET `Quantity` = '"+Quntity+"' WHERE `ISBN`= '"+isbn+"'");
                JOptionPane.showMessageDialog(null, "Borrowed Successfully");
                clear();

                DBConnect.con.close();
            }catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);

            }

        }
    }//GEN-LAST:event_btnBorroweActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LHome form = new LHome();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
       clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void qty(){
        int stoke = Integer.parseInt(txtstoke.getText());
        int book = Integer.parseInt((String) NOBCombo.getSelectedItem()) ;
        if(stoke >=10   ){
            int Tot = ((stoke) - (book));
            String ava = String.valueOf(Tot);
            txtstoke.setText(ava);}
        else{
            JOptionPane.showMessageDialog(null, "Not enough books in stoke","Stoke error", JOptionPane.ERROR_MESSAGE);
        }
 }
    private void ISBNComb()
    { 
         String Query = ("SELECT * FROM book");
            DBConnect.DBconnect();
        try 
        { 
             Statement st = DBConnect.con.prepareStatement(Query); 
             ResultSet rs = st.executeQuery(Query);
            while(rs.next())
            {      
               String ISBN=rs.getString("ISBN");
               ISBNComb.addItem(ISBN);
               
            }
            
	 } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex);    
	 }     
}
   
    private void LIDComb()
    { 
         String Query = ("SELECT LID FROM librarian");
            DBConnect.DBconnect();
        try 
 
        {
             Statement st = DBConnect.con.prepareStatement(Query); 
             ResultSet rs = st.executeQuery(Query);
            while(rs.next())
            {      
               String ISBN=rs.getString("LID");
               LIDComb.addItem(ISBN);
            }
            
	 } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex);    
	 } 
        
}
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
    
    
   private void NoOfDay(){
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        String date = sdf.format(this.jDateChooser3.getDate());
        
       SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd"); 
        String date2 = dtf.format(this.jDateChooser1.getDate());
        
        try
        {
        java.util.Date d1 = sdf. parse (date);
        java.util.Date d2 = dtf. parse (date2);
        
        long days = (d1.getTime()- d2.getTime())/(24*60*60*1000);
          String day = String.valueOf(days);
         this.txtNoDay.setText(day);
        
         
    }catch (java.text.ParseException pe)
    {
        JOptionPane.showMessageDialog(null, pe.getMessage());
    }
   }

   
 private void Date(){
     String ty = NOBCombo.getSelectedItem().toString();
  String ss = NOBCombo.getSelectedItem().toString();
 ty = "1";
 ss ="2";
        if(NOBCombo.getSelectedItem().equals(ss)){
         SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd"); 
        String date2 = dtf.format(this.jDateChooser1.getDate());
        
        try
        {
          Date dates = dtf.parse(date2);
          Calendar cal = Calendar.getInstance();
          cal.add(Calendar.DAY_OF_MONTH, 14);
          Date futureDate = cal.getTime();
          String outD = dtf.format(futureDate);
          
       Date Adate = new SimpleDateFormat("yyyy-MM-dd").parse(outD); 
       this.jDateChooser3.setDate(Adate);
      
    }catch (java.text.ParseException pe)
    {
        JOptionPane.showMessageDialog(null, pe.getMessage());
    }
        
       
        } 
        else if (NOBCombo.getSelectedItem().equals(ty)){
         SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd"); 
        String date2 = dtf.format(this.jDateChooser1.getDate());
        
        try
        {
          Date dates = dtf.parse(date2);
          Calendar cal = Calendar.getInstance();
          cal.add(Calendar.DAY_OF_MONTH, 7);
          Date futureDate = cal.getTime();
          String outD = dtf.format(futureDate);
          
       Date Adate = new SimpleDateFormat("yyyy-MM-dd").parse(outD); 
       this.jDateChooser3.setDate(Adate);
      
    }catch (java.text.ParseException pe)
    {
        JOptionPane.showMessageDialog(null, pe.getMessage());
    }
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Please Select Item");
        }
     
 }
 void clear(){
  ISBNComb.setSelectedItem("SELECT ISBN");
        LIDComb.setSelectedItem("SELECT ID");
        MIDComb.setSelectedItem("SELECT ID");
        NOBCombo.setSelectedItem("SELECT ");
        jDateChooser3.setDate(null);
        txtNoDay.setText("");
        txtstoke.setText("");
 }
 void LoadTable ()
     {
         DefaultTableModel dm = new DefaultTableModel();
         dm.addColumn("ISBN");
         dm.addColumn("Librarian ID");
         dm.addColumn("Member ID");
         dm.addColumn("Borrow_Date");
         dm.addColumn("Due_Date");
         dm.addColumn("No_of_Book");
          dm.addColumn("No_of_Days");
         
         
         String Query = "SELECT * FROM `borrow` ";
         
        DBConnect.DBconnect();
         
         try
         {
             Statement st = DBConnect.con.prepareStatement(Query);
             ResultSet rs = st.executeQuery(Query);
             
             while(rs.next()){
                isbn = rs.getString("ISBN");
                MID = rs.getString("MID");
                LID = rs.getString("LID");
                BorrowDate = rs.getString("Borrow_Date");
                DueDate = rs.getString("Due_Date");
                No_of_Book = rs.getString("No_of_Book");
                No_of_Day = rs.getString("No_of_Days");
                
                 dm.addRow(new String[]{isbn,MID ,LID , BorrowDate, DueDate,No_of_Book,No_of_Day});
             
             
            }
             this.jTable1.setModel(dm);
             
           DBConnect.con.close();
             
         
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ISBNComb;
    private javax.swing.JComboBox LIDComb;
    private javax.swing.JComboBox MIDComb;
    private javax.swing.JComboBox NOBCombo;
    private javax.swing.JButton btnBorrowe;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNoDay;
    private javax.swing.JTextField txtstoke;
    // End of variables declaration//GEN-END:variables

   
}
