package view;

import javax.swing.ImageIcon;

public class TelaVenceu extends javax.swing.JFrame {

    public TelaVenceu() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo_icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSim = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Forca");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSim.png"))); // NOI18N
        btnSim.setToolTipText("Clique para jogar novamente");
        btnSim.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSim2.png"))); // NOI18N
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });
        getContentPane().add(btnSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 60));

        btnNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnNao.png"))); // NOI18N
        btnNao.setToolTipText("Clique para fechar o jogo");
        btnNao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnNao2.png"))); // NOI18N
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 230, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_venceu.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnNaoActionPerformed

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        TelaInicio startScreen = new TelaInicio();
        startScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSimActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVenceu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenceu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenceu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenceu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenceu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnSim;
    // End of variables declaration//GEN-END:variables
}
