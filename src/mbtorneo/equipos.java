/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbtorneo;


import java.util.ArrayList;
import java.util.List;
import mbtorneo.Equipo;
import mbtorneo.Jugador;
import mbtorneo.Persona;

public class equipos extends javax.swing.JFrame {

    Torneo t1;
    int r1;
    boolean be = false;
    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = false;
    boolean b4 = false;
    boolean b5 = false;
    boolean b6 = false;
    boolean b7 = false;
    boolean b8 = false;
    boolean bDT = false;

    /**
     * Creates new form equipos
     */
    public equipos(Torneo t, int r) {
        initComponents();
        setLocationRelativeTo(this);
        t1 = t;
        r1 = r;

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
        setPreferredSize(new java.awt.Dimension(700, 500));

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
        ImputCNombre.setText("Equipo");
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

        BotonInicio.setText("SIGUIENTE");
        BotonInicio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonInicio.setMaximumSize(new java.awt.Dimension(180, 50));
        BotonInicio.setMinimumSize(new java.awt.Dimension(180, 50));
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
        ImputCNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre1KeyTyped(evt);
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
        ImputCNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre2KeyTyped(evt);
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
        ImputCNombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre3KeyTyped(evt);
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
        ImputCNombre4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre4KeyTyped(evt);
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
        ImputCNombre5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre5KeyTyped(evt);
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
        ImputCNombre6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre6KeyTyped(evt);
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
        ImputCNombre7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre7KeyTyped(evt);
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
        ImputCNombre8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombre8KeyTyped(evt);
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
        ImputCNombreDT.setText("DT");
        ImputCNombreDT.setPreferredSize(new java.awt.Dimension(300, 75));
        ImputCNombreDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImputCNombreDTMouseClicked(evt);
            }
        });
        ImputCNombreDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputCNombreDTActionPerformed(evt);
            }
        });
        ImputCNombreDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImputCNombreDTKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(LabelCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(93, 93, 93))
                            .addComponent(ImputCNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(LabelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(LabelCNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ImputCNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImputCNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ImputCNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ImputCNombre4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ImputCNombre7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ImputCNombre8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ImputCNombre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ImputCNombre6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(LabelCNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(349, 349, 349)))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ImputCNombreDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106)
                        .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LabelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(LabelCNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImputCNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ImputCNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ImputCNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ImputCNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImputCNombre8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ImputCNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(LabelCNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ImputCNombreDT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        if (ImputCNombre!=null && ImputCNombre1!=null && ImputCNombre2!=null && ImputCNombre3!=null && ImputCNombre4!=null && ImputCNombre5!=null &&ImputCNombre6!=null &&ImputCNombre7!=null && ImputCNombre8!=null && ImputCNombreDT!=null) {
            t1.getList_equipos().add(CargarEquipo());
            System.out.println(t1.getNombre_id() + "   " + t1.getList_equipos().get(r1).getNombre_equipo() + "   " + t1.getList_equipos().get(r1).getList_jugadores().get(0).getNombre());
            if (r1<=t1.getCant_equipos()-2) {
                new equipos(t1, r1 + 1).setVisible(true);
                dispose();
            } else {
                new llaves(t1,0).setVisible(true);
                dispose(); 
                
                
            }
        }

    }//GEN-LAST:event_BotonInicioActionPerformed

    private void ImputCNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombreKeyTyped
        be = true;
    }//GEN-LAST:event_ImputCNombreKeyTyped

    private void ImputCNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombreMouseClicked
        if (be == false) {

            ImputCNombre.setText(null);

        }
    }//GEN-LAST:event_ImputCNombreMouseClicked

    private void ImputCNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre1KeyTyped
        b1 = true;
    }//GEN-LAST:event_ImputCNombre1KeyTyped

    private void ImputCNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre1MouseClicked
        if (b1 == false) {

            ImputCNombre1.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre1MouseClicked

    private void ImputCNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre2KeyTyped
        b2 = true;
    }//GEN-LAST:event_ImputCNombre2KeyTyped

    private void ImputCNombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre2MouseClicked
        if (b2 == false) {

            ImputCNombre2.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre2MouseClicked

    private void ImputCNombre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre3KeyTyped
        b3 = true;
    }//GEN-LAST:event_ImputCNombre3KeyTyped

    private void ImputCNombre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre3MouseClicked
        if (b3 == false) {

            ImputCNombre3.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre3MouseClicked

    private void ImputCNombre4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre4KeyTyped
        b4 = true;
    }//GEN-LAST:event_ImputCNombre4KeyTyped

    private void ImputCNombre4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre4MouseClicked
        if (b4 == false) {

            ImputCNombre4.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre4MouseClicked

    private void ImputCNombre5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre5KeyTyped
        b5 = true;
    }//GEN-LAST:event_ImputCNombre5KeyTyped

    private void ImputCNombre5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre5MouseClicked
        if (b5 == false) {

            ImputCNombre5.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre5MouseClicked

    private void ImputCNombre6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre6KeyTyped
        b6 = true;
    }//GEN-LAST:event_ImputCNombre6KeyTyped

    private void ImputCNombre6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre6MouseClicked
        if (b6 == false) {

            ImputCNombre6.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre6MouseClicked

    private void ImputCNombre7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre7KeyTyped
        b7 = true;
    }//GEN-LAST:event_ImputCNombre7KeyTyped

    private void ImputCNombre7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre7MouseClicked
        if (b7 == false) {

            ImputCNombre7.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre7MouseClicked

    private void ImputCNombre8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombre8KeyTyped
        b8 = true;
    }//GEN-LAST:event_ImputCNombre8KeyTyped

    private void ImputCNombre8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombre8MouseClicked
        if (b8 == false) {

            ImputCNombre8.setText(null);

        }
    }//GEN-LAST:event_ImputCNombre8MouseClicked

    private void ImputCNombreDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImputCNombreDTKeyTyped
        bDT = true;
    }//GEN-LAST:event_ImputCNombreDTKeyTyped

    private void ImputCNombreDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImputCNombreDTMouseClicked
        if (bDT == false) {

            ImputCNombreDT.setText(null);

        }
    }//GEN-LAST:event_ImputCNombreDTMouseClicked

    private void ImputCNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombreActionPerformed

    private void ImputCNombreDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCNombreDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCNombreDTActionPerformed
    public Equipo CargarEquipo() {
        String nombree;
        String dt;
        Jugador j1 = new Jugador(ImputCNombre1.getText(), 1);
        Jugador j2 = new Jugador(ImputCNombre2.getText(), 2);
        Jugador j3 = new Jugador(ImputCNombre3.getText(), 3);
        Jugador j4 = new Jugador(ImputCNombre4.getText(), 4);
        Jugador j5 = new Jugador(ImputCNombre5.getText(), 5);
        Jugador j6 = new Jugador(ImputCNombre6.getText(), 6);
        Jugador j7 = new Jugador(ImputCNombre7.getText(), 7);
        Jugador j8 = new Jugador(ImputCNombre8.getText(), 8);
        if (bDT == false) {
            dt = ImputCNombreDT.getText() + " E" + (r1 + 1);
        } else {
            dt = ImputCNombreDT.getText();
        }
        Persona DT = new Persona(dt);
        List<Jugador> list_jugadores = new ArrayList<>();
        list_jugadores.add(j1);
        list_jugadores.add(j2);
        list_jugadores.add(j3);
        list_jugadores.add(j4);
        list_jugadores.add(j5);
        list_jugadores.add(j6);
        list_jugadores.add(j7);
        list_jugadores.add(j8);
        if (be == false) {
            nombree = ImputCNombre.getText() + (r1 + 1);
        } else {
            nombree = ImputCNombre.getText();
        }
        Equipo e = new Equipo(DT, nombree, list_jugadores);
        return e;
    }


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
            java.util.logging.Logger.getLogger(equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

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
