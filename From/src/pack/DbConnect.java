package pack;
import java.sql.*;
import javax.swing.*;

public class DbConnect {
    private Connection con;
    private Statement st;

    public DbConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raats","root","");
            st = con.createStatement();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void RegisterInsert(String queryInsert) {
        try {
            st.executeUpdate(queryInsert);
            JOptionPane.showMessageDialog(null,"OK Good");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"OK Bad");
        }
    }
}
