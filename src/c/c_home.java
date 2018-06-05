package c;

import V.home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class c_home {
    home view;
    public c_home(){
        view = new home();
        view.setVisible(true);
        view.exit().addActionListener(new klikExit());
        view.kelolaAset().addActionListener(new klikKelolaAset());
        view.kelolaTambak().addActionListener(new klikKelolaTambak());
        view.kelayakanUsaha().addActionListener(new klikUsaha());
        view.rekomTambak().addActionListener(new klikRekom());
    }

    private class klikRekom implements ActionListener {

        public klikRekom() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_kriteria().peringkat();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikUsaha implements ActionListener {

        public klikUsaha() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_kriteria().usaha();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikKelolaTambak implements ActionListener {

        public klikKelolaTambak() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_kriteria();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikKelolaAset implements ActionListener {

        public klikKelolaAset() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_aset();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikExit implements ActionListener {

        public klikExit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.tampilYesNo("Yakin Anda Mau Keluar.?") == JOptionPane.YES_OPTION) {
                view.dispose();
            }
        }
    }
    
}
