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
public class D extends javax.swing.JFrame {

    /**
     * Creates new form D
     */
    public D() {
        initComponents();
    }

    public D(char inicio) {
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
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        u = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 20));

        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMouseClicked(evt);
            }
        });
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, 20));

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        g.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gMouseClicked(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, 20));

        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hMouseClicked(evt);
            }
        });
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, 20));

        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iMouseClicked(evt);
            }
        });
        getContentPane().add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, 20));

        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMouseClicked(evt);
            }
        });
        getContentPane().add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, 20));

        k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kMouseClicked(evt);
            }
        });
        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, 20));

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        l.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMouseClicked(evt);
            }
        });
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, 20));

        m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mMouseClicked(evt);
            }
        });
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 20));

        n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nMouseClicked(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 20));

        o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oMouseClicked(evt);
            }
        });
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 20));

        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
        });
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 20));

        q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qMouseClicked(evt);
            }
        });
        getContentPane().add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, 20));

        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rMouseClicked(evt);
            }
        });
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, 20));

        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMouseClicked(evt);
            }
        });
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, 20));

        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        getContentPane().add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 20));

        u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMouseClicked(evt);
            }
        });
        getContentPane().add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));

        v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vMouseClicked(evt);
            }
        });
        getContentPane().add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, 20));

        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 20));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 20));

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_location_on_black_18dp.png"))); // NOI18N
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_food.png"))); // NOI18N
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yMouseClicked(evt);
            }
        });
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 30, 30));

        Mundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D.png"))); // NOI18N
        getContentPane().add(Mundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yMouseClicked
        // TODO add your handling code here:
        Es_Aqui ping_pong = new Es_Aqui();
        ping_pong.setVisible(true);
    }//GEN-LAST:event_yMouseClicked

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

    private void hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hMouseClicked
        // TODO add your handling code here:
        iluminar('h');
    }//GEN-LAST:event_hMouseClicked

    private void iMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMouseClicked
        // TODO add your handling code here:
        iluminar('i');
    }//GEN-LAST:event_iMouseClicked

    private void jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMouseClicked
        // TODO add your handling code here:
        iluminar('j');
    }//GEN-LAST:event_jMouseClicked

    private void kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMouseClicked
        // TODO add your handling code here:
        iluminar('k');
    }//GEN-LAST:event_kMouseClicked

    private void lMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMouseClicked
        // TODO add your handling code here:
        iluminar('l');
    }//GEN-LAST:event_lMouseClicked

    private void mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseClicked
        // TODO add your handling code here:
        iluminar('m');
    }//GEN-LAST:event_mMouseClicked

    private void nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nMouseClicked
        // TODO add your handling code here:
        iluminar('n');
    }//GEN-LAST:event_nMouseClicked

    private void oMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMouseClicked
        // TODO add your handling code here:
        iluminar('o');
    }//GEN-LAST:event_oMouseClicked

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
        // TODO add your handling code here:
        iluminar('p');
    }//GEN-LAST:event_pMouseClicked

    private void qMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qMouseClicked
        // TODO add your handling code here:
        iluminar('q');
    }//GEN-LAST:event_qMouseClicked

    private void rMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMouseClicked
        // TODO add your handling code here:
        iluminar('r');
    }//GEN-LAST:event_rMouseClicked

    private void sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMouseClicked
        // TODO add your handling code here:
        iluminar('s');
    }//GEN-LAST:event_sMouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
        // TODO add your handling code here:
        iluminar('t');
    }//GEN-LAST:event_tMouseClicked

    private void uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseClicked
        // TODO add your handling code here:
        iluminar('u');
    }//GEN-LAST:event_uMouseClicked

    private void vMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vMouseClicked
        // TODO add your handling code here:
        iluminar('v');
    }//GEN-LAST:event_vMouseClicked

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

    
        g1.agregarRuta('a','b',15);
        g1.agregarRuta('b','v',16);
        g1.agregarRuta('b','c',9);
        g1.agregarRuta('c','d',13);
        g1.agregarRuta('v','e',17);
        g1.agregarRuta('v','g',24);
        g1.agregarRuta('e','f',10);
        g1.agregarRuta('f','g',6);
        g1.agregarRuta('i','f',18);
        g1.agregarRuta('i','y',11);
        g1.agregarRuta('y','j',4);
        g1.agregarRuta('j','k',7);
        g1.agregarRuta('k','l',12);
        g1.agregarRuta('m','l',13);
        g1.agregarRuta('n','m',8);
        g1.agregarRuta('m','o',18);
        g1.agregarRuta('n','o',19);
        g1.agregarRuta('g','h',11);
        g1.agregarRuta('h','o',21);
        g1.agregarRuta('o','p',15);
        g1.agregarRuta('o','q',17);
        g1.agregarRuta('q','r',10);
        g1.agregarRuta('r','u',21);
        g1.agregarRuta('u','q',27);
        g1.agregarRuta('s','q',16);
        g1.agregarRuta('v','s',14);
        g1.agregarRuta('t','s',30);
        g1.agregarRuta('t','a',22);
        g1.agregarRuta('t','u',21);
        g1.agregarRuta('p','m',26);
        g1.agregarRuta('n','k',18);
//*Y es la cafeteria y todos van pa' allá

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
            java.util.logging.Logger.getLogger(D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D().setVisible(true);
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
    public javax.swing.JLabel h;
    public javax.swing.JLabel i;
    public javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel k;
    public javax.swing.JLabel l;
    public javax.swing.JLabel m;
    public javax.swing.JLabel n;
    public javax.swing.JLabel o;
    public javax.swing.JLabel p;
    public javax.swing.JLabel q;
    public javax.swing.JLabel r;
    public javax.swing.JLabel s;
    public javax.swing.JLabel t;
    public javax.swing.JLabel u;
    public javax.swing.JLabel v;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
