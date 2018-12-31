
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
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
public class Bills extends javax.swing.JFrame {

    /**
     * Creates new form Bills
     */
    public Bills() {
        initComponents();
        showAll1();
        showAll2();
        showAll3();
        showAll4();
        jPanel14.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
    jPanel20.setVisible(false);
    }

 Connection con;
    PreparedStatement st;
    ResultSet rs;
    DefaultTableModel tm1,tm2,tm3,tm4;
    

    void showAll1()
    {
        try
        {
                         Class.forName("com.mysql.jdbc.Driver");
                       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                       st=con.prepareStatement("select *from electricity_bill");
                       rs=st.executeQuery();
                       tm1=(DefaultTableModel)jTable1.getModel();
                       tm1.setNumRows(0);
                       jComboBox4.removeAllItems();
                       jComboBox4.addItem("Bill No");
                       jComboBox9.removeAllItems();
                       jComboBox9.addItem("Bill No");
                       while(rs.next())
                       {
                           Object obj[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8)};
                           tm1.addRow(obj);
                           jComboBox4.addItem(rs.getString(2));
                         jComboBox9.addItem(rs.getString(2));

                       }
                       
        }catch(SQLException|ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    void showAll2()
    {
        try
        {
                         Class.forName("com.mysql.jdbc.Driver");
                       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                       st=con.prepareStatement("select *from mobile_bill");
                       rs=st.executeQuery();
                       tm2=(DefaultTableModel)jTable2.getModel();
                       tm2.setNumRows(0);
                       jComboBox8.removeAllItems();
                       jComboBox8.addItem("Bill No");
                       jComboBox13.removeAllItems();
                       jComboBox13.addItem("Bill No");
                       while(rs.next())
                       {
                           Object obj[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)};
                           tm2.addRow(obj);
                           jComboBox8.addItem(rs.getString(2));
                           jComboBox13.addItem(rs.getString(2));
                       }
                       
        }catch(SQLException|ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    
    void showAll3()
    {
        try
        {
                         Class.forName("com.mysql.jdbc.Driver");
                       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                       st=con.prepareStatement("select *from dth_bill");
                       rs=st.executeQuery();
                       tm3=(DefaultTableModel)jTable6.getModel();
                       tm3.setNumRows(0);
                       jComboBox30.removeAllItems();
                       jComboBox30.addItem("Bill No");
                       jComboBox17.removeAllItems();
                       jComboBox17.addItem("Bill No");
                       while(rs.next())
                       {
                           Object obj[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
                           tm3.addRow(obj);
                           jComboBox30.addItem(rs.getString(2));
                           jComboBox17.addItem(rs.getString(2));
                       }
                       
                       jLabel54.setText("");
        }catch(SQLException|ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    
    void showAll4()
    {
        try
        {
                         Class.forName("com.mysql.jdbc.Driver");
                       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                       st=con.prepareStatement("select *from income_tax");
                       rs=st.executeQuery();
                       tm4=(DefaultTableModel)jTable3.getModel();
                       tm4.setNumRows(0);
                       jComboBox40.removeAllItems();
                       jComboBox40.addItem("Invoice No");
                       jComboBox41.removeAllItems();
                       jComboBox41.addItem("Invoice No");
                       while(rs.next())
                       {
                           Object obj[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7)};
                           tm4.addRow(obj);
                           jComboBox40.addItem(rs.getString(2));
                         jComboBox41.addItem(rs.getString(2));

                       }
                       
        }catch(SQLException|ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jComboBox23 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jComboBox31 = new javax.swing.JComboBox<>();
        jComboBox32 = new javax.swing.JComboBox<>();
        jComboBox33 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jComboBox24 = new javax.swing.JComboBox<>();
        jComboBox25 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jComboBox27 = new javax.swing.JComboBox<>();
        jComboBox28 = new javax.swing.JComboBox<>();
        jComboBox29 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel61 = new javax.swing.JLabel();
        jComboBox34 = new javax.swing.JComboBox<>();
        jComboBox35 = new javax.swing.JComboBox<>();
        jComboBox36 = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        jComboBox37 = new javax.swing.JComboBox<>();
        jComboBox38 = new javax.swing.JComboBox<>();
        jComboBox39 = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jComboBox30 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboBox20 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jComboBox41 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel68 = new javax.swing.JLabel();
        jComboBox42 = new javax.swing.JComboBox<>();
        jComboBox43 = new javax.swing.JComboBox<>();
        jComboBox44 = new javax.swing.JComboBox<>();
        jButton17 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox40 = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jPanel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Address");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 270, 40));

        jTextField2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, 40));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("Last Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 90, -1));

        jTextField3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 270, 40));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setText("Contact");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jTextField4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 270, 40));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setText("Curr. Reading");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 270, 40));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Prev. Reading");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, -1));

        jTextField6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 40));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel7.setText("Amount");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 270, 100));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setText("Bill No.");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 110, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 110, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/done.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jTabbedPane2.addTab("Insert", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Bill No.", "Contact", "Address", "Current Reading", "Previous Reading", "Last Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 290));

        jComboBox4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bill No" }));
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 40));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 430, 690, 30));

        jTabbedPane2.addTab("View/Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox9.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bill No" }));
        jPanel4.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 140, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, 40));

        jPanel9.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel19.setText("Address");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField13.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel9.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 270, 40));

        jTextField14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel9.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, 40));

        jLabel20.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel20.setText("Last Date");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 90, -1));

        jTextField15.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel9.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 270, 40));

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel21.setText("Contact");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jTextField16.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel9.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 270, 40));

        jLabel22.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel22.setText("Curr. Reading");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jTextField17.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel9.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 270, 40));

        jLabel23.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel23.setText("Prev. Reading");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, -1));

        jTextField18.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel9.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 40));

        jLabel24.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel24.setText("Name");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel25.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel25.setText("Amount");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 270, 100));

        jLabel26.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel26.setText("Bill No.");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jComboBox10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel9.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 110, -1));

        jComboBox11.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel9.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jComboBox12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel9.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 110, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 110, 50));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        jTabbedPane2.addTab("Edit", jPanel4);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 800, 470));

        jTabbedPane1.addTab("Electricity", jPanel1);

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jPanel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setText("Address");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 270, 40));

        jTextField8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, 40));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setText("Last Date");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jTextField9.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 270, 40));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel12.setText("Mobile NO.");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        jTextField12.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 40));

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel15.setText("Name");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel16.setText("Amount");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 270, 100));

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel17.setText("Bill No.");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        jComboBox5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        jComboBox6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel5.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel5.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 110, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/done.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 80, 40));

        jComboBox21.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel5.add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 110, -1));

        jComboBox22.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel5.add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jComboBox23.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel5.add(jComboBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jLabel46.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel46.setText("Bill Date");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        jTextField10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 270, 40));

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel13.setText("Operator");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jTabbedPane3.addTab("Insert", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox13.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bill No" }));
        jPanel6.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 140, 40));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 80, 40));

        jPanel10.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel27.setText("Address");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField19.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel10.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 270, 40));

        jTextField20.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel10.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, 40));

        jLabel28.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel28.setText("Last Date");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jTextField21.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel10.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 270, 40));

        jLabel29.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel29.setText("Mobile NO.");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        jTextField22.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel10.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 40));

        jLabel30.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel30.setText("Name");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel31.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel31.setText("Amount");
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane6.setViewportView(jTextArea4);

        jPanel10.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 270, 100));

        jLabel32.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel32.setText("Bill No.");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        jComboBox14.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        jComboBox15.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel10.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jComboBox16.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel10.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 110, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 110, 40));

        jComboBox31.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel10.add(jComboBox31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 110, -1));

        jComboBox32.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel10.add(jComboBox32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jComboBox33.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel10.add(jComboBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jLabel56.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel56.setText("Bill Date");
        jPanel10.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        jTextField23.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel10.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 270, 40));

        jLabel33.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel33.setText("Operator");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jTabbedPane3.addTab("Edit", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Bill No.", "Contact", "Address", "Bill Date", "Last Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 290));

        jComboBox8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bill No" }));
        jPanel7.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 40));

        jLabel18.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 430, 690, 30));

        jTabbedPane3.addTab("View/Delete", jPanel7);

        jTabbedPane1.addTab("Mobile", jTabbedPane3);

        jTabbedPane7.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jPanel17.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setText("Address");
        jPanel17.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel17.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 240, 40));

        jTextField31.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel17.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, 40));

        jLabel47.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel47.setText("Last Date");
        jPanel17.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jTextField32.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel17.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 240, 40));

        jLabel48.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel48.setText("Mobile No.");
        jPanel17.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        jTextField33.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel17.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, 40));

        jLabel49.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel49.setText("Name");
        jPanel17.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel50.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel50.setText("Amount");
        jPanel17.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea6.setRows(5);
        jScrollPane11.setViewportView(jTextArea6);

        jPanel17.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 240, 100));

        jLabel51.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel51.setText("Bill No.");
        jPanel17.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        jComboBox24.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox24ActionPerformed(evt);
            }
        });
        jPanel17.add(jComboBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        jComboBox25.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel17.add(jComboBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jComboBox26.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel17.add(jComboBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 110, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/done.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 80, 40));

        jComboBox27.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel17.add(jComboBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 110, -1));

        jComboBox28.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel17.add(jComboBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jComboBox29.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel17.add(jComboBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jLabel52.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel52.setText("Bill Date");
        jPanel17.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        jTextField34.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel17.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 240, 40));

        jLabel53.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel53.setText("Operator");
        jPanel17.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jTextField35.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel17.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 240, 40));

        jLabel55.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel55.setText("Plan Details");
        jPanel17.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 130, -1));

        jTabbedPane7.addTab("Insert", jPanel17);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox17.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bill No" }));
        jPanel18.add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 140, 40));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 80, 40));

        jPanel20.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel34.setText("Address");
        jPanel20.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField24.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel20.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 240, 40));

        jTextField36.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel20.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, 40));

        jLabel57.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel57.setText("Last Date");
        jPanel20.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jTextField37.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel20.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 240, 40));

        jLabel58.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel58.setText("Mobile No.");
        jPanel20.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        jTextField38.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel20.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, 40));

        jLabel59.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel59.setText("Name");
        jPanel20.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel60.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel60.setText("Amount");
        jPanel20.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea7.setRows(5);
        jScrollPane13.setViewportView(jTextArea7);

        jPanel20.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 240, 100));

        jLabel61.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel61.setText("Bill No.");
        jPanel20.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        jComboBox34.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox34ActionPerformed(evt);
            }
        });
        jPanel20.add(jComboBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        jComboBox35.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel20.add(jComboBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jComboBox36.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel20.add(jComboBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 110, -1));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 110, 40));

        jComboBox37.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel20.add(jComboBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 110, -1));

        jComboBox38.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel20.add(jComboBox38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jComboBox39.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel20.add(jComboBox39, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jLabel62.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel62.setText("Bill Date");
        jPanel20.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        jTextField39.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel20.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 240, 40));

        jLabel63.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel63.setText("Operator");
        jPanel20.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jTextField40.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel20.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 240, 40));

        jLabel64.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel64.setText("Plan Details");
        jPanel20.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 130, -1));

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jTabbedPane7.addTab("Edit", jPanel18);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Bill No.", "Contact", "Address", "Operator", "Plan Detail", "Bill Date", "Last Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable6);

        jPanel19.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 290));

        jComboBox30.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bill No" }));
        jPanel19.add(jComboBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 40));

        jLabel54.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 51, 51));
        jPanel19.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 430, 690, 30));

        jTabbedPane7.addTab("View/Delete", jPanel19);

        jTabbedPane1.addTab("DTH", jTabbedPane7);

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jPanel8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel35.setText("Address");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField25.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel8.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 270, 40));

        jTextField26.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel8.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, 40));

        jLabel36.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel36.setText("Invoice Date");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, -1));

        jTextField27.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel8.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 270, 40));

        jLabel37.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel37.setText("Contact");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jTextField29.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel8.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 270, 40));

        jLabel39.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel39.setText("GST No.");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, -1));

        jTextField30.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel8.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 40));

        jLabel40.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel40.setText("Name");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel41.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel41.setText("Amount");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane7.setViewportView(jTextArea5);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 270, 100));

        jLabel42.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel42.setText("Invoice No.");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));

        jComboBox18.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel8.add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 80, -1));

        jComboBox19.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel8.add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jComboBox20.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel8.add(jComboBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 80, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/done.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jTabbedPane4.addTab("Insert", jPanel8);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox41.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jComboBox41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Invoice No." }));
        jPanel12.add(jComboBox41, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 140, 40));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, 40));

        jPanel14.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel38.setText("Address");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, -1));

        jTextField28.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel14.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 270, 40));

        jTextField41.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel14.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, 40));

        jLabel44.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel44.setText("Invoice Date");
        jPanel14.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, -1));

        jTextField42.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel14.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 270, 40));

        jLabel45.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel45.setText("Contact");
        jPanel14.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jTextField43.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel14.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 270, 40));

        jLabel65.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel65.setText("GST No.");
        jPanel14.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, -1));

        jTextField44.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jPanel14.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 40));

        jLabel66.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel66.setText("Name");
        jPanel14.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel67.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel67.setText("Amount");
        jPanel14.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, -1));

        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea8.setRows(5);
        jScrollPane9.setViewportView(jTextArea8);

        jPanel14.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 270, 100));

        jLabel68.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel68.setText("Invoice No.");
        jPanel14.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));

        jComboBox42.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel14.add(jComboBox42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 80, -1));

        jComboBox43.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox43.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel14.add(jComboBox43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jComboBox44.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jComboBox44.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel14.add(jComboBox44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 80, -1));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 120, 40));

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jTabbedPane4.addTab("Edit", jPanel12);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Invoice No.", "Contact", "GST No.", "Invoice Date", "Amount", "Address "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTable3.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jScrollPane8.setViewportView(jTable3);

        jPanel11.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 290));

        jComboBox40.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jComboBox40.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Invoice No." }));
        jPanel11.add(jComboBox40, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 40));

        jLabel43.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 51, 51));
        jPanel11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 430, 690, 30));

        jTabbedPane4.addTab("View/Delete", jPanel11);

        jTabbedPane1.addTab("Income Tax", jTabbedPane4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 890, 470));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new MainWindow().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String bNo=(String)jComboBox8.getSelectedItem();
        if(bNo.equals("Bill No"))
        jLabel18.setText("Select a bill No");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("delete from mobile_bill where bill_no=?");
                st.setString(1,bNo);
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted!!!");
                showAll2();
            }catch(SQLException| ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String amt=jTextField7.getText();
        String operator=jTextField10.getText();
        String bNo=jTextField8.getText();
        String cNo=jTextField9.getText();
        String name=jTextField12.getText();
        String add=jTextArea2.getText();
        String day=(String)jComboBox5.getSelectedItem();
        String month=(String)jComboBox6.getSelectedItem();
        String year=(String)jComboBox7.getSelectedItem();
        String lastDate=year+"-"+month+"-"+day;
        day=(String)jComboBox23.getSelectedItem();
        month=(String)jComboBox22.getSelectedItem();
        year=(String)jComboBox21.getSelectedItem();
        String billDate=year+"-"+month+"-"+day;
        if(name.isEmpty()||cNo.isEmpty()||add.isEmpty()||amt.isEmpty()||operator.isEmpty())
        JOptionPane.showMessageDialog(this, "Some Fields Are Required!!");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("insert into mobile_bill values (?,?,?,?,?,?,?,?)");
                st.setString(1,name);
                st.setString(2,bNo);
                st.setString(3,operator);
                st.setString(4,cNo);
                st.setString(5,add);
                st.setString(6, billDate);
                st.setString(7,lastDate);
                st.setInt(8,Integer.parseInt(amt));
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Done!!!");
                jTextArea2.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField12.setText("");
                jTextField10.setText("");
                jComboBox5.setSelectedIndex(0);
                jComboBox6.setSelectedIndex(0);
                jComboBox7.setSelectedIndex(0);
                jComboBox21.setSelectedIndex(0);
                jComboBox22.setSelectedIndex(0);
                jComboBox23.setSelectedIndex(0);
                showAll2();
            }catch(ClassNotFoundException|SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed

    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String bNo=(String)jComboBox4.getSelectedItem();
        if(bNo.equals("Bill No"))
        jLabel9.setText("Select a bill No");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("delete from electricity_bill where bill_no=?");
                st.setString(1,bNo);
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted!!!");
                showAll1();
            }catch(SQLException| ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String amt=jTextField1.getText();
        String bNo=jTextField2.getText();
        String cNo=jTextField3.getText();
        String curr=jTextField4.getText();
        String prev=jTextField5.getText();
        String name=jTextField6.getText();
        String add=jTextArea1.getText();
        String day=(String)jComboBox1.getSelectedItem();
        String month=(String)jComboBox2.getSelectedItem();
        String year=(String)jComboBox3.getSelectedItem();
        String date=year+"-"+month+"-"+day;
        if(name.isEmpty()||cNo.isEmpty()||add.isEmpty()||curr.isEmpty()||prev.isEmpty()||date.isEmpty())
        JOptionPane.showMessageDialog(this, "Fields are Empty!!");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("insert into electricity_bill values (?,?,?,?,?,?,?,?)");
                st.setString(1,name);
                st.setString(2,bNo);
                st.setString(3,cNo);
                st.setString(4,add);
                st.setInt(5,Integer.parseInt(curr));
                st.setInt(6,Integer.parseInt(prev));
                st.setString(7,date);
                st.setInt(8,Integer.parseInt(amt));
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Done!!!");
                jTextArea1.setText("");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jComboBox3.setSelectedIndex(0);
                showAll1();
            }catch(ClassNotFoundException|SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox24ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
String amt=jTextField11.getText();
        String operator=jTextField34.getText();
        String bNo=jTextField31.getText();
        String cNo=jTextField32.getText();
        String name=jTextField33.getText();
        String Plan=jTextField35.getText();
        String add=jTextArea6.getText();
        String day=(String)jComboBox24.getSelectedItem();
        String month=(String)jComboBox25.getSelectedItem();
        String year=(String)jComboBox26.getSelectedItem();
        String lastDate=year+"-"+month+"-"+day;
        day=(String)jComboBox29.getSelectedItem();
        month=(String)jComboBox28.getSelectedItem();
        year=(String)jComboBox27.getSelectedItem();
        String billDate=year+"-"+month+"-"+day;
        if(name.isEmpty()||cNo.isEmpty()||add.isEmpty()||amt.isEmpty()||operator.isEmpty()||Plan.isEmpty())
        JOptionPane.showMessageDialog(this, "Some Fields Are Required!!");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("insert into dth_bill values (?,?,?,?,?,?,?,?,?)");
                st.setString(1,name);
                st.setString(2,bNo);
                st.setString(3,cNo);
                st.setString(4,add);
                st.setString(5,operator);
                st.setString(6,Plan);
                st.setString(7,billDate);
                st.setString(8,lastDate);
                st.setInt(9,Integer.parseInt(amt));
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Done!!!");
                jTextArea6.setText("");
                jTextField31.setText("");
                jTextField32.setText("");
                jTextField33.setText("");
                jTextField34.setText("");
                jTextField35.setText("");
                jComboBox24.setSelectedIndex(0);
                jComboBox25.setSelectedIndex(0);
                jComboBox26.setSelectedIndex(0);
                jComboBox27.setSelectedIndex(0);
                jComboBox28.setSelectedIndex(0);
                jComboBox29.setSelectedIndex(0);
                jTextField11.setText("");
                showAll3();
            }catch(ClassNotFoundException|SQLException ex)
            {
                ex.printStackTrace();
            }
        }        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 String bNo=(String)jComboBox30.getSelectedItem();
        if(bNo.equals("Bill No"))
        jLabel54.setText("Select a bill No");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("delete from dth_bill where bill_no=?");
                st.setString(1,bNo);
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted!!!");
                showAll3();
            }catch(SQLException| ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton13ActionPerformed
static String choice;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
choice=(String)jComboBox9.getSelectedItem();
                HashMap map=new HashMap();
                map.put("Choice", choice);
        if(choice.equals("Bill No"))
            JOptionPane.showMessageDialog(this, "Select a choice");
        else
        {
                
            jPanel9.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
String name=jTextField18.getText();
String bNo=jTextField14.getText();
String cNo=jTextField15.getText();
String curr=jTextField16.getText();
String prev=jTextField17.getText();
String amt=jTextField13.getText();
String add=jTextArea3.getText();
String day=(String)jComboBox10.getSelectedItem();
String month=(String)jComboBox11.getSelectedItem();
String year=(String)jComboBox12.getSelectedItem();
String date=year+"-"+month+"-"+day;
if(name.isEmpty()||bNo.isEmpty()||cNo.isEmpty()||amt.isEmpty()||add.isEmpty())
{
    JOptionPane.showMessageDialog(this,"Fields are empty!!!");
}
else
{
    try
    {
     Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
      st=con.prepareStatement("update electricity_bill set name=?,Bill_no=?, contact_no=?,address=?,currentReading=?,PreviousReading=?,lastDate=?,Amount=? where bill_no=?");
       st.setString(1,name);
       st.setString(2,bNo);
       st.setString(3,cNo);
       st.setString(4,add);
       st.setInt(5,Integer.parseInt(curr));
       st.setInt(6,Integer.parseInt(prev));
       st.setString(7,date);
       st.setInt(8,Integer.parseInt(amt));  
       st.setString(9,choice);
       st.executeUpdate();
       JOptionPane.showMessageDialog(this, "Updated Successfull");
       jTextField18.setText("");
jTextField14.setText("");
jTextField15.setText("");
jTextField16.setText("");
jTextField17.setText("");
jTextField13.setText("");
jTextArea3.setText("");
jComboBox10.setSelectedIndex(0);
jComboBox11.setSelectedIndex(0);
jComboBox12.setSelectedIndex(0);
jPanel9.setVisible(false);
        showAll1();
    }catch(SQLException|ClassNotFoundException ex)
    {
        ex.printStackTrace();
    }
}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    choice=(String)jComboBox13.getSelectedItem();
    if(choice.equals("Bill No"))
        JOptionPane.showMessageDialog(this,"Select choice");
    else
    {
     jPanel10.setVisible(true);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
String name=jTextField22.getText();
String bNo=jTextField20.getText();
String cNo=jTextField21.getText();
String operator=jTextField23.getText();
String amt=jTextField19.getText();
String add=jTextArea4.getText();
String day=(String)jComboBox33.getSelectedItem();
String month=(String)jComboBox32.getSelectedItem();
String year=(String)jComboBox31.getSelectedItem();
String billDate=year+"-"+month+"-"+day;
 day=(String)jComboBox14.getSelectedItem();
 month=(String)jComboBox15.getSelectedItem();
 year=(String)jComboBox16.getSelectedItem();
String lastDate=year+"-"+month+"-"+day;
if(name.isEmpty()||bNo.isEmpty()||cNo.isEmpty()||amt.isEmpty()||add.isEmpty())
{
    JOptionPane.showMessageDialog(this,"Fields are empty!!!");
}
else
{
    try
    {
     Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
      st=con.prepareStatement("update mobile_bill set name=?,Bill_no=?,operator=?, mobile_no=?,address=?,bill_date=?,last_date=?,Amount=? where bill_no=?");
       st.setString(1,name);
       st.setString(2,bNo);
       st.setString(3,operator);
       st.setString(4,cNo);
       st.setString(5,add);
       st.setString(6,billDate);
       st.setString(7,lastDate);
       st.setInt(8,Integer.parseInt(amt));  
       st.setString(9,choice);
       st.executeUpdate();
       JOptionPane.showMessageDialog(this, "Updated Successfull");
       jTextField18.setText("");
jTextField19.setText("");
jTextField20.setText("");
jTextField21.setText("");
jTextField22.setText("");
jTextField23.setText("");
jTextArea4.setText("");
jComboBox31.setSelectedIndex(0);
jComboBox32.setSelectedIndex(0);
jComboBox33.setSelectedIndex(0);
jComboBox14.setSelectedIndex(0);
jComboBox15.setSelectedIndex(0);
jComboBox16.setSelectedIndex(0);
jPanel10.setVisible(false);
        showAll2();
    }catch(SQLException|ClassNotFoundException ex)
    {
        ex.printStackTrace();
    }
}

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
choice=(String)jComboBox17.getSelectedItem();
    if(choice.equals("Bill No"))
        JOptionPane.showMessageDialog(this,"Select choice");
    else
    {
     jPanel20.setVisible(true);
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox34ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
String name=jTextField38.getText();
String bNo=jTextField36.getText();
String cNo=jTextField37.getText();
String operator=jTextField39.getText();
String amt=jTextField24.getText();
String pDetail=jTextField40.getText();
String add=jTextArea7.getText();
String day=(String)jComboBox39.getSelectedItem();
String month=(String)jComboBox38.getSelectedItem();
String year=(String)jComboBox37.getSelectedItem();
String billDate=year+"-"+month+"-"+day;
 day=(String)jComboBox34.getSelectedItem();
 month=(String)jComboBox35.getSelectedItem();
 year=(String)jComboBox36.getSelectedItem();
String lastDate=year+"-"+month+"-"+day;
if(name.isEmpty()||bNo.isEmpty()||cNo.isEmpty()||amt.isEmpty()||add.isEmpty())
{
    JOptionPane.showMessageDialog(this,"Fields are empty!!!");
}
else
{
    try
    {
     Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
      st=con.prepareStatement("update dth_bill set name=?,Bill_no=?,operator=?,mobile_no=?,address=?,bill_date=?,last_date=?,Amount=?,plan_detail=? where bill_no=?");
       st.setString(1,name);
       st.setString(2,bNo);
       st.setString(3,operator);
       st.setString(4,cNo);
       st.setString(5,add);
       st.setString(6,billDate);
       st.setString(7,lastDate);
       st.setInt(8,Integer.parseInt(amt));
       st.setString(9,pDetail);
       st.setString(10,choice);
       st.executeUpdate();
       JOptionPane.showMessageDialog(this, "Updated Successfull");
       jTextField38.setText("");
jTextField36.setText("");
jTextField37.setText("");
jTextField39.setText("");
jTextField24.setText("");
jTextField40.setText("");
jTextArea7.setText("");
jComboBox39.setSelectedIndex(0);
jComboBox38.setSelectedIndex(0);
jComboBox37.setSelectedIndex(0);
jComboBox34.setSelectedIndex(0);
jComboBox35.setSelectedIndex(0);
jComboBox36.setSelectedIndex(0);
 jPanel20.setVisible(false);
        showAll3();
    }catch(SQLException|ClassNotFoundException ex)
    {
        ex.printStackTrace();
    }
}
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String name=jTextField30.getText();
        String invoice=jTextField26.getText();
        String cNo=jTextField27.getText();
        String gst=jTextField29.getText();
        int amt=Integer.parseInt(jTextField25.getText());
        String address=jTextArea5.getText();
        String day=(String)jComboBox18.getSelectedItem();
        String month=(String)jComboBox19.getSelectedItem();
        String year=(String)jComboBox20.getSelectedItem();
        String date=year+"-"+month+"-"+day;
        if(name.isEmpty()||invoice.isEmpty()||cNo.isEmpty()||gst.isEmpty()||date.isEmpty())
        JOptionPane.showMessageDialog(this, "Fields are Empty!!");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("insert into income_tax values (?,?,?,?,?,?,?)");
                st.setString(1,name);
                st.setString(2,invoice);
                st.setString(3,cNo);
                st.setString(4,gst);
                st.setString(5,date);
                st.setInt(6,amt);
                st.setString(7,address);
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Done!!!");
                jTextArea5.setText("");
                jTextField30.setText("");
                jTextField26.setText("");
                jTextField27.setText("");
                jTextField29.setText("");
                jTextField25.setText("");
                jComboBox18.setSelectedIndex(0);
                jComboBox19.setSelectedIndex(0);
                jComboBox20.setSelectedIndex(0);
                showAll4();
            }catch(ClassNotFoundException|SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
choice=(String)jComboBox41.getSelectedItem();
                HashMap map=new HashMap();
                map.put("Choice", choice);
        if(choice.equals("Invoice No."))
            JOptionPane.showMessageDialog(this, "Select a choice");
        else
        {
                
            jPanel14.setVisible(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String invoiceNo=(String)jComboBox40.getSelectedItem();
        if(invoiceNo.equals("Invoice No."))
        jLabel43.setText("Select a Invoice No.");
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
                st=con.prepareStatement("delete from income_tax where invoice_no=?");
                st.setString(1,invoiceNo);
                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted!!!");
                showAll4();
            }catch(SQLException| ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
String name=jTextField44.getText();
String invoiceNo=jTextField41.getText();
String cNo=jTextField42.getText();
String amt=jTextField28.getText();
String add=jTextArea8.getText();
String gstNo=jTextField43.getText();
String day=(String)jComboBox42.getSelectedItem();
String month=(String)jComboBox43.getSelectedItem();
String year=(String)jComboBox44.getSelectedItem();
String date=year+"-"+month+"-"+day;
if(name.isEmpty()||invoiceNo.isEmpty()||cNo.isEmpty()||amt.isEmpty()||add.isEmpty())
{
    JOptionPane.showMessageDialog(this,"Fields are empty!!!");
}
else
{
    try
    {
     Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/service_backup","root","nikhil123");
      st=con.prepareStatement("update income_tax set name=?,invoice_no=?, contact=?,gst_no=?,invoice_date=?,Amount=?,address=? where invoice_no=?");
       st.setString(1,name);
       st.setString(2,invoiceNo);
       st.setString(3,cNo);
       st.setString(4,gstNo);
       st.setString(5,date);
       st.setInt(6,Integer.parseInt(amt));
       st.setString(7,add);  
       st.setString(8,choice);
       st.executeUpdate();
       JOptionPane.showMessageDialog(this, "Updated Successfull");
       jTextField44.setText("");
jTextField41.setText("");
jTextField42.setText("");
jTextField28.setText("");
jTextField43.setText("");
jTextArea8.setText("");
jComboBox42.setSelectedIndex(0);
jComboBox43.setSelectedIndex(0);
jComboBox44.setSelectedIndex(0);
jPanel14.setVisible(false);
        showAll4();
    }catch(SQLException|ClassNotFoundException ex)
    {
        ex.printStackTrace();
    }
}
    }//GEN-LAST:event_jButton17ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox38;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox40;
    private javax.swing.JComboBox<String> jComboBox41;
    private javax.swing.JComboBox<String> jComboBox42;
    private javax.swing.JComboBox<String> jComboBox43;
    private javax.swing.JComboBox<String> jComboBox44;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
