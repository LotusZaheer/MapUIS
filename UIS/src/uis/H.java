/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uis;

import static uis.Grafo.pila2;

/**
 *
 * @author USUARIO
 */
public class H extends javax.swing.JFrame {

    /**
     * Creates new form H
     */
    public H() {
        initComponents();
    }

    public H(char inicio) {
        initComponents();
        iluminar(inicio);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        y = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        Mundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ping.png"))); // NOI18N
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yMouseClicked(evt);
            }
        });
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 20));

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, 20));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 20));

        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 20));

        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMouseClicked(evt);
            }
        });
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 20));

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        g.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gMouseClicked(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 20));

        Mundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/H.png"))); // NOI18N
        Mundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Mundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked

        iluminar('a');
    }//GEN-LAST:event_aMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        // TODO add your handling code here:
        iluminar('b');
    }//GEN-LAST:event_bMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        // TODO add your handling code here:
        iluminar('c');
    }//GEN-LAST:event_cMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
        // TODO add your handling code here:
        iluminar('d');
    }//GEN-LAST:event_dMouseClicked

    private void eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseClicked
        // TODO add your handling code here:
        iluminar('e');
    }//GEN-LAST:event_eMouseClicked

    private void fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMouseClicked
        // TODO add your handling code here:
        iluminar('f');
    }//GEN-LAST:event_fMouseClicked

    private void gMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gMouseClicked
        // TODO add your handling code here:
        
        iluminar('g');
    }//GEN-LAST:event_gMouseClicked

    private void yMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yMouseClicked

        Es_Aqui ping_pong = new Es_Aqui();
        ping_pong.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_yMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        Menu m = new Menu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void iluminar(char inicio) {
        

    Grafo g1 = new Grafo("abcdefghijklmnopqrstuvwxyz");

    char fin = 'y';

    
        g1.agregarRuta('a','y',8);
    g1.agregarRuta('a','b',13);
    g1.agregarRuta('c','b',9);
    g1.agregarRuta('d','c',27);
    g1.agregarRuta('e','d',19);
    g1.agregarRuta('f','e',13);
    g1.agregarRuta('f','g',15);//*Y es la cafeteria y todos van pa' allá

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_food.png"))); // NOI18N

        pila2 = g1.Lista(inicio, fin);

        while (!pila2.isEmpty()) {
            char nombre = pila2.pop().id;
            switch (nombre) {
                case 'a':
                    a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'b':
                    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'c':
                    c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'd':
                    d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'e':
                    e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'f':
                    f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'g':
                    g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'y':
                    y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ping.png"))); // NOI18N
                    break;
            }
        }

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
            java.util.logging.Logger.getLogger(H.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(H.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(H.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(H.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new H().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mundo;
    public javax.swing.JLabel a;
    public javax.swing.JLabel b;
    public javax.swing.JLabel c;
    public javax.swing.JLabel d;
    public javax.swing.JLabel e;
    public javax.swing.JLabel f;
    public javax.swing.JLabel g;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
