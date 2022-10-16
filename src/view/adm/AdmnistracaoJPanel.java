/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.adm;

import Dao.CarroDao;
import bean.Carro;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.Notification;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class AdmnistracaoJPanel extends javax.swing.JFrame {

    private final NotificacaoJpanel n;
    private final CarroDao carroDao;
    private final List<Carro> listaDeCarros;
    private final CadastroDEViagens cadastroDEViagens;
    private final ValidarCarros validarCarros;

    public AdmnistracaoJPanel() {
        initComponents();
        carroDao = new CarroDao();
        n = new NotificacaoJpanel();
         cadastroDEViagens = new CadastroDEViagens();
         validarCarros = new  ValidarCarros();
        jPanel7.add(n);
        listaDeCarros = carroDao.listaDeCarros();
        int x = 0;
        n.setNewVeiculo(validarCarros.getNewVeiculo());
        n.setMsg(this);
        lblNrDeSolicitacoes.setText(x + "+");
        for (Carro l : listaDeCarros) {
            if (!l.getEstado().equals("ativo")) {
                x++;
                Notification panel = new Notification(this, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, l.getMotorista().getNome() + " enviou Pedido de validacao: ");
                panel.showNotification();
            }
        }
        lblNrDeSolicitacoes.setText(x + "+");
    }

//    @Override
//    public void paint(Graphics grphcs) {
//        Graphics2D g2 = (Graphics2D) grphcs.create();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2.setColor(getBackground());
//        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
//        g2.dispose();
//        super.paint(grphcs);
//    }
    public void voosMouseClicked() {
        List<Carro> listaDeMenssagen = new ArrayList<>();
        for (Carro l : listaDeCarros) {
            if (!l.getEstado().equals("ativo")) {
                listaDeMenssagen.add(l);
            }
        }

        n.getjList1().setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() {
                return listaDeMenssagen.size();
            }

            public String getElementAt(int i) {
                return listaDeMenssagen.get(i).toString();
            }
        });
        n.setBounds(lblNrDeSolicitacoes.getX() - 200, lblNrDeSolicitacoes.getY() + 20, 200, 80);
        n.setVisible(true);
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void add() {
        for (Carro l : listaDeCarros) {
            if (l.toString().equals(n.getMsg())) {
                validarCarros.getNewVeiculo().getTxtMatricula().setText(l.getMatricula());
                validarCarros.getNewVeiculo().getTxtMotorAviao().setText(l.getNrDeMotor());
                //validarCarros.getNewVeiculo().getTxtSerie().setText(l.get());
                //validarCarros.getNewVeiculo().getComboMarca().setSelectedItem("Item 1");
                // validarCarros.getNewVeiculo().getComboModelo().setSelectedItem();
                validarCarros.getNewVeiculo().getDate().setDateFormatString(l.getDataDeAquisicao());
                validarCarros.getNewVeiculo().getSpAcentos().setValue(l.getAcentos());
                validarCarros.getNewVeiculo().getSpTonelagem().setValue(l.getTonelagem());
                validarCarros.getNewVeiculo().getYear().setValue(l.getAnoFabrico());
                validarCarros.getNewVeiculo().getTxtMotorAviao().setText(l.getMotorista().getNome());
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNrDeSolicitacoes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        formTransition2 = new view.animacaopainel.FormTransition();
        jPanel2 = new javax.swing.JPanel();
        btnAgendarViagens = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnValidarCarros = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });

        jLabel1.setText("Pedidos de validacao");

        lblNrDeSolicitacoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNrDeSolicitacoes.setForeground(new java.awt.Color(102, 204, 0));
        lblNrDeSolicitacoes.setText("50+");
        lblNrDeSolicitacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNrDeSolicitacoesMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/icons8_checked_user_male_20px.png"))); // NOI18N

        lblNome.setText("Nome");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgendarViagens.setText("Agendar Viagens");
        btnAgendarViagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarViagensActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("Motorista");

        btnValidarCarros.setText("Carros");
        btnValidarCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarCarrosActionPerformed(evt);
            }
        });

        jLabel2.setText("Validar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(btnAgendarViagens)
                    .addComponent(jLabel2)
                    .addComponent(btnValidarCarros)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnAgendarViagens)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(btnValidarCarros)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 995, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNrDeSolicitacoes)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(formTransition2, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNrDeSolicitacoes)
                    .addComponent(jLabel3)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(formTransition2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNrDeSolicitacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNrDeSolicitacoesMouseClicked
        voosMouseClicked();// TODO add your handling code here:
    }//GEN-LAST:event_lblNrDeSolicitacoesMouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseEntered

    private void btnAgendarViagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarViagensActionPerformed
 formTransition2.showForm(cadastroDEViagens);         // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarViagensActionPerformed

    private void btnValidarCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarCarrosActionPerformed
       formTransition2.showForm(validarCarros);  // TODO add your handling code here:
    }//GEN-LAST:event_btnValidarCarrosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdmnistracaoJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmnistracaoJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmnistracaoJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmnistracaoJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmnistracaoJPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarViagens;
    private javax.swing.JButton btnValidarCarros;
    private view.animacaopainel.FormTransition formTransition2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNrDeSolicitacoes;
    // End of variables declaration//GEN-END:variables

   

}
