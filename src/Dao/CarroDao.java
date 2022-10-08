/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
package Dao;
import bean.AeroportoMoz;
import bean.Carro;
import bean.Viagens;
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
public class CarroDao {
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

    public void persist(Carro voos) {
        open();
        manager.persist(voos);
        tx.commit();
    }
    public void persist1(Carro c) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        
        manager.persist(c);
        tx.commit();
        manager.close();
        JpaUtil.close();
    }
    public List<Carro> listaDeCarros() {
        List<Carro> lista = manager
                .createQuery("select v from Carro v", Carro.class)
                .getResultList();
       return lista;
      
    }
    public void atualizarTabelaViagens(Viagens View) {
//        List<Carro> viagems = manager
//                .createQuery("select v from Carro v", Carro.class)
//                .getResultList();
//        DefaultTableModel tabModel = (DefaultTableModel) View.getjTableViagens().getModel();
//        for (int i = 0; i < View.getjTableViagens().getRowCount(); i++) {
//            tabModel.removeRow(i);
//        }
//        for (Carro mototristas1 : viagems) {
//            tabModel.addRow(new Object[]{
//                mototristas1.getId(),
//                mototristas1.getDataIda(),
//                mototristas1.getDataVolta(),
//                mototristas1.getOrigem(),
//                mototristas1.getDestino(),
//                mototristas1.getCarro()//,
////                mototristas1.getCarro().getMotorista()
//
//            });
//        }

    }

    public Carro pesquisarCarro(int id) {
        List<Carro> carros = manager
                .createQuery("select v from Carro v", Carro.class)
                .getResultList();
        for (Carro carroa : carros) {
            if (carroa.getId() == id);
            return carroa;
        }
        return null;
    }

    public ArrayList<Carro> pesquisarCarro(String txt) {
        List<AeroportoMoz> lista1 = new ArrayList<>();
        ArrayList<Carro> v = new ArrayList<>();

        try {
            Connection c;

            c = new ConexaoAeroporto().getconec();

            String sql = "select * from mocambique";
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                AeroportoMoz p = new AeroportoMoz();
                p.setId(rs.getInt("id"));
                p.setAeroporto(rs.getString("aeroporto"));
                p.setProvincia(rs.getString("provincia"));
                p.setRegiao(rs.getString("regiao"));
                p.setCapital(rs.getString("capital"));
                String toString = p.toString().toLowerCase();
                if (toString.equalsIgnoreCase(txt)) {
                    lista1.add(p);
                }
            }
            List<Carro> lista = manager
                    .createQuery("select v from Carro v", Carro.class)
                    .getResultList();
//            for (Carro voo : lista) {
//                if (voo.getOrigem().equalsIgnoreCase(lista1.get(0).getProvincia())) {
//                    v.add(voo);
//                }
//            }
        } catch (SQLException ex) {
            Logger.getLogger(DesktopClienteJpane.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v;
    }

  
    public Carro editae(Carro voos) {
        Carro viagem = manager.find(Carro.class, voos.getId());
        tx.commit();
        return viagem;
    }
}
