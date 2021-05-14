package POJO;

import POJO.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-14T02:15:53")
@StaticMetamodel(Prontuario.class)
public class Prontuario_ { 

    public static volatile SingularAttribute<Prontuario, Paciente> paciente;
    public static volatile SingularAttribute<Prontuario, String> prescricaoTratamento;
    public static volatile SingularAttribute<Prontuario, String> sintomas;
    public static volatile SingularAttribute<Prontuario, String> diagnosticoDoenca;
    public static volatile SingularAttribute<Prontuario, Integer> IdProntuario;

}