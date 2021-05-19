/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import POJO.Paciente;
import entityManager.GerenciadorDeEntidade;
import java.awt.Color;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author guipa
 */
public class secretariaAtualizaPaciente extends javax.swing.JFrame {
    private Paciente paciente;
    private GerenciadorDeEntidade gerenciador = new GerenciadorDeEntidade();
    List<Paciente> results = gerenciador.getPacientes();
    private JFrame telaAnterior;
    /**
     * Creates new form secretariaForm
     */
    public secretariaAtualizaPaciente(JFrame tela) {
        initComponents();
        telaAnterior = tela;
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/supimpa.png")).getImage());
    }

    private secretariaAtualizaPaciente() {
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

        jLabel1 = new javax.swing.JLabel();
        pacienteComboBox = new javax.swing.JComboBox<>();
        pacienteNomeTxt = new javax.swing.JTextField();
        pacienteEnderecoTxt = new javax.swing.JTextField();
        pacienteTelefoneTxt = new javax.swing.JTextField();
        pacienteEmailTxt = new javax.swing.JTextField();
        pacienteDataNascimentoTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        statusText = new javax.swing.JLabel();
        pacienteConvernioCBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Selecione o paciente a atualizar:");

        pacienteComboBox.setEditable(true);
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

        pacienteNomeTxt.setText("Nome");
        pacienteNomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteNomeTxtActionPerformed(evt);
            }
        });

        pacienteEnderecoTxt.setText("Endereço");
        pacienteEnderecoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteEnderecoTxtActionPerformed(evt);
            }
        });

        pacienteTelefoneTxt.setText("telefone");
        pacienteTelefoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteTelefoneTxtActionPerformed(evt);
            }
        });

        pacienteEmailTxt.setText("email");
        pacienteEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteEmailTxtActionPerformed(evt);
            }
        });

        pacienteDataNascimentoTxt.setText("nascimento");
        pacienteDataNascimentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteDataNascimentoTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Convenio:");

        jLabel4.setText("Data de nascimento:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Endereço:");

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

        pacienteConvernioCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Particular", "Plano de saúde" }));

        jLabel8.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pacienteEnderecoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(pacienteDataNascimentoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pacienteNomeTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(pacienteTelefoneTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(pacienteEmailTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(pacienteConvernioCBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteNomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pacienteConvernioCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteDataNascimentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteTelefoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteEnderecoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancelButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusText)
                    .addComponent(jLabel8))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pacienteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        System.out.println("abriu");
        //SELECT NOME FROM GABRIELLD.PACIENTE ORDER BY NOME;
        results.forEach(e -> {
            pacienteComboBox.addItem(e.getNome());
        });
        if (results.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado", "Atualizar Paciente", JOptionPane.ERROR_MESSAGE);
            telaAnterior.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void pacienteEnderecoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteEnderecoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteEnderecoTxtActionPerformed

    private void pacienteTelefoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteTelefoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteTelefoneTxtActionPerformed

    private void pacienteEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteEmailTxtActionPerformed

    private void pacienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pacienteComboBoxItemStateChanged
        int index = pacienteComboBox.getSelectedIndex();
        pacienteNomeTxt.setText(results.get(index).getNome());
        pacienteConvernioCBox.setSelectedItem(results.get(index).getConvenio());
        //pacienteDataNascimentoTxt.setText(results.get(index).getDataNascimento().toString());
        pacienteEnderecoTxt.setText(results.get(index).getEndereco());
        pacienteTelefoneTxt.setText(results.get(index).getTelefone());
        pacienteEmailTxt.setText(results.get(index).getEmail());
        statusText.setText("Aguardando...");
        statusText.setForeground(Color.white);
    }//GEN-LAST:event_pacienteComboBoxItemStateChanged

    private void pacienteDataNascimentoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteDataNascimentoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacienteDataNascimentoTxtActionPerformed

    private void pacienteNomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteNomeTxtActionPerformed

    }//GEN-LAST:event_pacienteNomeTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int index = pacienteComboBox.getSelectedIndex();
            int idPaciente = results.get(index).getIdPaciente();
            Paciente pacienteAtualizar = gerenciador.buscaPaciente(idPaciente);
            pacienteAtualizar.setNome(pacienteNomeTxt.getText());;
            pacienteAtualizar.setConvenio(pacienteConvernioCBox.getSelectedItem().toString());
            pacienteAtualizar.setDataNascimento(LocalDate.parse(pacienteDataNascimentoTxt.getText()));
            pacienteAtualizar.setEndereco(pacienteEnderecoTxt.getText());
            pacienteAtualizar.setTelefone(pacienteTelefoneTxt.getText());
            pacienteAtualizar.setEmail(pacienteEmailTxt.getText());
            int status = gerenciador.atualizaPaciente();
            if (status == 1){
                pacienteComboBox.removeItemAt(index);
                pacienteComboBox.insertItemAt(pacienteAtualizar.getNome(), index);
                pacienteComboBox.setSelectedIndex(index);
                statusText.setText("Paciente atualizado com sucesso!");
                statusText.setForeground(Color.decode("#006400"));
            }else{
                statusText.setText("Ocorreu um erro ao atualizar o paciente.");
                statusText.setForeground(Color.red);
            } 
        } catch(Exception e) {
            JOptionPane.showInputDialog("Formato de data incorreto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(secretariaAtualizaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secretariaAtualizaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secretariaAtualizaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secretariaAtualizaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secretariaAtualizaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> pacienteComboBox;
    private javax.swing.JComboBox<String> pacienteConvernioCBox;
    private javax.swing.JTextField pacienteDataNascimentoTxt;
    private javax.swing.JTextField pacienteEmailTxt;
    private javax.swing.JTextField pacienteEnderecoTxt;
    private javax.swing.JTextField pacienteNomeTxt;
    private javax.swing.JTextField pacienteTelefoneTxt;
    private javax.swing.JLabel statusText;
    // End of variables declaration//GEN-END:variables
}
