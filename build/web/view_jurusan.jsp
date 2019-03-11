
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.jurusan_model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jurusan</title>
    </head>
    <body>
        <center><h1>Form Jurusan</h1></center>
    <table style="margin:20px auto;" border="1">
        
        <tr>
            <th>Kode Jurusan</th>
            <th>Nama Jurusan</th>
            <th>Kaprodi</th>
            <th>Kode Fakultas</th>
            <th>Action</th>
        </tr>
        
        <%
            jurusan_model km = new jurusan_model();
            List<jurusan_model> data = new ArrayList<jurusan_model>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        %>
        <tr>

            <td><%=data.get(x).getKd_jurusan()%></td>
            <td><%=data.get(x).getNama_jurusan()%></td>
            <td><%=data.get(x).getKaprodi()%></td>
            <td><%=data.get(x).getKd_fakultas()%></td>
            <td>
                <a class="tambah" href="jurusanController?proses=input-jurusan">Tambah</a>
                <a href="jurusanController?proses=edit-jurusan&id=<%=data.get(x).getKd_jurusan()%>">Edit</a>

                <a href="jurusanController?proses=hapus-jurusan&id=<%=data.get(x).getKd_jurusan()%>">Hapus</a>
            </td>

        </tr>
        <%}%>

    </table>
    </body>
</html>
