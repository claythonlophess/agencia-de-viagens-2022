package model;

import java.io.Serializable;
import table.model.TableRowData;

public class funcionario  extends TableRowData implements Serializable {
    private ModelName name;

    public ModelName getName() {
        return name;
    }

    public void setName(ModelName name) {
        this.name = name;
    }

    private String nivelDeAcesso;
    private String senha;
    private String usuario;
    private int id;

    public funcionario() {
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object[] toTableRow() {
         return new Object[]{id, usuario, senha, nivelDeAcesso};
    }
} // fim da classe Classe
