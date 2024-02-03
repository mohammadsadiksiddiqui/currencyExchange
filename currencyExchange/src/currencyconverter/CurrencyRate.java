/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;

/**
 *
 * @author moham
 */
public class CurrencyRate extends javax.swing.JFrame {
    java.util.Date date;
    java.sql.Date sqlDate;
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    public CurrencyRate() {
        initComponents();
        con=DBConnection.getConnection();
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
        jLabel7 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        fromCurrencyCMB = new javax.swing.JComboBox<>();
        toCurrencyCMB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        converBTN = new javax.swing.JButton();
        amtTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        convAmtTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        commissionTF = new javax.swing.JTextField();
        payAmtTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        mobileTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        adharTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Date = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel9.setText("CuRRency Converter");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Developed  by Ayesha Khan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fromCurrencyCMB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fromCurrencyCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Currency", "Indian Rupee", "US Dollar", "Afghani", "Armenian Dram", "Bangladeshi Taka", "Cambodian Riel", "Chinese Yuan", "Georgian Lari", "Hong Kong Dollar", "Indonesian Rupiah", "Japanese Yen", "Kazakhstani Tenge", "Lao Kip", "Malaysian Ringgit", "South Korean Won", "Sri Lankan Rupee", "Maldivian Rufiyaa", "Pakistani Rupee", "Philippine Peso", "Thai Baht", "Taiwanese Dollar", "Vietnamese Dong", "Bahraini Dinar", "Emirati Dirham", "Saudi Arabian Riyal", "Omani Rial", "Israeli Shekel", "Iraqi Dinar", "Iranian Rial", "kuwaiti Dinar", "Lebanese Pound", "Qatari Riyal", "Libyan Dinar", "Bosnian Convertible Marka", "Euro", "Bulgarian Lev", "Czech Koruna", "Croatian Kuna", "Danish Krone", "Hungarian Forint", "Moldovan Leu", "Macedonian Denar", "Polish Zloty", "Romanian Leu", "Serbian Denar", "Russian Ruble", "Norwegian Krone", "Swedish Krona", "Swiss Franc", "Turkish Lira", "Ukranian Hryvnia", "British Pound" }));
        fromCurrencyCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromCurrencyCMBActionPerformed(evt);
            }
        });
        bg.add(fromCurrencyCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, 50));

        toCurrencyCMB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toCurrencyCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Currency", "Indian Rupee", "US Dollar", "Afghani", "Armenian Dram", "Bangladeshi Taka", "Cambodian Riel", "Chinese Yuan", "Georgian Lari", "Hong Kong Dollar", "Indonesian Rupiah", "Japanese Yen", "Kazakhstani Tenge", "Lao Kip", "Malaysian Ringgit", "South Korean Won", "Sri Lankan Rupee", "Maldivian Rufiyaa", "Pakistani Rupee", "Philippine Peso", "Thai Baht", "Taiwanese Dollar", "Vietnamese Dong", "Bahraini Dinar", "Emirati Dirham", "Saudi Arabian Riyal", "Omani Rial", "Israeli Shekel", "Iraqi Dinar", "Iranian Rial", "Icelandic Krona", "kuwaiti Dinar", "Lebanese Pound", "Qatari Riyal", "Libyan Dinar", "Bosnian Convertible Marka", "Euro", "Bulgarian Lev", "Czech Koruna", "Croatian Kuna", "Danish Krone", "Hungarian Forint", "Icelandic Krona", "Moldovan Leu", "Macedonian Denar", "Polish Zloty", "Romanian Leu", "Serbian Denar", "Russian Ruble", "Norwegian Krone", "Swedish Krona", "Swiss Franc", "Turkish Lira", "Ukranian Hryvnia", "British Pound" }));
        toCurrencyCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCurrencyCMBActionPerformed(evt);
            }
        });
        bg.add(toCurrencyCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, 50));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("TO:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("FROM:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Amount");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        converBTN.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        converBTN.setText("Convert");
        converBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converBTNActionPerformed(evt);
            }
        });
        bg.add(converBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        amtTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amtTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtTFActionPerformed(evt);
            }
        });
        bg.add(amtTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 242, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Convert Amount");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        convAmtTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        convAmtTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convAmtTFActionPerformed(evt);
            }
        });
        bg.add(convAmtTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 242, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Commission");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 158, -1));

        commissionTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        commissionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commissionTFActionPerformed(evt);
            }
        });
        bg.add(commissionTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 242, -1));

        payAmtTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payAmtTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payAmtTFActionPerformed(evt);
            }
        });
        bg.add(payAmtTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 242, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Pay mount");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, -1));

        exitBTN.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        bg.add(exitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        mobileTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobileTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTFActionPerformed(evt);
            }
        });
        bg.add(mobileTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 242, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setText("Mobile");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 54, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setText("Name");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 129, -1, -1));

        nameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        bg.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 242, -1));

        adharTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adharTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adharTFActionPerformed(evt);
            }
        });
        bg.add(adharTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 53, 242, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setText("Adhar No.");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 54, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setText("DOB");
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 129, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 50, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        bg.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 120, 107, -1));

        Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bg.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 125, 242, 35));

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton4.setText("Show all Transfer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        bg.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1300, 600));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("2% Commission will be show here in converted currency");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void payAmtTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payAmtTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payAmtTFActionPerformed

    private void commissionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commissionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commissionTFActionPerformed

    private void convAmtTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convAmtTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convAmtTFActionPerformed

    private void amtTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtTFActionPerformed

    private void converBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converBTNActionPerformed
        String sql="select * from currency_value where currencyname=?";
        int frmCurrencyId=0,toCurrencyId=0;
        float amtValue=0,toCurrencyValue=0,totalValue,com=0;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, fromCurrencyCMB.getSelectedItem().toString());
            rs=pst.executeQuery();
            rs.next();
            if(fromCurrencyCMB.getSelectedIndex()==0||toCurrencyCMB.getSelectedIndex()==0||mobileTF.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"enter customer mobile number and all mandatory fields !!!");
            }else{
                if(fromCurrencyCMB.getSelectedItem().toString().equals(rs.getString("currencyname"))){
                    //System.out.println(fromCurrencyCMB.getSelectedItem().toString());
                    amtValue = (float)(Double.parseDouble(amtTF.getText())*rs.getDouble("currencyvalue"));
                    frmCurrencyId=rs.getInt("currency_id");
                    
                }
                pst.setString(1, toCurrencyCMB.getSelectedItem().toString());
                rs=pst.executeQuery();
                rs.next();
                if(toCurrencyCMB.getSelectedItem().toString().equals(rs.getString("currencyname"))){
                    toCurrencyValue =  (float)rs.getDouble("currencyvalue");
                    toCurrencyId=rs.getInt("currency_id");
                }
                totalValue=amtValue/toCurrencyValue;

                convAmtTF.setText(String.valueOf(totalValue));
                com=(totalValue/100)*2;
                commissionTF.setText(String.valueOf(com));
                payAmtTF.setText(String.valueOf(totalValue-com));
                sql="insert into transfer(customer_mobile, from_currency_id,to_currency_id) values(?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, mobileTF.getText());
                pst.setInt(2, frmCurrencyId);
                pst.setInt(3, toCurrencyId);
                pst.execute();
                
                 sql="insert into commission(customer_mobile, commission_amount) values(?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, mobileTF.getText());
                pst.setDouble(2, com);
                pst.execute();
                
            }

            //System.out.println(amtValue);

        } catch (SQLException ex) {
            Logger.getLogger(CurrencyRate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_converBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        amtTF.setText("");
        convAmtTF.setText("");
        fromCurrencyCMB.setSelectedIndex(0);
        toCurrencyCMB.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void toCurrencyCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCurrencyCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toCurrencyCMBActionPerformed

    private void fromCurrencyCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromCurrencyCMBActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_fromCurrencyCMBActionPerformed

    private void mobileTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTFActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void adharTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adharTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adharTFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sql = "select * from customerdetail where mobile = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, mobileTF.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                adharTF.setText(rs.getString("adhar"));
                nameTF.setText(rs.getString("name"));
                Date.setDate(rs.getDate("dob"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CurrencyRate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql="insert into customerdetail (mobile, adhar, name, dob) values(?,?,?,?)";
        if(mobileTF.getText().equals("")||adharTF.getText().equals("")||nameTF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"plz fill complete customer detail!!!");
            
        }else{
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, mobileTF.getText());
                pst.setString(2,adharTF.getText());
                pst.setString(3,nameTF.getText());
                
                date =Date.getDate();
                sqlDate = new java.sql.Date(date.getTime());
                pst.setDate(4, sqlDate);
                pst.execute();
                JOptionPane.showMessageDialog(null,"user detail saved...");
            } catch (SQLException ex) {
                Logger.getLogger(CurrencyRate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AllTransfer at=new AllTransfer(this,true);
        at.show();
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
            java.util.logging.Logger.getLogger(CurrencyRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyRate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField adharTF;
    private javax.swing.JTextField amtTF;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField commissionTF;
    private javax.swing.JTextField convAmtTF;
    private javax.swing.JButton converBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JComboBox<String> fromCurrencyCMB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mobileTF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField payAmtTF;
    private javax.swing.JComboBox<String> toCurrencyCMB;
    // End of variables declaration//GEN-END:variables
}