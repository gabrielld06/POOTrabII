/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JFrame;

/**
 *
 * @author Gabriel
 */
public class medicoGerarRelatorio extends javax.swing.JFrame {

    private JFrame telaAnterior;

    /**
     * Creates new form medicoGerarRelatorioMedico
     */
    public medicoGerarRelatorio(JFrame tela) {
        initComponents();
        telaAnterior = tela;
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/supimpa.png")).getImage());
    }

    public medicoGerarRelatorio() {
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
        gerarReceitaBtn = new javax.swing.JButton();
        gerarAtestadoBtn = new javax.swing.JButton();
        GerarAcompanhamentoBtn = new javax.swing.JButton();
        gerarClientesMesBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(321, 244));
        setPreferredSize(new java.awt.Dimension(321, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(321, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setText("Voltar");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, -1));

        gerarReceitaBtn.setText("Gerar receita");
        gerarReceitaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarReceitaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(gerarReceitaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 43, 246, -1));

        gerarAtestadoBtn.setText("Gerar atestado");
        gerarAtestadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarAtestadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(gerarAtestadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 77, 246, -1));

        GerarAcompanhamentoBtn.setText("Gerar declaração de acompanhamento");
        GerarAcompanhamentoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarAcompanhamentoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(GerarAcompanhamentoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 111, 246, -1));

        gerarClientesMesBtn.setText("Gerar clientes atendidos no mês");
        gerarClientesMesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarClientesMesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(gerarClientesMesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 145, 246, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Selecione o relatório para gerar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        telaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void gerarReceitaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarReceitaBtnActionPerformed
        this.setVisible(false);
        medicoGerarReceita telaAtualiza = new medicoGerarReceita(this);
        telaAtualiza.setVisible(true);
    }//GEN-LAST:event_gerarReceitaBtnActionPerformed

    private void gerarAtestadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarAtestadoBtnActionPerformed
        this.setVisible(false);
        medicoGerarAtestado telaAtualiza = new medicoGerarAtestado(this);
        telaAtualiza.setVisible(true);
    }//GEN-LAST:event_gerarAtestadoBtnActionPerformed

    private void GerarAcompanhamentoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarAcompanhamentoBtnActionPerformed
        this.setVisible(false);
        medicoDeclaracaoAcompanhamento telaAtualiza = new medicoDeclaracaoAcompanhamento(this);
        telaAtualiza.setVisible(true);
    }//GEN-LAST:event_GerarAcompanhamentoBtnActionPerformed

    private void gerarClientesMesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarClientesMesBtnActionPerformed
        this.setVisible(false);
        medicoGerarClientesAtendidos telaAtualiza = new medicoGerarClientesAtendidos(this);
        telaAtualiza.setVisible(true);
    }//GEN-LAST:event_gerarClientesMesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(medicoGerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicoGerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicoGerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicoGerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicoGerarRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GerarAcompanhamentoBtn;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gerarAtestadoBtn;
    private javax.swing.JButton gerarClientesMesBtn;
    private javax.swing.JButton gerarReceitaBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
