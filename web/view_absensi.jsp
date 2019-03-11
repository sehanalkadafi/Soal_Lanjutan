
<%@page import="model.absensi_model"%>
<%--<%@page import="model.absensi_model"%>--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <center><h1>Form Relasi</h1></center>
    <table style="margin:20px auto;" border="1">
<!--        <center>
            <a class="tambah" href="matakuliahController?proses=input-matakuliah">Tambah</a>
        </center>-->

        <tr> 

            <th>NPM</th>
            <th>Nama Mahasiswa</th>
            <th>Jurusan</th>
            <th>Fakultas</th>
            <th>Nama Matakuliah</th>
            <th>SKS</th>
            <!--<th>Action</th>-->
        </tr>

        <%
            absensi_model km = new absensi_model();
            List<absensi_model> data = new ArrayList<absensi_model>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        %>
        <tr>

            <td><%=data.get(x).getNpm()%></td>
            <td><%=data.get(x).getNama_mhs()%></td>
            <td><%=data.get(x).getNama_jurusan()%></td>
            <td><%=data.get(x).getNama_fakultas()%></td>
            <td><%=data.get(x).getNama_mk()%></td>
            <td><%=data.get(x).getSks()%></td>
           

        </tr>
        <%}%>

    </table>
    </body>
</html>

