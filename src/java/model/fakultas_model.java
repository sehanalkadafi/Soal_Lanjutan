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
public class fakultas_model {
    String kd_fakultas, nama_fakultas, jumlah_fakultas;
    koneksi1 db = null;
    
      public fakultas_model(){
        db= new koneksi1();
    }

    public String getKd_fakultas() {
        return kd_fakultas;
    }

    public void setKd_fakultas(String kd_fakultas) {
        this.kd_fakultas = kd_fakultas;
    }

    public String getNama_fakultas() {
        return nama_fakultas;
    }

    public void setNama_fakultas(String nama_fakultas) {
        this.nama_fakultas = nama_fakultas;
    }

    public String getJumlah_fakultas() {
        return jumlah_fakultas;
    }

    public void setJumlah_fakultas(String jumlah_fakultas) {
        this.jumlah_fakultas = jumlah_fakultas;
    }

    public koneksi1 getDb() {
        return db;
    }

    public void setDb(koneksi1 db) {
        this.db = db;
    }

   
    public List tampil() {
        List<fakultas_model> data = new ArrayList<fakultas_model>();
        ResultSet rs = null;

        try {
            String sql = "select * from master_fakultas";
            rs = db.ambilData(sql);
            while (rs.next()) {
                fakultas_model um = new fakultas_model();
                um.setKd_fakultas(rs.getString("kd_fakultas"));
                um.setNama_fakultas(rs.getString("nama_fakultas"));
                um.setJumlah_fakultas(rs.getString("jumlah_fakultas"));
              
                data.add(um);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    
     public void simpan() {
        String sql = "INSERT INTO master_fakultas values('" + kd_fakultas + "', '" + nama_fakultas + "', '" + jumlah_fakultas +  "')";
        db.simpanData(sql);
    }
     
       public void update() {
        String sql = "UPDATE master_fakultas SET nama_fakultas='"+nama_fakultas+"',jumlah_fakultas='"+jumlah_fakultas+"' WHERE kd_fakultas='"+kd_fakultas+"'";
        db.simpanData(sql);
    }
     public void hapus(){
        String sql="DELETE FROM master_fakultas WHERE kd_fakultas='"+kd_fakultas+"'";
        db.simpanData(sql);
        System.out.println("");
    }
     
      public List cariID() {
        List<fakultas_model> data = new ArrayList<fakultas_model>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM master_fakultas WHERE kd_fakultas='"+kd_fakultas+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
               fakultas_model m = new fakultas_model();
                m.setKd_fakultas(rs.getString("kd_fakultas"));
                m.setNama_fakultas(rs.getString("nama_fakultas"));
                m.setJumlah_fakultas(rs.getString("jumlah_fakultas"));
             
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
}

