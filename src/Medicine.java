
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIDDLE
 */
public class Medicine extends javax.swing.JFrame 
{

    /**
     * Creates new form LogIn
     */
    public Medicine() {
        initComponents();
        showAll();
       jTable1.setRowSelectionAllowed(false);
            jTable1.setColumnSelectionAllowed(false);
     
    }
    DefaultTableModel tm;
    PreparedStatement st;
    ResultSet rs;
    Connection con;
    
    void showAll()
    {
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=(PreparedStatement)con.prepareStatement("select *from medicine");
                rs=st.executeQuery();
               tm=(DefaultTableModel) jTable1.getModel();
              jComboBox4.removeAllItems();
             jComboBox5.removeAllItems();
             jComboBox6.removeAllItems();
             jComboBox4.addItem("Name");
             jComboBox5.addItem("Use");
             jComboBox6.addItem("Expiry Date");
             
        
               while(rs.next())
               {
                   Object obj[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                   tm.addRow(obj);  
                  jComboBox4.addItem(rs.getString(1));
                  jComboBox5.addItem(rs.getString(2));
                  jComboBox6.addItem(rs.getString(3));
               }
        }catch(ClassNotFoundException|SQLException ex)
        {
            
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 110, 40));

        jTextField1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 270, 40));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 110, 40));

        jTextField2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 270, 40));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EXPIRY DATE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 180, 40));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUANTITY");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 140, 40));

        jTextField4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 270, 40));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 70, 30));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, 30));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 70, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/done.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 100, 40));

        jTabbedPane1.addTab("INSERT", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Use", "Expiry Date", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 470, 190));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/your medicines.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 470, -1));

        jComboBox6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expiry Date" }));
        jComboBox6.setToolTipText("Expiry Date");
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 120, -1));

        jComboBox5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Use" }));
        jComboBox5.setToolTipText("Use");
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, -1));

        jComboBox4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name" }));
        jComboBox4.setToolTipText("Name");
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 30));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filter.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 470, 50));

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 470, 20));

        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton4.setText("VIEW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jTabbedPane1.addTab("VIEW/DELETE", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        new MainWindow().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String Name=jTextField1.getText();
        String use=jTextField2.getText();
        String qty=jTextField4.getText();
        String date=new String();
        date=(String)jComboBox1.getSelectedItem();
        date+="-"+(String)jComboBox3.getSelectedItem();
        date+="-"+(String)jComboBox2.getSelectedItem();
        boolean res = false;
        if(qty.length()!=0)
        {
            for(int i=0;i<qty.length();i++)
            {
                if(Character.isLetter(qty.charAt(i)))
                res=true; break;
            }
        }
        
        if(qty.isEmpty()||use.isEmpty()||Name.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "All Fields Are Required!!");
        }
        
        else
        {
            if(res==true)
            JOptionPane.showMessageDialog(this,"Invalid Quantity");
            else
            {
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=(PreparedStatement)con.prepareStatement("insert into medicine value(?,?,?,?)");
               st.setString(1, Name);
             st.setString(2, use);
             st.setString(3, date);
             st.setInt(4, Integer.parseInt(qty));
             st.executeUpdate();
             JOptionPane.showMessageDialog(this, "Done!!!");
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField4.setText("");
             jComboBox1.setSelectedIndex(0);
             jComboBox2.setSelectedIndex(0);
             jComboBox3.setSelectedIndex(0);
             tm.setNumRows(0);
             showAll();
                     } catch(ClassNotFoundException| SQLException ex)
         {
             ex.printStackTrace();
         }
        }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
        {
            
        String name=(String)jComboBox4.getSelectedItem();
        String use=(String)jComboBox5.getSelectedItem();
         String date=(String)jComboBox6.getSelectedItem();
         if(name.equals("Name")&&date.equals("Expirty Date")&&use.equals("Use"))
         {
             jLabel7.setText("Select any one option!!");
         }   
         else if(name!="Name")
         {
             
             Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=(PreparedStatement)con.prepareStatement("delete from medicine where MedName=?");
               st.setString(1,name);
                st.executeUpdate();
                tm.setNumRows(0);
               showAll();
                jComboBox4.setSelectedIndex(0);

         }
               else if(use!="Use")
         {
             
             Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=(PreparedStatement)con.prepareStatement("delete from medicine where MedUse=?");
               st.setString(1,use);
                st.executeUpdate();
                tm.setNumRows(0);
               showAll();
               jComboBox5.setSelectedIndex(0);
               
         }
               else if(date!="Expiry Date")
         {
             
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup", "root", "nikhil123");
             st = (PreparedStatement) con.prepareStatement("delete from medicine where Expiry_Date=?");
             st.setString(1, date);
             st.executeUpdate();
             tm.setNumRows(0);
             showAll();
             jComboBox6.setSelectedIndex(0);
                       }
         } catch(ClassNotFoundException| SQLException ex)
         {
             ex.printStackTrace();
         }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        String name=(String)jComboBox4.getSelectedItem();
        String use=(String)jComboBox5.getSelectedItem();
         String date=(String)jComboBox6.getSelectedItem();
        if(name.equals("Name")&&date.equals("Expiry Date")&&use.equals("Use"))
        {
        jLabel7.setText("Select Name to Edit");
        }
        
        else if(date!="Expiry Date"||use!="Use")
        {
            jLabel7.setText("Select Name to Edit");
            jComboBox5.setSelectedIndex(0);
            jComboBox6.setSelectedIndex(0);
        }
        else if(name!="Name")
        {
            new medicineEdit(name).setVisible(true);
            jLabel7.setText("");
            dispose();
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            String name=(String)jComboBox4.getSelectedItem();
            String use=(String)jComboBox5.getSelectedItem();
            String date=(String)jComboBox6.getSelectedItem();
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
            if (name.equals("Name")&&date.equals("Expiry Date")&&use.equals("Use"))
            {
                tm.setNumRows(0);
                showAll();
            }
            else 
            {
              if(date.equals("Expiry Date")&&use.equals("Use"))
                    {
                    st=con.prepareStatement("select *from medicine where MedName=?");
                    st.setString(1,name);
                    rs=st.executeQuery();
                    tm.setNumRows(0);
                    while(rs.next())
                    {
                    Object obj[]={ rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                    tm.addRow(obj);
                    jComboBox4.setSelectedIndex(0);
                    }
                    }
            else if(name.equals("Name")&&date.equals("Expiry Date"))
                    {
                    st=con.prepareStatement("select *from medicine where MedUse=?");
                    st.setString(1,use);
                    rs=st.executeQuery();
                    tm.setNumRows(0);
                    while(rs.next())
                    {
                    Object obj[]={ rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                    tm.addRow(obj);
                    jComboBox5.setSelectedIndex(0);
                    }
                    }
            else if(name.equals("Name")&&use.equals("Use"))
                    {
                    st=con.prepareStatement("select *from medicine where Expiry_date=?");
                    st.setString(1,date);
                    rs=st.executeQuery();
                    tm.setNumRows(0);
                    while(rs.next())
                    {
                    Object obj[]={ rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                    tm.addRow(obj);
                    jComboBox6.setSelectedIndex(0);
                    }
                    }   
             }
            
                
        }catch(ClassNotFoundException| SQLException ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
