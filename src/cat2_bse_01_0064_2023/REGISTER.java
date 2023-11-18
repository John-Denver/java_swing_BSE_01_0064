package cat2_bse_01_0064_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author denve
 */
public class REGISTER extends javax.swing.JFrame {

    /**
     * Creates new form REGISTER
     */
    public REGISTER() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        terms = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        name_space = new javax.swing.JTextField();
        mobile_space = new javax.swing.JTextField();
        male_check = new javax.swing.JRadioButton();
        female_check = new javax.swing.JRadioButton();
        day_combo = new javax.swing.JComboBox<>();
        month_combo = new javax.swing.JComboBox<>();
        year_combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_text_area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        register_table = new javax.swing.JTable();
        hide_data = new javax.swing.JButton();
        view_data = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cat2_Register_Denver");

        jLabel1.setFont(new java.awt.Font("Arvo", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("Registration Form");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("NAME");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("MOBILE");

        gender.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        gender.setText("GENDER");

        dob.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        dob.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setText("ADDRESS");

        terms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Chiller", 3, 28)); // NOI18N
        jLabel7.setText("Accept Terms and Conditions");

        submit.setBackground(new java.awt.Color(51, 204, 0));
        submit.setFont(new java.awt.Font("Arvo", 1, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 0, 51));
        reset.setFont(new java.awt.Font("Arvo", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        male_check.setFont(new java.awt.Font("Vanilla", 0, 12)); // NOI18N
        male_check.setText("MALE");

        female_check.setFont(new java.awt.Font("Vanilla", 0, 12)); // NOI18N
        female_check.setText("FEMALE");
        female_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_checkActionPerformed(evt);
            }
        });

        day_combo.setFont(new java.awt.Font("Arvo", 1, 12)); // NOI18N
        day_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        month_combo.setFont(new java.awt.Font("Arvo", 1, 12)); // NOI18N
        month_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));

        year_combo.setFont(new java.awt.Font("Arvo", 1, 12)); // NOI18N
        year_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        address_text_area.setColumns(20);
        address_text_area.setRows(5);
        jScrollPane1.setViewportView(address_text_area);

        register_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        register_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "MOBILE", "GENDER", "DOB", "ADDRESS", "TERMS&CONDITIONS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        register_table.setMinimumSize(new java.awt.Dimension(105, 700));
        register_table.setRowHeight(35);
        jScrollPane2.setViewportView(register_table);

        hide_data.setBackground(new java.awt.Color(153, 153, 153));
        hide_data.setFont(new java.awt.Font("Arvo", 1, 12)); // NOI18N
        hide_data.setText("Hide Table Data");
        hide_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hide_dataActionPerformed(evt);
            }
        });

        view_data.setBackground(new java.awt.Color(153, 153, 0));
        view_data.setFont(new java.awt.Font("Arvo", 1, 12)); // NOI18N
        view_data.setText("View table Data");
        view_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(day_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mobile_space, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_space, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(terms)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(year_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(male_check, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(female_check, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(view_data, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hide_data, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_space, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(mobile_space, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gender)
                                .addComponent(male_check))
                            .addComponent(female_check))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dob)
                            .addComponent(day_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terms, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(reset)
                    .addComponent(hide_data)
                    .addComponent(view_data))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
         try 
  {
      String url = "jdbc:mysql://localhost:3306/oop2_cat2?autoReconnect=true&useSSL=false";
      String user = "root";
      String password = "";
      Connection con = DriverManager.getConnection(url, user, password);
      String query = "INSERT INTO register (name, mobile, gender, dob, address, terms) VALUES (?, ?, ?, ?, ?, ?)";
      PreparedStatement ready = con.prepareStatement(query);
      ready.setString(1, name_space.getText());
      ready.setString(2, mobile_space.getText());
      
      if (male_check.isSelected()) {
        ready.setString(3, "Male");
        } else if (female_check.isSelected()) {
            ready.setString(3, "Female");
        } else {
            //neither radio button is selected
            // default value handles in sql
        }

      
      // Get selected values from masaa combo boxes
        String selectedDay = day_combo.getSelectedItem().toString();
        String selectedMonth = month_combo.getSelectedItem().toString();
        String selectedYear = year_combo.getSelectedItem().toString();

        // Concatenate the values into a string
        String dobValue = selectedDay + " " + selectedMonth + " " + selectedYear;

        // Set the string value in the PreparedStatement
        ready.setString(4, dobValue);


        // ready.setString(4, dob.getText());
        ready.setString(5, address_text_area.getText());
        ready.setString(6, terms.isSelected() ? "Accepted" : "Not Accepted");

        ready.executeUpdate();
   
    
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e);
    }
    
    }//GEN-LAST:event_submitActionPerformed

    private void resetFields() {
    name_space.setText("");
    mobile_space.setText("");
    male_check.setSelected(false);
    female_check.setSelected(false);
    day_combo.setSelectedIndex(0);
    month_combo.setSelectedIndex(0);
    year_combo.setSelectedIndex(0);
    address_text_area.setText("");
    terms.setSelected(false);
}

    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_resetActionPerformed

    private void termsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termsActionPerformed

    private void female_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female_checkActionPerformed

    private void hide_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hide_dataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) register_table.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_hide_dataActionPerformed

    private void view_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_dataActionPerformed
        // TODO add your handling code here:
        try {
    String url = "jdbc:mysql://localhost:3306/oop2_cat2?autoReconnect=true&useSSL=false";
    String user = "root";
    String password = "";
    Connection con = DriverManager.getConnection(url, user, password);
    String query = "SELECT * from register";
    PreparedStatement ready = con.prepareStatement(query);
    
    ResultSet resultSet = ready.executeQuery();

    // Get the table model of your JTable
    DefaultTableModel model = (DefaultTableModel) register_table.getModel();
    
    // Clear existing rows
    model.setRowCount(0);

    while (resultSet.next()) {
        String id = resultSet.getString("id");
        String name = resultSet.getString("name");
        String mobile = resultSet.getString("mobile");
        String gender = resultSet.getString("gender");
        String dob = resultSet.getString("dob");
        String address = resultSet.getString("address");
        String terms = resultSet.getString("terms");

        // Add a new row to the Table
        model.addRow(new Object[]{id, name, mobile, gender, dob, address, terms});
    }

    resultSet.close();
    ready.close();
    con.close();

} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, e);
}

    }//GEN-LAST:event_view_dataActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_text_area;
    private javax.swing.JComboBox<String> day_combo;
    private javax.swing.JLabel dob;
    private javax.swing.JRadioButton female_check;
    private javax.swing.JLabel gender;
    private javax.swing.JButton hide_data;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male_check;
    private javax.swing.JTextField mobile_space;
    private javax.swing.JComboBox<String> month_combo;
    private javax.swing.JTextField name_space;
    private javax.swing.JTable register_table;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox terms;
    private javax.swing.JButton view_data;
    private javax.swing.JComboBox<String> year_combo;
    // End of variables declaration//GEN-END:variables
}
