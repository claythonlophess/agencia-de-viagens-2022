/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
package controller;

import Dao.CarroDao;
import Dao.MotorristaDao;
import bean.Carro;
import bean.Motorrista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.Home;
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
    private CarroDao carroDao;
    private MotorristaDao motorristaDao;

    public MotorristaController() {

    }

    public MotorristaController(PrefilMotorista view) {
        this.view = view;
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.getNewJPanel1().getClaitonTable1().addTitleColum("Veiculos");
        carroDao = new CarroDao();
        motorristaDao = new MotorristaDao();
        atualizarTabela();
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
        linha1.getBtnGravar().setVisible(true);
        linha1.getLblEdit().setVisible(false);

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
                String marca = linha1.getComboMarca().getSelectedItem().toString();
                String modelo = linha1.getComboModelo().getSelectedItem().toString();
                String dataDeAquisicao = linha1.getDate().getDateFormatString();
                String acentos = linha1.getSpAcentos().getValue().toString();
                String tonelagem = linha1.getSpTonelagem().getValue().toString();
                int ano = linha1.getYear().getValue();
                String motor = linha1.getTxtMotorAviao().getText();
                carroDao.addCarro(motorrista.getId(), matricula, marca, modelo, dataDeAquisicao, acentos, tonelagem, motor, motor, estado);

            }
        });

    }

    public void atualizarTabela() {

        List<Carro> listaDeCarros = carroDao.listaDeCarros();
        for (Carro carro : listaDeCarros) {
            String acentos = carro.getAcentos();
            int anoFabrico = carro.getAnoFabrico();
            String dataDeAquisicao = carro.getDataDeAquisicao();
            String estado = carro.getEstado();
            int id = carro.getId();
            String marca = carro.getMarca();
            String matricula = carro.getMatricula();
            String modelo = carro.getModelo();
            String nrDeMotor = carro.getNrDeMotor();
            Motorrista motorista = carro.getMotorista();
            String tonelagem = carro.getTonelagem();

            for (Carro l : listaDeCarros) {
                linha1 = new NewVeiculo();
                linha1.setIndex(i);
                linha1.getBtnGravar().setVisible(false);
                linha1.getLblEdit().setVisible(true);

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
                linha1.getTxtMatricula().setText(l.getMatricula());
                linha1.getTxtMotorAviao().setText(l.getNrDeMotor());
                linha1.getTxtSerie().setText(l.getMatricula());
                linha1.getComboMarca().setSelectedItem(l.getMarca());
                linha1.getComboModelo().setSelectedItem(l.getModelo());
                // linha1.getDate().setDateFormatString(l.getDataDeAquisicao());
                //linha1.getSpAcentos().setValue(l.getAcentos());
                //linha1.getSpTonelagem().setValue(l.getTonelagem());
                linha1.getYear().setValue(l.getAnoFabrico());
                linha1.getTxtMotorAviao().setText(l.getNrDeMotor());
            }
            linha1.getCbAtivo();
            linha1.getCbAtivo();
            linha1.getCbAtivo();
            linha1.getCbAtivo();
        }
//        linha1.getBtnGravar().addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                String estado = "";
//                if (linha1.getCbAtivo().isSelected()) {
//                    estado = "Ativo";
//                }
//                String matricula = linha1.getTxtMatricula().getText();
//                String marca = linha1.getComboMarca().getSelectedItem().toString();
//                String modelo = linha1.getComboModelo().getSelectedItem().toString();
//                String dataDeAquisicao = linha1.getDate().getDateFormatString();
//                String acentos = linha1.getSpAcentos().getValue().toString();
//                String tonelagem = linha1.getSpTonelagem().getValue().toString();
//                int ano = linha1.getYear().getValue();
//                String motor = linha1.getTxtMotorAviao().getText();
//                carroDao.addCarro(motorrista.getId(), matricula, marca, modelo, dataDeAquisicao, acentos, tonelagem, motor, motor, estado);
//
//            }
//        });

    }

    public void terminarSessao() {
        view.dispose();
        new Home().setVisible(true);
    }

}
