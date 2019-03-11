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
import model.fakultas_model;

/**
 *
 * @author Alkadafi
 */
@WebServlet(name = "fakultasController", urlPatterns = {"/fakultasController"})
public class fakultasController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("menuutama")) {
            response.sendRedirect("view_fakultas.jsp");
        } else if (proses.equals("input-fakultas")) {
            response.sendRedirect("tambah_fakultas.jsp");
            return;
        } else if (proses.equals("edit-fakultas")) {
            response.sendRedirect("edit_fakultas.jsp?id=" + request.getParameter("id"));
            return;
        } else if (proses.equals("hapus-fakultas")) {
            fakultas_model hm = new fakultas_model();
            hm.setKd_fakultas(request.getParameter("id"));
            hm.hapus();
//            response.sendRedirect("index.jsp");
            response.sendRedirect("view_fakultas.jsp");
//        }else if (proses.equals("data_penjualan")) {
          
           
//        }
        }

    }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

            String data = request.getParameter("data");
            String proses = request.getParameter("proses");

            if (data != null) {
                if (data.equals("fakultas")) {
                    fakultas_model um = new fakultas_model();
                    um.setKd_fakultas(request.getParameter("kd_fakultas"));
                    um.setNama_fakultas(request.getParameter("nama_fakultas"));
                    um.setJumlah_fakultas(request.getParameter("jumlah_fakultas"));

                    if (proses.equals("menuutama")) {
                        response.sendRedirect("view_fakultas.jsp");
                    } else if (proses.equals("input-fakultas")) {
                        um.simpan();
                    } else if (proses.equals("edit-fakultas")) {
                        um.update();
                    } else if (proses.equals("hapus-fakultas")) {
                        um.hapus();
                    }
//                response.sendRedirect("index.jsp");
                    response.sendRedirect("view_fakultas.jsp");

                }
            }
        }
}