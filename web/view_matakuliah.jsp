
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.matakuliah_model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matakuliah</title>
    </head>
    <body>
      <center><h1>Form Matakuliah</h1></center>
    <table style="margin:20px auto;" border="1">

        <tr>

            <th>Kode Matakuliah</th>
            <th>Nama Matakuliah</th>
            <th>SKS</th>
            <th>Action</th>
        </tr>

        <%
            matakuliah_model km = new matakuliah_model();
            List<matakuliah_model> data = new ArrayList<matakuliah_model>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        %>
        <tr>

            <td><%=data.get(x).getKd_mk()%></td>
            <td><%=data.get(x).getNama_mk()%></td>
            <td><%=data.get(x).getSks()%></td>
             <td>
                <a class="tambah" href="matakuliahController?proses=input-matakuliah">Tambah</a>
                <a href="matakuliahController?proses=edit-matakuliah&id=<%=data.get(x).getKd_mk()%>">Edit</a>

                <a href="matakuliahController?proses=hapus-matakuliah&id=<%=data.get(x).getKd_mk()%>">Hapus</a>
            </td>

        </tr>
        <%}%>

    </table>
    </body>
</html>
