package controleUsuario;

import javax.swing.JFrame;

public class TipoUsuario {

    private Usuario usuario;

    public TipoUsuario(Usuario u) {
        this.usuario = u;
    }

    public TipoUsuario() {

    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
    public void menu(JFrame telaAnterior) {
        usuario.menu(telaAnterior);
    }
}
