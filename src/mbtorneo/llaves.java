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
public class llaves extends javax.swing.JFrame {

    /**
     * Creates new form equipos
     */
    public llaves() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelCrear = new javax.swing.JLabel();
        LabelCNombre = new javax.swing.JLabel();
        ImputCNombre = new javax.swing.JTextField();
        BotonInicio = new javax.swing.JButton();
        LabelCNombre1 = new javax.swing.JLabel();
        ImputCNombre1 = new javax.swing.JTextField();
        ImputCNombre2 = new javax.swing.JTextField();
        ImputCNombre3 = new javax.swing.JTextField();
        ImputCNombre4 = new javax.swing.JTextField();
        ImputCNombre5 = new javax.swing.JTextField();
        ImputCNombre6 = new javax.swing.JTextField();
        ImputCNombre7 = new javax.swing.JTextField();
        ImputCNombre8 = new javax.swing.JTextField();
        LabelCNombre2 = new javax.swing.JLabel();
        ImputCNombreDT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        LabelCrear.setFont(new java.awt.Font("Twitchy.TV", 0, 36)); // NOI18N
        LabelCrear.setForeground(new java.awt.Color(255, 255, 255));
        LabelCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCrear.setText("NUEVO EQUIPO");
        LabelCrear.setToolTipText("");
        LabelCrear.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LabelCrear.setMaximumSize(new java.awt.Dimension(210003, 290000));
        LabelCrear.setPreferredSize(new java.awt.Dimension(480, 100));

        LabelCNombre.setFont(new java.awt.Font("Twitchy.TV", 0, 18)); // NOI18N
        LabelCNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelCNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCNombre.setText("NOMBRE");
        LabelCNombre.setPreferredSize(new java.awt.Dimension(300, 75));

        ImputCNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre.setText("Nombre del Equipo");
        ImputCNombre.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombreMouseClicked(evt);
            }
        });

        BotonInicio.setText("SIGUIENTE");
        BotonInicio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonInicio.setMaximumSize(new java.awt.Dimension(73000, 200003));
        BotonInicio.setOpaque(false);
        BotonInicio.setPreferredSize(new java.awt.Dimension(150, 25));
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        LabelCNombre1.setFont(new java.awt.Font("Twitchy.TV", 0, 18)); // NOI18N
        LabelCNombre1.setForeground(new java.awt.Color(255, 255, 255));
        LabelCNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCNombre1.setText("JUGADORES");
        LabelCNombre1.setPreferredSize(new java.awt.Dimension(300, 75));

        ImputCNombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre1.setText("Jugador 1");
        ImputCNombre1.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre1MouseClicked(evt);
            }
        });
        ImputCNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputCNombre1ActionPerformed(evt);
            }
        });

        ImputCNombre2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre2.setText("Jugador 2");
        ImputCNombre2.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre2MouseClicked(evt);
            }
        });

        ImputCNombre3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre3.setText("Jugador 3");
        ImputCNombre3.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre3MouseClicked(evt);
            }
        });

        ImputCNombre4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre4.setText("Jugador 4");
        ImputCNombre4.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre4MouseClicked(evt);
            }
        });

        ImputCNombre5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre5.setText("Jugador 5");
        ImputCNombre5.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre5MouseClicked(evt);
            }
        });

        ImputCNombre6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre6.setText("Jugador 6");
        ImputCNombre6.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre6MouseClicked(evt);
            }
        });

        ImputCNombre7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre7.setText("Jugador 7");
        ImputCNombre7.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre7MouseClicked(evt);
            }
        });

        ImputCNombre8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombre8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombre8.setText("Jugador 8");
        ImputCNombre8.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombre8MouseClicked(evt);
            }
        });

        LabelCNombre2.setFont(new java.awt.Font("Twitchy.TV", 0, 18)); // NOI18N
        LabelCNombre2.setForeground(new java.awt.Color(255, 255, 255));
        LabelCNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCNombre2.setText("DIRECTOR técnico");
        LabelCNombre2.setToolTipText("");
        LabelCNombre2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelCNombre2.setPreferredSize(new java.awt.Dimension(300, 75));

        ImputCNombreDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputCNombreDT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputCNombreDT.setText("Nombre DT");
        ImputCNombreDT.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombreDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombreDTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addComponent(ImputCNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelCNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ImputCNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ImputCNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ImputCNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ImputCNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ImputCNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ImputCNombre8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ImputCNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ImputCNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LabelCNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(349, 349, 349))))
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ImputCNombreDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LabelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImputCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImputCNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImputCNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImputCNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImputCNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(LabelCNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImputCNombreDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        new crear().setVisible(true);

    }//GEN-LAST:event_BotonInicioActionPerformed

    private void ImputCNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre1MouseClicked

    private void ImputCNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombreMouseClicked

    private void ImputCNombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre2MouseClicked

    private void ImputCNombre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre3MouseClicked

    private void ImputCNombre4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre4MouseClicked

    private void ImputCNombre5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre5MouseClicked

    private void ImputCNombre6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre6MouseClicked

    private void ImputCNombre7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre7MouseClicked

    private void ImputCNombre8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre8MouseClicked

    private void ImputCNombreDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombreDTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombreDTMouseClicked

    private void ImputCNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombre1ActionPerformed

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
            java.util.logging.Logger.getLogger(llaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(llaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(llaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(llaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new llaves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    private javax.swing.JTextField ImputCNombre;
    private javax.swing.JTextField ImputCNombre1;
    private javax.swing.JTextField ImputCNombre2;
    private javax.swing.JTextField ImputCNombre3;
    private javax.swing.JTextField ImputCNombre4;
    private javax.swing.JTextField ImputCNombre5;
    private javax.swing.JTextField ImputCNombre6;
    private javax.swing.JTextField ImputCNombre7;
    private javax.swing.JTextField ImputCNombre8;
    private javax.swing.JTextField ImputCNombreDT;
    private javax.swing.JLabel LabelCNombre;
    private javax.swing.JLabel LabelCNombre1;
    private javax.swing.JLabel LabelCNombre2;
    private javax.swing.JLabel LabelCrear;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
