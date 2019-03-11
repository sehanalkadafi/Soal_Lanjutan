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


/**
 *
 * @author Alkadafi
 */
@WebServlet(name = "jurusanController", urlPatterns = {"/jurusanController"})
public class jurusanController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("menuutama")) {
            response.sendRedirect("view_jurusan.jsp");
        } else 
        if (proses.equals("input-jurusan")) {
            response.sendRedirect("tambah_jurusan.jsp");
            return;
        }
        else if (proses.equals("edit-jurusan")) {
            response.sendRedirect("edit_jurusan.jsp?id=" + request.getParameter("id"));
            return;
        } else if (proses.equals("hapus-jurusan")) {
            jurusan_model hm = new jurusan_model();
            hm.setKd_jurusan(request.getParameter("id"));
            hm.hapus();
//            response.sendRedirect("index.jsp");
            response.sendRedirect("view_jurusan.jsp");
        } 
//            response.sendRedirect("view_jurusan.jsp");
//            return;
        
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
            if (data.equals("jurusan")) {
                jurusan_model um = new jurusan_model();
                um.setKd_jurusan(request.getParameter("kd_jurusan"));
                um.setNama_jurusan(request.getParameter("nama_jurusan"));
                um.setKaprodi(request.getParameter("jumlah_jurusan"));
                um.setKd_fakultas(request.getParameter("kd_fakultas"));

                if (proses.equals("menuutama")) {
                    response.sendRedirect("view_jurusan.jsp");
                } else 
                if (proses.equals("input-jurusan")) {
                    um.simpan();
                
                } else if (proses.equals("edit-jurusan")) {
                    um.update();
                } else if (proses.equals("hapus-jurusan")) {
                    um.hapus();
                }
////                response.sendRedirect("index.jsp");
                response.sendRedirect("view_jurusan.jsp");
            
            }
        }
    }
}