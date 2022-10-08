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
import javax.persistence.OneToOne;

/**
 *
 * @author Administrator
 */
@Entity
public class Viagens implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private double preco;
    @OneToOne
    @JoinColumn(name = "voos")
    private Voos voos;

    public int getId() {
        return id;
    }

    public void setVoos(Voos voos) {
        this.voos = voos;
    }

    public Voos getVoos() {
        return voos;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

  

    public Viagens() {
    }

}
