package V;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class kelolaAset extends javax.swing.JFrame {

    public kelolaAset() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public JTextField getNama(){
        return nama;
    }
    
    public JTextField getJumlah(){
        return jumlah;
    }
    
    public JTable getTabelAset() {
        return tabelAset;
    }
    
    public JButton tambah() {
        return bTambah;
    }
    
    public JButton kembali() {
        return bBack;
    }
    
    public JButton ubah() {
        return bUbah;
    }
    
    public JButton hapus() {
        return bhapus;
    }
    
    public JButton batal() {
        return bBatal;
    }
    
    public void tampilPesan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAset = new javax.swing.JTable();
        nama = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        bhapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bBatal = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("JUMLAH");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        bTambah.setText("Save");
        getContentPane().add(bTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 80, 40));

        tabelAset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelAset);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 610, 510));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 185, 50));
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 185, 50));

        bhapus.setText("Hapus");
        getContentPane().add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 70, 40));

        bUbah.setText("Ubah");
        getContentPane().add(bUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 70, 40));

        bBatal.setText("batal");
        getContentPane().add(bBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 80, 40));

        bBack.setText("Kembali");
        getContentPane().add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 543, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aset.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(kelolaAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelolaAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelolaAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelolaAset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelolaAset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JButton bhapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField nama;
    private javax.swing.JTable tabelAset;
    // End of variables declaration//GEN-END:variables
}
