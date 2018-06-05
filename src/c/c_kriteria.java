package c;

import V.kelayakanUsaha;
import V.kriteriaTambak;
import V.lihatPeringkat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.m_kriteria;

public class c_kriteria {

    kriteriaTambak view;
    lihatPeringkat views;
    kelayakanUsaha viewss;
    m_kriteria model;

    private int kriteria1;
    private int kriteria2;
    private int kriteria3;
    private int kriteria4;
    private int kriteria5;
    private double w;
    private boolean status;
    private int Periode;

    public c_kriteria() throws SQLException {
        view = new kriteriaTambak();
        views = new lihatPeringkat();
        viewss = new kelayakanUsaha();
        model = new m_kriteria();
        view.getTabel().setModel(model.getTabel());
        view.save().addActionListener(new klikSave());
        view.back().addActionListener(new klikBack());
        views.peringkat().setEnabled(false);
        views.normal().addActionListener(new klikNormalisasi());
        views.peringkat().addActionListener(new klikPeringkat());
        views.getTabel().setModel(model.getTabel());
        views.kembali().addActionListener(new klikBack());
        viewss.kembali().addActionListener(new klikBack());
        viewss.analisa().addActionListener(new klikAnalisa());
        String[] nama = model.getNamaTambak();
        for (int i = 0; i < model.cariMaxData(); i++) {
            viewss.getTambak().addItem(nama[i]);
        }
        viewss.getTipeBaru().addActionListener(new klikPilihan());
        viewss.getTipeLama().addActionListener(new klikPilihan());
        view.setVisible(true);
    }

    public void peringkat() {
        views.setVisible(true);
        view.dispose();
    }

    public void usaha() {
        viewss.setVisible(true);
        view.dispose();
    }

    private class klikPilihan implements ActionListener {

        public klikPilihan() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean baru = viewss.getTipeBaru().isSelected();
            if (baru==true) {
                viewss.getModalTambak().setEnabled(true);
            }else{
                viewss.getModalTambak().setEnabled(false);
                viewss.getModalTambak().setText("0");
            }
        }
    }

    private class klikAnalisa implements ActionListener {

        public klikAnalisa() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String nama = (String) viewss.getTambak().getSelectedItem();
            String modalTambak = viewss.getModalTambak().getText();
            String pakan = viewss.getPakan().getText();
            String perawatan = viewss.getPerawatan().getText();
            String peralatan = viewss.getPeralatan().getText();
            String bibit = viewss.getBibit().getText();
            String jual = viewss.getHargaJual().getText();
            String jumlah = viewss.getJumlah().getText();
            boolean pilihPeriode = viewss.getTahunan().isSelected();
            if (pilihPeriode==true) {
                Periode=4;
            }else{
                Periode=1;
            }
            double untung = Integer.parseInt(jual)*Integer.parseInt(jumlah)*Periode;
            String penghasilan = Integer.toString((int) untung);
            double modal = Integer.parseInt(modalTambak)+(Integer.parseInt(pakan)+Integer.parseInt(perawatan)+Integer.parseInt(peralatan)+Integer.parseInt(bibit)*Periode);
            String modalUsaha = Integer.toString((int) modal);
            float bcr = (float) (untung/modal);
            System.out.println(bcr);
            if (bcr>=1) {
                viewss.hasil().setText("Dengan hasil BC Ratio Sebesar = "+bcr+" \n"
                        + "Pada Tambak yang berada di="+nama
                        + " \n maka usaha tersebut layak untuk dilakukan");
            }else{
                if (Periode==4) {
                    viewss.hasil().setText("Dengan hasil BC Ratio Sebesar = "+bcr+" \n"
                        + "Pada Tambak yang berada di = "+nama
                        + " \n maka usaha tersebut layak untuk dilakukan \n"
                        + "dalam waktu satu tahun kedepan karena keuntungan terlalu kecil");
                }else{
                    viewss.hasil().setText("Dengan hasil BC Ratio Sebesar = "+bcr+" \n"
                        + "Pada Tambak yang berada di = "+nama
                        + " \n maka usaha tersebut layak untuk dilakukan \n"
                        + "dalam waktu satu periode kedepan karena keuntungan terlalu kecil");
                }
            }
            viewss.modalUsaha().setText(modalUsaha);
            viewss.penjualan().setText(penghasilan);
        }
    }

    private class klikPeringkat implements ActionListener {

        public klikPeringkat() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int x = 0; x < views.getTabel().getRowCount(); x++) {
                double r1;
                double r2;
                double r3;
                double r4;
                double r5;
                r1 = (Float.valueOf(views.getTabel().getValueAt(x, 2).toString()) * 0.10);
                r2 = (Float.valueOf(views.getTabel().getValueAt(x, 3).toString()) * 0.30);
                r3 = (Float.valueOf(views.getTabel().getValueAt(x, 4).toString()) * 0.20);
                r4 = (Float.valueOf(views.getTabel().getValueAt(x, 5).toString()) * 0.30);
                r5 = (Float.valueOf(views.getTabel().getValueAt(x, 6).toString()) * 0.10);
                w = r1 + r2 + r3 + r4 + r5;
            }
            try {
                int max = model.cariMaxData();
                int maxPeringkat = model.cariMaxPeringkat();
                int selisih = max-maxPeringkat;
                for (int i = 0; i < selisih; i++) {
                    if (selisih==0) {
                        views.getTabel().setModel(model.getTabelPeringkat());
                    }else{
                        model.insertperingkat(views.getTabel().getValueAt(i+maxPeringkat, 0).toString(), w);
                    }
                System.out.println(w);
                System.out.println("==================");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_kriteria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikBack implements ActionListener {

        public klikBack() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_home();
            view.dispose();
        }
    }

    private class klikNormalisasi implements ActionListener {

        public klikNormalisasi() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            views.peringkat().setEnabled(true);
            views.getTabel().setModel(model.normalisasi());
        }
    }

    private class klikSave implements ActionListener {

        public klikSave() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String lokasi = view.getNama().getText();
            String kedalaman = view.getKedalaman().getText();
            String jarakPantai = view.getJarakPantai().getText();
            String jarakAir = view.getJarakSumber().getText();
            String ukuran = view.getUkuran().getText();
            String jenis = (String) view.getJenis().getSelectedItem();
            int dalam = Integer.parseInt(kedalaman);
            int pantai = Integer.parseInt(jarakPantai);
            int air = Integer.parseInt(jarakAir);
            int luas = Integer.parseInt(ukuran);
            if (dalam >= 10) {
                kriteria1 = 3;
            } else if (dalam < 10 && dalam > 6) {
                kriteria1 = 2;
            } else if (dalam <= 5) {
                kriteria1 = 1;
            } else {
                view.tampilPesan("Inputan Kedalaman Kolam salah");
                status = false;
            }
            if (pantai >= 20) {
                kriteria2 = 3;
            } else if (pantai < 20 && pantai > 10) {
                kriteria2 = 2;
            } else if (pantai <= 10) {
                kriteria2 = 1;
            } else {
                view.tampilPesan("Inputan Jarak Kolam salah");
                status = false;
            }
            if (air >= 20) {
                kriteria3 = 3;
            } else if (air < 20 && air > 10) {
                kriteria3 = 2;
            } else if (air <= 10) {
                kriteria3 = 1;
            } else {
                view.tampilPesan("Inputan Air Kolam salah");
                status = false;
            }
            if (luas < 30) {
                kriteria4 = 3;
            } else if (luas <= 30 && luas > 50) {
                kriteria4 = 2;
            } else if (luas <= 50) {
                kriteria4 = 1;
            } else {
                view.tampilPesan("Inputan Luas Kolam salah");
                status = false;
            }
            if (jenis == "tanah liat") {
                kriteria5 = 3;
            } else if (jenis == "tanah gambus") {
                kriteria5 = 2;
            } else {
                kriteria5 = 1;
                status = false;
            }
            if (status == true) {
                view.tampilPesan("sukses menambahkan");
                model.insertKriteria(lokasi, kriteria1, kriteria2, kriteria3, kriteria4, kriteria5);
                view.getTabel().setModel(model.getTabel());
                view.getNama().setText("");
                view.getKedalaman().setText("");
                view.getJarakPantai().setText("");
                view.getJarakSumber().setText("");
                view.getUkuran().setText("");
            }

        }
    }

}
