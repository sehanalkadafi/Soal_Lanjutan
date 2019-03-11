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
public class matakuliah_model {
    
    String kd_mk, nama_mk, sks;
    koneksi1 db = null;

    public matakuliah_model(){
        db= new koneksi1();
    }
    
    public String getKd_mk() {
        return kd_mk;
    }

    public void setKd_mk(String kd_mk) {
        this.kd_mk = kd_mk;
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
        List<matakuliah_model> data = new ArrayList<matakuliah_model>();
        ResultSet rs = null;

        try {
            String sql = "select * from master_matakuliah";
            rs = db.ambilData(sql);
            while (rs.next()) {
                matakuliah_model um = new matakuliah_model();
                um.setKd_mk(rs.getString("kd_mk"));
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
    
     public void simpan() {
        String sql = "INSERT INTO master_matakuliah values('" + kd_mk + "', '" + nama_mk + "', '" + sks + "')";
        db.simpanData(sql);
    }
     
           public void update() {
        String sql = "UPDATE master_matakuliah SET nama_mk='"+nama_mk+"',sks='"+sks+"' WHERE kd_mk='"+kd_mk+"'";
        db.simpanData(sql);
    }
     public void hapus(){
        String sql="DELETE FROM master_matakuliah WHERE kd_mk='"+kd_mk+"'";
        db.simpanData(sql);
        System.out.println("");
    }
     
      public List cariID() {
        List<matakuliah_model> data = new ArrayList<matakuliah_model>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM master_matakuliah WHERE kd_mk='"+kd_mk+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
               matakuliah_model m = new matakuliah_model();
                m.setKd_mk(rs.getString("kd_mk"));
                m.setNama_mk(rs.getString("nama_mk"));
                m.setSks(rs.getString("sks"));
                
             
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
}
