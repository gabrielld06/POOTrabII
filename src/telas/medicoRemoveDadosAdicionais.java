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
public class medicoRemoveDadosAdicionais extends javax.swing.JFrame {

    private GerenciadorDeEntidade gerenciador;
    private JFrame telaAnterior;
    private List<Paciente> results;

    /**
     * Creates new form medicoRemoveDadosAdicionais
     */
    public medicoRemoveDadosAdicionais(JFrame tela, GerenciadorDeEntidade g) {
        initComponents();
        telaAnterior = tela;
        gerenciador = g;
        results = gerenciador.getPacientesDadosAdicionais();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/supimpa.png")).getImage());
    }

    public medicoRemoveDadosAdicionais() {
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

        exitButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doencaCardiacaSimButton = new javax.swing.JRadioButton();
        pacienteComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        doencaCardiacaNaoButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fumanteSimButton = new javax.swing.JRadioButton();
        pacienteDiabeteTxt = new javax.swing.JTextField();
        fumanteNaoButton = new javax.swing.JRadioButton();
        alcoolSimButton = new javax.swing.JRadioButton();
        pacienteCirurgiaTxt = new javax.swing.JTextField();
        alcoolNaoButton = new javax.swing.JRadioButton();
        pacienteColesterolTxt = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        pacienteAlergiaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        statusText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        exitButton.setText("Cancelar");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Alergias:");

        jLabel4.setText("Valor do colesterol:");

        doencaCardiacaSimButton.setText("Sim");
        doencaCardiacaSimButton.setActionCommand("sim");
        doencaCardiacaSimButton.setEnabled(false);

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

        jLabel5.setText("Diabete:");

        doencaCardiacaNaoButton.setText("N??o");
        doencaCardiacaNaoButton.setActionCommand("n??o");
        doencaCardiacaNaoButton.setEnabled(false);

        jLabel7.setText("Cirurgias:");

        jLabel1.setText("Selecione o paciente a remover dados adicionais:");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Doen??a card??aca:");

        fumanteSimButton.setText("Sim");
        fumanteSimButton.setActionCommand("sim");
        fumanteSimButton.setEnabled(false);

        pacienteDiabeteTxt.setEditable(false);
        pacienteDiabeteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteDiabeteTxtActionPerformed(evt);
            }
        });

        fumanteNaoButton.setText("N??o");
        fumanteNaoButton.setActionCommand("n??o");
        fumanteNaoButton.setEnabled(false);

        alcoolSimButton.setText("Sim");
        alcoolSimButton.setActionCommand("sim");
        alcoolSimButton.setEnabled(false);

        pacienteCirurgiaTxt.setEditable(false);
        pacienteCirurgiaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteCirurgiaTxtActionPerformed(evt);
            }
        });

        alcoolNaoButton.setText("N??o");
        alcoolNaoButton.setActionCommand("n??o");
        alcoolNaoButton.setEnabled(false);

        pacienteColesterolTxt.setEditable(false);
        pacienteColesterolTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel2.setText("Fumante:");

        pacienteAlergiaTxt.setEditable(false);
        pacienteAlergiaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteAlergiaTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Consome ??lcool:");

        statusText.setText("Aguardando...");

        jLabel8.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fumanteSimButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fumanteNaoButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alcoolSimButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alcoolNaoButton))
                            .addComponent(pacienteColesterolTxt)
                            .addComponent(pacienteDiabeteTxt)
                            .addComponent(pacienteCirurgiaTxt)
                            .addComponent(pacienteAlergiaTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doencaCardiacaSimButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doencaCardiacaNaoButton)))))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fumanteSimButton)
                        .addComponent(fumanteNaoButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alcoolSimButton)
                    .addComponent(alcoolNaoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pacienteColesterolTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteDiabeteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(doencaCardiacaSimButton)
                    .addComponent(doencaCardiacaNaoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteCirurgiaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(pacienteAlergiaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(exitButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusText)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addContainerGap(329, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        telaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void pacienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pacienteComboBoxItemStateChanged
        try {
            int index = pacienteComboBox.getSelectedIndex();
            DadosAdicionais dadosAdicionais = results.get(index).getDadosAdicionais();
            if (dadosAdicionais.getFuma() == true) {
                fumanteSimButton.setSelected(true);
                fumanteNaoButton.setSelected(false);
            } else {
                fumanteNaoButton.setSelected(true);
                fumanteSimButton.setSelected(false);
            }
            if (dadosAdicionais.getBebe() == true) {
                alcoolSimButton.setSelected(true);
                alcoolNaoButton.setSelected(false);
            } else {
                alcoolNaoButton.setSelected(true);
                alcoolSimButton.setSelected(false);
            }
            if (dadosAdicionais.getDoen??aCardiaca() == true) {
                doencaCardiacaSimButton.setSelected(true);
                doencaCardiacaNaoButton.setSelected(false);
            } else {
                doencaCardiacaNaoButton.setSelected(true);
                doencaCardiacaSimButton.setSelected(false);
            }
            pacienteColesterolTxt.setText(Double.toString(dadosAdicionais.getColesterol()));
            pacienteCirurgiaTxt.setText(dadosAdicionais.getCirurgias());
            pacienteDiabeteTxt.setText(dadosAdicionais.getDiabete());
            pacienteAlergiaTxt.setText(dadosAdicionais.getAlergias());
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_pacienteComboBoxItemStateChanged

    private void pacienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Deseja mesmo remover os dados adicionais do paciente?", "", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            try {
                int index = pacienteComboBox.getSelectedIndex();
                int idPaciente = results.get(index).getIdPaciente();
                DadosAdicionais dadosAdicionaisRemover = results.get(index).getDadosAdicionais();
                results.get(index).setDadosAdicionais(null);
                int status = gerenciador.remove(dadosAdicionaisRemover);
                if (status == 1) {
                    statusText.setText(String.format("Dados adicionais do paciente %s removido com sucesso!", pacienteComboBox.getSelectedItem()));
                    statusText.setForeground(Color.decode("#17cf17"));
                    pacienteComboBox.removeItemAt(index);
                    results = gerenciador.getPacientesDadosAdicionais();
                    if (results.size() == 0) {
                        JOptionPane.showMessageDialog(this, "Nenhum paciente com dados adicionais cadastrado.", "Remover Dados adicionais", JOptionPane.ERROR_MESSAGE);
                        telaAnterior.setVisible(true);
                        this.dispose();
                    }
                } else {
                    statusText.setText("Erro ao remover paciente!");
                    statusText.setForeground(Color.decode("#17cf17"));
                }
            } catch (Exception e) {
                statusText.setText("Ocorreu um erro, verifique os dados inseridos!");
                statusText.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pacienteDiabeteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteDiabeteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteDiabeteTxtActionPerformed

    private void pacienteCirurgiaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteCirurgiaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteCirurgiaTxtActionPerformed

    private void pacienteAlergiaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteAlergiaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteAlergiaTxtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        results.forEach(e -> {
            pacienteComboBox.addItem(e.getNome());
        });
        if (results.size() == 0) {
            JOptionPane.showMessageDialog(this, "N??o h?? nenhum paciente com dados adicionais cadastrado.", "Remover Dados Adicionais.", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(medicoRemoveDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicoRemoveDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicoRemoveDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicoRemoveDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicoRemoveDadosAdicionais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alcoolNaoButton;
    private javax.swing.JRadioButton alcoolSimButton;
    private javax.swing.JRadioButton doencaCardiacaNaoButton;
    private javax.swing.JRadioButton doencaCardiacaSimButton;
    private javax.swing.JButton exitButton;
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
