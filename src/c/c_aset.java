package c;

import V.kelolaAset;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import m.m_aset;

public class c_aset {
    kelolaAset view;
    m_aset model;
    private String id;
    private boolean statusUbah;
    public c_aset() throws SQLException{
        view = new kelolaAset();
        model = new m_aset();
        view.getTabelAset().setModel(model.getTabel());
        view.tambah().addActionListener(new klikTambah());
        view.ubah().addActionListener(new klikUbah());
        view.hapus().addActionListener(new klikHapus());
        view.kembali().addActionListener(new klikBack());
        view.setVisible(true);
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

    private class klikHapus implements ActionListener {

        public klikHapus() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

    private class klikUbah implements ActionListener {

        public klikUbah() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int baris = view.getTabelAset().getSelectedRow();
            id = view.getTabelAset().getValueAt(baris, 0).toString();
            String nama = view.getTabelAset().getValueAt(baris, 1).toString();
            String jumlah = view.getTabelAset().getValueAt(baris, 2).toString();
            view.getNama().setText(nama);
            view.getJumlah().setText(jumlah);
            statusUbah=true;
        }
    }

    private class klikTambah implements ActionListener {

        public klikTambah() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String nama = view.getNama().getText();
            String jumlah = view.getJumlah().getText();
            if (statusUbah==true) {
                model.updateAset(Integer.parseInt(jumlah), Integer.parseInt(id));
                view.getTabelAset().setModel(model.getTabel());
                view.tampilPesan("data berhasil dirubah");
            }else{
                model.insertAset(nama, Integer.parseInt(jumlah));
                view.getTabelAset().setModel(model.getTabel());
                view.tampilPesan("data berhasil ditambahkan");
            }
            view.getNama().setText("");
            view.getJumlah().setText("");
        }
    }
}
