import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class LoginFrom extends JFrame {
    
    private JLabel userLabel,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton LoginButton,ClearButton;
    private Container c;
    private Font f;
    LoginFrom(){
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setBounds(100,50,420,350);
      this.setTitle("Login Demo");
      
      c = this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.MAGENTA);
      f = new Font("Arial",Font.BOLD,18);
      
      userLabel = new JLabel("User Name : ");
      userLabel.setBounds(50, 50, 150, 50);
      userLabel.setFont(f);
      c.add(userLabel);
      
      
      tf = new JTextField();
      tf.setFont(f);
      tf.setBounds(170, 50, 200, 50);
      c.add(tf);
      
      
        passLabel = new JLabel("Password : ");
      passLabel.setBounds(50, 120, 150, 50);
      passLabel.setFont(f);
      c.add(passLabel);
      
      pf = new JPasswordField();
      pf.setFont(f);
      pf.setBounds(170, 120, 200, 50);
      pf.setEchoChar('*');
      c.add(pf);
      
      
      LoginButton = new JButton("Login");
      LoginButton.setBounds(170, 190, 90, 50);
      LoginButton.setFont(f);
      c.add(LoginButton);
      
      ClearButton = new JButton("Clear");
      ClearButton.setBounds(280, 190, 90, 50);
      ClearButton.setFont(f);
      c.add(ClearButton);
      
      
      ClearButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            tf.setText("");
            pf.setText("");
          }
      
      });
      
      LoginButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
           
              String userName = tf.getText();
              String password = pf.getText();
              
              if(userName.equals("Mezbah") && password.equals("123"))
              {
               JOptionPane.showMessageDialog(null,  "You are successfully Loged in");
               
               NewFrame frame = new NewFrame();
               frame.setVisible(true);
              }
              
             else 
              {
                  JOptionPane.showMessageDialog(null,  "Invalid user name or password");
              }
          }
      
      });
    }
              
    
    public static void main(String[] args) {
        LoginFrom frame = new LoginFrom();
        frame.setVisible(true);
    }
 
}
