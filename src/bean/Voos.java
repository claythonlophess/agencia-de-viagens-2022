/*
  claiton lopes matavele
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author claiton lopes matavele
 */
@Entity
public class Voos implements Serializable {

    @Id
    @GeneratedValue
    private  int id;
    private  String dataPartida;
    private  String datachegada;
    private  int nrPassageiros;
    private  String origem;
    private  String destino;
    private  String classe;
    private  String agencia;
    private  String aviao;
    private double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setAviao(String aviao) {
        this.aviao = aviao;
    }

    public String getAviao() {
        return aviao;
    }

    public void setDatachegada(String datachegada) {
        this.datachegada = datachegada;
    }

    public String getDatachegada() {
        return datachegada;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    

    public Voos() {
    }

    public Voos(int id, String dataPartida, String datachegada, int nrPassageiros, String origem, String destino, String classe, String agencia, String aviao, double preco) {
        this.id = id;
        this.dataPartida = dataPartida;
        this.datachegada = datachegada;
        this.nrPassageiros = nrPassageiros;
        this.origem = origem;
        this.destino = destino;
        this.classe = classe;
        this.agencia = agencia;
        this.aviao = aviao;
        this.preco = preco;
    }

  
    @Override
    public String toString() {
        return origem+" "+destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public int getNrPassageiros() {
        return nrPassageiros;
    }

    public void setNrPassageiros(int nrPassageiros) {
        this.nrPassageiros = nrPassageiros;
    }

    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    
}
// claiton lopes matavele