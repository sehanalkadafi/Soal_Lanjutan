package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.absensi_model;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;

public final class view_005fabsensi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <center><h1>Form absensi</h1></center>\n");
      out.write("    <table style=\"margin:20px auto;\" border=\"1\">\n");
      out.write("<!--        <center>\n");
      out.write("            <a class=\"tambah\" href=\"matakuliahController?proses=input-matakuliah\">Tambah</a>\n");
      out.write("        </center>-->\n");
      out.write("\n");
      out.write("        <tr> \n");
      out.write("\n");
      out.write("            <th>NPM</th>\n");
      out.write("            <th>Nama Mahasiswa</th>\n");
      out.write("            <th>Jurusan</th>\n");
      out.write("            <th>Fakultas</th>\n");
      out.write("            <th>Nama Matakuliah</th>\n");
      out.write("            <th>SKS</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");

            absensi_model km = new absensi_model();
            List<absensi_model> data = new ArrayList<absensi_model>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("\n");
      out.write("            <td>");
      out.print(data.get(x).getNpm());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(data.get(x).getNama_mhs());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(data.get(x).getJurusan());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(data.get(x).getFakultas());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(data.get(x).getNama_mk());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(data.get(x).getSks());
      out.write("</td>\n");
      out.write("           \n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
