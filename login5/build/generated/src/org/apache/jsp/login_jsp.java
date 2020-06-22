package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" xmlns:th=\"http://www.thymeleaf.org\">\n");
      out.write("<head>\n");
      out.write("    <title>Login</title>\n");
      out.write("\n");
      out.write("    <!--JQUERY-->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- FRAMEWORK BOOTSTRAP para el estilo de la pagina-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Los iconos tipo Solid de Fontawesome-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.8/css/solid.css\">\n");
      out.write("    <script src=\"https://use.fontawesome.com/releases/v5.0.7/js/all.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Nuestro css-->\n");
      out.write("    \n");
      out.write("    <link href=\"MISESTILOS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url(../img/background.jpg)\">\n");
      out.write("    <div class=\"modal-dialog text-center\">\n");
      out.write("        <div class=\"col-sm-8 main-section\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"col-12 user-img\">\n");
      out.write("                    <img src=\"static/img/asd.jpeg\" th:src=\"@{/img/asd.jpeg}\"/>\n");
      out.write("                </div>\n");
      out.write("                <form class=\"col-12\" th:action=\"@{/login}\" method=\"get\">\n");
      out.write("                    <div class=\"form-group\" id=\"user-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Nombre de usuario\" name=\"username\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"contrasena-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Contrasena\" name=\"password\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\"><i class=\"fas fa-sign-in-alt\"></i>  Ingresar </button>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"col-12 forgot\">\n");
      out.write("                    <a href=\"#\">Recordar contrasena?</a>\n");
      out.write("                </div>\n");
      out.write("                <div th:if=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("\t\t            Invalid username and password.\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div th:if=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.logout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"alert alert-success\" role=\"alert\">\n");
      out.write("\t\t            You have been logged out.\n");
      out.write("\t\t        </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
