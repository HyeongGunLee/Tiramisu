/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-07-20 23:57:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import work.model.service.TeamService;

public final class team_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("work.model.service.TeamService");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"euc-kr\">\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("utf-8");
	String teamName = request.getParameter("teamName");
	TeamService service = TeamService.getInstance();
	ArrayList<String> channelNameArray = service.teamHasChannel(teamName);
	if (channelNameArray != null) {
		for (String str : channelNameArray) {
			System.out.println("team.jsp : " + str);
		}
	}
	System.out.println(channelNameArray.size());
	boolean existChart = service.existChart(teamName);

      out.write("\r\n");
      out.write("<!-- 버튼 api-->\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<!--js-->\r\n");
      out.write("<script src=\"js/jquery-2.1.1.min.js\"></script> \r\n");
      out.write("<!--icons-css-->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!--Google Fonts-->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!--button css-->\r\n");
      out.write("<link href=\"css/demo-page.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<link href=\"css/hover.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<!--//but-->\r\n");
      out.write("<!-- 버튼End -->\r\n");
      out.write("\r\n");
      out.write("<!-- 팝업 소스 -->\r\n");
      out.write("<link href=\"css/popup.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"js/popup.js\"></script>\r\n");
      out.write("<!-- 팝업 소스 END -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function page_move(team,channel){\r\n");
      out.write("    var f=document.paging; //폼 name\r\n");
      out.write("    f.teamName.value = team; //POST방식으로 넘기고 싶은 값\r\n");
      out.write("    f.channelName.value = channel;//POST방식으로 넘기고 싶은 값\r\n");
      out.write("    f.action=\"index.jsp\";//이동할 페이지\r\n");
      out.write("    f.method=\"post\";//POST방식\r\n");
      out.write("    f.submit();\r\n");
      out.write("    console.log('enter');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<form name=\"paging\">\r\n");
      out.write("      <input type=\"hidden\" name=\"teamName\"/>\r\n");
      out.write("      <input type=\"hidden\" name=\"channelName\"/>\r\n");
      out.write("</form>\r\n");
      out.write("<li><a href=\"#\" class=\"hvr-grow-shadow\"style=\"background-color:#a0522d; font-size:15px;\">");
      out.print(teamName);
      out.write("</a>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<!-- <li><a href=\"#\" id=\"General\"><img src=\"images/chat.png\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 19px; height: 19px;\"> General chat</a></li> -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t");

			for (int i = 0; i < channelNameArray.size(); i++) {
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li><a href=\"index.jsp?teamName=");
      out.print(teamName );
      out.write("&channelName=");
      out.print(channelNameArray.get(i) );
      out.write("\" id=\"channelSelect\"><img src=\"images/chat.png\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 19px; height: 19px;\"> ");
      out.print(channelNameArray.get(i) );
      out.write("</a></li>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t<li><a href=\"#\"><img src=\"images/files.png\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 17px; height: 17px;\"> data file</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\" onclick=\"clickChart()\"><img src=\"images/chart.png\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 17px; height: 17px;\"> charts</a></li>\r\n");
      out.write("\t\t<li><a href=\"buildChannelPop.jsp?teamName=");
      out.print(teamName );
      out.write("\"><img src=\"images/plus_white.png\" style=\"width: 15px; height: 15px;\"> Add Channel</a></li>\r\n");
      out.write("\t</ul></li>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction clickChart(){\r\n");
      out.write("\t\tif(");
      out.print(existChart);
      out.write("){\r\n");
      out.write("\t\t\tlocation.href='chart.jsp?teamName=");
      out.print(teamName);
      out.write("';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\tconsole.log(document.getElementById(\"body\").innerHTML);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t    \tdocument.getElementById(\"body\").innerHTML +='<div id=\"abc\">\\\r\n");
      out.write("\t    \t<div id=\"popupContact\">\\\r\n");
      out.write("\t    \t<form action=\"TeamController?action=makeChart\" id=\"voteform\" method=\"post\" name=\"voteform\">\\\r\n");
      out.write("\t    \t\t\t<img id=\"close\" width=\"25px\" height=\"25px\" src=\"images/x.png\" onclick=\"div_hide()\">\\\r\n");
      out.write("\t    \t\t\t<h2 id=\"headH2\">투표할 주제를 적어주세요!</h2><hr>\\\r\n");
      out.write("\t\t\t\t<input style=\"width:200px\" id=\"teamVoteName\" name=\"teamVoteName\" type=\"text\">\\\r\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"submit\"></form></div></div>';\r\n");
      out.write("\t    \tdocument.getElementById('abc').style.display = \"block\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>");
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
