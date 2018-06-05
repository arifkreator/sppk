package V;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class kelayakanUsaha extends javax.swing.JFrame {

    public kelayakanUsaha() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton kembali() {
        return bBack;
    }
    
    public JButton analisa() {
        return bAnalisa;
    }
    
    public JTextField getJumlah(){
        return jumlahUdang;
    }
    
    public JTextField getModalTambak(){
        return modalKolam;
    }
    
    public JTextField getPakan(){
        return pakan;
    }
    
    public JTextField getPerawatan(){
        return perawatan;
    }
    
    public JTextField getPeralatan(){
        return peralatan;
    }
    
    public JTextField getBibit(){
        return bibit;
    }
    
    public JTextField getHargaJual(){
        return hargaJual;
    }
    
    public JTextField modalUsaha(){
        return modalUsaha;
    }
    
    public JTextField penjualan(){
        return hasilPenjualanPermusim;
    }
    
    public JTextArea hasil(){
        return hasil;
    }
    
    public JComboBox getTambak(){
        return tambak;
    }
    
    public JRadioButton getTipeBaru(){
        return baru;
    }
    
    public JRadioButton getTipeLama(){
        return lama;
    }
    
    public JRadioButton get3bulan(){
        return periode3;
    }
    
    public JRadioButton getTahunan(){
        return tahunan;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipeTambak = new javax.swing.ButtonGroup();
        tipePendapatan = new javax.swing.ButtonGroup();
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
        tambak = new javax.swing.JComboBox();
        bBack = new javax.swing.JButton();
        lama = new javax.swing.JRadioButton();
        baru = new javax.swing.JRadioButton();
        periode3 = new javax.swing.JRadioButton();
        tahunan = new javax.swing.JRadioButton();
        modalKolam = new javax.swing.JTextField();
        pakan = new javax.swing.JTextField();
        perawatan = new javax.swing.JTextField();
        peralatan = new javax.swing.JTextField();
        bibit = new javax.swing.JTextField();
        hargaJual = new javax.swing.JTextField();
        modalUsaha = new javax.swing.JTextField();
        jumlahUdang = new javax.swing.JTextField();
        bAnalisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        hasilPenjualanPermusim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Pilih Tambak");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setText("Golongan Tambak");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setText("Estimasi Modal Pembuatan Tambak");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setText("Estimasi Biaya Pakan / Periode");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setText("Estimasi Biaya Perawatan / Periode");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel7.setText("Estimasi Pembelian Peralatan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel8.setText("Estimasi Pembelian Bibit");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel9.setText("Harga Jual / Kg");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel10.setText("Jumlah udang / Tambak (KG)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel11.setText("Modal Usaha");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel12.setText("Hasil Penjualan");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabel13.setText("Tipe Perhitungan");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        getContentPane().add(tambak, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 240, 30));

        bBack.setText("KEMBALI");
        getContentPane().add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, -1, 30));

        tipeTambak.add(lama);
        lama.setText("Lama");
        getContentPane().add(lama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 40));

        tipeTambak.add(baru);
        baru.setText("Baru");
        getContentPane().add(baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 80, 40));

        tipePendapatan.add(periode3);
        periode3.setText("Perperiode (3 Bulan)");
        getContentPane().add(periode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        tipePendapatan.add(tahunan);
        tahunan.setText("Pertahun");
        getContentPane().add(tahunan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        modalKolam.setEnabled(false);
        getContentPane().add(modalKolam, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 240, 30));
        getContentPane().add(pakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 240, 30));
        getContentPane().add(perawatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 240, 30));
        getContentPane().add(peralatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 240, 30));
        getContentPane().add(bibit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 240, 30));

        hargaJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaJualActionPerformed(evt);
            }
        });
        getContentPane().add(hargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 240, 30));

        modalUsaha.setEnabled(false);
        getContentPane().add(modalUsaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 240, 30));
        getContentPane().add(jumlahUdang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 240, 30));

        bAnalisa.setText("analisa");
        getContentPane().add(bAnalisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 240, 40));

        hasil.setColumns(20);
        hasil.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hasil.setLineWrap(true);
        hasil.setRows(5);
        hasil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hasil.setEnabled(false);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 380, 150));

        hasilPenjualanPermusim.setEnabled(false);
        getContentPane().add(hasilPenjualanPermusim, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/layak.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hargaJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaJualActionPerformed

    }//GEN-LAST:event_hargaJualActionPerformed

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
            java.util.logging.Logger.getLogger(kelayakanUsaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelayakanUsaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelayakanUsaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelayakanUsaha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelayakanUsaha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnalisa;
    private javax.swing.JButton bBack;
    private javax.swing.JRadioButton baru;
    private javax.swing.JTextField bibit;
    private javax.swing.JTextField hargaJual;
    private javax.swing.JTextArea hasil;
    private javax.swing.JTextField hasilPenjualanPermusim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahUdang;
    private javax.swing.JRadioButton lama;
    private javax.swing.JTextField modalKolam;
    private javax.swing.JTextField modalUsaha;
    private javax.swing.JTextField pakan;
    private javax.swing.JTextField peralatan;
    private javax.swing.JTextField perawatan;
    private javax.swing.JRadioButton periode3;
    private javax.swing.JRadioButton tahunan;
    private javax.swing.JComboBox tambak;
    private javax.swing.ButtonGroup tipePendapatan;
    private javax.swing.ButtonGroup tipeTambak;
    // End of variables declaration//GEN-END:variables
}
