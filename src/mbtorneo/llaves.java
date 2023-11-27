/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbtorneo;

import javax.swing.JLabel;

/**
 *
 * @author Juli
 */
public class llaves extends javax.swing.JFrame {

    Torneo t1;
    int i1;

    public llaves(Torneo t, int i) {
        t1 = t;
        i1 = i;
        initComponents();
        setLocationRelativeTo(this);
        if (t.getCant_equipos() == 4) {
            jLabel1.setText(t.getList_equipos().get(0).getNombre_equipo());
            jLabel2.setText(t.getList_equipos().get(1).getNombre_equipo());
            jLabel3.setText(t.getList_equipos().get(2).getNombre_equipo());
            jLabel4.setText(t.getList_equipos().get(3).getNombre_equipo());
            jLabel5.setText(null);
            jLabel6.setText(null);
            jLabel7.setText(null);
            jLabel8.setText(null);
            jLabel9.setText(null);
            jLabel10.setText(null);
            jLabel11.setText(null);
            jLabel12.setText(null);
            jLabel13.setText(null);
            jLabel14.setText(null);
            switch (i1) {
                case 1:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    break;
                case 2:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    jLabel6.setText(t1.getList_partidos().get(1).getGanador().getNombre_equipo());
                    break;
                

            }
        }
        if (t.getCant_equipos() == 8) {
            jLabel1.setText(t.getList_equipos().get(0).getNombre_equipo());
            jLabel2.setText(t.getList_equipos().get(1).getNombre_equipo());
            jLabel3.setText(t.getList_equipos().get(2).getNombre_equipo());
            jLabel4.setText(t.getList_equipos().get(3).getNombre_equipo());
            jLabel5.setText(null);
            jLabel6.setText(null);
            jLabel7.setText(null);
            jLabel8.setText(null);
            jLabel9.setText(null);
            jLabel10.setText(null);
            jLabel11.setText(t.getList_equipos().get(4).getNombre_equipo());
            jLabel12.setText(t.getList_equipos().get(5).getNombre_equipo());
            jLabel13.setText(t.getList_equipos().get(6).getNombre_equipo());
            jLabel14.setText(t.getList_equipos().get(7).getNombre_equipo());
            switch (i1) {
                case 1:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    break;
                case 2:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    jLabel6.setText(t1.getList_partidos().get(1).getGanador().getNombre_equipo());
                    break;
                case 3:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    jLabel6.setText(t1.getList_partidos().get(1).getGanador().getNombre_equipo());
                    jLabel9.setText(t1.getList_partidos().get(2).getGanador().getNombre_equipo());
                    break;
                case 4:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    jLabel6.setText(t1.getList_partidos().get(1).getGanador().getNombre_equipo());
                    jLabel9.setText(t1.getList_partidos().get(2).getGanador().getNombre_equipo());
                    jLabel10.setText(t1.getList_partidos().get(3).getGanador().getNombre_equipo());
                    break;
                case 5:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    jLabel6.setText(t1.getList_partidos().get(1).getGanador().getNombre_equipo());
                    jLabel9.setText(t1.getList_partidos().get(2).getGanador().getNombre_equipo());
                    jLabel10.setText(t1.getList_partidos().get(3).getGanador().getNombre_equipo());
                    jLabel7.setText(t1.getList_partidos().get(4).getGanador().getNombre_equipo());
                    
                    break;
                case 6:
                    jLabel5.setText(t1.getList_partidos().get(0).getGanador().getNombre_equipo());
                    jLabel6.setText(t1.getList_partidos().get(1).getGanador().getNombre_equipo());
                    jLabel9.setText(t1.getList_partidos().get(2).getGanador().getNombre_equipo());
                    jLabel10.setText(t1.getList_partidos().get(3).getGanador().getNombre_equipo());
                    jLabel7.setText(t1.getList_partidos().get(4).getGanador().getNombre_equipo());
                    jLabel8.setText(t1.getList_partidos().get(5).getGanador().getNombre_equipo());
                    break;
                

            }
        }

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMaximumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.setLayout(null);

        LabelCrear.setFont(new java.awt.Font("Twitchy.TV", 0, 36)); // NOI18N
        LabelCrear.setForeground(new java.awt.Color(255, 255, 255));
        LabelCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCrear.setText("CRUCES");
        LabelCrear.setToolTipText("");
        LabelCrear.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LabelCrear.setMaximumSize(new java.awt.Dimension(210003, 290000));
        LabelCrear.setPreferredSize(new java.awt.Dimension(480, 100));
        jPanel1.add(LabelCrear);
        LabelCrear.setBounds(270, 0, 540, 57);

        jLabel1.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 80, 150, 45);

        jLabel2.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(null);
        jLabel2.setMinimumSize(null);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 160, 150, 45);

        jLabel3.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(null);
        jLabel3.setMinimumSize(null);
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 310, 150, 45);

        jLabel4.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(null);
        jLabel4.setMinimumSize(null);
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 380, 150, 45);

        jLabel5.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(null);
        jLabel5.setMinimumSize(null);
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 120, 150, 45);

        jLabel6.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel7");
        jLabel6.setMaximumSize(null);
        jLabel6.setMinimumSize(null);
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 340, 150, 45);

        jLabel7.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel6");
        jLabel7.setMaximumSize(null);
        jLabel7.setMinimumSize(null);
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 240, 150, 45);

        jLabel8.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(null);
        jLabel8.setMinimumSize(null);
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 240, 150, 45);

        jLabel9.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel9");
        jLabel9.setMaximumSize(null);
        jLabel9.setMinimumSize(null);
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(700, 120, 150, 45);

        jLabel10.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("jLabel12");
        jLabel10.setMaximumSize(null);
        jLabel10.setMinimumSize(null);
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(700, 340, 150, 45);

        jLabel11.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("jLabel10");
        jLabel11.setMaximumSize(null);
        jLabel11.setMinimumSize(null);
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(890, 80, 150, 45);

        jLabel12.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("jLabel11");
        jLabel12.setMaximumSize(null);
        jLabel12.setMinimumSize(null);
        jLabel12.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(890, 160, 150, 45);

        jLabel13.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("jLabel13");
        jLabel13.setMaximumSize(null);
        jLabel13.setMinimumSize(null);
        jLabel13.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(890, 300, 150, 45);

        jLabel14.setFont(new java.awt.Font("Twitchy.TV", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel14");
        jLabel14.setMaximumSize(null);
        jLabel14.setMinimumSize(null);
        jLabel14.setPreferredSize(new java.awt.Dimension(150, 45));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(890, 380, 150, 45);

        jButton1.setText("SIGUIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(860, 499, 180, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(290, 270, 90, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(100, 150, 120, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(100, 370, 120, 10);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(850, 370, 120, 10);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(850, 150, 120, 10);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(530, 270, 10, 10);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(690, 270, 90, 10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (t1.getCant_equipos() == 4) {
            switch (i1) {
                case 0:
                    Partido p = new Partido(t1.getList_equipos().get(0), t1.getList_equipos().get(1));
                    t1.getList_partidos().add(p);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 1:
                    Partido p1 = new Partido(t1.getList_equipos().get(2), t1.getList_equipos().get(3));
                    t1.getList_partidos().add(p1);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 2:
                    Partido p2 = new Partido(t1.getList_partidos().get(0).getGanador(), t1.getList_partidos().get(1).getGanador());
                    t1.getList_partidos().add(p2);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;

            }
        }
        if (t1.getCant_equipos() == 8) {
            switch (i1) {
                case 0:
                    Partido p = new Partido(t1.getList_equipos().get(0), t1.getList_equipos().get(1));
                    t1.getList_partidos().add(p);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 1:
                    Partido p1 = new Partido(t1.getList_equipos().get(2), t1.getList_equipos().get(3));
                    t1.getList_partidos().add(p1);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 2:
                    Partido p2 = new Partido(t1.getList_equipos().get(4), t1.getList_equipos().get(5));
                    t1.getList_partidos().add(p2);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 3:
                    Partido p3 = new Partido(t1.getList_equipos().get(6), t1.getList_equipos().get(7));
                    t1.getList_partidos().add(p3);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 4:
                    Partido p4 = new Partido(t1.getList_partidos().get(0).getGanador(), t1.getList_partidos().get(1).getGanador());
                    t1.getList_partidos().add(p4);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 5:
                    Partido p5 = new Partido(t1.getList_partidos().get(2).getGanador(), t1.getList_partidos().get(3).getGanador());
                    t1.getList_partidos().add(p5);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;
                case 6:
                    Partido p6 = new Partido(t1.getList_partidos().get(4).getGanador(), t1.getList_partidos().get(5).getGanador());
                    t1.getList_partidos().add(p6);
                    new partidos(t1, i1).setVisible(true);
                    dispose();
                    break;

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
