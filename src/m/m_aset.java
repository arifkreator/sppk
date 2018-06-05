package m;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class m_aset extends model{
    public m_aset()throws SQLException{
        super();
    }
    
    public DefaultTableModel getTabel() {
        String[] header = {"id", "nama aset",  "Jumlah"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from aset";
            ResultSet rs = kon.getResult(query);

            while (rs.next()) {
                String[] kolom = new String[3];
                kolom[0] = rs.getString("idAset");
                kolom[1] = rs.getString("nama");
                kolom[2] = rs.getString("jumlah");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
    }
    
    public void insertAset(String nama, int jumlah) {
        try {
            String query = "INSERT INTO `sppk`.`aset` (`idAset`, `nama`, `jumlah`) "
                    + "VALUES (NULL, '" + nama + "', '" + jumlah + "');";
            kon.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void updateAset(int jumlah,int id) {
        try {
            String query = "UPDATE `aset` SET `jumlah`= "+jumlah+" WHERE idAset="+id;
            kon.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
