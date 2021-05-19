package trabalho;

import POJO.Prontuario;
import POJO.Consulta;
import POJO.DadosAdicionais;
import controleUsuario.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Usuario {
    
    public Medico() {
        
    }
    
    // Imprime em tela o menu de opções do usuario Medico 
    // e gerencia a interação com o sistema
    public void menu(Dados dados) {

    }
    // Recebe as informações do usuario para realizar o cadastro dos dados adicionais
    // de um paciente
    public void cadastraPaciente(Dados dados) {
        
    }
    
    // Recebe as informações do usuario para realizar a atualização dos dados adicionais
    // de um paciente, caso exista um, caso contrario, apenas imprime "Paciente não encontrado ou não tem dados adicionais cadastrados"
    public void atualizaPaciente(Dados dados) {
        
    }
    
    // Recebe uma string do usuario e remove os dados adicionais do paciente com esse nome
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado"
    public void removePaciente(Dados dados) {
        
    }
    
    // Recebe as informações do usuario para realizar o cadastro de um novo prontuário do paciente
    public void cadastraConsulta(Dados dados) {

    }
    
    // Recebe uma string do usuario e atualiza o prontuário do paciente com esse nome
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado ou não tem prontuário cadastrado"
    public void atualizaConsulta(Dados dados) {
       
    }
    
    // Recebe uma string do usuario e remove o prontuario do paciente com esse nome
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado ou não tem prontuário cadastrado"
    public void removeConsulta(Dados dados) {
        
    }
    
    // Recebe as informações do usuário e imprime na tela a receita do paciente
    public void gerarRelatorioReceita(Dados dados){
        
    }
    
    // Recebe as informações do usuário e imprime na tela o atestado do paciente
    public void gerarRelatorioAtestado(Dados dados){
        
    }
    
    // Recebe as informações do usuário e imprime na tela a declaração de acompanhamento do paciente
    public void gerarRelatorioAcompanhamento(Dados dados){
        
    }
    
    // Gera os relatórios médico do paciente
    public void gerarRelatorio(Dados dados) {
        
    }

}
