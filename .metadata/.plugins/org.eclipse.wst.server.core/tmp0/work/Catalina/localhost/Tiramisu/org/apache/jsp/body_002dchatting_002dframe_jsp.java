/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-07-19 04:25:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class body_002dchatting_002dframe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

	request.setCharacterEncoding("utf-8");

      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar textarea = document.getElementById(\"chat\");\n");
      out.write("\tvar webSocket = new WebSocket('ws://localhost:8070/Tiramisu/broadcasting');\n");
      out.write("\tvar inputMessage = document.getElementById('dialogInput');\n");
      out.write("\tvar nickname = null;\n");
      out.write("\tvar time = null;\n");
      out.write("\tvar content = null;\n");
      out.write("\twebSocket.onerror = function(event) {\n");
      out.write("\t\tonError(event)\n");
      out.write("\t};\n");
      out.write("\twebSocket.onopen = function(event) {\n");
      out.write("\t\tonOpen(event)\n");
      out.write("\t};\n");
      out.write("\twebSocket.onmessage = function(event) {\n");
      out.write("\t\tonMessage(event)\n");
      out.write("\t};\n");
      out.write("\tfunction onMessage(event) {\n");
      out.write("\t\tvar recMessage = event.data;\n");
      out.write("\t\tconsole.log(recMessage);\n");
      out.write("\t\trecMessage = recMessage.split('`');\n");
      out.write("\t\tconsole.log(recMessage[0]);\n");
      out.write("\t\tconsole.log(recMessage[1]);\n");
      out.write("\t\tconsole.log(recMessage[2]);\n");
      out.write("\t\ttextarea.innerHTML += '<li class=\"left clearfix\"><span class=\"chat-img pull-left\">\\\n");
      out.write("\t\t\t<img src=\"images/tirami.PNG\" alt=\"User Avatar\">\\\n");
      out.write("\t\t</span>\\\n");
      out.write("\t\t\t<div class=\"chat-body clearfix\">\\\n");
      out.write("\t\t\t\t<div class=\"header\">\\\n");
      out.write("\t\t\t\t\t<strong class=\"primary-font\">'+ recMessage[0] +'</strong> <small\\\n");
      out.write("\t\t\t\t\t\tclass=\"pull-right text-muted\"><i class=\"fa fa-clock-o\"></i>'+\n");
      out.write("\t\t\t\t\t\t+ new Date() +'</small>\\\n");
      out.write("\t\t\t\t</div>\\\n");
      out.write("\t\t\t\t<p>'+ recMessage[2] +'</p>\\\n");
      out.write("\t\t\t</div></li>';\n");
      out.write("\t\t//textarea.value += \"상대 : \" + event.data + \"\\n\";\n");
      out.write("\t}\n");
      out.write("\tfunction onOpen(event) {\n");
      out.write("\t\tconsole.log(\"연결 성공\\n\");\n");
      out.write("\t}\n");
      out.write("\tfunction onError(event) {\n");
      out.write("\t\talert(event.data);\n");
      out.write("\t}\n");
      out.write("\tfunction send() {\n");
      out.write("\t\tcontent = document.getElementById(\"dialogInput\").value;\n");
      out.write("\t\ttime = new Date();\n");
      out.write("\t\tnickname = \"");
      out.print(session.getAttribute("nickname"));
      out.write("\";\n");
      out.write("\n");
      out.write("\t\ttextarea.innerHTML += '<li class=\"right clearfix\"><span class=\"chat-img pull-right\">\\\n");
      out.write("\t\t\t<img src=\"images/me.jpg\" alt=\"User Avatar\">\\\n");
      out.write("\t\t</span>\\\n");
      out.write("\t\t\t<div class=\"chat-body clearfix\">\\\n");
      out.write("\t\t\t\t<div class=\"header\">\\\n");
      out.write("\t\t\t\t\t<strong class=\"primary-font\">'+ nickname +'</strong> <small\\\n");
      out.write("\t\t\t\t\t\tclass=\"pull-right text-muted\"><i class=\"fa fa-clock-o\"></i>'+\n");
      out.write("\t\t\t\t\t\t+ time +'</small>\\\n");
      out.write("\t\t\t\t</div>\\\n");
      out.write("\t\t\t\t<p>'+ content +'</p>\\\n");
      out.write("\t\t\t</div></li>';\n");
      out.write("\t\tsendMessage = nickname+\"`\"+time+\"`\"+content;\n");
      out.write("\t\twebSocket.send(sendMessage);\n");
      out.write("\t\tinputMessage.value = \"\";\n");
      out.write("\t}\n");
      out.write("\t/*Debug function*/\n");
      out.write("\tfunction dialogSubmit(){\n");
      out.write("\t\tcontent = document.getElementById(\"dialogInput\").value;\n");
      out.write("\t\ttime = new Date();\n");
      out.write("\t\tnickname = \"");
      out.print(session.getAttribute("nickname"));
      out.write("\";\n");
      out.write("\t\t/*document.writeln(content);\n");
      out.write("\t\tdocument.writeln(time);\n");
      out.write("\t\tdocument.writeln(nickname);*/\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("<link\n");
      out.write("\thref=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"css/chatting.css\" rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container bootstrap snippet\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t<!--=========================================================-->\n");
      out.write("\t\t<!-- selected chat -->\n");
      out.write("\t\t<div class=\"col-md-8 bg-white \">\n");
      out.write("\t\t\t<div class=\"chat-message\">\n");
      out.write("\t\t\t\t<ul class=\"chat\" id=\"chat\">\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chatting-left-clearfix.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("chatNickname", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("이형건", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("chatTime", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("2017-07-18 AM 05:45", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("chatContent", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("오늘 11시까지인데 밥언제 먹나요...:(", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chatting-right-clearfix.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("chatNickname", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("변다영", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("chatTime", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("2017-07-18 AM 05:46", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("chatContent", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("지금 당장 먹어도 시원찮습니다", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"left clearfix\"><span class=\"chat-img pull-left\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/tirami.PNG\" alt=\"User Avatar\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-body clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"primary-font\">이성민</strong> <small\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted\"><i class=\"fa fa-clock-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t2017-07-18 AM 05:47</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<p>나도 머글랭</p>\n");
      out.write("\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t<li class=\"right clearfix\"><span class=\"chat-img pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/me.jpg\" alt=\"User Avatar\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-body clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"primary-font\">변다영</strong> <small\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted\"><i class=\"fa fa-clock-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t2017-07-18 AM 05:49</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<p>오빠도 먹죠</p>\n");
      out.write("\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t<li class=\"left clearfix\"><span class=\"chat-img pull-left\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/tirami.PNG\" alt=\"User Avatar\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-body clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"primary-font\">김태정</strong> <small\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted\"><i class=\"fa fa-clock-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t2017-07-18 AM 05:50</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<p>나는 아무거나 괜찮아요.</p>\n");
      out.write("\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t<li class=\"right clearfix\"><span class=\"chat-img pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/me.jpg\" alt=\"User Avatar\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-body clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"primary-font\">변다영</strong> <small\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted\"><i class=\"fa fa-clock-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t2017-07-18 AM 05:50</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<p>그 놈의 아무거나</p>\n");
      out.write("\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t<li class=\"right clearfix\"><span class=\"chat-img pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/me.jpg\" alt=\"User Avatar\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-body clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"primary-font\">변다영</strong> <small\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted\"><i class=\"fa fa-clock-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t2017-07-18 AM 05:51</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<p>아악!</p>\n");
      out.write("\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"chat-box bg-white\">\n");
      out.write("\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t<input class=\"form-control border no-shadow no-rounded\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Type your message here\" id=\"dialogInput\"> <span\n");
      out.write("\t\t\t\t\t\tclass=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-success no-rounded\" type=\"button\"\n");
      out.write("\t\t\t\t\t\t\tonclick=\"send()\">Send</button>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /input-group -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!--오른쪽 면 -->\n");
      out.write("\t\t<div class=\"col-md-4 bg-white \">\n");
      out.write("\t\t\t<div class=\" row border-bottom padding-sm\" style=\"height: 60px;\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- =============================================================== -->\n");
      out.write("\t\t\t<!-- member list -->\n");
      out.write("\t\t\t<ul class=\"friend-list\">\n");
      out.write("\t\t\t\t<li class=\"active bounceInDown\"><a href=\"#\" class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t<img src=\"https://bootdey.com/img/Content/user_1.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>John Doe</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Hello, Are you there?</div> <small\n");
      out.write("\t\t\t\t\t\tclass=\"time text-muted\">Just now</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert label label-danger\">1</small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"clearfix\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://bootdey.com/img/Content/user_2.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>Jane Doe</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Lorem ipsum dolor sit\n");
      out.write("\t\t\t\t\t\t\tamet.</div> <small class=\"time text-muted\">5 mins ago</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert text-muted\"><i class=\"fa fa-check\"></i></small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"clearfix\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://bootdey.com/img/Content/user_3.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>Kate</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Lorem ipsum dolor sit\n");
      out.write("\t\t\t\t\t\t\tamet.</div> <small class=\"time text-muted\">Yesterday</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert text-muted\"><i class=\"fa fa-reply\"></i></small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"clearfix\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://bootdey.com/img/Content/user_1.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>Kate</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Lorem ipsum dolor sit\n");
      out.write("\t\t\t\t\t\t\tamet.</div> <small class=\"time text-muted\">Yesterday</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert text-muted\"><i class=\"fa fa-reply\"></i></small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"clearfix\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://bootdey.com/img/Content/user_2.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>Kate</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Lorem ipsum dolor sit\n");
      out.write("\t\t\t\t\t\t\tamet.</div> <small class=\"time text-muted\">Yesterday</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert text-muted\"><i class=\"fa fa-reply\"></i></small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"clearfix\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://bootdey.com/img/Content/user_6.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>Kate</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Lorem ipsum dolor sit\n");
      out.write("\t\t\t\t\t\t\tamet.</div> <small class=\"time text-muted\">Yesterday</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert text-muted\"><i class=\"fa fa-reply\"></i></small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"clearfix\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://bootdey.com/img/Content/user_5.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>Kate</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Lorem ipsum dolor sit\n");
      out.write("\t\t\t\t\t\t\tamet.</div> <small class=\"time text-muted\">Yesterday</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert text-muted\"><i class=\"fa fa-reply\"></i></small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"clearfix\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"https://bootdey.com/img/Content/user_2.jpg\" alt=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"img-circle\">\n");
      out.write("\t\t\t\t\t\t<div class=\"friend-name\">\n");
      out.write("\t\t\t\t\t\t\t<strong>Jane Doe</strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"last-message text-muted\">Lorem ipsum dolor sit\n");
      out.write("\t\t\t\t\t\t\tamet.</div> <small class=\"time text-muted\">5 mins ago</small> <small\n");
      out.write("\t\t\t\t\t\tclass=\"chat-alert text-muted\"><i class=\"fa fa-check\"></i></small>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");

	//This scritp was occured error.

      out.write("\n");
      out.write("<!--  <script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>-->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("</script>\n");
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
