package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class staffList extends JFrame {
    JPanel p1;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;
    DefaultTableModel model;
    JTable table;
    String s1,s2,s3,s4;



    staffList(){
        setTitle("Stuffs List");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        p1 = new JPanel();
        p1.setBounds(0,0,500,500);
        p1.setBackground(new Color(230,230,250));
        p1.setLayout(null);
        add(p1);

        Object data[][] = {{1, "Rifat", "Morning",10}, {2, "Rishad","Night", 1},{3, "Samina","Night", 1}};
        String columnNames[] = {"ID", "Staff Name", "Shift","Salary"};
        model = new DefaultTableModel(data,columnNames);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10,10,460,170);
        p1.add(sp);

        t1 = new JTextField("ID");
        t1.setBounds(100,200,300,35);
        p1.add(t1);

        t2 = new JTextField("Staff Name");
        t2.setBounds(100,250,300,35);
        p1.add(t2);

        t3 = new JTextField("Shift");
        t3.setBounds(100,300,300,35);
        p1.add(t3);

        t4 = new JTextField("Salary");
        t4.setBounds(100,350,300,35);
        p1.add(t4);

        b1 = new JButton("ADD");
        b1.setFocusable(false);
        b1.setBounds(100,400,80,50);
        b1.setBackground(new Color(132,123,166));
        p1.add(b1);

        b2 = new JButton("DELETE");
        b2.setBounds(200,400,80,50);
        b2.setFocusable(false);
        b2.setBackground(new Color(132,123,166));
        p1.add(b2);

        b3 = new JButton("EXIT");
        b3.setBounds(300,400,80,50);
        b3.setBackground(new Color(132,123,166));
        p1.add(b3);


        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                s1 = t1.getText();
                s2 = t2.getText();
                s3 = t3.getText();
                s4 = t4.getText();

                Object newRow[]= {s1,s2,s3,s4};
                model.addRow(newRow);
            }
        });
        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                model.removeRow(table.getSelectedRow());
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });



        setVisible(true);
    }
}
