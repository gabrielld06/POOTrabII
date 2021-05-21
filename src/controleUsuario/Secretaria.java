package controleUsuario;

import telas.secretariaMenu;
import entityManager.GerenciadorDeEntidade;
import javax.swing.JFrame;
import telas.secretariaAtualizaConsulta;
import telas.secretariaAtualizaPaciente;
import telas.secretariaCadastraConsulta;
import telas.secretariaCadastraPaciente;
import telas.secretariaGerarRelatorioConsulta;
import telas.secretariaRemoveConsulta;
import telas.secretariaRemovePaciente;

public class Secretaria extends Usuario {

    private GerenciadorDeEntidade gerenciador;

    public Secretaria() {

    }

    public Secretaria(GerenciadorDeEntidade gerenciador) {
        this.gerenciador = gerenciador;
    }

    // Imprime em tela o menu de opções do usuario Secretaria 
    // e gerencia a interação com o sistema
    @Override
    public void menu(JFrame telaAnterior) {
        secretariaMenu menu = new secretariaMenu(telaAnterior, this);
        menu.setVisible(true);
    }

    // Recebe as informações do usuario para realizar o cadastro de um novo paciente nos dados
    @Override
    public void cadastraPaciente(JFrame telaAnterior) {
        secretariaCadastraPaciente telaCadastro = new secretariaCadastraPaciente(telaAnterior, gerenciador);
        telaCadastro.setVisible(true);
    }

    // Recebe as informações do usuario para atualizar um paciente nos dados
    @Override
    public void atualizaPaciente(JFrame telaAnterior) {
        secretariaAtualizaPaciente telaAtualiza = new secretariaAtualizaPaciente(telaAnterior, gerenciador);
        telaAtualiza.setVisible(true);
    }

    // Recebe uma string do usuario e remove um paciente com esse nome dos dados
    // caso exista um, caso contrario, apenas imprime "Paciente não encontrado"
    @Override
    public void removePaciente(JFrame telaAnterior) {
        secretariaRemovePaciente telaRemove = new secretariaRemovePaciente(telaAnterior, gerenciador);
        telaRemove.setVisible(true);
    }

    // Recebe as informações do usuario para realizar o cadastro de uma nova consulta nos dados
    @Override
    public void cadastraConsulta(JFrame telaAnterior) {
        secretariaCadastraConsulta tela = new secretariaCadastraConsulta(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

    // Recebe as informações do usuario para atualizar uma consulta nos dados
    @Override
    public void atualizaConsulta(JFrame telaAnterior) {
        secretariaAtualizaConsulta tela = new secretariaAtualizaConsulta(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

    // Recebe um int do usuario e remove uma consulta com esse ID dos dados
    // caso exista um, caso contrario, apenas imprime "Consulta não encontrada"
    @Override
    public void removeConsulta(JFrame telaAnterior) {
        secretariaRemoveConsulta tela = new secretariaRemoveConsulta(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

    // Gera o relatorio de consultas relativas ao dia seguinte
    @Override
    public void gerarRelatorio(JFrame telaAnterior) {
        secretariaGerarRelatorioConsulta tela = new secretariaGerarRelatorioConsulta(telaAnterior, gerenciador);
        tela.setVisible(true);
    }

}
