package controller;

import Dao.ConexaoAeroporto;
import Dao.VoosDao;
import bean.AeroportoMoz;
import bean.Voos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.Home;
import view.adm.AdmnistracaoJPanel;
import view.clientes.AlugerDECarrosJpanel;
import view.clientes.DetalhesDoVooFrame;
import view.clientes.DetalhesDoVooJpanel;
import view.clientes.LoginJDialog;
import view.clientes.PassageirosJpanel;
import view.clientes.SugestaoJpanel;
import view.clientes.TarifasJpanel;
import view.clientes.VoosJpanel;

public class VoosController {

    private final AlugerDECarrosJpanel c;
    private final VoosJpanel v;
    private final SugestaoJpanel sugestaoJpanel;
    private final Home view;
    private final VoosDao dao;
    private ArrayList<Voos> voos;
    private ArrayList<Voos> voos1;
    private DetalhesDoVooFrame detalhesJFrame;
    private DetalhesDoVooJpanel detalhesDoVooJpanel;
    private PassageirosJpanel passageirosJpanel;
    private TarifasJpanel tarifasJpanel;
    private int i = 0;
    private int AnteriorProximo = 0;

    public VoosController(Home view) {
        this.view = view;
        c = new AlugerDECarrosJpanel();
        v = new VoosJpanel(this);
        dao = new VoosDao();
        view.getJpDesjtop().add(c);
        view.getJpDesjtop().add(v);

        sugestaoJpanel = new SugestaoJpanel();
        view.getjPanel7().add(sugestaoJpanel);
        sugestaoJpanel.setVisible(false);
        v.getVoosSugestao1().getBtnAgendar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarVoo();
            }
        });
        v.getVoosSugestao2().getBtnAgendar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarVoo();
            }
        });
        v.getVoosSugestao3().getBtnAgendar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarVoo();
            }
        });
    }

    public void carrosMouseClicked() {
        int height = view.getJpDesjtop().getHeight();
        int width = view.getJpDesjtop().getWidth();
        c.setBounds(0, 0, width, height);
        v.setVisible(false);
        c.setVisible(true);
    }

    private void jPanel12MouseClicked() {
        AdmnistracaoJPanel p = new AdmnistracaoJPanel();
        int height = view.getJpDesjtop().getHeight();
        int width = view.getJpDesjtop().getWidth();
        p.setBounds(0, 0, width, height);
        v.setVisible(false);
        c.setVisible(false);//Claiton lopes matavele info: LinkedIn: Quality and Reality
        p.setVisible(true);//Claiton lopes matavele info: LinkedIn: Quality and Reality
        view.getJpDesjtop().add(p);
    }

    public void voosMouseClicked() {
        int height = view.getJpDesjtop().getHeight();
        int width = view.getJpDesjtop().getWidth();
        v.setBounds(0, 0, width, height);
        v.setVisible(true);
        c.setVisible(false);
    }

    public void pesquisarVoos(JTextField txt, JTextField txt1) {
        view.getjPanel6().setVisible(false);
        view.getjPanel10().setVisible(true);
        
        int width = view.getJpDesjtop().getWidth();
        v.setBounds(0, 0, width+10, 631);
        v.setVisible(true);
        c.setVisible(false);

        voos = dao.pesquisarVoos(txt.getText());
        v.getVoosSugestao1().getLblAgencia().setText(voos.get(0).getAgencia());
        v.getVoosSugestao1().getLblHora().setText(voos.get(0).getDataPartida() + " - " + voos.get(0).getDataPartida());
        v.getVoosSugestao1().getLblOrigemDestino().setText(voos.get(0).getOrigem() + " - " + voos.get(0).getDestino());
        v.getVoosSugestao1().getLblPreco().setText(voos.get(0).getPreco() + "");

        voos1 = dao.pesquisarVoos(txt1.getText());
        v.getVoosSugestao1().getLblAgencia2().setText(voos1.get(0).getAgencia());
        v.getVoosSugestao1().getLblHora2().setText(voos1.get(0).getDataPartida() + " - " + voos1.get(0).getDataPartida());
        v.getVoosSugestao1().getLblOrigemDestino2().setText(voos1.get(0).getOrigem() + " - " + voos1.get(0).getDestino());
        v.getVoosSugestao1().getLblPreco().setText(voos1.get(0).getPreco() + "");

        v.getVoosSugestao2().getLblAgencia().setText(voos.get(1).getAgencia());
        v.getVoosSugestao2().getLblHora().setText(voos.get(1).getDataPartida() + " - " + voos.get(1).getDataPartida());
        v.getVoosSugestao2().getLblOrigemDestino().setText(voos.get(1).getOrigem() + " - " + voos.get(1).getDestino());
        v.getVoosSugestao2().getLblPreco().setText(voos.get(1).getPreco() + "");

        v.getVoosSugestao2().getLblAgencia2().setText(voos1.get(1).getAgencia());
        v.getVoosSugestao2().getLblHora2().setText(voos1.get(1).getDataPartida() + " - " + voos1.get(1).getDataPartida());
        v.getVoosSugestao2().getLblOrigemDestino2().setText(voos1.get(1).getOrigem() + " - " + voos1.get(1).getDestino());
        v.getVoosSugestao2().getLblPreco().setText(voos1.get(1).getPreco() + "");

        v.getVoosSugestao3().getLblAgencia().setText(voos.get(2).getAgencia());
        v.getVoosSugestao3().getLblHora().setText(voos.get(2).getDataPartida() + " - " + voos.get(1).getDataPartida());
        v.getVoosSugestao3().getLblOrigemDestino().setText(voos.get(2).getOrigem() + " - " + voos.get(2).getDestino());
        v.getVoosSugestao3().getLblPreco().setText(voos.get(2).getPreco() + "");

        v.getVoosSugestao3().getLblAgencia2().setText(voos1.get(2).getAgencia());
        v.getVoosSugestao3().getLblHora2().setText(voos1.get(2).getDataPartida() + " - " + voos1.get(2).getDataPartida());
        v.getVoosSugestao3().getLblOrigemDestino2().setText(voos1.get(2).getOrigem() + " - " + voos1.get(2).getDestino());
        v.getVoosSugestao3().getLblPreco().setText(voos1.get(2).getPreco() + "");

    }

    public void pesqusa(JTextField jTextField) {
        List<AeroportoMoz> lista = new ArrayList<>();
        String text = jTextField.getText();
        sugestaoJpanel.setjTextField1(jTextField);

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
                if (toString.contains(text)) {
                    lista.add(p);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        int x = jTextField.getX();
        int y = jTextField.getY();
        int width = jTextField.getWidth();
        sugestaoJpanel.setBounds(x, y, width, 140);

        sugestaoJpanel.getjList1().setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() {
                return lista.size();
            }

            public String getElementAt(int i) {
                return lista.get(i).toString();
            }
        });
        //   sugestaoJpanel.setjTextField1(jTextField);
        sugestaoJpanel.setVisible(true);
    }

    public void btnAgendarVoo() {
        detalhesJFrame = new DetalhesDoVooFrame();

        detalhesDoVooJpanel = new DetalhesDoVooJpanel();
        passageirosJpanel = new PassageirosJpanel();
        tarifasJpanel = new TarifasJpanel();

        tarifasJpanel.setBounds(0, 0, detalhesJFrame.getjPanel1().getWidth(), detalhesJFrame.getjPanel1().getHeight());
        detalhesDoVooJpanel.setBounds(0, 0, detalhesJFrame.getjPanel1().getWidth(), detalhesJFrame.getjPanel1().getHeight());
        passageirosJpanel.setBounds(detalhesJFrame.getjPanel1().getWidth() / 4, detalhesJFrame.getjPanel1().getHeight() / 3, 615, 188);

        tarifasJpanel.setVisible(false);
        passageirosJpanel.setVisible(false);
        ProximoAnterior();
        if (v.getVoosSugestao1()
                .getjCheckBox1().isSelected()) {
            Date date = new Date();
            int date1 = date.getDate();
            int month = date.getMonth();
            int year = date.getYear();
            System.out.println(year);
            int hours = date.getHours();
            detalhesDoVooJpanel.setDetalhes("Sua Viagem para " + voos.get(0).getDestino(), voos.get(0).getAgencia(), date + "",
                    hours + "", date1 + "", month + "", voos.get(0).getOrigem(), voos.get(0).getAgencia() + " ABC", "Mocambique", (hours + 1.5) + "",
                    date1 + "", month + "", voos.get(0).getDestino(), voos.get(0).getAgencia() + " ABC", "Mocambique");
            detalhesDoVooJpanel.getBtnAlterar().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    detalhesJFrame.dispose();
                }
            });

            detalhesJFrame.getjPanel1().add(detalhesDoVooJpanel);
            detalhesJFrame.getjPanel1().add(tarifasJpanel);
            detalhesJFrame.getjPanel1().add(passageirosJpanel);
            detalhesJFrame.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(view, "Selecione pelo menos um voo");
        }
    }

    public void ProximoAnterior() {
        detalhesJFrame.getLblProximo().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switch (AnteriorProximo) {
                    case 0:
                        AnteriorProximo++;
                        passageirosJpanel.setVisible(true);
                        detalhesDoVooJpanel.setVisible(false);
                        break;
                    case 1:
                        AnteriorProximo++;
                        tarifasJpanel.setVisible(true);
                        passageirosJpanel.setVisible(false);
                        break;
                    default:
                        break;
                }
                detalhesJFrame.getjPanel1().repaint();
                detalhesJFrame.getjPanel1().updateUI();
            }
        });
        detalhesJFrame.getLblAnterior().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switch (AnteriorProximo) {
                    case 1:
                        AnteriorProximo--;
                        passageirosJpanel.setVisible(false);
                        detalhesDoVooJpanel.setVisible(true);
                        break;
                    case 2:
                        AnteriorProximo--;
                        tarifasJpanel.setVisible(false);
                        passageirosJpanel.setVisible(true);
                        break;
                    default:
                        break;
                }
                detalhesJFrame.getjPanel1().repaint();
                detalhesJFrame.getjPanel1().updateUI();
            }
        });
        detalhesJFrame.getjPanel1().addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tarifasJpanel.setBounds(0, 0, detalhesJFrame.getjPanel1().getWidth(), detalhesJFrame.getjPanel1().getHeight());
                detalhesDoVooJpanel.setBounds(0, 0, detalhesJFrame.getjPanel1().getWidth(), detalhesJFrame.getjPanel1().getHeight());
                passageirosJpanel.setBounds(detalhesJFrame.getjPanel1().getWidth() / 4, detalhesJFrame.getjPanel1().getHeight() / 3, 615, 188);
                detalhesJFrame.getjPanel1().repaint();
                detalhesJFrame.getjPanel1().updateUI();
            }
        });

    }

    public void login() {
        LoginJDialog l = new LoginJDialog(view, true);
        l.setVisible(true);

    }
}
