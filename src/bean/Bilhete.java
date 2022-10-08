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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Toshiba cada bilhete pertence a uma viagem e uma pessoa
 */
@Entity
public class Bilhete implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private  String dataVolta;
    private  String dataIda;
    private  String nrPassageiros;
    private  String origem;
    private  String destino;
    private  String classe;
    private  String ida;

    @ManyToOne
    @JoinColumn(name = "cliente_codico")
    private Cliente cliente = new Cliente();

    public Bilhete() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public void setNrPassageiros(String nrPassageiros) {
        this.nrPassageiros = nrPassageiros;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public String getDataIda() {
        return dataIda;
    }

    public String getNrPassageiros() {
        return nrPassageiros;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getClasse() {
        return classe;
    }

    public String getIda() {
        return ida;
    }

    @Override
    public String toString() {
        return "Bilhete{" + "dataVolta=" + dataVolta + ", dataIda=" + dataIda + ", nrPassageiros=" + nrPassageiros + ", origem=" + origem + ", destino=" + destino + ", classe=" + classe + ", ida=" + ida + '}';
    }

}
