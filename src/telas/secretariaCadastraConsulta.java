/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import POJO.Consulta;
import POJO.Paciente;
import entityManager.GerenciadorDeEntidade;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Gabriel
 */
public class secretariaCadastraConsulta extends javax.swing.JFrame {

    private GerenciadorDeEntidade gerenciador = new GerenciadorDeEntidade();
    List<Paciente> results = gerenciador.getPacientesSemConsulta();
    private JFrame telaAnterior;

    /**
     * Creates new form secretariaCadastraConsulta
     */
    public secretariaCadastraConsulta(JFrame tela) {
        initComponents();
        telaAnterior = tela;
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/supimpa.png")).getImage());
    }

    public secretariaCadastraConsulta() {
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

        jCalendar1 = new com.toedter.calendar.JCalendar();
        exitButton = new javax.swing.JButton();
        confirmaButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        statusText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        horarioTextPane = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pacienteComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicoTextPane = new javax.swing.JTextPane();
        tipoComboBox = new javax.swing.JComboBox<>();
        dataTextPane = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(291, 297));
        setPreferredSize(new java.awt.Dimension(291, 320));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        exitButton.setText("Cancelar");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(175, 223, 76, 22);

        confirmaButton.setText("Confirmar");
        confirmaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmaButton);
        confirmaButton.setBounds(73, 223, 84, 22);

        jLabel8.setText("Digite as informações para marcar a Consulta");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(22, 6, 239, 16);

        statusText.setText("Aguardando...");
        getContentPane().add(statusText);
        statusText.setBounds(47, 263, 75, 16);

        jLabel9.setText("Status:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(6, 263, 35, 16);

        horarioTextPane.setText("horario");
        horarioTextPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioTextPaneActionPerformed(evt);
            }
        });
        getContentPane().add(horarioTextPane);
        horarioTextPane.setBounds(98, 142, 99, 22);

        jLabel3.setText("Medico");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(52, 86, 40, 16);

        jLabel4.setText("Data:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(65, 114, 27, 16);

        jLabel5.setText("Horario");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(52, 145, 40, 16);

        jLabel6.setText("Tipo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(69, 179, 23, 16);

        getContentPane().add(pacienteComboBox);
        pacienteComboBox.setBounds(98, 40, 100, 22);

        jLabel1.setText("Paciente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(47, 43, 45, 16);

        medicoTextPane.setText("medico");
        jScrollPane1.setViewportView(medicoTextPane);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(98, 80, 100, 22);

        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Retorno" }));
        getContentPane().add(tipoComboBox);
        tipoComboBox.setBounds(98, 176, 99, 22);

        dataTextPane.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(dataTextPane);
        dataTextPane.setBounds(100, 110, 120, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        telaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void confirmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaButtonActionPerformed
        Consulta novaConsulta = new Consulta();
        try {
            LocalDate data = dataTextPane.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (data.isAfter(LocalDate.now())) {
                novaConsulta.setMedico(medicoTextPane.getText());
                novaConsulta.setData(data);
                novaConsulta.setHorario(horarioTextPane.getText());
                novaConsulta.setTipo(tipoComboBox.getSelectedItem().toString());
                int index = pacienteComboBox.getSelectedIndex();
                int idPaciente = results.get(index).getIdPaciente();
                Paciente paciente = results.get(index);
                paciente.setConsulta(novaConsulta);
                novaConsulta.setPaciente(paciente);
                int status = gerenciador.inserir(novaConsulta);
                if (status == 1) {
                    statusText.setText("Consulta cadastrada com sucesso!");
                    statusText.setForeground(Color.decode("#17cf17"));
                    if (novaConsulta.getData().toString().equals(LocalDate.now().plusDays(1).toString())) {
                        String txt = "";
                        if (paciente.getEmail().equals("") && !paciente.getTelefone().equals("")) {
                            txt += "SMS enviado para ";
                        } else if (!paciente.getEmail().equals("") && paciente.getTelefone().equals("")) {
                            txt += "Email enviado para ";
                        } else if (!paciente.getEmail().equals("") && !paciente.getTelefone().equals("")) {
                            txt += "SMS e email enviado para ";
                        } else {
                            txt += "Nenhuma forma de contato registrada para ";
                        }
                        txt += paciente.getNome();
                        JOptionPane.showMessageDialog(this, txt, "Gerenciador de mensagens", JOptionPane.INFORMATION_MESSAGE);
                    }
                    pacienteComboBox.removeItemAt(index);
                    results = gerenciador.getPacientesSemConsulta();
                    if (results.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Nenhum paciente sem consulta cadastrado.", "Cadastrar Consulta", JOptionPane.ERROR_MESSAGE);
                        telaAnterior.setVisible(true);
                        this.dispose();
                    }
                } else {
                    statusText.setText("Ocorreu um erro ao atualizar a consulta.");
                    statusText.setForeground(Color.red);
                }
            } else {
                throw new Exception("Data inválida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data inválida", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_confirmaButtonActionPerformed

    private void horarioTextPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioTextPaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioTextPaneActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        results.forEach(e -> {
            pacienteComboBox.addItem(e.getNome());
        });
        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum paciente cadastrado", "Cadastrar Consulta", JOptionPane.ERROR_MESSAGE);
            telaAnterior.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(secretariaCadastraConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secretariaCadastraConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secretariaCadastraConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secretariaCadastraConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secretariaCadastraConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmaButton;
    private com.toedter.calendar.JDateChooser dataTextPane;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField horarioTextPane;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane medicoTextPane;
    private javax.swing.JComboBox<String> pacienteComboBox;
    private javax.swing.JLabel statusText;
    private javax.swing.JComboBox<String> tipoComboBox;
    // End of variables declaration//GEN-END:variables
}
