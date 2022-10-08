/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Toshiba
 */
@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(name = "cliente_codigo")
public class Cliente extends Pessoa implements Serializable {

    public Cliente() {

    }

    public Cliente(String usuario, String senha) {
        super(0, usuario, senha);
    }

    public Cliente(int id, int nivelDeAcesso, String nome, String apelido, String idade, String contato, String morada, String numeroDeCartao) {
        super(id, nivelDeAcesso, nome, apelido, idade, contato, morada, numeroDeCartao);
    }
    @OneToMany(mappedBy = "cliente")
    private List<Bilhete> bilhetes;

}
