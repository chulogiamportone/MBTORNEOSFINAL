/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mbtorneo;
import java.util.ArrayList;
import mbtorneo.Torneo;
/**
 *
 * @author Juli
 */
public class crear extends javax.swing.JFrame {
    private int cant=8;
    private String name;
    
    boolean a=false;
    boolean nombre=false;
    
    public crear() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear = new javax.swing.JPanel();
        LabelCrear = new javax.swing.JLabel();
        LabelCNombre = new javax.swing.JLabel();
        ImputCNombre = new javax.swing.JTextField();
        LabelCEquipos = new javax.swing.JLabel();
        DesplegableCEquipos = new javax.swing.JComboBox();
        BotonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crear.setBackground(new java.awt.Color(0, 102, 102));
        crear.setMaximumSize(new java.awt.Dimension(2920000, 4700000));
        crear.setName(""); // NOI18N
        crear.setPreferredSize(new java.awt.Dimension(700, 500));
        crear.setVerifyInputWhenFocusTarget(false);

        LabelCrear.setFont(new java.awt.Font("Twitchy.TV", 0, 36)); // NOI18N
        LabelCrear.setForeground(new java.awt.Color(255, 255, 255));
        LabelCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCrear.setText("NUEVO TORNEO");
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
        ImputCNombre.setText("Nombre del torneo");
        ImputCNombre.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombreMouseClicked(evt);
            }
        });
        ImputCNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputCNombreActionPerformed(evt);
            }
        });
        ImputCNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombreKeyTyped(evt);
            }
        });

        LabelCEquipos.setFont(new java.awt.Font("Twitchy.TV", 0, 18)); // NOI18N
        LabelCEquipos.setForeground(new java.awt.Color(255, 255, 255));
        LabelCEquipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCEquipos.setText("CANTIDAD DE EQUIPOS");
        LabelCEquipos.setPreferredSize(new java.awt.Dimension(300, 75));

        DesplegableCEquipos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DesplegableCEquipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "16", "32" }));
        DesplegableCEquipos.setToolTipText("");
        DesplegableCEquipos.setPreferredSize(new java.awt.Dimension(300, 75));
        DesplegableCEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesplegableCEquiposActionPerformed(evt);
            }
        });

        BotonCrear.setText("CREAR TORNEO");
        BotonCrear.setPreferredSize(new java.awt.Dimension(300, 100));
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crearLayout = new javax.swing.GroupLayout(crear);
        crear.setLayout(crearLayout);
        crearLayout.setHorizontalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(crearLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearLayout.createSequentialGroup()
                        .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImputCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearLayout.createSequentialGroup()
                        .addGroup(crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearLayout.createSequentialGroup()
                                .addComponent(DesplegableCEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addComponent(LabelCEquipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        crearLayout.setVerticalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LabelCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImputCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelCEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DesplegableCEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesplegableCEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesplegableCEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesplegableCEquiposActionPerformed

    private void ImputCNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCNombreActionPerformed
        
    }//GEN-LAST:event_ImputCNombreActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        if (a==true)  {
            switch ( DesplegableCEquipos.getSelectedIndex()){
                case  0 :
                    cant=8;
                case  1 :
                    cant=16;
                case  2 :
                    cant=32;  
                    
                
            }
            name=ImputCNombre.getText();
            System.out.println(cant+"  "+name);
            ArrayList<Equipo> list_equipos = new ArrayList<>();
            Torneo t=new Torneo(cant,name,list_equipos);
            new equipos(t).setVisible(true);
            dispose();
        }// TODO add your handling code here:
    }//GEN-LAST:event_BotonCrearActionPerformed

    private void ImputCNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombreKeyTyped
       
        
        a=true;
        
        
        
    }//GEN-LAST:event_ImputCNombreKeyTyped

    private void ImputCNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombreMouseClicked
        if (nombre==false){
            ImputCNombre.setText(null);
            nombre=true;

        }
    }//GEN-LAST:event_ImputCNombreMouseClicked

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
            java.util.logging.Logger.getLogger(crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrear;
    private javax.swing.JComboBox DesplegableCEquipos;
    private javax.swing.JTextField ImputCNombre;
    private javax.swing.JLabel LabelCEquipos;
    private javax.swing.JLabel LabelCNombre;
    private javax.swing.JLabel LabelCrear;
    private javax.swing.JPanel crear;
    // End of variables declaration//GEN-END:variables
}
