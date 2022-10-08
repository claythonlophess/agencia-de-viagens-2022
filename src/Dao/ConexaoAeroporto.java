package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoAeroporto{
    public Connection getconec(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/aeroportos_data_base","root","");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro com ao Conectar com o banco de dados");
            Logger.getLogger(ConexaoAeroporto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}