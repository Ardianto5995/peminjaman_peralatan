package peminjaman_peralatan;
import java.sql.*;
/**
 *
 * @author sekonol
 */
public class Koneksi {
    //membuat variabel untuk koneksi ke database
    private final String database = "peminjaman_peralatan";
    private final String url = "jdbc:mysql://localhost/" + database;
    private final String user = "root";
    private final String pass = "";
    private Connection com;
    
    //membuat method memanggil koneksi
    public Connection buatkoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            com = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException c) {
            System.out.println("Driver MySql JDBC tidak ditemukan");
        } catch (SQLException e) {
            System.out.println("Koneksi ke server GAGAL...!");
        }
        return com;
}
}
