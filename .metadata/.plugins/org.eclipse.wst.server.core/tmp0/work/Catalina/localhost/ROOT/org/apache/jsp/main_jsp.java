/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-11-16 02:57:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1636839884000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1637031472000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>AwesomePlace</title>\r\n");
      out.write("<!-- CSS 5.1.3 최신 버전입니다 -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- header -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resource/css/font.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"/main.jsp\">AWESOME PLACE</a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll\" style=\"--bs-scroll-height: 100px;\">\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarScrollingDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            	어썸플레이스 소개\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/intro/intro.jsp\">카페연혁</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/intro/branch.jsp\">매장찾기</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarScrollingDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            	메뉴이야기\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/menu/mCoffee.jsp\">COFFEE</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/menu/mTea.jsp\">TEA</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/menu/mDessert.jsp\">DESSERT</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarScrollingDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            	게시판\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/board/listBoard.jsp\">공지사항</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">이달의 메뉴</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">이벤트</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" id=\"navbarScrollingDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("            	회원가입\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/member/Login.jsp\">로그인</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"/member/Join.jsp\">로그아웃</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">회원탈퇴</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  Carousel slide image// 기본 5초 간격 slide입니다 -->\r\n");
      out.write("<div id=\"awsomeCarousel\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active\">\r\n");
      out.write("      <img src=\"/resource/images/1.jpg\" class=\"d-block w-100\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"/resource/images/2.jpg\" class=\"d-block w-100\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"/resource/images/3.jpg\" class=\"d-block w-100\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"/resource/images/4.jpg\" class=\"d-block w-100\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#awsomeCarousel\" data-bs-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#awsomeCarousel\" data-bs-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("  </button>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<!-- 간략 설명 -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("	<h1> AWESOME PLACE</h1>	\r\n");
      out.write("	<br>\r\n");
      out.write("	<p> 깊고 진한 커피향기에 반하는 우리동네 핫플레이스 </p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("  <p class=\"mt-5 mb-3 text-muted\">&copy; Awesome 2021</p>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
