/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Toshiba
 */
@Entity
@Table(name = "motorista")
public class Motorrista extends Pessoa{
    private boolean disponivel;
    public Motorrista() {
    }

    public Motorrista(int id,  String nome, String apelido, String idade, String contato, String morada, String numeroDeCartao) {
        super(id, 1, nome, apelido, idade, contato, morada, numeroDeCartao);
    }

    public Motorrista(String usuario, String senha) {
        super(1, usuario, senha);
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return super.getNome();
    }
    
}
