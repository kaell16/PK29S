/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pk29s;

import javax.swing.JDesktopPane;

/**
 *
 * @author kaell
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    JDesktopPane desktopPane = new JDesktopPane();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnSair = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnPesquisa = new javax.swing.JMenuItem();
        mnCadastro = new javax.swing.JMenuItem();
        mnEdicao = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnOcorrenciasFrequentes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Ocorrências");
        setName("principal"); // NOI18N

        mnSair.setText("Sair");
        mnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnSair);

        jMenu2.setText("Opções");

        mnPesquisa.setText("Pesquisa");
        mnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPesquisaActionPerformed(evt);
            }
        });
        jMenu2.add(mnPesquisa);

        mnCadastro.setText("Cadastro");
        mnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(mnCadastro);

        mnEdicao.setText("Edição");
        mnEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEdicaoActionPerformed(evt);
            }
        });
        jMenu2.add(mnEdicao);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        mnOcorrenciasFrequentes.setText("Ocorrências Frequentes");
        mnOcorrenciasFrequentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOcorrenciasFrequentesActionPerformed(evt);
            }
        });
        jMenu3.add(mnOcorrenciasFrequentes);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnPesquisaActionPerformed

    private void mnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnCadastroActionPerformed

    private void mnEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnEdicaoActionPerformed

    private void mnOcorrenciasFrequentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOcorrenciasFrequentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnOcorrenciasFrequentesActionPerformed

    private void mnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mnSairMouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnCadastro;
    private javax.swing.JMenuItem mnEdicao;
    private javax.swing.JMenuItem mnOcorrenciasFrequentes;
    private javax.swing.JMenuItem mnPesquisa;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}