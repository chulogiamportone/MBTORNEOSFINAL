/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mbtorneo;

/**
 *
 * @author Juli
 */
public class partidos extends javax.swing.JFrame {

    /**
     * Creates new form equipos
     */
    public partidos(Torneo t,int i) {
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

        ImputCNombre5 = new javax.swing.JTextField();
        ImputCNombre6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        LabelPartido = new javax.swing.JLabel();
        BotonPartido = new javax.swing.JButton();
        ImputPGoles1 = new javax.swing.JTextField();
        ImputPGoles2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        ImputCNombre5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre5.setText("Nombre del Equipo");
        ImputCNombre5.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputCNombre5ActionPerformed(evt);
            }
        });

        ImputCNombre6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre6.setText("Nombre del Equipo");
        ImputCNombre6.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputCNombre6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        LabelPartido.setFont(new java.awt.Font("Twitchy.TV", 0, 36)); // NOI18N
        LabelPartido.setForeground(new java.awt.Color(255, 255, 255));
        LabelPartido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPartido.setText("NUEVO EQUIPO");
        LabelPartido.setToolTipText("");
        LabelPartido.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelPartido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LabelPartido.setMaximumSize(new java.awt.Dimension(210003, 290000));
        LabelPartido.setPreferredSize(new java.awt.Dimension(480, 100));

        BotonPartido.setText("SIGUIENTE");
        BotonPartido.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonPartido.setMaximumSize(new java.awt.Dimension(73000, 200003));
        BotonPartido.setPreferredSize(new java.awt.Dimension(150, 25));
        BotonPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPartidoActionPerformed(evt);
            }
        });

        ImputPGoles1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputPGoles1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputPGoles1.setText("GOLES");
        ImputPGoles1.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputPGoles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputCNombre3ActionPerformed(evt);
            }
        });

        ImputPGoles2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputPGoles2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputPGoles2.setText("GOLES");
        ImputPGoles2.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputPGoles2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputPGoles2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel2");
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 45));

        jLabel2.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(null);
        jLabel2.setMinimumSize(null);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ImputPGoles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ImputPGoles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputPGoles1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImputPGoles2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addComponent(BotonPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImputCNombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCNombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre5ActionPerformed

    private void ImputCNombre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCNombre6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre6ActionPerformed

    private void ImputPGoles2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputPGoles2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputPGoles2ActionPerformed

    private void ImputCNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre3ActionPerformed

    private void BotonPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPartidoActionPerformed
        new crear().setVisible(true);
    }//GEN-LAST:event_BotonPartidoActionPerformed

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
            java.util.logging.Logger.getLogger(partidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(partidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(partidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(partidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPartido;
    private javax.swing.JTextField ImputCNombre5;
    private javax.swing.JTextField ImputCNombre6;
    private javax.swing.JTextField ImputPGoles1;
    private javax.swing.JTextField ImputPGoles2;
    private javax.swing.JLabel LabelPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
