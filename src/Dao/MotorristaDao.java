/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
package Dao;

import bean.AeroportoMoz;
import bean.Carro;
import bean.Viagens;
import bean.Motorrista;
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
public class MotorristaDao {
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

    public void persist(Motorrista voos) {
        open();
        manager.persist(voos);
        tx.commit();
    }
    public void persist(Carro voos) {
        open();
        manager.persist(voos);
        tx.commit();
    }

    public void atualizarTabelaViagens(Viagens View) {
//        List<Motorrista> viagems = manager
//                .createQuery("select v from Motorrista v", Motorrista.class)
//                .getResultList();
//        DefaultTableModel tabModel = (DefaultTableModel) View.getjTableViagens().getModel();
//        for (int i = 0; i < View.getjTableViagens().getRowCount(); i++) {
//            tabModel.removeRow(i);
//        }
//        for (Motorrista mototristas1 : viagems) {
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

    public Motorrista pesquisarMotorrista(int id) {
        List<Motorrista> carros = manager
                .createQuery("select v from Motorrista v", Motorrista.class)
                .getResultList();
        for (Motorrista carroa : carros) {
            if (carroa.getId() == id);
            return carroa;
        }
        return null;
    }

    public ArrayList<Motorrista> pesquisarMotorrista(String txt) {
        List<AeroportoMoz> lista1 = new ArrayList<>();
        ArrayList<Motorrista> v = new ArrayList<>();

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
            List<Motorrista> lista = manager
                    .createQuery("select v from Motorrista v", Motorrista.class)
                    .getResultList();
//            for (Motorrista voo : lista) {
//                if (voo.getOrigem().equalsIgnoreCase(lista1.get(0).getProvincia())) {
//                    v.add(voo);
//                }
//            }
        } catch (SQLException ex) {
            Logger.getLogger(DesktopClienteJpane.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v;
    }

  
    public Motorrista editae(Motorrista voos) {
        Motorrista viagem = manager.find(Motorrista.class, voos.getId());
        tx.commit();
        return viagem;
    }
}
