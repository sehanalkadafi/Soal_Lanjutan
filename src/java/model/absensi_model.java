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
public class absensi_model {

    String npm, nama_mhs, nama_jurusan, nama_fakultas, nama_mk, sks;
    koneksi1 db = null;

    public absensi_model() {
        db = new koneksi1();
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

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_jurusan(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }

    public String getNama_fakultas() {
        return nama_fakultas;
    }

    public void setNama_fakultas(String nama_fakultas) {
        this.nama_fakultas = nama_fakultas;
    }

    public String getNama_mk() {
        return nama_mk;
    }

    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public koneksi1 getDb() {
        return db;
    }

    public void setDb(koneksi1 db) {
        this.db = db;
    }

    public List tampil() {
        List<absensi_model> data = new ArrayList<absensi_model>();
        ResultSet rs = null;

        try {
            String sql = "select * from master_matakuliah,absensi,mahasiswa,master_fakultas,master_jurusan where absensi.npm=mahasiswa.npm and absensi.kd_mk=master_matakuliah.kd_mk and mahasiswa.kd_jurusan=master_jurusan.kd_jurusan and master_jurusan.kd_fakultas=master_fakultas.kd_fakultas";
            rs = db.ambilData(sql);
            while (rs.next()) {
                absensi_model um = new absensi_model();
                um.setNpm(rs.getString("npm"));
                um.setNama_mhs(rs.getString("nama_mhs"));
                um.setNama_jurusan(rs.getString("nama_jurusan"));
                um.setNama_fakultas(rs.getString("nama_fakultas"));
                um.setNama_mk(rs.getString("nama_mk"));
                um.setSks(rs.getString("sks"));
                data.add(um);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    /*public void simpan() {
     String sql = "INSERT INTO master_matakuliah values('" + kd_mk + "', '" + nama_mk + "', '" + sks + "')";
     db.simpanData(sql);
     }*/
}
