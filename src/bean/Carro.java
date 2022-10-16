/*
|"jkhgf
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Toshiba
 */
@Entity
public class Carro extends Veiculo implements Serializable {

   
    @JoinColumn(name = "motorista_codico")
    @OneToOne
    private Motorrista motorista;
    private String matricula;

    public Carro() {
    }

    public Carro(Motorrista motorista, String matricula, String marca, String modelo, String dataDeAquisicao, String acentos, String tonelagem, int anoFabrico, String nrDeMotor, String estado) {
        super(marca, modelo, dataDeAquisicao, acentos, tonelagem, anoFabrico, nrDeMotor, estado);
        this.matricula = matricula;
        this.motorista = motorista;
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    public Motorrista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorrista motorista) {
        this.motorista = motorista;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "Carros{" + "motorista=" + motorista + ", matricula=" + matricula + '}';
    }
   

}
