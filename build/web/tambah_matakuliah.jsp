
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>matakuliah</title>
    </head>
    <body>
    <center><h1>Tambah Data Matakuliah </h1></center>
    <form action="matakuliahController?data=matakuliah&proses=input-matakuliah" method="post">
        <table style="margin:20px auto;">

            <tr>
                <td>Kode Matakuliah </td>
                <td> : </td>
                <td> <input type="text" name="kd_mk"> </td>
            </tr>
            <tr>
                <td>Nama Matakuliah </td>
                <td> : </td>
                <td> 
                    <input type="checkbox" name="nama_mk" value="Pemrograman"> Pemrograman <br>
                    <input type="checkbox" name="nama_mk" value="Algoritma"> Algoritma <br>
                    <input type="checkbox" name="nama_mk" value="Kalkulus"> Kalkulus <br>
                </td>
            </tr>
            <tr>
                <td>SKS </td>
                <td> : </td>
                <td> <input type="text" name="sks"> </td>
            </tr>
            
             <tr></tr>
            <tr></tr>
              <tr>
              
                  <td><input type="submit" value="Simpan"></td>
            </tr>
        </table>
    </form>
</body>
</html>
