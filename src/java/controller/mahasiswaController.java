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
import model.mahasiswa_model;

/**
 *
 * @author Alkadafi
 */
@WebServlet(name = "mahasiswaController", urlPatterns = {"/mahasiswaController"})
public class mahasiswaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");

        if (proses.equals("menuutama")) {
            response.sendRedirect("view_mahasiswa.jsp");
        } else if (proses.equals("input-mahasiswa")) {
            response.sendRedirect("tambah_mahasiswa.jsp");
            return;
        } else if (proses.equals("edit-mahasiswa")) {
            response.sendRedirect("edit_mahasiswa.jsp?id=" + request.getParameter("id"));
            return;
        } else if (proses.equals("hapus-mahasiswa")) {
            mahasiswa_model hm = new mahasiswa_model();
            hm.setNpm(request.getParameter("id"));
            hm.hapus();
//            response.sendRedirect("index.jsp");
            response.sendRedirect("view_mahasiswa.jsp");
//        }else if (proses.equals("data_penjualan")) {
//            response.sendRedirect("view_penjualan.jsp");
//            return;
        }
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

        String data = request.getParameter("data");
        String proses = request.getParameter("proses");

        if (data != null) {
            if (data.equals("mahasiswa")) {
                mahasiswa_model um = new mahasiswa_model();
                um.setNpm(request.getParameter("npm"));
                um.setNama_mhs(request.getParameter("nama_mhs"));
                um.setKd_jurusan(request.getParameter("kd_jurusan"));
                um.setAlamat(request.getParameter("alamat"));
                um.setTlp(request.getParameter("tlp"));

                if (proses.equals("menuutama")) {
                    response.sendRedirect("view_mahasiswa.jsp");
                } else if (proses.equals("input-mahasiswa")) {
                    um.simpan();
                } else if (proses.equals("edit-mahasiswa")) {
                    um.update();
                } else if (proses.equals("hapus-mahasiswa")) { 
                    um.hapus();
                }
//                response.sendRedirect("index.jsp");
                response.sendRedirect("view_mahasiswa.jsp");
            }
        }
    }
}
