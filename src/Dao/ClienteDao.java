/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
package Dao;
import bean.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import view.clientes.DesktopClienteJpane;

/**
 *
 * @author Administrator
 */
public class ClienteDao {
    EntityManager manager = JpaUtil.getEntityManager();

    EntityTransaction tx = manager.getTransaction();

    public void open() {
        Persistence.createEntityManagerFactory("Vendas_PU");
        manager = JpaUtil.getEntityManager();
        tx = manager.getTransaction();
        tx.begin();
    }

    public void close() {

        manager.close();
        JpaUtil.close();
    }

    public void persist(Cliente voos) {
        open();
        manager.persist(voos);
        tx.commit();
    }

   
    public Cliente pesquisarCliente(int id) {
        List<Cliente> carros = manager
                .createQuery("select v from Cliente v", Cliente.class)
                .getResultList();
        for (Cliente carroa : carros) {
            if (carroa.getId() == id);
            return carroa;
        }
        return null;
    }

    public ArrayList<Cliente> pesquisarCliente(String txt) {
        List<Cliente> lista1 = new ArrayList<>();
        ArrayList<Cliente> v = new ArrayList<>();

        try {
            Connection c;

            c = new ConexaoAeroporto().getconec();

            String sql = "select * from mocambique";
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente p = new Cliente();
                p.setId(rs.getInt("id"));
//                p.setAeroporto(rs.getString("aeroporto"));
//                p.setProvincia(rs.getString("provincia"));
//                p.setRegiao(rs.getString("regiao"));
//                p.setCapital(rs.getString("capital"));
                String toString = p.toString().toLowerCase();
                if (toString.equalsIgnoreCase(txt)) {
                    lista1.add(p);
                }
            }
            List<Cliente> lista = manager
                    .createQuery("select v from Cliente v", Cliente.class)
                    .getResultList();
//            for (Cliente voo : lista) {
//                if (voo.getOrigem().equalsIgnoreCase(lista1.get(0).getProvincia())) {
//                    v.add(voo);
//                }
//            }
        } catch (SQLException ex) {
            Logger.getLogger(DesktopClienteJpane.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v;
    }

  
    public Cliente editae(Cliente voos) {
        Cliente viagem = manager.find(Cliente.class, voos.getId());
        tx.commit();
        return viagem;
    }
}
