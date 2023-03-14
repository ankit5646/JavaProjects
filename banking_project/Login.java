package banking_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

 JButton login, clear, signup;
 JTextField cardTextField;
 JPasswordField PINTextField;

Login() {
setTitle("Automatic Teller Machine");

setLayout(null);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/logo.jpg"));
Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel label = new JLabel(i3);
label.setBounds(70, 10, 100,100);

add(label);

JLabel text = new JLabel("Welocome to ATM");
text.setFont(new Font("Osward", Font.BOLD, 38));
text.setBounds(200,40,400,40);
add(text);

JLabel cardno = new JLabel("Card number:");
cardno.setFont(new Font("Raleway", Font.BOLD, 28));
cardno.setBounds(90,150,250,30);
add(cardno);

cardTextField = new JTextField();
cardTextField.setBounds(320, 150, 250, 30);
cardTextField.setFont(new Font("Arial",Font.BOLD, 16));
add(cardTextField);

JLabel password = new JLabel("Enter PIN:");
password.setFont(new Font("Raleway", Font.BOLD, 28));
password.setBounds(90,220,375,30);
add(password);

PINTextField = new JPasswordField();
PINTextField.setBounds(320, 220, 250, 30);
add(PINTextField);

login = new JButton("SIGN IN");
login.setBounds(320, 300, 100, 30);
login.addActionListener(this);
add(login);
// login.setBackground(Color.BLACK);
// login.setForeground(Color.WHITE);


clear = new JButton("CLEAR");
clear.setBounds(450, 300, 100, 30);
clear.addActionListener(this);
add(clear);

signup = new JButton("SIGN UP");
signup.setBounds(325, 340, 220, 30);
signup.addActionListener(this);
add(signup);

getContentPane().setBackground(Color.WHITE);

setSize(800,480);
setVisible(true);
setLocation(350,200);
}

public void actionPerformed(ActionEvent ae){
 if(ae.getSource()== clear){
cardTextField.setText("");
PINTextField.setText("");
 } else if(ae.getSource()==signup){

 }
 else if(ae.getSource()==login) {

 }
}
    public static void main( String[]args){
   new Login();

    }
}
