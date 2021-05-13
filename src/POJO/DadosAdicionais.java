package POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class DadosAdicionais {
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int IdDadosAdicionais;
    private boolean fuma;
    private boolean bebe;
    private double colesterol;
    private String diabete;
    private boolean doençaCardiaca;
    private String cirurgias;
    private String alergias;
    @OneToOne
    private Paciente paciente;
    
    public boolean getFuma(){
        return fuma;
    }

    public int getIdDadosAdicionais() {
        return IdDadosAdicionais;
    }

    public void setIdDadosAdicionais(int IdDadosAdicionais) {
        this.IdDadosAdicionais = IdDadosAdicionais;
    }
    
    public void setFuma(String fuma){
        if (fuma.equals("S") || fuma.equals("s")){
            this.fuma = true;
        }else if (fuma.equals("N") || fuma.equals("n")){
            this.fuma = false;
        }else{
            System.out.println("\nFumante: Digite apenas S para sim ou N para não, valor de Fumante não foi alterado.");
        }
    }
       
    public boolean getBebe(){
        return bebe;
    }
    
    public void setBebe(String bebe){
        if (bebe.equals("S") || bebe.equals("s")){
            this.bebe = true;
        }else if (bebe.equals("N") || bebe.equals("n")){
            this.bebe = false;
        }else{
            System.out.println("\nConsome álcool: Digite apenas S para sim ou N para não, valor de Consome álcool não foi alterado.");
        }
    }
    
    public double getColesterol(){
        return colesterol;
    }
    
    public void setColesterol(String colesterol){
        try {
        this.colesterol = Double.parseDouble(colesterol);
        }catch(Exception e) {
           System.out.println("\nValor do colesterol: Digite apenas números positivos, valor de colesterol não foi alterado.");
        }
    }
    
    public String getDiabete(){
        return diabete;
    }
    
    public void setDiabete(String diabete){
        this.diabete = diabete;
    }
    
    public boolean getDoençaCardiaca(){
        return doençaCardiaca;
    }
    
    public void setDoençaCardiaca(String doençaCardiaca){
        if (doençaCardiaca.equals("S") || doençaCardiaca.equals("s")){
            this.doençaCardiaca = true;
        }else if (doençaCardiaca.equals("N") || doençaCardiaca.equals("n")){
            this.doençaCardiaca = false;
        }else{
            System.out.println("\nDoença cardiaca: Digite apenas S para sim ou N para não, valor de Doença Cardiaca não foi alterado.");
        }
    }
    
    public String getCirurgias(){
        return cirurgias;
    }
    
    public void setCirurgias(String cirurgias){
        this.cirurgias = cirurgias;
    }
    
    public String getAlergias(){
        return alergias;
    }
    
    public void setAlergias(String alergias){
        this.alergias = alergias;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
