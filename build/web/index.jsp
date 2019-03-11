<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Universitas</title>
    </head>
    
    <style>
        #header ul {padding:0;margin:0;list-style:none;float:left;}
	#header ul li{float:left;font-size:12px;}
	#header li a{;float:left;color:#c5c5c5;padding:12px 20px;text-decoration:none;}
	#header ul li a:hover {color:white;}

    </style>
   <body>
    <div id="bok">    
        </div>
    <div id="header">
        <ul style="list-style-type:none">
       <li><a href="mahasiswaController?proses=menuutama"><h2>Mahasiswa</h2></a></li>
       <li><a href="fakultasController?proses=menuutama"><h2>Fakultas</h2></a></li>
       <li><a href="jurusanController?proses=menuutama"><h2>Jurusan</h2></a></li>
       <li><a href="matakuliahController?proses=menuutama"><h2>Matakuliah</h2></a></li>
       <li><a href="absensiController?proses=menuutama"><h2>RelasiTable</h2></a></li>
       </ul>
    </div>
    <div id="main">
        <center><br<h1>Universitas</h1></center>
    <form method="post" action="login.jsp">
        <center>
        <table border="1" width="30%" cellpadding="3">
         <thead>
         <tr><th colspan="2">Login Here</th></tr>
         </thead>
            <tbody>
                <tr>
                    <td>User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Yet Not Registered!! <a href="reg.jsp">Register Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>  
             </div>
        <div id="footer"></div>
    

    </body>
</html>
