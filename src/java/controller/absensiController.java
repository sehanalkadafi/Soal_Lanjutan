/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.jurusan_model;
import model.matakuliah_model;

/**
 *
 * @author Alkadafi
 */
@WebServlet(name = "absensiController", urlPatterns = {"/absensiController"})
public class absensiController extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("menuutama")) {
            response.sendRedirect("view_absensi.jsp");
//        } 
//        else 
//        if (proses.equals("input-matakuliah")) {
//            response.sendRedirect("tambah_matakuliah.jsp");
            return;
        }
//else if (proses.equals("edit-barang")) {
//            response.sendRedirect("edit_barang.jsp?id=" + request.getParameter("id"));
//            return;
//        } else if (proses.equals("hapus-barang")) {
//            barangModel hm = new barangModel();
//            hm.setKd_brg(request.getParameter("id"));
//            hm.hapus();
////            response.sendRedirect("index.jsp");
//            response.sendRedirect("view_masterdata.jsp");
//        }else if (proses.equals("data_penjualan")) {
//            response.sendRedirect("view_penjualan.jsp");
//            return;
//        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String data = request.getParameter("data");
        String proses = request.getParameter("proses");

        if (data != null) {
            if (data.equals("absensi")) {
                matakuliah_model um = new matakuliah_model();
                um.setKd_mk(request.getParameter("kd_mk"));
                um.setNama_mk(request.getParameter("nama_mk"));
                um.setSks(request.getParameter("sks"));
              

//                if (proses.equals("menuutama")) {
//                    response.sendRedirect("view_masterdata.jsp");
//                } else 
                if (proses.equals("input-matakuliah")) {
                    um.simpan();
                }
//                    else if (proses.equals("edit-barang")) {
//                    um.update();
//                } else if (proses.equals("hapus-barang")) {
//                    um.hapus();
//                }
////                response.sendRedirect("index.jsp");
//                response.sendRedirect("view_masterdata.jsp");
//            }
            }
        }
    }
}