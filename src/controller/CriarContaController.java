/*
 *  Autor:    Claiton Lopes Matavele 

 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
package controller;

import Dao.ClienteDao;
import Dao.MotorristaDao;
import bean.Cliente;
import bean.Motorrista;
import javax.swing.JOptionPane;
import view.UsuariosExternos.PrefilMotorista;
import view.clientes.ClienteJFrame;
import view.clientes.CriarContaJDialog;

/** 
 *
 * @author Administrator
 */
public class CriarContaController {

    private final CriarContaJDialog criarContaJDialog;

    public CriarContaController(CriarContaJDialog criarContaJDialog) {
        this.criarContaJDialog = criarContaJDialog;
        if (validar()) {
            if (criarContaJDialog.getPfConfirmarSenha().getText().equals(criarContaJDialog.getPfSenha().getText())) {

                if (criarContaJDialog.getjCheckBox4().isSelected()) {
                    Motorrista m = new Motorrista(criarContaJDialog.getTxtUsuario().getText(), criarContaJDialog.getTxtUsuario().getText());
                    new MotorristaDao().persist(m);
                    PrefilMotorista p = new PrefilMotorista(m);
                    p.getTxtUsuario().setText("Uusario: " + m.getUsuario());
                } else if (criarContaJDialog.getjCheckBox1().isSelected()) {
                    Cliente m = new Cliente(criarContaJDialog.getTxtUsuario().getText(), criarContaJDialog.getTxtUsuario().getText());
                    new ClienteDao().persist(m);
                    ClienteJFrame clienteJFrame = new ClienteJFrame();
                    clienteJFrame.getTxtUsuario().setText("Uusario: " + m.getUsuario());
                    clienteJFrame.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(criarContaJDialog, "Ocoreu um erro ao criar sua conta.");
            }
        }

    }

    final boolean validar() {
        return !criarContaJDialog.getPfConfirmarSenha().getText().equals("") && !criarContaJDialog.getPfSenha().getText().equals("") && !criarContaJDialog.getTxtUsuario().equals("");
    }

}
