package POJO;

import POJO.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-14T02:15:52")
@StaticMetamodel(DadosAdicionais.class)
public class DadosAdicionais_ { 

    public static volatile SingularAttribute<DadosAdicionais, Integer> IdDadosAdicionais;
    public static volatile SingularAttribute<DadosAdicionais, String> diabete;
    public static volatile SingularAttribute<DadosAdicionais, Boolean> doençaCardiaca;
    public static volatile SingularAttribute<DadosAdicionais, Boolean> fuma;
    public static volatile SingularAttribute<DadosAdicionais, Double> colesterol;
    public static volatile SingularAttribute<DadosAdicionais, Paciente> paciente;
    public static volatile SingularAttribute<DadosAdicionais, Boolean> bebe;
    public static volatile SingularAttribute<DadosAdicionais, String> cirurgias;
    public static volatile SingularAttribute<DadosAdicionais, String> alergias;

}