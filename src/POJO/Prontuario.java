package POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Prontuario {
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int IdProntuario;
    private String sintomas;
    private String diagnosticoDoenca;
    private String prescricaoTratamento;
    @OneToOne
    private Paciente paciente;

    public int getIdProntuario() {
        return IdProntuario;
    }

    public void setIdProntuario(int IdProntuario) {
        this.IdProntuario = IdProntuario;
    }
    
    public String getSintomas(){
        return this.sintomas;
    }
    
    public void setSintomas(String sintomas){
        this.sintomas = sintomas;
    }
    
    public String getDiagnosticoDoenca(){
        return this.diagnosticoDoenca;
    }
    
    public void setDiagnosticoDoenca(String diagnosticoDoenca){
        this.diagnosticoDoenca = diagnosticoDoenca;
    }
    
    public String getPrescricaoTratamento(){
        return this.prescricaoTratamento;
    }
    
    public void setPrescricaoTratamento(String prescricaoTratamento){
        this.prescricaoTratamento = prescricaoTratamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
