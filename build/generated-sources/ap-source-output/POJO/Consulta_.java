package POJO;

import POJO.Paciente;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-13T16:46:43")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, String> tipo;
    public static volatile SingularAttribute<Consulta, LocalDate> data;
    public static volatile SingularAttribute<Consulta, String> horario;
    public static volatile SingularAttribute<Consulta, Paciente> paciente;
    public static volatile SingularAttribute<Consulta, String> medico;
    public static volatile SingularAttribute<Consulta, Integer> idConsulta;

}