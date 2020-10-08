package imageslider;

import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class slider extends javax.swing.JFrame {

    public slider() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imageslider/icon.png")).getImage());

        show(position);
    }
    int position = 0;

    public String[] takeimage() {
        File f = new File(getClass().getResource("/imagespath").getFile());
        String[] Images = f.list();
        return Images;
    }

    public void show(int index) {
        String[] Images = takeimage();
        String img = Images[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagespath/" + img));
        Image image = icon.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
        label1.setIcon(new ImageIcon(image));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book - Ingeniería económica - Carlos Javier López(16-2519)");
        setLocation(new java.awt.Point(200, 100));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/icons8_Cancel_30px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, 30, 40));

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/icons8_Back_To_64px.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previousMousePressed(evt);
            }
        });
        getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 80));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/icons8_Next_page_52px.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 350, -1, 50));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 880, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageslider/pngwing.com.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(slider.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.label1.getX();

        if (p > -1) {
            Animacion.Animacion.mover_izquierda(900, 90, 1, 2, label1);
        }
        position = position + 1;
        if (position >= takeimage().length) {
            position = takeimage().length - 1;
        }
        show(position);
    }//GEN-LAST:event_nextMousePressed

    private void previousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMousePressed
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(slider.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.label1.getX();

        if (p > -1) {
            Animacion.Animacion.mover_izquierda(900, 90, 1, 2, label1);

        }
        position = position - 1;
        if (position < 0) {
            position = 0;
        }
        show(position);
    }//GEN-LAST:event_previousMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel next;
    private javax.swing.JLabel previous;
    // End of variables declaration//GEN-END:variables
}
