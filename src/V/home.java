package V;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public JButton kelolaAset() {
        return bAset;
    }
    
    public JButton exit() {
        return bExit;
    }
    
    public JButton kelolaTambak() {
        return bTambak;
    }
    
    public JButton rekomTambak() {
        return bRekomTambak;
    }
    
    public JButton kelayakanUsaha() {
        return bKelayakanUsaha;
    }
    
    
    public int tampilYesNo(String pesan) {
        return JOptionPane.showConfirmDialog(this, pesan, null, JOptionPane.YES_NO_OPTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAset = new javax.swing.JButton();
        bTambak = new javax.swing.JButton();
        bRekomTambak = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bKelayakanUsaha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bAset.setText("Kelola Aset");
        getContentPane().add(bAset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, 53));

        bTambak.setText("Kelola Tambak");
        getContentPane().add(bTambak, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, 44));

        bRekomTambak.setText("Lihat Rekomendasi Tambak");
        getContentPane().add(bRekomTambak, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, 43));

        bExit.setText("Exit");
        getContentPane().add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 200, 43));

        bKelayakanUsaha.setText("Lihat Kelayakan Usaha");
        getContentPane().add(bKelayakanUsaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAset;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bKelayakanUsaha;
    private javax.swing.JButton bRekomTambak;
    private javax.swing.JButton bTambak;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
