package controleUsuario;

import trabalho.Dados;

public class TipoUsuario {

    private Usuario usuario;

    public TipoUsuario(Usuario u) {
        this.usuario = u;
    }

    public TipoUsuario() {

    }

    public void menu(Dados dados) {
        usuario.menu(dados);
    }
}
