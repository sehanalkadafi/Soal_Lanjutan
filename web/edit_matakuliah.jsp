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
        <title>matakuliah</title>
    </head>
    <body>
       <center><h1>Edit Data Matakuliah</h1></center>
    <form action="matakuliahController?data=matakuliah&proses=edit-matakuliah" method="post">
        <table style="margin:20px auto;">
            
            <%
                String id = request.getParameter("id");
                matakuliah_model km = new  matakuliah_model();
                km.setKd_mk(id);
                List<matakuliah_model> data = new ArrayList<matakuliah_model>();
                data = km.cariID();
                if (data.size() > 0) {

            %>
             <tr>
                <td>Kode Matakuliah </td>
                <td> : </td>
                <td> <input type="text" name="kd_mk" value="<%=data.get(0).getKd_mk()%>"> </td>
            </tr>
            <tr>
                <td>Nama Matakuliah </td>
                <td> : </td>
                <td> 
                    <input type="checkbox" name="nama_mk" value="<%=data.get(0).getNama_mk()%>"> Pemrograman <br>
                    <input type="checkbox" name="nama_mk" value="<%=data.get(0).getNama_mk()%>"> Algoritma <br>
                    <input type="checkbox" name="nama_mk" value="<%=data.get(0).getNama_mk()%>"> Kalkulus <br>
                </td>
            </tr>
            <tr>
                <td>SKS </td>
                <td> : </td>
                <td> <input type="text" name="sks" value="<%=data.get(0).getSks()%>"> </td>
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
