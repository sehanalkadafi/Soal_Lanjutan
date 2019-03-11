
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_view.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jurusan</title>
    </head>
    <body>
    <center><h1>Tambah Data Jurusan </h1></center>
    <form action="jurusanController?data=jurusan&proses=input-jurusan" method="post">
        <table style="margin:20px auto;">

            <tr>
                <td>Kode Jurusan </td>
                <td> : </td>
                <td> <input type="text" name="kd_jurusan"> </td>
            </tr>
            <tr>
                <td>Nama Jurusan</td>
                <td> : </td>
                <td> 
                    <select name="nama_jurusan">
                        <option value=""> Pilihan </option>
                        <option value="informatika"> Teknik Informatika </option>
                        <option value="industri"> Teknik Industri </option>
                        <option value="fisika"> Pendidikan Fisika </option>
                        <option value="arsitektur"> Arsitektur </option>
                        <option value="matematika"> Pendidikan Matematika </option>
                        <option value="biologi"> Pendidikan Biologi </option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>Kaprodi </td>
                <td> : </td>
                <td> <input type="text" name="kaprodi"> </td>
            </tr>
            <tr>
                <td>Kode Fakultas </td>
                <td> : </td>
                <td> <input type="text" name="kd_fakultas"> </td>
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
