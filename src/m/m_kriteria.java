package m;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class m_kriteria extends model {

    public m_kriteria() throws SQLException {
        super();
    }

    public DefaultTableModel getTabel() {
        String[] header = {"Id", "Lokasi Tambak", "Kriteria 1", "Kriteria 2", "Kriteria 3", "Kriteria 4", "Kriteria 5"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from kriteria";
            ResultSet rs = kon.getResult(query);

            while (rs.next()) {
                String[] kolom = new String[7];
                kolom[0] = rs.getString("id");
                kolom[1] = rs.getString("lokasi");
                kolom[2] = rs.getString("kedalaman");
                kolom[3] = rs.getString("jarakpantai");
                kolom[4] = rs.getString("jaraksumberair");
                kolom[5] = rs.getString("ukuran");
                kolom[6] = rs.getString("jenis");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
    }

    public void insertKriteria(String lokasi, int kedalaman, int jarakPantai, int jarakAir, int ukuran, int jenis) {
        try {
            String query = "INSERT INTO `sppk`.`kriteria` (`id`, `lokasi`, `kedalaman`,`jarakpantai`,`jaraksumberair`,`ukuran`,`jenis`) "
                    + "VALUES (NULL, '" + lokasi + "', '" + kedalaman + "', '" + jarakPantai + "', '" + jarakAir + "', '" + ukuran + "', '" + jenis + "');";
            kon.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public DefaultTableModel normalisasi() {
        LinkedList max = new LinkedList();
        LinkedList mm = new LinkedList();
        String[] header = {"Id", "Lokasi Tambak", "Kriteria 1", "Kriteria 2", "Kriteria 3", "Kriteria 4", "Kriteria 5"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select MIN(kedalaman),"
                    + "MIN(jarakpantai),"
                    + "MIN(jaraksumberair),"
                    + "MAX(ukuran),"
                    + "MAX(jenis) from kriteria";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                max.add(rs.getString(1));
                max.add(rs.getString(2));
                max.add(rs.getString(3));
                max.add(rs.getString(4));
                max.add(rs.getString(5));
            }

            String query2 = "select * from kriteria";
            ResultSet rs2 = kon.getResult(query2);

            while (rs2.next()) {
                dtm.addRow(new Object[]{
                    rs2.getString(1), 
                    rs2.getString(2), 
                    (Float.valueOf(max.get(0).toString())/rs2.getFloat(3)),
                    (Float.valueOf(max.get(1).toString())/rs2.getFloat(4)), 
                    (Float.valueOf(max.get(2).toString())/rs2.getFloat(5)), 
                    (rs2.getFloat(6)/Float.valueOf(max.get(3).toString())),
                    (rs2.getFloat(7))/Float.valueOf(max.get(4).toString())
                });

            }

        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(this, ex);
        }
        return dtm;
    }
    
    public void insertperingkat(String lokasi, double nilai) {
        try {
            String query = "INSERT INTO `sppk`.`peringkat` (`idPeringkat`, `id`, `nilai`) "
                    + "VALUES (NULL, '" + lokasi + "', '" + nilai + "');";
            kon.execute(query);
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    public int cariMaxPeringkat() throws SQLException {
        String query = "SELECT Max(idperingkat) FROM `peringkat`";
        ResultSet hasil = kon.getResult(query);
        hasil.next();
        int data = hasil.getInt(1);
        return data;
    }
    
    public int cariMaxData() throws SQLException {
        String query = "SELECT Max(id) FROM `kriteria`";
        ResultSet hasil = kon.getResult(query);
        hasil.next();
        int data = hasil.getInt(1);
        return data;
    }
    
    public String[] getNamaTambak() throws SQLException {
        String query = "SELECT k.lokasi,p.nilai FROM `peringkat` as p join `kriteria` as k ON p.id=k.id ORDER by p.idperingkat DESC";
        ResultSet hasil = kon.getResult(query);
        String nama[];
        int hitung=0;
        while(hasil.next()){
            hitung++;
        }
        hasil.beforeFirst();
        nama = new String[hitung];
        int i=0;
        while(hasil.next()){
            nama[i]=hasil.getString(1);
            i++;
        }
        return nama;
    }
    
    public DefaultTableModel getTabelPeringkat() {
        String[] header = {"nama", "nilai"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "SELECT k.lokasi,p.nilai FROM `peringkat` as p join `kriteria` as k ON p.id=k.id";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                String[] kolom = new String[2];
                kolom[0] = rs.getString("k.lokasi");
                kolom[1] = rs.getString("p.nilai");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
    }

}
