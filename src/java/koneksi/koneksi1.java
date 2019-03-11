/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Alkadafi
 */
public class koneksi1 {

   private Connection conn;
    private Statement st;
 
    public static void ambilKoneksi() {
        try {
            String db = "jdbc:mysql://localhost/universitas";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db, user, pass);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan ambil koneksi : " + x);
        }
    }
 
    public void koneksi1() {
        try {
            String db = "jdbc:mysql://localhost/universitas";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db, user, pass);
            st = conn.createStatement();
        } catch (Exception x) {
 
            System.out.println("Terjadi kesalahan koneksi : " + x);
        }
    }
 
    public void diskonek(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            st.close();
            conn.close();
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan diskoneksi : " + x);
        }
    }
 
    public ResultSet ambilData(String sql) {
        ResultSet rs = null;
        try {
            koneksi1();
            rs = st.executeQuery(sql);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan ambil data : " + x);
        }
        return rs;
    }
 
    public void simpanData(String sql) {
        try {
            koneksi1();
            st.executeUpdate(sql);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan simpan data : " + x);
        }
    }
}
