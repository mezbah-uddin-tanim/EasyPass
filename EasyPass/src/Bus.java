
import EasyPass1.Welcome;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mezbah Uddin
 */
public class Bus extends javax.swing.JFrame {

    /**
     * Creates new form Bus
     */
    public Bus() {
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
        phone = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        tphone = new javax.swing.JTextField();
        tgender = new javax.swing.JTextField();
        tdate = new javax.swing.JTextField();
        tfrom = new javax.swing.JTextField();
        tto = new javax.swing.JTextField();
        bback = new javax.swing.JButton();
        bsubmit = new javax.swing.JButton();
        bcancel = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setText("Name");
        jPanel1.add(name);
        name.setBounds(40, 20, 90, 21);

        phone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phone.setText("Phone");
        jPanel1.add(phone);
        phone.setBounds(40, 60, 70, 21);

        gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gender.setText("Gender");
        jPanel1.add(gender);
        gender.setBounds(30, 110, 70, 21);

        date.setBackground(new java.awt.Color(0, 0, 51));
        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        date.setText("Date");
        jPanel1.add(date);
        date.setBounds(350, 100, 60, 30);

        from.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        from.setText("From");
        jPanel1.add(from);
        from.setBounds(350, 20, 80, 21);

        to.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        to.setText("To");
        jPanel1.add(to);
        to.setBounds(360, 60, 21, 21);

        tname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tname);
        tname.setBounds(110, 18, 210, 30);

        tphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tphone);
        tphone.setBounds(110, 60, 210, 30);

        tgender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tgender);
        tgender.setBounds(110, 100, 210, 30);

        tdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tdate);
        tdate.setBounds(420, 100, 210, 30);

        tfrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfrom);
        tfrom.setBounds(420, 20, 210, 30);

        tto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tto);
        tto.setBounds(420, 60, 210, 30);

        bback.setBackground(new java.awt.Color(51, 51, 51));
        bback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bback.setForeground(new java.awt.Color(255, 255, 255));
        bback.setText("Back");
        bback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });
        jPanel1.add(bback);
        bback.setBounds(70, 350, 80, 25);

        bsubmit.setBackground(new java.awt.Color(51, 51, 51));
        bsubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bsubmit.setForeground(new java.awt.Color(255, 255, 255));
        bsubmit.setText("Submit");
        bsubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(bsubmit);
        bsubmit.setBounds(260, 350, 90, 30);

        bcancel.setBackground(new java.awt.Color(51, 51, 51));
        bcancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bcancel.setForeground(new java.awt.Color(255, 255, 255));
        bcancel.setText("Cancel");
        bcancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });
        jPanel1.add(bcancel);
        bcancel.setBounds(500, 350, 80, 30);

        jLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Services/bus1.jpg"))); // NOI18N
        jLabel.setText("To");
        jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel);
        jLabel.setBounds(0, 0, 640, 427);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        tname.setText("");
        tphone.setText(" ");
        tgender.setText("");
        tdate.setText("");
        tfrom.setText("");
        tto.setText("");
    }//GEN-LAST:event_bcancelActionPerformed

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
       new Welcome().setVisible(true);
    }//GEN-LAST:event_bbackActionPerformed

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed
        
       String text = tname.getText() + "\n" +
                      tphone.getText() + "\n" +
                      tgender.getText() + "\n" +
                      tfrom.getText() + "\n" +
                      tto.getText() + "\n" +
                      tdate.getText();

        JOptionPane.showMessageDialog(this, text, "Your Ticket", JOptionPane.INFORMATION_MESSAGE);

        //try {
            // Parse the date using SimpleDateFormat
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //java.util.Date utilDate = sdf.parse(tdate.getText());

            // Convert java.util.Date to java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            // Connect to the MySQL database
           // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ilog_in", "root", "root");

            //String insertSQL = "INSERT INTO `bus` (`Name`, `Phone`, `Gender`, `From`, `To`, `Date`) VALUES (?, ?, ?, ?, ?, ?)";
           // PreparedStatement preparedStatement = conn.prepareStatement(insertSQL);

           // preparedStatement.setString(1, tname.getText());
           // preparedStatement.setString(2, tphone.getText());
           // preparedStatement.setString(3, tgender.getText());
           // preparedStatement.setString(4, tfrom.getText());
           // preparedStatement.setString(5, tto.getText());
           // preparedStatement.setDate(6, sqlDate);

           // int rowsAffected = preparedStatement.executeUpdate();

            //if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data inserted successfully!");
           // } else {
                JOptionPane.showMessageDialog(this, "Data insertion failed.");
           // }

            // Close the database connection
           // conn.close();
       // } catch (SQLException | ParseException ex) {
            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_bsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bsubmit;
    private javax.swing.JLabel date;
    private javax.swing.JLabel from;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField tdate;
    private javax.swing.JTextField tfrom;
    private javax.swing.JTextField tgender;
    private javax.swing.JTextField tname;
    private javax.swing.JLabel to;
    private javax.swing.JTextField tphone;
    private javax.swing.JTextField tto;
    // End of variables declaration//GEN-END:variables
}
