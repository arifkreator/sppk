package m;

import java.sql.SQLException;
import model.koneksi;

public abstract class model {
    koneksi kon;
    public model() throws SQLException{
        kon=new koneksi("sppk","root","");
    }
}
