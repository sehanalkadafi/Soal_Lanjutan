
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.mahasiswa_model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mahasiswa</title>
    </head>
    
    <body>
        <center><h1>Form Mahasiswa</h1></center>
    <table style="margin:20px auto;" border="1">
        
        <tr>
            <th>NPM</th>
            <th>Nama Mahasiswa</th>
            <th>Kode Jurusan</th>
            <th>Alamat</th>
            <th>Telp</th>
            <th>Action</th>
        </tr>
        
        <%
            mahasiswa_model km = new mahasiswa_model();
            List<mahasiswa_model> data = new ArrayList<mahasiswa_model>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        %>
        <tr>

            <td><%=data.get(x).getNpm()%></td>
            <td><%=data.get(x).getNama_mhs()%></td>
            <td><%=data.get(x).getKd_jurusan()%></td>
            <td><%=data.get(x).getAlamat()%></td>
            <td><%=data.get(x).getTlp()%></td>
           <td>
                <a class="tambah" href="mahasiswaController?proses=input-mahasiswa">Tambah</a>
                <a href="mahasiswaController?proses=edit-mahasiswa&id=<%=data.get(x).getNpm()%>">Edit</a>

                <a href="mahasiswaController?proses=hapus-mahasiswa&id=<%=data.get(x).getNpm()%>">Hapus</a>
            </td>

        </tr>
        
      
        <%}%>

    </table>
    </body>
</html>
