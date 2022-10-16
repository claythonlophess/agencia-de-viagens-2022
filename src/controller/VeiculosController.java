package controller;

/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */

import Dao.CarroDao;
import bean.Carro;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextField;
import view.clientes.AlugerDECarrosJpanel;
import view.clientes.DetalhesDoVeiculoFrame;
import view.clientes.DetalhesDoVeiculoJpanel;

/**
 *
 * @author Administrator
 */
public class VeiculosController {

    private final AlugerDECarrosJpanel c;
    private final AlugerDECarrosJpanel tela;
    private final CarroDao dao;
    private DetalhesDoVeiculoJpanel detalhesDoVeiculoJpanel;
    private DetalhesDoVeiculoFrame detalhesJFrame;
    private ArrayList<Carro> carros;

    public VeiculosController(AlugerDECarrosJpanel tela) {
        this.tela = tela;
        c = new AlugerDECarrosJpanel();
        dao = new CarroDao();

        c.getBtnAlugar1().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        c.getBtnAlugar1().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // btnAgendarVoo();
            }
        });
        c.getBtnAlugar1().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //  btnAgendarVoo();
            }
        });
    }

    /**
     * Area principal dos detalhes do voo (contem botoes Proximo e Anterios)
     */
    public void btnAgendarVoo() {
        //Area principal dos detalhes do voo (contem botoes Proximo e Anterios)
        detalhesJFrame = new DetalhesDoVeiculoFrame();

        //gerencia todos os paines ate chegar ao pagamento
        detalhesDoVeiculoJpanel = new DetalhesDoVeiculoJpanel();
//        passageirosJpanel = new PassageirosJpanel();
//        tarifasJpanel = new TarifasJpanel();

//        tarifasJpanel.setBounds(0, 0, detalhesJFrame.getjPanel1().getWidth(), detalhesJFrame.getjPanel1().getHeight());
//        detalhesDoVeiculoJpanel.setBounds(0, 0, detalhesJFrame.getjPanel1().getWidth(), detalhesJFrame.getjPanel1().getHeight());
//        passageirosJpanel.setBounds(detalhesJFrame.getjPanel1().getWidth() / 4, detalhesJFrame.getjPanel1().getHeight() / 3, 615, 188);
////
//        tarifasJpanel.setVisible(false);
//        passageirosJpanel.setVisible(false);
        // ProximoAnterior();
        Date date = new Date();
        int date1 = date.getDate();
        int month = date.getMonth();
        int year = date.getYear();
        System.out.println(year);
        int hours = date.getHours();
        detalhesDoVeiculoJpanel.getLblPrecoToTal();
        detalhesDoVeiculoJpanel.getLblPrecoPorHora();
        detalhesDoVeiculoJpanel.getLblPrecoPorDia();
        detalhesDoVeiculoJpanel.getSpDias1();
        detalhesDoVeiculoJpanel.getSpDias();

        detalhesDoVeiculoJpanel.getBtnAlterar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalhesJFrame.dispose();
            }
        });

        detalhesJFrame.setVisible(true);
        detalhesJFrame.getjPanel1().showForm(detalhesDoVeiculoJpanel);
//            detalhesJFrame.getjPanel1().add(tarifasJpanel);
//            detalhesJFrame.getjPanel1().add(passageirosJpanel);

    }

    public void pesquisarCarros(JTextField txt) {
        //tela.getjPanel6().setVisible(false);
        //tela.getjPanel10().setVisible(true);

        int width = tela.getWidth();
        c.setBounds(0, 0, width + 10, 631);
        c.setVisible(true);
        int i =0;
        carros = dao.pesquisarCarro(txt.getText());
        c.getLblDetalhes().setText(carros.get(i).toString());
        //c.getLblLocalizacaoDoCarro2().setText();
        c.getLblKilometragem1();
        c.getLblLocalizacaoAtual1();
        c.getLblLocalizacaoDoCarro1();
        
        c.getLblPrecoDia();
        c.getLblPrecoHora();
        
        c.getLblPrecoDia1();
        c.getLblPrecoHora1();
        
        c.getLblPrecoDia1();
        c.getLblPrecoHora1();
       
        detalhesDoVeiculoJpanel.getLblPrecoPorHora();
        detalhesDoVeiculoJpanel.getLblPrecoPorDia();
        detalhesDoVeiculoJpanel.getSpDias1();
        detalhesDoVeiculoJpanel.getSpDias();

        detalhesDoVeiculoJpanel.getLblPrecoToTal();
        detalhesDoVeiculoJpanel.getLblPrecoPorHora();
        detalhesDoVeiculoJpanel.getLblPrecoPorDia();
        detalhesDoVeiculoJpanel.getSpDias1();
        detalhesDoVeiculoJpanel.getSpDias();

        detalhesDoVeiculoJpanel.getLblPrecoToTal();
        detalhesDoVeiculoJpanel.getLblPrecoPorHora();
        detalhesDoVeiculoJpanel.getLblPrecoPorDia();
        detalhesDoVeiculoJpanel.getSpDias1();
        detalhesDoVeiculoJpanel.getSpDias();
    }

}
