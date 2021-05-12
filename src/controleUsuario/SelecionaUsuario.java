/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleUsuario;

import trabalho.GerenciadorDeMensagens;
import trabalho.Medico;
import trabalho.Secretaria;

/**
 *
 * @author Gabriel
 */
public class SelecionaUsuario {
    public TipoUsuario configurarUsuario(String opcao) {
        switch(opcao) {
            case "1":
                Secretaria secretaria = new Secretaria();
                return new TipoUsuario(secretaria);
            case "2":
                Medico medico = new Medico();
                return new TipoUsuario(medico);
            case "3":
                GerenciadorDeMensagens gerenciador = new GerenciadorDeMensagens();
                return new TipoUsuario(gerenciador);
            case "4":
                System.out.println("Finalizando programa");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        return null;
    }
}
