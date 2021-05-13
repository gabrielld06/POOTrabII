package POJO;

import POJO.Consulta;
import POJO.DadosAdicionais;
import POJO.Prontuario;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-13T05:04:26")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Integer> IdPaciente;
    public static volatile SingularAttribute<Paciente, String> telefone;
    public static volatile SingularAttribute<Paciente, Prontuario> prontuario;
    public static volatile SingularAttribute<Paciente, String> endereco;
    public static volatile SingularAttribute<Paciente, String> convenio;
    public static volatile SingularAttribute<Paciente, DadosAdicionais> dadosAdicionais;
    public static volatile SingularAttribute<Paciente, String> nome;
    public static volatile SingularAttribute<Paciente, LocalDate> dataNascimento;
    public static volatile SingularAttribute<Paciente, Consulta> consulta;
    public static volatile SingularAttribute<Paciente, String> email;

}