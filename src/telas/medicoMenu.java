/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controleUsuario.Medico;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel
 */
public class medicoMenu extends javax.swing.JFrame {

    private JFrame telaAnterior;
    Medico medico = new Medico();

    public medicoMenu() {
        initComponents();
    }

    public medicoMenu(JFrame tela, Medico m) {
        initComponents();
        telaAnterior = tela;
        medico = m;
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/supimpa.png")).getImage());
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
        cadastrarButton = new javax.swing.JButton();
        atualizaButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        menuText1 = new javax.swing.JLabel();
        cadastrarProntuarioButton = new javax.swing.JButton();
        atualizarProntuarioButton = new javax.swing.JButton();
        removeProntuarioButton = new javax.swing.JButton();
        gerarRelatorioMedicoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        cadastrarButton.setText("Cadastrar Dados Adicionais");
        cadastrarButton.setPreferredSize(new java.awt.Dimension(180, 22));
        cadastrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarButtonMouseClicked(evt);
            }
        });
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        atualizaButton.setText("Atualizar Dados Adicionais");
        atualizaButton.setPreferredSize(new java.awt.Dimension(180, 22));
        atualizaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizaButtonMouseClicked(evt);
            }
        });

        removeButton.setText("Remover Dados Adicionais");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });

        menuText1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuText1.setText("Menu médico");
        menuText1.setPreferredSize(new java.awt.Dimension(110, 25));

        cadastrarProntuarioButton.setText("Cadastrar Prontuário");
        cadastrarProntuarioButton.setPreferredSize(new java.awt.Dimension(140, 22));
        cadastrarProntuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProntuarioButtonActionPerformed(evt);
            }
        });

        atualizarProntuarioButton.setText("Atualizar Prontuário");
        atualizarProntuarioButton.setPreferredSize(new java.awt.Dimension(140, 22));
        atualizarProntuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProntuarioButtonActionPerformed(evt);
            }
        });

        removeProntuarioButton.setText("Remover Prontuário");
        removeProntuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProntuarioButtonActionPerformed(evt);
            }
        });

        gerarRelatorioMedicoButton.setText("Gerar Relatórios Médicos");
        gerarRelatorioMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioMedicoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(cadastrarProntuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gerarRelatorioMedicoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(atualizaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeProntuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atualizarProntuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 422, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(menuText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(menuText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarProntuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarProntuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(removeProntuarioButton))
                .addGap(18, 18, 18)
                .addComponent(gerarRelatorioMedicoButton)
                .addGap(27, 27, 27)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarButtonMouseClicked
        this.setVisible(false);
        medico.cadastraPaciente(this);
    }//GEN-LAST:event_cadastrarButtonMouseClicked

    private void atualizaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizaButtonMouseClicked
        this.setVisible(false);
        medico.atualizaPaciente(this);

    }//GEN-LAST:event_atualizaButtonMouseClicked

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
        this.setVisible(false);
        medico.removePaciente(this);
    }//GEN-LAST:event_removeButtonMouseClicked

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        telaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cadastrarProntuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProntuarioButtonActionPerformed
        this.setVisible(false);
        medico.cadastraConsulta(this);
    }//GEN-LAST:event_cadastrarProntuarioButtonActionPerformed

    private void atualizarProntuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarProntuarioButtonActionPerformed
        this.setVisible(false);
        medico.atualizaConsulta(this);
    }//GEN-LAST:event_atualizarProntuarioButtonActionPerformed

    private void removeProntuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProntuarioButtonActionPerformed
        this.setVisible(false);
        medico.removeConsulta(this);
    }//GEN-LAST:event_removeProntuarioButtonActionPerformed

    private void gerarRelatorioMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioMedicoButtonActionPerformed
        this.setVisible(false);
        medico.gerarRelatorio(this);
    }//GEN-LAST:event_gerarRelatorioMedicoButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(medicoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizaButton;
    private javax.swing.JButton atualizarProntuarioButton;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JButton cadastrarProntuarioButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gerarRelatorioMedicoButton;
    private javax.swing.JLabel menuText1;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton removeProntuarioButton;
    // End of variables declaration//GEN-END:variables
}
