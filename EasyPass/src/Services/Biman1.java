/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Services;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;




import EasyPass1.Welcome;

/**
 *
 * @author Mezbah Uddin
 */
public class Biman1 extends javax.swing.JFrame {

    /**
     * Creates new form Biman1
     */
    public Biman1() {
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

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        gneder = new javax.swing.JLabel();
        takeof = new javax.swing.JLabel();
        landing = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        tgender = new javax.swing.JTextField();
        ttakeof = new javax.swing.JTextField();
        tlanding = new javax.swing.JTextField();
        tdate = new javax.swing.JTextField();
        bback = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 750, 500));

        jPanel1.setLayout(null);

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        jPanel1.add(name);
        name.setBounds(40, 40, 110, 30);

        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");
        jPanel1.add(email);
        email.setBounds(40, 100, 50, 30);

        gneder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gneder.setForeground(new java.awt.Color(255, 255, 255));
        gneder.setText("Gender");
        jPanel1.add(gneder);
        gneder.setBounds(40, 160, 70, 30);

        takeof.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        takeof.setForeground(new java.awt.Color(255, 255, 255));
        takeof.setText("Take OF");
        jPanel1.add(takeof);
        takeof.setBounds(410, 40, 70, 20);

        landing.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        landing.setForeground(new java.awt.Color(255, 255, 255));
        landing.setText("Landing");
        jPanel1.add(landing);
        landing.setBounds(410, 110, 70, 21);

        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");
        jPanel1.add(date);
        date.setBounds(420, 170, 60, 30);
        jPanel1.add(tname);
        tname.setBounds(150, 40, 210, 30);
        jPanel1.add(temail);
        temail.setBounds(150, 100, 210, 30);
        jPanel1.add(tgender);
        tgender.setBounds(150, 160, 210, 30);
        jPanel1.add(ttakeof);
        ttakeof.setBounds(500, 40, 230, 30);
        jPanel1.add(tlanding);
        tlanding.setBounds(500, 110, 230, 30);
        jPanel1.add(tdate);
        tdate.setBounds(500, 170, 230, 30);

        bback.setBackground(new java.awt.Color(6, 6, 68));
        bback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bback.setForeground(new java.awt.Color(255, 255, 255));
        bback.setText("Back");
        bback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });
        jPanel1.add(bback);
        bback.setBounds(100, 425, 120, 30);

        jButton1.setBackground(new java.awt.Color(6, 6, 68));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 425, 130, 30);

        jButton2.setBackground(new java.awt.Color(6, 6, 68));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(600, 420, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Services/Untitled design (3).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tname.setText("");
        temail.setText(" ");
        tgender.setText("");
        tdate.setText("");
        ttakeof.setText("");
        tlanding.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
         new Welcome().setVisible(true);
         dispose();
    }//GEN-LAST:event_bbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String Name = tname.getText();
    //String Email = temail.getText();
    //String Gender = tgender.getText();
    //String Landing = tlanding.getText();
    //String TakeOf = ttakeof.getText();
   // String Date = tdate.getText();
      String name = tname.getText();
    String email = temail.getText();
    String gender = tgender.getText();
    String landing = tlanding.getText();
    String takeoff = ttakeof.getText();
    String date = tdate.getText();

    // Create a confirmation message with the user-provided data
    String confirmMessage = "Name: " + name + "\nEmail: " + email + "\nGender: " + gender
            + "\nLanding: " + landing + "\nTakeOff: " + takeoff + "\nDate: " + date;

    int choice = JOptionPane.showConfirmDialog(rootPane, "Please confirm the following information:\n\n" + confirmMessage, "Confirm Data", JOptionPane.YES_NO_OPTION);
       

    String DateText = tdate.getText();
    
    //JOptionPane.showMessageDialog(null,  "Name : "+tname.getText());
    
    // Use SimpleDateFormat to parse the String into a java.util.Date
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date utilDate;
    try {
        utilDate = sdf.parse(DateText);
        
        // Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        try {
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ilog_in", "root", "root");

            String insertSQL = "INSERT INTO biman1 (Name, Email, Gender, Landing, TakeOff, Date) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insertSQL);

           preparedStatement.setString(1, tname.getText());
        preparedStatement.setString(2, temail.getText());
        preparedStatement.setString(3, tgender.getText()); 
        preparedStatement.setString(4, tlanding.getText());
        preparedStatement.setString(5, ttakeof.getText());
        preparedStatement.setString(6, tdate.getText()); // Set the SQL Date

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(rootPane, "Data inserted successfully!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Data insertion failed.");
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Biman1.class.getName()).log(Level.SEVERE, null, ex);
        }
    } catch (java.text.ParseException e) {
        // Handle parsing exception, e.g., display an error message
        JOptionPane.showMessageDialog(rootPane, "Invalid date format. Please enter a date in yyyy-MM-dd format.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Biman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biman1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JLabel date;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gneder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel landing;
    private javax.swing.JLabel name;
    private javax.swing.JLabel takeof;
    private javax.swing.JTextField tdate;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tgender;
    private javax.swing.JTextField tlanding;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField ttakeof;
    // End of variables declaration//GEN-END:variables
}
