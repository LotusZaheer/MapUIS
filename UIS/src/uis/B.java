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
public class B extends javax.swing.JFrame {

    /**
     * Creates new form B
     */
    public B() {
        initComponents();
    }

    public B(char inicio) {

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        y = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        u = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        Mundo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ping.png"))); // NOI18N
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yMouseClicked(evt);
            }
        });
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        w.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wMouseClicked(evt);
            }
        });
        getContentPane().add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 20));

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 20));

        v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vMouseClicked(evt);
            }
        });
        getContentPane().add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 20));

        u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMouseClicked(evt);
            }
        });
        getContentPane().add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, 20));

        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        getContentPane().add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, 20));

        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMouseClicked(evt);
            }
        });
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 20));

        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rMouseClicked(evt);
            }
        });
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, 20));

        q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qMouseClicked(evt);
            }
        });
        getContentPane().add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 20));

        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
        });
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, 20));

        o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oMouseClicked(evt);
            }
        });
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, 20));

        n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nMouseClicked(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, 20));

        m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mMouseClicked(evt);
            }
        });
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 20));

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        l.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMouseClicked(evt);
            }
        });
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, 20));

        k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kMouseClicked(evt);
            }
        });
        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, 20));

        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMouseClicked(evt);
            }
        });
        getContentPane().add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, 20));

        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iMouseClicked(evt);
            }
        });
        getContentPane().add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, 20));

        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hMouseClicked(evt);
            }
        });
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, 20));

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        g.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gMouseClicked(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, 20));

        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMouseClicked(evt);
            }
        });
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, 20));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, 20));

        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, 20));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 20));

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 20));

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 20));

        z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zMouseClicked(evt);
            }
        });
        getContentPane().add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        Mundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        Mundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MundoMouseClicked(evt);
            }
        });
        getContentPane().add(Mundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yMouseClicked

        Es_Aqui ping_pong = new Es_Aqui();
        ping_pong.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_yMouseClicked

    private void eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseClicked
        // TODO add your handling code here:

        iluminar('e');
    }//GEN-LAST:event_eMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        // TODO add your handling code here:

        iluminar('c');
    }//GEN-LAST:event_cMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        // TODO add your handling code here:

        iluminar('b');
    }//GEN-LAST:event_bMouseClicked

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked

        iluminar('a');
    }//GEN-LAST:event_aMouseClicked

    private void MundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MundoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MundoMouseClicked

    private void fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMouseClicked
        // TODO add your handling code here:

        iluminar('f');
    }//GEN-LAST:event_fMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
        // TODO add your handling code here:

        iluminar('d');
    }//GEN-LAST:event_dMouseClicked

    private void gMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gMouseClicked
        // TODO add your handling code here:

        iluminar('g');
    }//GEN-LAST:event_gMouseClicked

    private void hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hMouseClicked
        // TODO add your handling code here:

        iluminar('h');
    }//GEN-LAST:event_hMouseClicked

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
        // TODO add your handling code here:

        iluminar('p');
    }//GEN-LAST:event_pMouseClicked

    private void sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMouseClicked
        // TODO add your handling code here:

        iluminar('s');
    }//GEN-LAST:event_sMouseClicked

    private void rMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMouseClicked
        // TODO add your handling code here:

        iluminar('r');
    }//GEN-LAST:event_rMouseClicked

    private void uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseClicked
        // TODO add your handling code here:
        iluminar('u');
    }//GEN-LAST:event_uMouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
        // TODO add your handling code here:

        iluminar('t');
    }//GEN-LAST:event_tMouseClicked

    private void qMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qMouseClicked
        // TODO add your handling code here:

        iluminar('q');
    }//GEN-LAST:event_qMouseClicked

    private void vMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vMouseClicked
        // TODO add your handling code here:
        iluminar('v');
    }//GEN-LAST:event_vMouseClicked

    private void nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nMouseClicked
        // TODO add your handling code here:

        iluminar('n');
    }//GEN-LAST:event_nMouseClicked

    private void mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseClicked
        // TODO add your handling code here:

        iluminar('m');
    }//GEN-LAST:event_mMouseClicked

    private void lMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMouseClicked
        // TODO add your handling code here:

        iluminar('l');
    }//GEN-LAST:event_lMouseClicked

    private void oMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMouseClicked
        // TODO add your handling code here:

        iluminar('o');
    }//GEN-LAST:event_oMouseClicked

    private void kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMouseClicked
        // TODO add your handling code here:

        iluminar('k');
    }//GEN-LAST:event_kMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        // TODO add your handling code here:

        iluminar('x');
    }//GEN-LAST:event_xMouseClicked

    private void zMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zMouseClicked
        // TODO add your handling code here:
        iluminar('z');
    }//GEN-LAST:event_zMouseClicked

    private void jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMouseClicked
        // TODO add your handling code here:

        iluminar('j');
    }//GEN-LAST:event_jMouseClicked

    private void wMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wMouseClicked
        // TODO add your handling code here:
        iluminar('w');
    }//GEN-LAST:event_wMouseClicked

    private void iMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMouseClicked
        // TODO add your handling code here:

        iluminar('i');
    }//GEN-LAST:event_iMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        Menu m = new Menu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    public void iluminar(char inicio) {

        Grafo g1 = new Grafo("abcdefghijklmnopqrstuvwxyz");

        char fin = 'y';

        g1.agregarRuta('e', 'a', 32);
        g1.agregarRuta('e', 'b', 17);
        g1.agregarRuta('e', 's', 15);
        g1.agregarRuta('e', 'f', 30);
        g1.agregarRuta('f', 'g', 12);
        g1.agregarRuta('s', 'q', 7);
        g1.agregarRuta('i', 'd', 11);
        g1.agregarRuta('i', 'g', 14);
        g1.agregarRuta('i', 'k', 17);
        g1.agregarRuta('j', 'k', 12);
        g1.agregarRuta('j', 'l', 13);
        g1.agregarRuta('l', 'k', 16);
        g1.agregarRuta('l', 'n', 12);
        g1.agregarRuta('n', 'm', 8);
        g1.agregarRuta('l', 'm', 10);
        g1.agregarRuta('m', 'h', 27);
        g1.agregarRuta('n', 'v', 10);
        g1.agregarRuta('r', 's', 5);
        g1.agregarRuta('p', 's', 5);
        g1.agregarRuta('p', 'o', 6);
        g1.agregarRuta('o', 'q', 4);
        g1.agregarRuta('r', 'q', 10);
        g1.agregarRuta('v', 'o', 11);
        g1.agregarRuta('v', 'q', 10);
        g1.agregarRuta('q', 'w', 16);
        g1.agregarRuta('v', 'w', 6);
        g1.agregarRuta('l', 'x', 22);
        g1.agregarRuta('n', 'x', 15);
        g1.agregarRuta('t', 'w', 17);
        g1.agregarRuta('u', 't', 7);
        g1.agregarRuta('h', 'f', 27);
        g1.agregarRuta('x', 'z', 8);
        g1.agregarRuta('y', 'z', 13);
        g1.agregarRuta('y', 'w', 20);
        g1.agregarRuta('z', 'w', 11);
        g1.agregarRuta('n', 'w', 12);
        g1.agregarRuta('c', 'y', 10);//*Y es la cafeteria y todos van pa' allá

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));
        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_food.png"))); // NOI18N
        z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png")));

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
                case 'h':
                    h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'i':
                    i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'j':
                    j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'k':
                    k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'l':
                    l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'm':
                    m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'n':
                    n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'o':
                    o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'p':
                    p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'q':
                    q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'r':
                    r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 's':
                    s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 't':
                    t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'u':
                    u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'v':
                    v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'w':
                    w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'x':
                    x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
                    break;
                case 'y':
                    y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_food.png"))); // NOI18N
                    break;
                case 'z':
                    z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mundo;
    public javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JLabel g;
    private javax.swing.JLabel h;
    private javax.swing.JLabel i;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel k;
    private javax.swing.JLabel l;
    private javax.swing.JLabel m;
    private javax.swing.JLabel n;
    private javax.swing.JLabel o;
    private javax.swing.JLabel p;
    private javax.swing.JLabel q;
    private javax.swing.JLabel r;
    private javax.swing.JLabel s;
    private javax.swing.JLabel t;
    private javax.swing.JLabel u;
    private javax.swing.JLabel v;
    private javax.swing.JLabel w;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    private javax.swing.JLabel z;
    // End of variables declaration//GEN-END:variables
}
