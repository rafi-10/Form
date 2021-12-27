package pack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class RegisterForm extends JFrame {

    public RegisterForm(){
        setTitle("Rafibai");
        setSize(500,460);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = (new Font("Arial", Font.BOLD,16));

        JPanel headerpanel1 = new JPanel();
        headerpanel1.setBackground(Color.PINK);
        headerpanel1.setBounds(5,5,490,60);
        add(headerpanel1);

        JLabel headerTxt = new JLabel("Registration Form");
        headerTxt.setFont(new Font("Arial", Font.BOLD,30));
        headerpanel1.add(headerTxt);

        JPanel inputpanel = new JPanel();
        inputpanel.setBackground(new Color(199,227,240));
        inputpanel.setBounds(5,70,490,425);
        inputpanel.setLayout(null);
        add(inputpanel);

        ///NameField
        JLabel namelabel = new JLabel("Name  :");
        namelabel.setBounds(130,5,100,25);
        namelabel.setFont(labelFont);
        inputpanel.add(namelabel);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200,5,200,25);
        nameTxt.setFont(labelFont);
        inputpanel.add(nameTxt);

        ///EmailField
        JLabel emaillabel = new JLabel("Email  :");
        emaillabel.setBounds(130,50,100,25);
        emaillabel.setFont(labelFont);
        inputpanel.add(emaillabel);

        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(200,50,200,25);
        emailTxt.setFont(labelFont);
        inputpanel.add(emailTxt);

        ///PasswordField
        JLabel passlabel = new JLabel("Password  :");
        passlabel.setBounds(95,100,100,25);
        passlabel.setFont(labelFont);
        inputpanel.add(passlabel);

        JTextField passTxt = new JTextField();
        passTxt.setBounds(200,100,200,25);
        passTxt.setFont(labelFont);
        inputpanel.add(passTxt);

        ///Confirm PasswordField
        JLabel conPasslabel = new JLabel("Confirm Password  :");
        conPasslabel.setBounds(30,150,170,25);
        conPasslabel.setFont(labelFont);
        inputpanel.add(conPasslabel);

        JTextField conPassTxt = new JTextField();
        conPassTxt.setBounds(200,150,200,25);
        conPassTxt.setFont(labelFont);
        inputpanel.add(conPassTxt);

        ///MobileField
        JLabel mobilelabel = new JLabel("Mobile  :");
        mobilelabel.setBounds(120,200,100,25);
        mobilelabel.setFont(labelFont);
        inputpanel.add(mobilelabel);

        JTextField mobileTxt = new JTextField();
        mobileTxt.setBounds(200,200,200,25);
        mobileTxt.setFont(labelFont);
        inputpanel.add(mobileTxt);

        ////AddressField
        JLabel addresslabel = new JLabel("Address  :");
        addresslabel.setBounds(110,250,100,25);
        addresslabel.setFont(labelFont);
        inputpanel.add(addresslabel);

        JTextField addressTxt = new JTextField();
        addressTxt.setBounds(200,250,200,25);
        addressTxt.setFont(labelFont);
        inputpanel.add(addressTxt);

        JButton regBtn = new JButton("Register");
        regBtn.setBounds(300,300,100,30);
        regBtn.setBackground(new Color(219,143,160));
        regBtn.setFont(labelFont);
        regBtn.setForeground(Color.WHITE);
        regBtn.setBorder(new LineBorder(Color.RED));
        //regBtn.setRequestFocusEnabled(false);
        regBtn.setFocusable(false);
        inputpanel.add(regBtn);

        JButton logBtn = new JButton("Login");
        logBtn.setBounds(100,300,100,30);
        logBtn.setBackground(new Color(93,161,217));
        logBtn.setFont(labelFont);
        logBtn.setForeground(Color.WHITE);
        logBtn.setBorder(new LineBorder(Color.BLUE));
        //logBtn.setRequestFocusEnabled(false);
        logBtn.setFocusable(false);
        inputpanel.add(logBtn);

        setVisible(true);

        logBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginForm();

            }
        });
        regBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nameTxt.getText();
                String email = emailTxt.getText();
                String pass = passTxt.getText();
                String conPass = conPassTxt.getText();
                String mobile = mobileTxt.getText();
                String address = addressTxt.getText();

                DbConnect db = new DbConnect();
                String queryInsert = "INSERT INTO `aboutus`(`username`, `password`, `email`, `mobile`, `address`) VALUES ('" + userName + "','" + email + "','" + pass + "','" + mobile + "','" + address + "')";
                db.RegisterInsert(queryInsert);
            }
        });
    }
}






