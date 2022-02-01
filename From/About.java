package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class About extends JFrame {
    JTextArea t;
    JButton b;

    About(){

        setTitle("About US");
        setSize(650,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font f = new Font("Candara",Font.ITALIC,15);

        b = new JButton("EXIT");
        b.setBounds(500,380,80,50);
        b.setFocusable(false);
        b.setBackground(new Color(132,123,166));
        add(b);



        t = new JTextArea(5,20);
        t.setLineWrap(true);
        t.setFont(f);
        //t.setEnabled(false);
        t.setText("We all are aware about restaurants around us."+
                " But we are not aware of how a restaurant can be manage" +
                " effectively. We found out that in our University’s canteen," +
                " there is no management system available. As a result, we decided" +
                " to make this project so that our canteen’s staff can manage our" +
                " canteen more efficiently and effortlessly. The main reason for our" +
                " project is to reduce human effort. With this project, canteen’s staff" +
                " can easily check which items they have in stock, can effortlessly make" +
                " a bill for an order which is only one click away. Our project will be" +
                " user-friendly. For that, anyone can easily get used to this project" +
                " without any problems. Even though our project is comparatively small," +
                " it has the potential to grow bigger. With right amount of time and manpower," +
                " we can extend this project even further. We can enrich our project with" +
                " more features added in the near future. Some of these features are described" +
                " below, We can add online payment system for faster transaction, We will add" +
                " food review option, We will connect our project with a printer for printing receipt for orders.\n\n\n"+


                "WE----\n" +
                "Abdullah Al Masrur \n" +
                "Leading University\n" +
                "Email: cse_2012020255@lus.ac.bd\n\n"+

                "Md. Jafrul Haque Rafi\n"+
                "Leading University\n"+
                "Email: cse_2012020259@lus.ac.bd");
        t.setBounds(0,10,600,500);
        add(t);


        setVisible(true);

        b.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
