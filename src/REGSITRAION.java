
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BHAVUK
 */
public class REGSITRAION extends javax.swing.JFrame {
String sql;   
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
 static final String DB_URL = "jdbc:mysql://localhost:3306/authenticate";
 // Database credentials
 static final String USER = "root";
 static final String PASS = "Bhavuk@123";
 String ousername;
 String opassword;
 int flag =0 ;
 int flat = 0;
 long count=0;
 long num = 0 ;
 /**
     * Creates new form REGSITRAION
     */
    public REGSITRAION() {
        initComponents();
        setSize(815,770);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        t10 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 140, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("TITLE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 190, 50, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("INSTITUTION NAME ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 230, 176, 21);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("HOSTEL NAME");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 270, 127, 21);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("ROOM NUMBER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 320, 136, 21);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("EMAIL");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 370, 57, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("PHONE NUMBER");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 420, 142, 21);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(420, 140, 90, 30);
        getContentPane().add(t3);
        t3.setBounds(420, 230, 170, 30);
        getContentPane().add(t4);
        t4.setBounds(420, 270, 90, 30);

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5);
        t5.setBounds(420, 320, 90, 30);
        getContentPane().add(t2);
        t2.setBounds(510, 140, 90, 30);
        getContentPane().add(t6);
        t6.setBounds(420, 370, 160, 30);

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        getContentPane().add(t7);
        t7.setBounds(420, 410, 110, 30);

        jLabel10.setText("FIRST NAME");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(420, 170, 80, 17);

        jLabel11.setText("LAST NAME");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 170, 70, 17);

        jLabel13.setText("ex :- BH-1");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(430, 300, 90, 17);

        jLabel14.setText("ex :- 703-C");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(430, 350, 70, 17);

        jLabel15.setText("ex :- 9089786756");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(420, 440, 120, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr", "Mr", "Mrs", "Ms" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(420, 190, 80, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("REGISTRATION NUMBER");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 470, 213, 50);
        getContentPane().add(t8);
        t8.setBounds(420, 470, 110, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RETURN");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 650, 100, 50);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RESET");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 650, 100, 50);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SUBMIT");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 650, 100, 50);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(540, 320, 70, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("PASSWORD");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(180, 530, 220, 20);
        getContentPane().add(t9);
        t9.setBounds(420, 520, 110, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nick Name ?", "First School Name ?", "First Pet Name ?" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(420, 560, 250, 30);
        getContentPane().add(t10);
        t10.setBounds(420, 600, 120, 30);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("ANSWER");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(180, 600, 120, 30);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("SECURITY QUESTION");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(180, 570, 210, 21);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRATION FORM");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 30, 260, 30);

        jLabel21.setText("_");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(520, 320, 40, 20);

        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel20);
        jLabel20.setBounds(240, 20, 300, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whatsapp web 3.PNG"))); // NOI18N
        jLabel18.setText("jLabel18");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(100, 110, 610, 530);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_button.png"))); // NOI18N
        jButton7.setToolTipText("EXIT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(770, 10, 40, 40);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("* Passowrd Must Contain Minimum Of 8 characters.");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(100, 710, 530, 17);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("**** Registeration Number Should be in block letters.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(100, 750, 330, 20);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("*** Please Fill all the Entries.");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(100, 730, 370, 30);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("** Mobile Number should be of 10 digits.");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(100, 720, 270, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 180, 820, 370);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black wallpaper.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 540, 840, 240);

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 0, 820, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try {
    String fname = t1.getText();
    String lname = t2.getText();
    String title = (String)jComboBox1.getSelectedItem();
    String i_name = t3.getText();
    String h_name = t4.getText();
    String room_no1 = (String)jComboBox2.getSelectedItem();
    String room_no = t5.getText();
    String email = t6.getText();
    long   phone = Long.parseLong(t7.getText());
    String reg_no = t8.getText();
    String password = t9.getText();
    String security = (String)jComboBox3.getSelectedItem();
    String answer = t10.getText();
    room_no = room_no+"-"+room_no1;
    System.out.println(title);
    if(fname.equals("") || lname.equals("") || i_name.equals("") || h_name.equals("") || room_no.equals("") || email.equals("") || reg_no.equals("") ||password.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Field cannot be left blank");
            }
 Connection con = DriverManager.getConnection(DB_URL,"root","Bhavuk@123");
 Statement stmt = con.createStatement();
 num = phone;
 while(num!=0)
 {
     num = num/10;
     count++;
 }
 System.out.println(count);
 if(password.length()<8)
        {
            JOptionPane.showMessageDialog(null,"Password should be of  more than 8 character..");
           
        }
 else if(count <= 10)
        {
            JOptionPane.showMessageDialog(null,"Please Enter Valid Phone Number..");
            count = 0;
        }
 else
        {
            PreparedStatement ps = con.prepareStatement("insert into student_details values('"+fname+"','"+lname+"','"+title+"','"+i_name+"','"+h_name+"','"+room_no+"','"+email+"','"+phone+"','"+reg_no+"','"+password+"','"+security+"','"+answer+"');");     
            int status = ps.executeUpdate();
            
            if(status != 0 )
                {
                    flat =1;    
                    JOptionPane.showMessageDialog(null,"Registration Completed..You will be redirected to Dashboard");
                
stmt.close();
con.close();
if(flat==1)
{
new Dashboard().setVisible(true);
dispose();
}
}
}
}
 
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(null,"Please Check your Entries");
     System.out.println(e);
 }   

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
t1.setText("");
t1.requestFocus(true);
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");



// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Dashboard().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(REGSITRAION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGSITRAION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGSITRAION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGSITRAION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGSITRAION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}