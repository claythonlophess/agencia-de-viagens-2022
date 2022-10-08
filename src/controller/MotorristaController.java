/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
package controller;

import Dao.CarroDao;
import Dao.JpaUtil;
import Dao.MotorristaDao;
import bean.Carro;
import bean.Motorrista;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.UsuariosExternos.PrefilMotorista;
import view.clientes.NewVeiculo;

/**
 *
 * @author Claiton Lopes Matavele
 */
public class MotorristaController {

    private PrefilMotorista view;
    private NewVeiculo linha1;
    private Motorrista motorrista;
    private int i = 0;

    public MotorristaController() {

    }

    public MotorristaController(PrefilMotorista view) {
        this.view = view;
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.getNewJPanel1().getClaitonTable1().addTitleColum("Veiculos");
    }

    public void setMotorrista(Motorrista motorrista) {
        this.motorrista = motorrista;
    }

    public Motorrista getMotorrista() {
        return motorrista;
    }

    public void adicionarCarro() {

        linha1 = new NewVeiculo();
        linha1.setIndex(i);
        view.getNewJPanel1().getClaitonTable1().addRowJpanel(linha1, 74);
        final int j = i;
        i++;
        linha1.getLblDel().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view.getNewJPanel1().getClaitonTable1().removeRowElement(j);
                JOptionPane.showMessageDialog(view, "Carro eliminado com sucesso");
            }
        });

        linha1.getBtnGravar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String estado = "";
                if (linha1.getCbAtivo().isSelected()) {
                    estado = "Ativo";
                }
                String matricula = linha1.getTxtMatricula().getText();
                Object marca = linha1.getComboMarca().getSelectedItem();
                Object modelo = linha1.getComboModelo().getSelectedItem();
                String dataDeAquisicao = linha1.getDate().getDateFormatString();
                String acentos = linha1.getSpAcentos().getValue().toString();
                String tonelagem = linha1.getSpTonelagem().getValue().toString();
                int ano = linha1.getYear().getValue();
                String motor = linha1.getTxtMotorAviao().getText();
                EntityManager manager = JpaUtil.getEntityManager();
                EntityTransaction tx = manager.getTransaction();
                tx.begin();

                Carro c = new Carro();
                c.setMatricula(matricula);
                c.setMarca(marca.toString());
                c.setModelo(modelo.toString());
                c.setDataDeAquisicao(dataDeAquisicao);
                c.setAcentos(acentos);
                c.setTonelagem(tonelagem);
                c.setAnoFabrico(ano);
                Motorrista mt = new MotorristaDao().pesquisarMotorrista(motorrista.getId());
                c.setMotorista(mt);
                c.setNrDeMotor(motor);
                c.setEstado(estado);

                manager.persist(c);
                tx.commit();
                manager.close();
                JpaUtil.close();
                JOptionPane.showMessageDialog(view, "Carro addicionado com sucesso");
                // System.out.println(c.toString());
            }
        });
    }
}
