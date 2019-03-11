
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
    <center><h1>Tambah Data Mahasiswa </h1></center>
    <form action="mahasiswaController?data=mahasiswa&proses=input-mahasiswa" method="post">
        <table style="margin:20px auto;">

        

            <tr>
                <td>NPM </td>
                <td> : </td>
                <td> <input type="text" name="npm"> </td>
            </tr>
            <tr>
                <td>Nama </td>
                <td> : </td>
                <td> <input type="text" name="nama_mhs"> </td>
            </tr>
            <tr>
                <td> Kode Jurusan </td>
                <td> : </td>
                <td> <input type="text" name="kd_jurusan"> </td>
            </tr>
            <tr>
                <td>Alamat </td>
                <td> : </td>
                <td> <input type="text" name="alamat"> </td>
            </tr>
            <tr>
                <td>Telp </td>
                <td> : </td>
                <td> <input type="text" name="tlp"> </td>
            </tr>
            <tr></tr>
            <tr></tr>
            <tr>

                <td><input type="submit" value="Simpan"></td>
            </tr>
            <tr></tr>
            <tr></tr>
           

        </table>
    </form>



</body>
</html>
