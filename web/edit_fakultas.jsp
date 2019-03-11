<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.fakultas_model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>fakultas</title>
    </head>
    <body>
    <center><h1>Edit Data Mahasiwa</h1></center>
    <form action="fakultasController?data=fakultas&proses=edit-fakultas" method="post">
        <table style="margin:20px auto;">
            <%
                String id = request.getParameter("id");
                fakultas_model km = new fakultas_model();
                km.setKd_fakultas(id);
                List<fakultas_model> data = new ArrayList<fakultas_model>();
                data = km.cariID();
                if (data.size() > 0) {

            %>

            <tr>
                <td>Kode Fakultas </td>
                <td> : </td>
                <td> <input type="text" name="kd_fakultas" value="<%=data.get(0).getKd_fakultas()%>"> </td>
                  <td><input type="hidden" name="kd_fakultas" value="<%=data.get(0).getKd_fakultas()%>"></td>
            </tr>
            <tr>
                <td>Nama Fakultas </td>
                <td> : </td>
                <td> 
                    <input type="radio" name="nama_fakultas" value="<%=data.get(0).getNama_fakultas()%>">FBS
                    <input type="radio" name="nama_fakultas" value="<%=data.get(0).getNama_fakultas()%>">FTMIPA
                    <input type="radio" name="nama_fakultas" value="FIPPS">FIPPS

                </td>
            </tr>
            <tr>
                <td>Jumlah Fakultas</td>
                <td> : </td>
                <td> <input type="text" name="jumlah_fakultas" value="<%=data.get(0).getJumlah_fakultas()%>"> </td>
                  <td><input type="hidden" name="jumlah_fakultas" value="<%=data.get(0).getJumlah_fakultas()%>"></td>
            </tr>
            <tr></tr>
            <tr></tr>
            <tr>

                <td><input type="submit" value="Edit"></td>
            </tr>
               <%}%>
        </table>
    </form>
</body>
</html>
