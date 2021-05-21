package controleUsuario;

import telas.medicoMenu;
import entityManager.GerenciadorDeEntidade;
import javax.swing.JFrame;
import telas.medicoAtualizaProntuario;
import telas.medicoCadastraDadosAdicionais;
import telas.medicoCadastraProntuario;
import telas.medicoGerarRelatorio;
import telas.medicoRemoveDadosAdicionais;
import telas.medicoRemoveProntuario;

public class Medico extends Usuario {

    private GerenciadorDeEntidade gerenciador;

    public Medico() {

    }

    public Medico(GerenciadorDeEntidade gerenciador) {
        this.gerenciador = gerenciador;
    }

    // Imprime em tela o menu de opções do usuario Medico 
    // e gerencia a interação com o sistema
    @Override
    public void menu(JFrame telaAnterior) {
        medicoMenu menu = new medicoMenu(telaAnterior, this);
        menu.setVisible(true);
    }

    // Recebe as informações do usuario para realizar o cadastro dos dados adicionais
    // de um paciente
    @Override
    public void cadastraPaciente(JFrame telaAnterior) {
        medicoCadastraDadosAdicionais telaCadastro = new medicoCadastraDadosAdicionais(telaAnterior, gerenciador);
        telaCadastro.setVisible(true);
    }

    // Recebe as informações do usuario para realizar a atualização dos dados adicionais
    // de um paciente, caso exista um, caso contrario, apenas imprime "Paciente não encontrado ou não tem dados adicionais cadastrados"
    @Override
    public void atualizaPaciente(JFrame telaAnterior) {
        medicoAtualizaProntuario telaAtualiza = new medicoAtualizaProntuario(telaAnterior, gerenciador);
        telaAtualiza.setVisible(true);
    }

    // Recebe uma string do usuario e remove os dados adicionais do paciente com esse nome
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado"
    @Override
    public void removePaciente(JFrame telaAnterior) {
        medicoRemoveDadosAdicionais telaRemove = new medicoRemoveDadosAdicionais(telaAnterior, gerenciador);
        telaRemove.setVisible(true);
    }

    // Recebe as informações do usuario para realizar o cadastro de um novo prontuário do paciente
    @Override
    public void cadastraConsulta(JFrame telaAnterior) {
        medicoCadastraProntuario tela = new medicoCadastraProntuario(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

    // Recebe uma string do usuario e atualiza o prontuário do paciente com esse nome
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado ou não tem prontuário cadastrado"
    @Override
    public void atualizaConsulta(JFrame telaAnterior) {
        medicoAtualizaProntuario tela = new medicoAtualizaProntuario(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

    // Recebe uma string do usuario e remove o prontuario do paciente com esse nome
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado ou não tem prontuário cadastrado"
    @Override
    public void removeConsulta(JFrame telaAnterior) {
        medicoRemoveProntuario tela = new medicoRemoveProntuario(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

    // Gera os relatórios médico do paciente
    @Override
    public void gerarRelatorio(JFrame telaAnterior) {
        medicoGerarRelatorio tela = new medicoGerarRelatorio(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

}
