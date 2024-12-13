
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class RegistrationForm extends JFrame {
    private JLabel RgistrationLabel, NameLabel,EmailLabel,PassLabel,ConfirmPassLabel;
    private JTextField tf;
    private JTextField tff;
    private JPasswordField pf;
    private JPasswordField pff;
    private JButton RegisterButton;
    private Container c;
    private Font f;
    
    RegistrationForm(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 600, 800);
        this.setTitle(" \t     Registraton From");
        
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        f = new Font("Arial",Font.BOLD,18);
        
        RgistrationLabel = new JLabel(" Rgistration From ");
        RgistrationLabel.setBounds(250, 10, 200, 50);
        RgistrationLabel.setFont(f);
        c.add(RgistrationLabel);
        
        
        
        NameLabel = new JLabel("Name : ");
        NameLabel.setBounds(50, 100, 150, 50);
        NameLabel.setFont(f);
        c.add(NameLabel);
        
        tff = new JTextField();
        tff.setFont(f);
        tff.setBounds(270, 100, 200, 50);
        c.add(tff);
        
        
        
         EmailLabel = new JLabel("Email : " );
        EmailLabel.setBounds(50, 170, 150, 50);
        EmailLabel.setFont(f);
        c.add(EmailLabel);
        
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(270, 170, 200, 50);
        c.add(tf);
        
        
         PassLabel = new JLabel("Password : ");
      PassLabel.setBounds(50, 240, 150, 50);
      PassLabel.setFont(f);
      c.add(PassLabel);
      
      pf = new JPasswordField();
      pf.setFont(f);
      pf.setBounds(270, 240, 200, 50);
      pf.setEchoChar('*');
      c.add(pf);
      
      
      ConfirmPassLabel = new JLabel("Confirm : ");
      ConfirmPassLabel.setBounds(50, 310, 150, 50);
      ConfirmPassLabel.setFont(f);
      c.add(ConfirmPassLabel);
      
      pff = new JPasswordField();
      pff.setFont(f);
      pff.setBounds(270, 310, 200, 50);
      pff.setEchoChar('*');
      c.add(pff);
        
      RegisterButton = new JButton("Register");
      RegisterButton.setBounds(220, 400, 150, 50);
      RegisterButton.setFont(f);
      c.add(RegisterButton);
      
      //&& Email.equals("mezbah203@gmail.com") && Confirm.equals("123")
       RegisterButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
           
              String Name = tff.getText();
              String Password = pf.getText();
              String Email = tf.getText();
              String Confirm = pff.getText();
              
              if(Name.equals("Mezbah") && Email.equals("mezbah203@gmail.com")  && Password.equals("123") && Confirm.equals("123") )
              {
               JOptionPane.showMessageDialog(null,  "Successfully Register");
               
             
              }
              
             else 
              {
                  JOptionPane.showMessageDialog(null,  "Invalid user name or password");
              }
          }
      
      });
        
    }
    
    public static void main(String[] args) {
       RegistrationForm reg = new RegistrationForm();
       reg.setVisible(true);
    }
    
    
    
    
    
    
}
