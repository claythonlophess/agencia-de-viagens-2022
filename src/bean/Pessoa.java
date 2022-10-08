/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Toshiba
 */
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private int nivelDeAcesso;
    private String nome, apelido;
    private String idade,
            contato;
    private String morada, numeroDeCartao;
    private String usuario, senha;

    public Pessoa(int nivelDeAcesso, String usuario, String senha) {
        this.nivelDeAcesso = nivelDeAcesso;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Pessoa() {
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public String impressao() {
        return null;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNumeroDeCartao() {
        return numeroDeCartao;
    }

    public void setNumeroDeCartao(String numeroDeCartao) {
        this.numeroDeCartao = numeroDeCartao;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int id, int nivelDeAcesso, String nome, String apelido, String idade, String contato, String morada, String numeroDeCartao) {
        this.id = id;
        this.nivelDeAcesso = nivelDeAcesso;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.contato = contato;
        this.morada = morada;
        this.numeroDeCartao = numeroDeCartao;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa(String nome, String apelido, String contato, String morada, String numeroDeCartao) {
        this.nome = nome;
        this.apelido = apelido;
        this.contato = contato;
        this.morada = morada;
        this.numeroDeCartao = numeroDeCartao;

    }

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + ", apelido=" + apelido + ", idade=" + idade + ", contato=" + contato + ", morada=" + morada + ", numeroDeCartao=" + numeroDeCartao + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
