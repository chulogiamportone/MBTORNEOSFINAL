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
public class partidosP extends javax.swing.JFrame {

    Torneo t1;
    int i1;
    boolean a = false;
    boolean b = false;

    public partidosP(Torneo t, int i) {
        initComponents();
        setLocationRelativeTo(this);
        t1 = t;
        i1 = i;
        switch (i1) {
            case 0:
                LabelPartido.setText("Semifinal 1");
                break;
            case 1:
                LabelPartido.setText("Semifinal 2");

                break;
            case 2:
                LabelPartido.setText("GRAN FINAL");

                break;

        }
        jLabel1.setText(t1.getList_partidos().get(i1).getEquipo_1().getNombre_equipo());
        jLabel2.setText(t1.getList_partidos().get(i1).getEquipo_2().getNombre_equipo());
        jLabel3.setText(Integer.toString(t1.getList_partidos().get(i1).getGole1()));
        jLabel4.setText(Integer.toString(t1.getList_partidos().get(i1).getGole2()));
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
        LabelPartido = new javax.swing.JLabel();
        BotonPartido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ImputPPenales2 = new javax.swing.JTextField();
        ImputPPenales1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        LabelPartido.setFont(new java.awt.Font("Twitchy.TV", 0, 36)); // NOI18N
        LabelPartido.setForeground(new java.awt.Color(255, 255, 255));
        LabelPartido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPartido.setText("partido x");
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

        jLabel1.setFont(new java.awt.Font("Twitchy.TV", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel2");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 45));

        jLabel2.setFont(new java.awt.Font("Twitchy.TV", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 45));

        ImputPPenales2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputPPenales2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputPPenales2.setText("PENALES");
        ImputPPenales2.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputPPenales2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputPPenales2MouseClicked(evt);
            }
        });
        ImputPPenales2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputPPenales2KeyTyped(evt);
            }
        });

        ImputPPenales1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImputPPenales1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImputPPenales1.setText("PENALES");
        ImputPPenales1.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputPPenales1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputPPenales1MouseClicked(evt);
            }
        });
        ImputPPenales1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputPPenales1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setInheritsPopupMenu(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("4");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ImputPPenales1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(ImputPPenales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BotonPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(LabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImputPPenales2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImputPPenales1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(BotonPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPartidoActionPerformed
        int g1;
        int g2;

        if (ImputPPenales1.getText().matches("-?\\d+") && ImputPPenales2.getText().matches("-?\\d+")) {
            g1 = Integer.parseInt(ImputPPenales1.getText());
            g2 = Integer.parseInt(ImputPPenales2.getText());
            if (g1 != g2) {
                t1.getList_partidos().get(i1).setPenales1(g1);
                t1.getList_partidos().get(i1).setPenales2(g2);

                if (t1.getList_partidos().get(i1).getPenales1() > t1.getList_partidos().get(i1).getPenales2()) {
                    t1.getList_partidos().get(i1).setGanador(t1.getList_partidos().get(i1).getEquipo_1());

                } else {
                    t1.getList_partidos().get(i1).setGanador(t1.getList_partidos().get(i1).getEquipo_2());
                }
                i1 = i1 + 1;
                if(i1==t1.getCant_equipos()-1){
                    new Final(t1).setVisible(true);
                    dispose();
                }else{
                   new llaves(t1, i1).setVisible(true);
                   dispose(); 
                }
                

            }
        }
    }//GEN-LAST:event_BotonPartidoActionPerformed

    private void ImputPPenales1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputPPenales1KeyTyped
        a = true;
    }//GEN-LAST:event_ImputPPenales1KeyTyped

    private void ImputPPenales1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputPPenales1MouseClicked
        if (a == false) {

            ImputPPenales1.setText(null);

        }
    }//GEN-LAST:event_ImputPPenales1MouseClicked

    private void ImputPPenales2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputPPenales2KeyTyped
        b = true;
    }//GEN-LAST:event_ImputPPenales2KeyTyped

    private void ImputPPenales2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputPPenales2MouseClicked
        if (b == false) {

            ImputPPenales2.setText(null);

        }
    }//GEN-LAST:event_ImputPPenales2MouseClicked

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
            java.util.logging.Logger.getLogger(partidosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(partidosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(partidosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(partidosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField ImputPPenales1;
    private javax.swing.JTextField ImputPPenales2;
    private javax.swing.JLabel LabelPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
