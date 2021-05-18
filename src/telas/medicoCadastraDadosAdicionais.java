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
 * @author guipa
 */
public class medicoCadastraDadosAdicionais extends javax.swing.JFrame {
    private Paciente paciente;
    private GerenciadorDeEntidade gerenciador = new GerenciadorDeEntidade();
    List<Paciente> results = gerenciador.buscaPacienteSemDadosAdicionais();
    JFrame telaAnterior;
    
    /**
     * Creates new form medicoCadastraDadosAdicionais
     */
    public medicoCadastraDadosAdicionais(JFrame tela) {
        initComponents();
        telaAnterior = tela;
        setLocationRelativeTo(null);
    }
    
    public medicoCadastraDadosAdicionais() {
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
        doencaCardiacaGroup = new javax.swing.ButtonGroup();
        pacienteComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        pacienteDiabeteTxt = new javax.swing.JTextField();
        statusText = new javax.swing.JLabel();
        pacienteCirurgiaTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fumanteSimButton = new javax.swing.JRadioButton();
        fumanteNaoButton = new javax.swing.JRadioButton();
        alcoolSimButton = new javax.swing.JRadioButton();
        alcoolNaoButton = new javax.swing.JRadioButton();
        pacienteColesterolTxt = new javax.swing.JFormattedTextField();
        pacienteAlergiaTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        doencaCardiacaSimButton = new javax.swing.JRadioButton();
        doencaCardiacaNaoButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pacienteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pacienteComboBoxItemStateChanged(evt);
            }
        });
        pacienteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Cirurgias:");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        exitButton.setText("Cancelar");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        pacienteDiabeteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteDiabeteTxtActionPerformed(evt);
            }
        });

        statusText.setText("Aguardando...");

        pacienteCirurgiaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteCirurgiaTxtActionPerformed(evt);
            }
        });

        jLabel8.setText("Status:");

        jLabel2.setText("Fumante:");

        jLabel3.setText("Consome álcool:");

        jLabel4.setText("Valor do colesterol:");

        jLabel5.setText("Diabete:");

        jLabel1.setText("Selecione o paciente a cadastrar dados adicionais:");

        jLabel6.setText("Doença cardíaca:");

        fumanteGroup.add(fumanteSimButton);
        fumanteSimButton.setText("Sim");
        fumanteSimButton.setActionCommand("sim");

        fumanteGroup.add(fumanteNaoButton);
        fumanteNaoButton.setText("Não");
        fumanteNaoButton.setActionCommand("não");

        alcoolGroup.add(alcoolSimButton);
        alcoolSimButton.setText("Sim");
        alcoolSimButton.setActionCommand("sim");

        alcoolGroup.add(alcoolNaoButton);
        alcoolNaoButton.setText("Não");
        alcoolNaoButton.setActionCommand("não");

        pacienteColesterolTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        pacienteAlergiaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteAlergiaTxtActionPerformed(evt);
            }
        });

        jLabel9.setText("Alergias:");

        doencaCardiacaGroup.add(doencaCardiacaSimButton);
        doencaCardiacaSimButton.setText("Sim");
        doencaCardiacaSimButton.setActionCommand("sim");

        doencaCardiacaGroup.add(doencaCardiacaNaoButton);
        doencaCardiacaNaoButton.setText("Não");
        doencaCardiacaNaoButton.setActionCommand("não");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitButton))
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
                                        .addComponent(doencaCardiacaNaoButton)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusText)
                    .addComponent(jLabel8)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pacienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pacienteComboBoxItemStateChanged

        
    }//GEN-LAST:event_pacienteComboBoxItemStateChanged

    private void pacienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int index = pacienteComboBox.getSelectedIndex();
        int idPaciente = results.get(index).getIdPaciente();
        Paciente paciente = gerenciador.buscaPaciente(idPaciente);
        DadosAdicionais novoDadosAdicionais = new DadosAdicionais();
        String fuma, bebe, doencaCardiaca;
        fuma = fumanteGroup.getSelection().getActionCommand();
        bebe = alcoolGroup.getSelection().getActionCommand();
        System.out.println(bebe);
        doencaCardiaca = doencaCardiacaGroup.getSelection().getActionCommand();
        novoDadosAdicionais.setFuma(fuma);
        novoDadosAdicionais.setBebe(bebe);
        novoDadosAdicionais.setDoençaCardiaca(doencaCardiaca);
        novoDadosAdicionais.setColesterol(pacienteColesterolTxt.getText());
        novoDadosAdicionais.setDiabete(pacienteDiabeteTxt.getText());
        novoDadosAdicionais.setCirurgias(pacienteCirurgiaTxt.getText());
        novoDadosAdicionais.setAlergias(pacienteAlergiaTxt.getText());
        novoDadosAdicionais.setPaciente(paciente);
        paciente.setDadosAdicionais(novoDadosAdicionais);
        int status = gerenciador.inserir(novoDadosAdicionais);
        if (status == 1){
            statusText.setText("Dados adicionais cadastrados com sucesso!");
            statusText.setForeground(Color.decode("#006400"));
        }else{
            statusText.setText("Ocorreu um erro ao cadastrar os dados adicionais!");
            statusText.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pacienteDiabeteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteDiabeteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteDiabeteTxtActionPerformed

    private void pacienteCirurgiaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteCirurgiaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteCirurgiaTxtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        results.forEach(e -> {
            pacienteComboBox.addItem(e.getNome());
        });
        if (results.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhum paciente sem dados adicionais.", "Cadastrar dados adicionais", JOptionPane.ERROR_MESSAGE);
            telaAnterior.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void pacienteAlergiaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteAlergiaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteAlergiaTxtActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        telaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(medicoCadastraDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicoCadastraDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicoCadastraDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicoCadastraDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicoCadastraDadosAdicionais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alcoolGroup;
    private javax.swing.JRadioButton alcoolNaoButton;
    private javax.swing.JRadioButton alcoolSimButton;
    private javax.swing.ButtonGroup doencaCardiacaGroup;
    private javax.swing.JRadioButton doencaCardiacaNaoButton;
    private javax.swing.JRadioButton doencaCardiacaSimButton;
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
