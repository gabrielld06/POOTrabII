package trabalho;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import controleUsuario.TipoUsuario;
import java.util.Scanner;
import telas.selecionarUsuario;

public class Trabalho {

    public static void main(String[] args) {
        try {
            FlatLightLaf.install();
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        selecionarUsuario tela = new selecionarUsuario();
        tela.setVisible(true);
    }

}
