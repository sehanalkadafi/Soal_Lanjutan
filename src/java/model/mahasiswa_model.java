/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi1;

/**
 *
 * @author Alkadafi
 */
public class mahasiswa_model {

    String npm, nama_mhs, kd_jurusan, alamat, tlp;
    koneksi1 db = null;
    
      public mahasiswa_model(){
        db= new koneksi1();
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }

    public String getKd_jurusan() {
        return kd_jurusan;
    }

    public void setKd_jurusan(String kd_jurusan) {
        this.kd_jurusan = kd_jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public koneksi1 getDb() {
        return db;
    }

    public void setDb(koneksi1 db) {
        this.db = db;
    }

    public List tampil() {
        List<mahasiswa_model> data = new ArrayList<mahasiswa_model>();
        ResultSet rs = null;

        try {
            String sql = "select * from mahasiswa";
            rs = db.ambilData(sql);
            while (rs.next()) {
                mahasiswa_model um = new mahasiswa_model();
                um.setNpm(rs.getString("npm"));
                um.setNama_mhs(rs.getString("nama_mhs"));
                um.setKd_jurusan(rs.getString("kd_jurusan"));
                um.setAlamat(rs.getString("alamat"));
                um.setTlp(rs.getString("tlp"));
                data.add(um);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    
     public void simpan() {
        String sql = "INSERT INTO mahasiswa values('" + npm + "', '" + nama_mhs + "', '" + kd_jurusan + "', '" + alamat + "','" + tlp +  "')";
        db.simpanData(sql);
    }
     
       public void update() {
        String sql = "UPDATE mahasiswa SET nama_mhs='"+nama_mhs+"',kd_jurusan='"+kd_jurusan+"',alamat='"+alamat+ "',tlp='"+tlp+"' WHERE npm='"+npm+"'";
        db.simpanData(sql);
    }
     public void hapus(){
        String sql="DELETE FROM mahasiswa WHERE npm='"+npm+"'";
        db.simpanData(sql);
        System.out.println("");
    }
     
      public List cariID() {
        List<mahasiswa_model> data = new ArrayList<mahasiswa_model>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM mahasiswa WHERE npm='"+npm+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                mahasiswa_model m = new mahasiswa_model();
                m.setNpm(rs.getString("npm"));
                m.setNama_mhs(rs.getString("nama_mhs"));
                m.setKd_jurusan(rs.getString("kd_jurusan"));
                m.setAlamat(rs.getString("alamat"));
                m.setTlp(rs.getString("tlp"));
              
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
   
}
