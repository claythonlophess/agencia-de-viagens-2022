/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.AeroportoMoz;
import bean.Viagens;
import bean.Voos;
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
import view.adm.Funcionario;
import view.clientes.DesktopClienteJpane;

/**
 *
 * @author Administrator
 */
public class VoosDao {

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

    public void persist(Voos voos) {
        open();
        manager.persist(voos);
        tx.commit();
    }

    public void atualizarTabelaViagens(Viagens View) {
//        List<Voos> viagems = manager
//                .createQuery("select v from Voos v", Voos.class)
//                .getResultList();
//        DefaultTableModel tabModel = (DefaultTableModel) View.getjTableViagens().getModel();
//        for (int i = 0; i < View.getjTableViagens().getRowCount(); i++) {
//            tabModel.removeRow(i);
//        }
//        for (Voos mototristas1 : viagems) {
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

    public Voos pesquisarVoos(int id) {
        List<Voos> carros = manager
                .createQuery("select v from Voos v", Voos.class)
                .getResultList();
        for (Voos carroa : carros) {
            if (carroa.getId() == id);
            return carroa;
        }
        return null;
    }

    public ArrayList<Voos> pesquisarVoos(String txt) {
        List<AeroportoMoz> lista1 = new ArrayList<>();
        ArrayList<Voos> v = new ArrayList<>();

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
            List<Voos> lista = manager
                    .createQuery("select v from Voos v", Voos.class)
                    .getResultList();
            for (Voos voo : lista) {
                if (voo.getOrigem().equalsIgnoreCase(lista1.get(0).getProvincia())) {
                    v.add(voo);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DesktopClienteJpane.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v;
    }

  
    public Voos editae(Voos voos) {
        Voos viagem = manager.find(Voos.class, voos.getId());
        tx.commit();
        return viagem;
    }
}
