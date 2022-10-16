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

/**
 *
 * @author Administrator
 */
@Entity
public class AeroportoMoz implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String aeroporto;
    private String provincia;
    private String regiao;
    private String capital;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(String aeroporto) {
        this.aeroporto = aeroporto;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public AeroportoMoz(int id, String aeroporto, String provincia, String regiao, String capital) {
        this.id = id;
        this.aeroporto = aeroporto;
        this.provincia = provincia;
        this.regiao = regiao;
        this.capital = capital;
    }

    public AeroportoMoz() {
    }

    @Override
    public String toString() {
        return aeroporto + ", " + provincia + ", " + regiao + ", " + capital ;
    }
     
    
    
}
