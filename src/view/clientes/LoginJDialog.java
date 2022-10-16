/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.clientes;

import Dao.JpaUtil;
import bean.Motorrista;
import bean.Pessoa;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import view.UsuariosExternos.PrefilMotorista;
import view.adm.AdmnistracaoJPanel;

/**
 *
 * @author Administrator
 */
public class LoginJDialog extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;
    private final Frame parent1;

    /**
     * Creates new form Login
     */
    public LoginJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent1 = parent;
        initComponents();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginJpanel = new javax.swing.JPanel();
        lblUsuario1 = new javax.swing.JLabel();
        LblSenha1 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        pfSenha1 = new javax.swing.JPasswordField();
        jsUsuario1 = new javax.swing.JSeparator();
        jsSenha1 = new javax.swing.JSeparator();
        lblEsqueceuSenha = new javax.swing.JLabel();
        jsTema1 = new javax.swing.JSeparator();
        lblTitulo1 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        lblCriarConta1 = new javax.swing.JLabel();
        lblNaoConta1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        loginJpanel.setBackground(new java.awt.Color(245, 255, 252));
        loginJpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginJpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario1.setText("Usuario");
        loginJpanel.add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 40, -1));

        LblSenha1.setText("Senha");
        loginJpanel.add(LblSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txtUsuario1.setBackground(new java.awt.Color(245, 255, 252));
        txtUsuario1.setBorder(null);
        txtUsuario1.setOpaque(false);
        loginJpanel.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 220, 22));

        pfSenha1.setBackground(new java.awt.Color(245, 255, 252));
        pfSenha1.setBorder(null);
        loginJpanel.add(pfSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 220, 20));
        loginJpanel.add(jsUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 220, -1));
        loginJpanel.add(jsSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 220, -1));

        lblEsqueceuSenha.setText("Esqueceu senha?");
        loginJpanel.add(lblEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        loginJpanel.add(jsTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 330, 10));

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Login");
        loginJpanel.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 330, 30));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        loginJpanel.add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 193, 220, 20));
        getRootPane().setDefaultButton(okButton);

        lblCriarConta1.setForeground(new java.awt.Color(102, 102, 255));
        lblCriarConta1.setText("Criar conta");
        lblCriarConta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCriarConta1MouseClicked(evt);
            }
        });
        loginJpanel.add(lblCriarConta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        lblNaoConta1.setText("Nao tem conta?");
        loginJpanel.add(lblNaoConta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loginJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        EntityManager manager = JpaUtil.getEntityManager();
        Query query = manager.createQuery("from Pessoa");
        List<Pessoa> p1 = query.getResultList();
        for (Pessoa p : p1) {
            if (p.getUsuario().equals(txtUsuario1.getText()) && p.getSenha().equals(pfSenha1.getText())) {
                if (p.getNivelDeAcesso() == 0) {
                    ClienteJFrame clienteJFrame = new ClienteJFrame();
                    clienteJFrame.getTxtUsuario().setText("Usuario: " + p.getUsuario());
                    clienteJFrame.setVisible(true);
                    manager.close();
        parent1.dispose();
        doClose(RET_OK);
                }
                if (p.getNivelDeAcesso() == 1) {
                    PrefilMotorista m = new PrefilMotorista((Motorrista) p);
                    m.getLblNome().setText("Nome: " + p.getNome());
                    m.getLblUsuario().setText("Usuario: " + p.getUsuario());
                    m.setVisible(true);
                    manager.close();
        parent1.dispose();
        doClose(RET_OK);
                }
                if (p.getNivelDeAcesso() == 2) {
                    AdmnistracaoJPanel a = new AdmnistracaoJPanel();
                    a.getLblNome().setText(p.getNome());
                    a.setVisible(true);
                    manager.close();
        JpaUtil.close();
        parent1.dispose();
        doClose(RET_OK);
                }
            }
        }
        
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void lblCriarConta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCriarConta1MouseClicked
        this.setVisible(false);
        new CriarContaJDialog(null, true).setVisible(true);
    }//GEN-LAST:event_lblCriarConta1MouseClicked

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

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
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginJDialog dialog = new LoginJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblSenha1;
    private javax.swing.JSeparator jsSenha1;
    private javax.swing.JSeparator jsTema1;
    private javax.swing.JSeparator jsUsuario1;
    private javax.swing.JLabel lblCriarConta1;
    private javax.swing.JLabel lblEsqueceuSenha;
    private javax.swing.JLabel lblNaoConta1;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPanel loginJpanel;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField pfSenha1;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
