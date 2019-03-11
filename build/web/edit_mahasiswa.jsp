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
    <center><h1>Edit Data Mahasiwa</h1></center>
    <form action="mahasiswaController?data=mahasiswa&proses=edit-mahasiswa" method="post">
        <table style="margin:20px auto;">
            <%
                String id = request.getParameter("id");
                mahasiswa_model km = new mahasiswa_model();
                km.setNpm(id);
                List<mahasiswa_model> data = new ArrayList<mahasiswa_model>();
                data = km.cariID();
                if (data.size() > 0) {

            %>
            <tr>
                <td>NPM </td>
                <td> : </td>
                <td> <input type="text" name="npm" value="<%=data.get(0).getNpm()%>"> </td>
            </tr>
            <tr>
                <td>Nama </td>
                <td> : </td>
                <td> <input type="text" name="nama_mhs" value="<%=data.get(0).getNama_mhs()%>"> </td>
            </tr>
            <tr>
                <td> Kode Jurusan </td>
                <td> : </td>
                <td> <input type="text" name="kd_jurusan" value="<%=data.get(0).getKd_jurusan()%>"> </td>
            </tr>
            <tr>
                <td>Alamat </td>
                <td> : </td>
                <td> <input type="text" name="alamat" value=<%=data.get(0).getAlamat()%>"> </td>
            </tr>
            <tr>
                <td>Telp </td>
                <td> : </td>
                <td> <input type="text" name="tlp" value="<%=data.get(0).getTlp()%>"></td>
            </tr>

           
            <tr>
                <td></td>
                <td><input type="submit" value="Edit"></td>
            </tr>
            <%}%>
        </table>

    </form> 

</body>
</html>
