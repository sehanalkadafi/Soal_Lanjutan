<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.jurusan_model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jurusan</title>
    </head>
    <body>
       <center><h1>Edit Data Jurusan</h1></center>
    <form action="jurusanController?data=jurusan&proses=edit-jurusan" method="post">
        <table style="margin:20px auto;">
            <%
                String id = request.getParameter("id");
                jurusan_model km = new jurusan_model();
                km.setKd_jurusan(id);
                List<jurusan_model> data = new ArrayList<jurusan_model>();
                data = km.cariID();
                if (data.size() > 0) {

            %>
              <tr>
                <td>Kode Jurusan </td>
                <td> : </td>
                <td> <input type="text" name="kd_jurusan" value="<%=data.get(0).getKd_jurusan()%>">> </td>
            </tr>
            <tr>
                <td>Nama Jurusan</td>
                <td> : </td>
                <td> 
                    <select name="nama_jurusan">
                        <option value=""> Pilihan </option>
                        <option value="<%=data.get(0).getNama_jurusan()%>"> Teknik Informatika </option>
                        <option value="<%=data.get(0).getNama_jurusan()%>"> Teknik Industri </option>
                        <option value="<%=data.get(0).getNama_jurusan()%>"> Pendidikan Fisika </option>
                        <option value="<%=data.get(0).getNama_jurusan()%>"> Arsitektur </option>
                        <option value="<%=data.get(0).getNama_jurusan()%>"> Pendidikan Matematika </option>
                        <option value="<%=data.get(0).getNama_jurusan()%>"> Pendidikan Biologi </option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>Kaprodi </td>
                <td> : </td>
                <td> <input type="text" name="kaprodi" value="<%=data.get(0).getNama_jurusan()%>"> </td>
            </tr>
            <tr>
                <td>Kode Fakultas </td>
                <td> : </td>
                <td> <input type="text" name="kd_fakultas" value="<%=data.get(0).getKd_fakultas()%>"> </td>
            </tr>

             <tr></tr>
            <tr></tr>
           
            <tr>
                <td></td>
                <td><input type="submit" value="Edit"></td>
            </tr>
            <%}%>
        </table>

    </form> 

    </body>
</html>
