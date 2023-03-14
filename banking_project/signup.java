package banking_project;
import javax.swing.*;
import java.awt.*;
import java.util.*;

import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.JDateChooser.*;


public class signup extends JFrame {

signup(){

    setLayout(null);

    Random ran= new Random();
    long random= Math.abs((ran.nextLong() % 9000L) + 1000L);

    JLabel formno= new JLabel("APPLICATION FORM NO:" + random );
    formno.setFont(new Font("Raleway",Font.BOLD, 38));
    formno.setBounds(140, 20, 600,40);
    add(formno);

    JLabel personalDetails= new JLabel("Page 1: Personal Details" );
    personalDetails.setFont(new Font("Raleway",Font.BOLD, 25));
    personalDetails.setBounds(290, 80, 800,45);
    add(personalDetails);

    JLabel name= new JLabel("Name:" );
    name.setFont(new Font("Raleway",Font.BOLD, 20));
    name.setBounds(100, 140, 100,30);
    add(name);

    JTextField nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    nameTextField.setBounds(300,140, 400, 30);
    add(nameTextField);
    
    JLabel FName= new JLabel("Father's Name:" );
    FName.setFont(new Font("Raleway",Font.BOLD, 20));
    FName.setBounds(100, 190, 200,30);
    add(FName);

    JTextField fnameTextField = new JTextField();
    fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    fnameTextField.setBounds(300,190, 400, 30);
    add(fnameTextField);

    JLabel dob= new JLabel("DOB:" );
    dob.setFont(new Font("Raleway",Font.BOLD, 20));
    dob.setBounds(100, 240, 200,30);
    add(dob);

    JDateChooser dateChooser = new JDateChooser();
    dateChooser.setBounds(300, 250, 400, 30);
    add(dateChooser);



    JLabel gender= new JLabel("Gender:" );
    gender.setFont(new Font("Raleway",Font.BOLD, 20));
    gender.setBounds(100, 290, 200,30);
    add(gender);

    JRadioButton male= new JRadioButton("Male");
    male.setBounds(300, 290, 100,30);
    add(male);
    
    JRadioButton female= new JRadioButton("Female");
    female.setBounds(400,290,100,30);
    add(female);

    JRadioButton others= new JRadioButton("Others");
    others.setBounds(500,290,100,30);
    add(others);

    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(male);
    genderGroup.add(female);
    genderGroup.add(others);


    JLabel gmail= new JLabel("Gmail:" );
    gmail.setFont(new Font("Raleway",Font.BOLD, 20));
    gmail.setBounds(100, 340, 200,30);
    add(gmail);

    JTextField gmailTextField = new JTextField();
    gmailTextField.setFont(new Font("Raleway",Font.BOLD,14));
    gmailTextField.setBounds(300,340, 400, 30);
    add(gmailTextField);

    JLabel marital= new JLabel("Marital Status:" );
    marital.setFont(new Font("Raleway",Font.BOLD, 20));
    marital.setBounds(100, 390, 200,30);
    add(marital);

    JRadioButton married = new JRadioButton("Married");
    married.setBounds(300,390,100,30);
    add(married);

    JRadioButton unmarried = new JRadioButton("Happy");
    unmarried.setBounds(400,390,100,30);
    add(unmarried);

   JRadioButton divorced = new JRadioButton("Divorced");
   divorced.setBounds(500,390,100,30);
   add(divorced);

   ButtonGroup maritialGroup= new ButtonGroup();
   maritialGroup.add(married);
   maritialGroup.add(unmarried);
   maritialGroup.add(divorced);

    JLabel address= new JLabel("Address:" );
    address.setFont(new Font("Raleway",Font.BOLD, 20));
    address.setBounds(100, 440, 200,30);
    add(address);

    JTextField addressTextField = new JTextField();
    addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
    addressTextField.setBounds(300,440, 400, 30);
    add(addressTextField);

    JLabel city= new JLabel("City:" );
   city.setFont(new Font("Raleway",Font.BOLD, 20));
   city.setBounds(100, 490, 200,30);
    add (city);

    JTextField cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
    cityTextField.setBounds(300,490, 400, 30);
    add(cityTextField);

    JLabel state= new JLabel("State:" );
   state.setFont(new Font("Raleway",Font.BOLD, 20));
   state.setBounds(100, 540, 200,30);
    add (state);

    JTextField stateTextField = new JTextField();
    stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
    stateTextField.setBounds(300,540, 400, 30);
    add(stateTextField);

    JLabel pincode= new JLabel("Pincode:" );
   pincode.setFont(new Font("Raleway",Font.BOLD, 20));
   pincode.setBounds(100, 590, 200,30);
    add (pincode);

    JTextField pincodeTextField = new JTextField();
    pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
    pincodeTextField.setBounds(300,590, 400, 30);
    add(pincodeTextField);

   
    JButton next = new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setFont(new Font("raleway", Font.BOLD,15));
    next.setBounds(400, 700, 100,30);
    add(next);

getContentPane().setBackground(Color.WHITE);

  setSize(850,800);
  setLocation(350, 10);
  setVisible(true);
}

    public static void main(String[]args){
  new signup();
    }
}
