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
public class jurusan_model {

    String kd_jurusan, nama_jurusan, kaprodi, kd_fakultas;
    koneksi1 db = null;
    
      public jurusan_model(){
        db= new koneksi1();
    }

    public String getKd_jurusan() {
        return kd_jurusan;
    }

    public void setKd_jurusan(String kd_jurusan) {
        this.kd_jurusan = kd_jurusan;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_jurusan(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }

    public String getKaprodi() {
        return kaprodi;
    }

    public void setKaprodi(String kaprodi) {
        this.kaprodi = kaprodi;
    }

    public String getKd_fakultas() {
        return kd_fakultas;
    }

    public void setKd_fakultas(String kd_fakultas) {
        this.kd_fakultas = kd_fakultas;
    }

    public koneksi1 getDb() {
        return db;
    }

    public void setDb(koneksi1 db) {
        this.db = db;
    }

    public List tampil() {
        List<jurusan_model> data = new ArrayList<jurusan_model>();
        ResultSet rs = null;

        try {
            String sql = "select * from master_jurusan";
            rs = db.ambilData(sql);
            while (rs.next()) {
                jurusan_model um = new jurusan_model();
                um.setKd_jurusan(rs.getString("kd_jurusan"));
                um.setNama_jurusan(rs.getString("nama_jurusan"));
                um.setKaprodi(rs.getString("kaprodi"));
                um.setKd_fakultas(rs.getString("kd_fakultas"));

                data.add(um);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }

    public void simpan() {
        String sql = "INSERT INTO master_jurusan values('" + kd_jurusan + "', '" + nama_jurusan + "', '" + kaprodi + "', '" + kd_fakultas + "')";
        db.simpanData(sql);
    }

    public void update() {
        String sql = "UPDATE master_jurusan SET nama_jurusan='" + nama_jurusan + "',kaprodi='" + kaprodi + "',kd_fakultas='" + kd_fakultas + "' WHERE kd_jurusan='" + kd_jurusan + "'";
        db.simpanData(sql);
    }

    public void hapus() {
        String sql = "DELETE FROM master_jurusan WHERE kd_jurusan='" + kd_jurusan + "'";
        db.simpanData(sql);
        System.out.println("");
    }

    public List cariID() {
        List<jurusan_model> data = new ArrayList<jurusan_model>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM master_jurusan WHERE kd_jurusan='" + kd_jurusan + "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                jurusan_model m = new jurusan_model();
                m.setKd_jurusan(rs.getString("kd_jurusan"));
                m.setNama_jurusan(rs.getString("nama_jurusan"));
                m.setKaprodi(rs.getString("kaprodi"));
                m.setKd_fakultas(rs.getString("kd_fakultas"));

                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
}
