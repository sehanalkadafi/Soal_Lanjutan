
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>fakultas</title>
    </head>
    <body>
    <center><h1>Tambah Data Fakultas </h1></center>
    <form action="fakultasController?data=fakultas&proses=input-fakultas" method="post">
        <table style="margin:20px auto;">

            <tr>
                <td>Kode Fakultas </td>
                <td> : </td>
                <td> <input type="text" name="kd_fakultas"> </td>
            </tr>
            <tr>
                <td>Nama Fakultas </td>
                <td> : </td>
                <td> 
                     <input type="radio" name="nama_fakultas" value="FBS">FBS
                    <input type="radio" name="nama_fakultas" value="FTMIPA">FTMIPA
                    <input type="radio" name="nama_fakultas" value="FIPPS">FIPPS
                </td>
            </tr>
            <tr>
                <td>Jumlah Fakultas</td>
                <td> : </td>
                <td> <input type="text" name="jumlah_fakultas"> </td>
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
