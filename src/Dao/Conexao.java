package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao{
    public Connection getconec(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/agenciadeviagens","root","");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro com ao Conectar com o banco de dados");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}