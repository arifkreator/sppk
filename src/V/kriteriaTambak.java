package V;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class kriteriaTambak extends javax.swing.JFrame {


    public kriteriaTambak() {
        initComponents();
        this.setLocationRelativeTo(null);
//        this.setVisible(true);
    }

    public JTextField getNama(){
        return tambak;
    }
    
    public JTextField getKedalaman(){
        return kriteria1;
    }
    
    public JTextField getJarakPantai(){
        return kriteria2;
    }
    
    public JTextField getJarakSumber(){
        return kriteria3;
    }
    
    public JTextField getUkuran(){
        return kriteria4;
    }
    
    public JComboBox getJenis(){
        return kriteria5;
    }
    
    public JButton save() {
        return bTambah;
    }

    
    public JButton back() {
        return bBack;
    }
    
    public JTable getTabel() {
        return tabelTambak;
    }

    public void tampilPesan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tambak = new javax.swing.JTextField();
        kriteria1 = new javax.swing.JTextField();
        kriteria2 = new javax.swing.JTextField();
        kriteria3 = new javax.swing.JTextField();
        kriteria4 = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTambak = new javax.swing.JTable();
        bBack = new javax.swing.JButton();
        lokasi = new javax.swing.JLabel();
        kedalaman = new javax.swing.JLabel();
        jarakpantai = new javax.swing.JLabel();
        jaraksumber = new javax.swing.JLabel();
        ukuran = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        kriteria5 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tambak, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 312, 39));
        getContentPane().add(kriteria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 175, -1));
        getContentPane().add(kriteria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 175, -1));
        getContentPane().add(kriteria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 175, -1));
        getContentPane().add(kriteria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 175, -1));

        bTambah.setText("Tambahkan");
        getContentPane().add(bTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 175, -1));

        tabelTambak.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelTambak);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 588, 197));

        bBack.setText("BACK");
        getContentPane().add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        lokasi.setText("Lokasi Tambak");
        getContentPane().add(lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        kedalaman.setText("Kedalaman Tambak");
        getContentPane().add(kedalaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jarakpantai.setText("Jarak Tambak Dengan Pantai");
        getContentPane().add(jarakpantai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jaraksumber.setText("Jarak Sumber Air");
        getContentPane().add(jaraksumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        ukuran.setText("Ukuran Tambak");
        getContentPane().add(ukuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jenis.setText("Jenis Lahan");
        getContentPane().add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        kriteria5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "tanah liat", "tanah gambus", "pesisir pantai" }));
        getContentPane().add(kriteria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 175, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sppk.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
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
            java.util.logging.Logger.getLogger(kriteriaTambak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kriteriaTambak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kriteriaTambak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kriteriaTambak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kriteriaTambak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jarakpantai;
    private javax.swing.JLabel jaraksumber;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel kedalaman;
    private javax.swing.JTextField kriteria1;
    private javax.swing.JTextField kriteria2;
    private javax.swing.JTextField kriteria3;
    private javax.swing.JTextField kriteria4;
    private javax.swing.JComboBox kriteria5;
    private javax.swing.JLabel lokasi;
    private javax.swing.JTable tabelTambak;
    private javax.swing.JTextField tambak;
    private javax.swing.JLabel ukuran;
    // End of variables declaration//GEN-END:variables
}
