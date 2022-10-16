package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

    @Entity
public abstract class Veiculo implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    protected String marca;
    protected String motor;
    protected String modelo;
    protected String dataDeAquisicao;
    protected String acentos;
    protected String tonelagem;
    protected int anoFabrico;
    private String nrDeMotor;
    private String estado;
    

//Um construtor vazio para nos permitir chamar a super classe e nao usar todos atributos se necesssario    
    public Veiculo() {
    }
//Um construtor com todos atributos para chamar a super classe e usar todos atritbutos 
    public Veiculo( String marca, String modelo, String dataDeAquisicao, String acentos, String tonelagem, int anoFabrico,String nrDeMotor, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.dataDeAquisicao = dataDeAquisicao;
        this.acentos = acentos;
        this.tonelagem = tonelagem;
        this.anoFabrico = anoFabrico;
        this.nrDeMotor = nrDeMotor;
        this.estado = estado;
        
    }



//Aqui temos os getters e setters para garantir a integridade dos nossos atributos   
   
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


  

    public String getDataDeAquisicao() {
        return dataDeAquisicao;
    }

    public void setDataDeAquisicao(String dataDeAquisicao) {
        this.dataDeAquisicao = dataDeAquisicao;
    }

    public String getAcentos() {
        return acentos;
    }

    public void setAcentos(String acentos) {
        this.acentos = acentos;
    }

    public String getTonelagem() {
        return tonelagem;
    }

    public void setTonelagem(String tonelagem) {
        this.tonelagem = tonelagem;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public void setAnoFabrico(int anoFabrico) {
        this.anoFabrico = anoFabrico;
    }

    public String getNrDeMotor() {
        return nrDeMotor;
    }

    public void setNrDeMotor(String nrDeMotor) {
        this.nrDeMotor = nrDeMotor;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

//Tem se aqui  o metodo toString para imprimir a informacao do veiculo    
    @Override
    public String toString() {
        return "Marca:\t" + marca + "\nModelo:\t" + modelo +"\nData de Aquisicao:\t" + dataDeAquisicao + "\nAno de Fabrico:\t"+ anoFabrico+"\nNumero de Lugares:\t" + acentos + "\nTonelagem:\t" + tonelagem+"\nEstado:\t"+estado;
    }
     public String toString1() {
        return "Marca:" + marca + " Modelo:" + modelo +" Acentos:" + acentos + " Tonelagem:" + tonelagem;
    }
    
    
    
}
