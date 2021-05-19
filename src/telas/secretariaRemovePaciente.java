/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

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
public class secretariaRemovePaciente extends javax.swing.JFrame {
    private Paciente paciente;
    private GerenciadorDeEntidade gerenciador = new GerenciadorDeEntidade();
    List<Paciente> results = gerenciador.getPacientes();
    private JFrame telaAnterior;
    /**
     * Creates new form secretariaRemovePaciente
     */
    public secretariaRemovePaciente(JFrame tela) {
        initComponents();
        telaAnterior = tela;
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/supimpa.png")).getImage());
    }

    private secretariaRemovePaciente() {
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

        semPacienteMsg = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pacienteComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        statusText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pacienteNomeText = new javax.swing.JLabel();
        pacienteConvenioText = new javax.swing.JLabel();
        pacienteDataNascimentoText = new javax.swing.JLabel();
        pacienteTelefoneText = new javax.swing.JLabel();
        pacienteEnderecoText = new javax.swing.JLabel();
        pacienteEmailText = new javax.swing.JLabel();

        semPacienteMsg.setAlwaysOnTop(true);
        semPacienteMsg.setType(java.awt.Window.Type.POPUP);

        jLabel9.setText("Não há mais pacientes.");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout semPacienteMsgLayout = new javax.swing.GroupLayout(semPacienteMsg.getContentPane());
        semPacienteMsg.getContentPane().setLayout(semPacienteMsgLayout);
        semPacienteMsgLayout.setHorizontalGroup(
            semPacienteMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semPacienteMsgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(semPacienteMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jLabel9))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        semPacienteMsgLayout.setVerticalGroup(
            semPacienteMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semPacienteMsgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        jLabel7.setText("Email:");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        statusText.setText("Aguardando...");

        jLabel8.setText("Status:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Convenio:");

        jLabel4.setText("Data de nascimento:");

        jLabel5.setText("Telefone:");

        jLabel1.setText("Selecione o paciente para remover:");

        jLabel6.setText("Endereço:");

        pacienteNomeText.setText("Nome");

        pacienteConvenioText.setText("Convenio");

        pacienteDataNascimentoText.setText("Data de nascimento");

        pacienteTelefoneText.setText("Telefone");

        pacienteEnderecoText.setText("Endereço");

        pacienteEmailText.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pacienteEmailText)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pacienteNomeText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pacienteConvenioText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pacienteDataNascimentoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pacienteTelefoneText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pacienteEnderecoText, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusText)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pacienteEmailText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pacienteNomeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pacienteConvenioText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pacienteDataNascimentoText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pacienteTelefoneText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pacienteEnderecoText)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusText)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pacienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pacienteComboBoxItemStateChanged
        int index = pacienteComboBox.getSelectedIndex();
        if (index < 0){
            JOptionPane.showMessageDialog(null, "Todos os pacientes foram removidos", "Remover Paciente", JOptionPane.ERROR_MESSAGE);
            telaAnterior.setVisible(true);
            this.dispose();
        } else {
            pacienteNomeText.setText(results.get(index).getNome());
            pacienteConvenioText.setText(results.get(index).getConvenio());
            //pacienteDataNascimentoTxt.setText(results.get(index).getDataNascimento().toString());
            pacienteEnderecoText.setText(results.get(index).getEndereco());
            pacienteTelefoneText.setText(results.get(index).getTelefone());
            pacienteEmailText.setText(results.get(index).getEmail());
        }
    }//GEN-LAST:event_pacienteComboBoxItemStateChanged

    private void pacienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int index = pacienteComboBox.getSelectedIndex();
        int idPaciente = results.get(index).getIdPaciente();
        Paciente pacienteRemover = gerenciador.buscaPaciente(idPaciente);
        int status = gerenciador.remove(pacienteRemover);
        if (status == 1){
            statusText.setText("Paciente removido com sucesso!");
            statusText.setForeground(Color.decode("#006400"));
            pacienteComboBox.removeItemAt(index);
            results = gerenciador.getPacientes();
            if (results.size() == 0){
                JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado", "Remover Paciente", JOptionPane.ERROR_MESSAGE);
                telaAnterior.setVisible(true);
                this.dispose();
            }
        }else{
            statusText.setText("Erro ao remover paciente!");
            statusText.setForeground(Color.decode("#006400"));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        results.forEach(e -> {
            pacienteComboBox.addItem(e.getNome());
        });
        if (results.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado", "Remover Paciente", JOptionPane.ERROR_MESSAGE);
            telaAnterior.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
        telaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

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
            java.util.logging.Logger.getLogger(secretariaRemovePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secretariaRemovePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secretariaRemovePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secretariaRemovePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secretariaRemovePaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> pacienteComboBox;
    private javax.swing.JLabel pacienteConvenioText;
    private javax.swing.JLabel pacienteDataNascimentoText;
    private javax.swing.JLabel pacienteEmailText;
    private javax.swing.JLabel pacienteEnderecoText;
    private javax.swing.JLabel pacienteNomeText;
    private javax.swing.JLabel pacienteTelefoneText;
    private javax.swing.JDialog semPacienteMsg;
    private javax.swing.JLabel statusText;
    // End of variables declaration//GEN-END:variables
}
