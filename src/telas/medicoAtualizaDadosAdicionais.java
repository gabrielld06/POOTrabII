/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import POJO.DadosAdicionais;
import POJO.Paciente;
import entityManager.GerenciadorDeEntidade;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class medicoAtualizaDadosAdicionais extends javax.swing.JFrame {

    private GerenciadorDeEntidade gerenciador = new GerenciadorDeEntidade();
    List<Paciente> results = gerenciador.getPacientesDadosAdicionais();
    private JFrame telaAnterior;

    /**
     * Creates new form medicoAtualizaDadosAdicionais
     */
    public medicoAtualizaDadosAdicionais(JFrame tela) {
        initComponents();
        telaAnterior = tela;
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/supimpa.png")).getImage());
    }

    public medicoAtualizaDadosAdicionais() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fumanteGroup = new javax.swing.ButtonGroup();
        alcoolGroup = new javax.swing.ButtonGroup();
        doencaGroup = new javax.swing.ButtonGroup();
        exitButton = new javax.swing.JButton();
        alcoolSimButton = new javax.swing.JRadioButton();
        pacienteCirurgiaTxt = new javax.swing.JTextField();
        alcoolNaoButton = new javax.swing.JRadioButton();
        pacienteColesterolTxt = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        pacienteAlergiaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doencaCardiacaSimButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        doencaCardiacaNaoButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pacienteComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fumanteSimButton = new javax.swing.JRadioButton();
        pacienteDiabeteTxt = new javax.swing.JTextField();
        fumanteNaoButton = new javax.swing.JRadioButton();
        statusText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(410, 375));
        setPreferredSize(new java.awt.Dimension(415, 410));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setText("Cancelar");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        alcoolGroup.add(alcoolSimButton);
        alcoolSimButton.setText("Sim");
        alcoolSimButton.setActionCommand("sim");
        getContentPane().add(alcoolSimButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 100, -1, -1));

        pacienteCirurgiaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteCirurgiaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(pacienteCirurgiaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 232, 94, -1));

        alcoolGroup.add(alcoolNaoButton);
        alcoolNaoButton.setText("Não");
        alcoolNaoButton.setActionCommand("não");
        getContentPane().add(alcoolNaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 100, -1, -1));

        pacienteColesterolTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(pacienteColesterolTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 132, 94, -1));

        jLabel2.setText("Fumante:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 68, -1, -1));

        pacienteAlergiaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteAlergiaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(pacienteAlergiaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 266, 94, -1));

        jLabel3.setText("Consome álcool:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 102, -1, -1));

        jLabel9.setText("Alergias:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 266, -1, -1));

        jLabel4.setText("Valor do colesterol:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 135, -1, -1));

        doencaGroup.add(doencaCardiacaSimButton);
        doencaCardiacaSimButton.setText("Sim");
        doencaCardiacaSimButton.setActionCommand("sim");
        getContentPane().add(doencaCardiacaSimButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 200, -1, -1));

        jLabel5.setText("Diabete:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 169, -1, -1));

        doencaGroup.add(doencaCardiacaNaoButton);
        doencaCardiacaNaoButton.setText("Não");
        doencaCardiacaNaoButton.setActionCommand("não");
        getContentPane().add(doencaCardiacaNaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 200, -1, -1));

        jLabel1.setText("Selecione o paciente a atualizar dados adicionais:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 9, -1, -1));

        jLabel6.setText("Doença cardíaca:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 202, -1, -1));

        pacienteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pacienteComboBoxItemStateChanged(evt);
            }
        });
        pacienteComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacienteComboBoxMouseClicked(evt);
            }
        });
        pacienteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(pacienteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 6, 129, -1));

        jLabel7.setText("Cirurgias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 235, -1, -1));

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        fumanteGroup.add(fumanteSimButton);
        fumanteSimButton.setText("Sim");
        fumanteSimButton.setActionCommand("sim");
        getContentPane().add(fumanteSimButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 68, -1, -1));

        pacienteDiabeteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteDiabeteTxtActionPerformed(evt);
            }
        });
        getContentPane().add(pacienteDiabeteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 166, 94, -1));

        fumanteGroup.add(fumanteNaoButton);
        fumanteNaoButton.setText("Não");
        fumanteNaoButton.setActionCommand("não");
        getContentPane().add(fumanteNaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 68, -1, -1));

        statusText.setText("Aguardando...");
        getContentPane().add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel8.setText("Status:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        telaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void pacienteCirurgiaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteCirurgiaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteCirurgiaTxtActionPerformed

    private void pacienteAlergiaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteAlergiaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteAlergiaTxtActionPerformed

    private void pacienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pacienteComboBoxItemStateChanged
        int index = pacienteComboBox.getSelectedIndex();
        DadosAdicionais dadosAdicionais = results.get(index).getDadosAdicionais();
        if (dadosAdicionais.getFuma() == true) {
            fumanteSimButton.setSelected(true);
        } else {
            fumanteNaoButton.setSelected(true);
        }
        if (dadosAdicionais.getBebe() == true) {
            alcoolSimButton.setSelected(true);
        } else {
            alcoolNaoButton.setSelected(true);
        }
        if (dadosAdicionais.getDoençaCardiaca() == true) {
            doencaCardiacaSimButton.setSelected(true);
        } else {
            doencaCardiacaNaoButton.setSelected(true);
        }
        pacienteColesterolTxt.setText(Double.toString(dadosAdicionais.getColesterol()));
        pacienteCirurgiaTxt.setText(dadosAdicionais.getCirurgias());
        pacienteDiabeteTxt.setText(dadosAdicionais.getDiabete());
        pacienteAlergiaTxt.setText(dadosAdicionais.getAlergias());
    }//GEN-LAST:event_pacienteComboBoxItemStateChanged

    private void pacienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int index = pacienteComboBox.getSelectedIndex();
            int idPaciente = results.get(index).getIdPaciente();
            Paciente paciente = gerenciador.buscaPaciente(idPaciente);
            DadosAdicionais novoDadosAdicionais = paciente.getDadosAdicionais();
            String fuma, bebe, doencaCardiaca;
            fuma = fumanteGroup.getSelection().getActionCommand();
            bebe = alcoolGroup.getSelection().getActionCommand();
            doencaCardiaca = doencaGroup.getSelection().getActionCommand();
            novoDadosAdicionais.setFuma(fuma);
            novoDadosAdicionais.setBebe(bebe);
            novoDadosAdicionais.setDoençaCardiaca(doencaCardiaca);
            novoDadosAdicionais.setColesterol(pacienteColesterolTxt.getText());
            novoDadosAdicionais.setDiabete(pacienteDiabeteTxt.getText());
            novoDadosAdicionais.setCirurgias(pacienteCirurgiaTxt.getText());
            novoDadosAdicionais.setAlergias(pacienteAlergiaTxt.getText());
            int status = gerenciador.atualizaPaciente();
            if (status == 1) {
                statusText.setText(String.format("Dados adicionais do paciente %s atualizado com sucesso!", pacienteComboBox.getSelectedItem()));
                statusText.setForeground(Color.decode("#17cf17"));
            } else {
                statusText.setText("Ocorreu um erro ao cadastrar os dados adicionais!");
                statusText.setForeground(Color.red);
            }
        } catch (Exception e) {
            statusText.setText("Ocorreu um erro, verifique os dados inseridos!");
            statusText.setForeground(Color.red);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void pacienteDiabeteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteDiabeteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteDiabeteTxtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        results.forEach(e -> {
            pacienteComboBox.addItem(e.getNome());
        });
        if (results.size() == 0) {
            JOptionPane.showMessageDialog(null, "Não há nenhum paciente com dados adicionais cadastrado.", "Atualiza Dados Adicionais.", JOptionPane.ERROR_MESSAGE);
            telaAnterior.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void pacienteComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacienteComboBoxMouseClicked
        statusText.setText("Aguardando...");
        statusText.setForeground(Color.white);
    }//GEN-LAST:event_pacienteComboBoxMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(medicoAtualizaDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicoAtualizaDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicoAtualizaDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicoAtualizaDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicoAtualizaDadosAdicionais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alcoolGroup;
    private javax.swing.JRadioButton alcoolNaoButton;
    private javax.swing.JRadioButton alcoolSimButton;
    private javax.swing.JRadioButton doencaCardiacaNaoButton;
    private javax.swing.JRadioButton doencaCardiacaSimButton;
    private javax.swing.ButtonGroup doencaGroup;
    private javax.swing.JButton exitButton;
    private javax.swing.ButtonGroup fumanteGroup;
    private javax.swing.JRadioButton fumanteNaoButton;
    private javax.swing.JRadioButton fumanteSimButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pacienteAlergiaTxt;
    private javax.swing.JTextField pacienteCirurgiaTxt;
    private javax.swing.JFormattedTextField pacienteColesterolTxt;
    private javax.swing.JComboBox<String> pacienteComboBox;
    private javax.swing.JTextField pacienteDiabeteTxt;
    private javax.swing.JLabel statusText;
    // End of variables declaration//GEN-END:variables
}
