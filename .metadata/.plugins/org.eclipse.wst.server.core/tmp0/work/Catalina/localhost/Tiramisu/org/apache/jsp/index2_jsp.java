/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-07-20 13:01:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>티라미슈~~</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- 채팅 소스 -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/chatting.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- 채팅 소스 ENd -->\r\n");
      out.write("<!-- 팝업 소스 -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/popup.js\"></script>\r\n");
      out.write("<!-- 팝업 소스 END -->\r\n");
      out.write("<!-- 차트 api 소스 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    google.charts.load('current', {'packages':['corechart']});\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function selectHandler(e) {\r\n");
      out.write("  \t  alert('The user selected' + PieChart.getSelection().length + ' items.');\r\n");
      out.write("  }\r\n");
      out.write("    \r\n");
      out.write("    function drawChart() { //도넛차트 Start\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("          ['Task', '투표수'],\r\n");
      out.write("          ['보쌈',    15],\r\n");
      out.write("          ['닭발',    7],\r\n");
      out.write("          ['피자',  3]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: '프로젝트 후 회식을 어디서?',\r\n");
      out.write("          pieHole: 0.4,\r\n");
      out.write("          fontSize : 15\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.PieChart(document.getElementById('donutchart'));\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("        \r\n");
      out.write("        //이벤트 핸들러\r\n");
      out.write("        google.visualization.events.addListener(chart, 'select', selectHandler);\r\n");
      out.write("        function selectHandler(e) {\r\n");
      out.write("        \t\r\n");
      out.write("        \tdocument.getElementById(\"body\").innerHTML +='<div id=\"abc\"><div id=\"popupContact\"><form action=\"#의견처리\" id=\"voteform\" method=\"post\" name=\"voteform\"><img id=\"close\" width=\"25px\" height=\"25px\" src=\"images/x.png\" onclick=\"div_hide()\"><h2 id=\"headH2\">의견을 작성해주세요!</h2><hr><input id=\"name_readonly\" name=\"name\" type=\"text\" value=\"변다영\" readonly><select id=\"bias\" name=\"bias\" style=\"width:82%;padding:10px;margin-top:30px;border:1px solid #ccc;\tpadding-left:40px;font-size:16px;font-family:raleway\"><option value=\"\">선택해주세요</option><option value=\"보쌈\">보쌈</option><option value=\"닭발\">닭발</option><option value=\"피자\">피자</option>\t</select><textarea id=\"opinion\" name=\"opinion\" placeholder=\"Please tell me your voice!\"></textarea><a href=\"javascript:%20check_empty()\" id=\"submit\">Send</a></form></div></div>';\r\n");
      out.write("        \tconsole.log(document.getElementById(\"body\").innerHTML);\r\n");
      out.write("        \tdocument.getElementById('abc').style.display = \"block\";\r\n");
      out.write("        }\r\n");
      out.write("    }//도넛차트 End\r\n");
      out.write("    \r\n");
      out.write("    function drawSeriesChart() { //버블차트 Start\r\n");
      out.write("\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("          ['Nickname', 'x축', 'y축', \t\t'버블색깔',        '버블크기'],\r\n");
      out.write("          ['김태정',    92.11,   1.67,    '컴퓨터공학',  \t\t33073],\r\n");
      out.write("          ['변다영',    85.05,   1.36,    '경영정보학',       40190],\r\n");
      out.write("          ['이성민',    60.60,   1.84,     '데이터학',       55230],\r\n");
      out.write("          ['이형건',    55.42,   2.78,     '컴퓨터공학',  \t24716]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: '보쌈부서의 '+ '팀원 별 기여도/참여도',\r\n");
      out.write("          fontSize : 18,\r\n");
      out.write("          /* titleTextStyle : { fontsize : 30}, */\r\n");
      out.write("          hAxis: {title: 'x축'},\r\n");
      out.write("          vAxis: {title: 'y축'},\r\n");
      out.write("          bubble: {textStyle: {fontSize: 15}}\r\n");
      out.write("          };\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.BubbleChart(document.getElementById('series_chart_div'));\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("      }//버블차트 END\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      </script>\r\n");
      out.write("<!-- 차트 api소스END -->\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\">\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--js-->\r\n");
      out.write("<script src=\"js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<!--icons-css-->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--Google Fonts-->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Carrois+Gothic'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='css/search.css' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!--static chart-->\r\n");
      out.write("<script src=\"js/Chart.min.js\"></script>\r\n");
      out.write("<!--//charts-->\r\n");
      out.write("<!-- geo chart -->\r\n");
      out.write("<script src=\"//cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\twindow.modernizr\r\n");
      out.write("\t\t\t|| document\r\n");
      out.write("\t\t\t\t\t.write('<script src=\"lib/modernizr/modernizr-custom.js\"><\\/script>')\r\n");
      out.write("</script>\r\n");
      out.write("<!--<script src=\"lib/html5shiv/html5shiv.js\"></script>-->\r\n");
      out.write("<!-- Chartinator  -->\r\n");
      out.write("<script src=\"js/chartinator.js\"></script>\r\n");
      out.write("<!-- 차트 api 소스 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    google.charts.load('current', {'packages':['corechart']});\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function selectHandler(e) {\r\n");
      out.write("  \t  alert('The user selected' + PieChart.getSelection().length + ' items.');\r\n");
      out.write("  }\r\n");
      out.write("    \r\n");
      out.write("    function drawChart() { //도넛차트 Start\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("          ['Task', '투표수'],\r\n");
      out.write("          ['보쌈',    15],\r\n");
      out.write("          ['닭발',    7],\r\n");
      out.write("          ['피자',  3]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: '프로젝트 후 회식을 어디서?',\r\n");
      out.write("          pieHole: 0.4,\r\n");
      out.write("          fontSize : 15\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.PieChart(document.getElementById('donutchart'));\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("        \r\n");
      out.write("        //이벤트 핸들러\r\n");
      out.write("        google.visualization.events.addListener(chart, 'select', selectHandler);\r\n");
      out.write("        function selectHandler(e) {\r\n");
      out.write("        \t\r\n");
      out.write("        \tdocument.getElementById(\"body\").innerHTML +='<div id=\"abc\"><div id=\"popupContact\"><form action=\"#의견처리\" id=\"voteform\" method=\"post\" name=\"voteform\"><img id=\"close\" width=\"25px\" height=\"25px\" src=\"images/x.png\" onclick=\"div_hide()\"><h2 id=\"headH2\">의견을 작성해주세요!</h2><hr><input id=\"name_readonly\" name=\"name\" type=\"text\" value=\"변다영\" readonly><select id=\"bias\" name=\"bias\" style=\"width:82%;padding:10px;margin-top:30px;border:1px solid #ccc;\tpadding-left:40px;font-size:16px;font-family:raleway\"><option value=\"\">선택해주세요</option><option value=\"보쌈\">보쌈</option><option value=\"닭발\">닭발</option><option value=\"피자\">피자</option>\t</select><textarea id=\"opinion\" name=\"opinion\" placeholder=\"Please tell me your voice!\"></textarea><a href=\"javascript:%20check_empty()\" id=\"submit\">Send</a></form></div></div>';\r\n");
      out.write("        \tconsole.log(document.getElementById(\"body\").innerHTML);\r\n");
      out.write("        \tdocument.getElementById('abc').style.display = \"block\";\r\n");
      out.write("        }\r\n");
      out.write("    }//도넛차트 End\r\n");
      out.write("    \r\n");
      out.write("    function drawSeriesChart() { //버블차트 Start\r\n");
      out.write("\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("          ['Nickname', 'x축', 'y축', \t\t'버블색깔',        '버블크기'],\r\n");
      out.write("          ['김태정',    92.11,   1.67,    '컴퓨터공학',  \t\t33073],\r\n");
      out.write("          ['변다영',    85.05,   1.36,    '경영정보학',       40190],\r\n");
      out.write("          ['이성민',    60.60,   1.84,     '데이터학',       55230],\r\n");
      out.write("          ['이형건',    55.42,   2.78,     '컴퓨터공학',  \t24716]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: '보쌈부서의 '+ '팀원 별 기여도/참여도',\r\n");
      out.write("          fontSize : 18,\r\n");
      out.write("          /* titleTextStyle : { fontsize : 30}, */\r\n");
      out.write("          hAxis: {title: 'x축'},\r\n");
      out.write("          vAxis: {title: 'y축'},\r\n");
      out.write("          bubble: {textStyle: {fontSize: 15}}\r\n");
      out.write("          };\r\n");
      out.write("\r\n");
      out.write("        var chart = new google.visualization.BubbleChart(document.getElementById('series_chart_div'));\r\n");
      out.write("        chart.draw(data, options);\r\n");
      out.write("      }//버블차트 END\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      </script>\r\n");
      out.write("<!-- 차트 api소스END -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
boolean isLogin = (session != null && session.getAttribute("memberId") != null ? true : false);
			//System.out.println("Debug index.jsp : " + session.getAttribute("memberId"));
			//System.out.println("Debug index.jsp : " + session.getAttribute("nickname"));
	
			if (isLogin) {
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#header-frame\").load(\"header-chatting-frame.jsp\");\r\n");
      out.write("\t});\r\n");
} else {
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#header-frame\").load(\"header-logout-frame.jsp\");\r\n");
      out.write("\t});\r\n");
}
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#left-frame\").load(\"left-frame.jsp\");\r\n");
      out.write("\t});\r\n");
String teamName = request.getParameter("teamName");
			String channelName = request.getParameter("channelName");
			//System.out.println(teamName + ":" + channelName);
			if (channelName != null & teamName != null) {
				session.setAttribute("teamName", teamName);
				session.setAttribute("channelName", channelName);
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#body-frame\").load(\"body-chatting-frame.jsp\");\r\n");
      out.write("\t});\r\n");
}
      out.write("\r\n");
      out.write("\t\r\n");

	if(request.getParameter("action")!=null){
		if(request.getParameter("action").equals("null")){
			session.removeAttribute("teamName");
			session.removeAttribute("channelName");
			System.out.println(session.getAttribute("action"));
		}
	}


      out.write("\r\n");
      out.write("google.charts.setOnLoadCallback(drawChart);//도넛차트 \r\n");
      out.write("google.charts.setOnLoadCallback(drawSeriesChart);//버블차트\r\n");
      out.write("</script>\r\n");
      out.write("<!--geo chart-->\r\n");
      out.write("\r\n");
      out.write("<!--skycons-icons-->\r\n");
      out.write("<script src=\"js/skycons.js\"></script>\r\n");
      out.write("<!--//skycons-icons-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"page-container\">\r\n");
      out.write("\t\t<div class=\"left-content\">\r\n");
      out.write("\t\t\t<div class=\"mother-grid-inner\">\r\n");
      out.write("\t\t\t\t<div id=\"header-frame\"></div>\r\n");
      out.write("\t\t\t\t<!-- <div id=\"header-login-frame\"></div> -->\r\n");
      out.write("\t\t\t\t<!-- script-for sticky-nav -->\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t\tvar navoffeset = $(\".header-main\").offset().top;\r\n");
      out.write("\t\t\t\t\t\t$(window).scroll(function() {\r\n");
      out.write("\t\t\t\t\t\t\tvar scrollpos = $(window).scrollTop();\r\n");
      out.write("\t\t\t\t\t\t\tif (scrollpos >= navoffeset) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\".header-main\").addClass(\"fixed\");\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\".header-main\").removeClass(\"fixed\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<!-- /script-for sticky-nav -->\r\n");
      out.write("\t\t\t\t<!--inner block start here-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table style=\"background-color:white\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><div id=\"donutchart\" style=\"width: 750px; height: 380px; \"></div></td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div style=\"overflow-y:scroll; height:380px;\"> \r\n");
      out.write("\t\t\t\t<div  class=\"chat-message\" style=\"background-color:white; padding-top:20px;\">\r\n");
      out.write("\t\t\t\t\t<h3 style=\"align:center; \">가장 추천을 많이 받은 의견입니다</h3>\r\n");
      out.write("\t\t\t\t\t<ul class=\"chat\"  >\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"left clearfix\" >\r\n");
      out.write("                        <div class=\"chat-body clearfix\"  style=\"margin-left: 0px; \">\r\n");
      out.write("                    \t\t<div class=\"header\">\r\n");
      out.write("                    \t\t    <strong class=\"primary-font\" style=\"color:#990000; font-size:18px; padding-right:1em\">보쌈</strong>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px\">변다영</strong>\r\n");
      out.write("                    \t\t\t<a href=\"#\" class=\"hvr-icon-bounce\" style=\"background-color:white; padding:0px 0px 10px 0px; width:70px; height:20px;\">좋아요!</a>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px; color:#FFBA00\"><b>7</b></strong>\r\n");
      out.write("                    \t\t\t<small class=\"pull-right text-muted\">\r\n");
      out.write("                    \t\t\t<i class=\"fa fa-clock-o\"></i> 2017-07-18 AM 05:50</small>\r\n");
      out.write("                    \t\t</div>\r\n");
      out.write("                    \t\t<p style=\"font-size:15px\">\r\n");
      out.write("                    \t\t\t보쌈은 동맥경화증, 고혈압 등의 성인병을 막는 효능을 하기 때문에 저는 회식을 갈비로 하는 것에 반대합니다\r\n");
      out.write("                    \t\t</p>\r\n");
      out.write("                    \t</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"left clearfix\" >\r\n");
      out.write("                        <div class=\"chat-body clearfix\"  style=\"margin-left: 0px; \">\r\n");
      out.write("                    \t\t<div class=\"header\">\r\n");
      out.write("                    \t\t    <strong class=\"primary-font\" style=\"color:#990000; font-size:18px; padding-right:1em\">닭발</strong>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px\">이형건</strong>\r\n");
      out.write("                    \t\t\t<a href=\"#\" class=\"hvr-icon-bounce\" style=\"background-color:white; padding:0px 0px 10px 0px; width:70px; height:20px;\">좋아요!</a>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px; color:#FFBA00\"><b>6</b></strong>\r\n");
      out.write("                    \t\t\t<small class=\"pull-right text-muted\">\r\n");
      out.write("                    \t\t\t<i class=\"fa fa-clock-o\"></i> 2017-07-18 AM 05:50</small>\r\n");
      out.write("                    \t\t</div>\r\n");
      out.write("                    \t\t<p style=\"font-size:15px\">\r\n");
      out.write("                    \t\t\t수영에 개존맛 닭발이 있어요 \r\n");
      out.write("                    \t\t</p>\r\n");
      out.write("                    \t</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"left clearfix\" >\r\n");
      out.write("                        <div class=\"chat-body clearfix\"  style=\"margin-left: 0px; \">\r\n");
      out.write("                    \t\t<div class=\"header\">\r\n");
      out.write("                    \t\t    <strong class=\"primary-font\" style=\"color:#990000; font-size:18px; padding-right:1em\">닭발</strong>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px\">이성민</strong>\r\n");
      out.write("                    \t\t\t<a href=\"#\" class=\"hvr-icon-bounce\" style=\"background-color:white; padding:0px 0px 10px 0px; width:70px; height:20px;\">좋아요!</a>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px; color:#FFBA00\"><b>3</b></strong>\r\n");
      out.write("                    \t\t\t<small class=\"pull-right text-muted\">\r\n");
      out.write("                    \t\t\t<i class=\"fa fa-clock-o\"></i> 2017-07-18 AM 05:50</small>\r\n");
      out.write("                    \t\t</div>\r\n");
      out.write("                    \t\t<p style=\"font-size:15px\">\r\n");
      out.write("                    \t\t\t닭발이 다이어트에 도움이 됩니다.\r\n");
      out.write("                    \t\t</p>\r\n");
      out.write("                    \t</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"left clearfix\" >\r\n");
      out.write("                        <div class=\"chat-body clearfix\"  style=\"margin-left: 0px; \">\r\n");
      out.write("                    \t\t<div class=\"header\">\r\n");
      out.write("                    \t\t    <strong class=\"primary-font\" style=\"color:#990000; font-size:18px; padding-right:1em\">피자</strong>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px\">김태정</strong>\r\n");
      out.write("                    \t\t\t<a href=\"#\" class=\"hvr-icon-bounce\" style=\"background-color:white; padding:0px 0px 10px 0px; width:70px; height:20px;\">좋아요!</a>\r\n");
      out.write("                    \t\t\t<strong class=\"primary-font\" style=\"font-size:18px; color:#FFBA00\"><b>0</b></strong>\r\n");
      out.write("                    \t\t\t<small class=\"pull-right text-muted\">\r\n");
      out.write("                    \t\t\t<i class=\"fa fa-clock-o\"></i> 2017-07-18 AM 05:50</small>\r\n");
      out.write("                    \t\t</div>\r\n");
      out.write("                    \t\t<p style=\"font-size:15px\">\r\n");
      out.write("                    \t\t\t피자...피자가 좋아\r\n");
      out.write("                    \t\t</p>\r\n");
      out.write("                    \t</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>&nbsp;</tr>\r\n");
      out.write("\t \t<tr><td><div id=\"series_chart_div\" style=\"width: 800px; height: 420px; border: 1px solid #ccc;\"></div></td></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\t\t\t\t<!--main-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--inner block end here-->\r\n");
      out.write("\t\t\t\t<!--copy rights start here-->\r\n");
      out.write("\t\t\t\t<div class=\"copyrights\">\r\n");
      out.write("\t\t\t\t\t<p>© 2017 Tiramisu. | 부산대학교 자연대연구실험동 301호</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<b>김태정 변다영 이성민 이형건 </b>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--COPY rights end here-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"left-frame\"></div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--scrolling js-->\r\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\t<!--//scrolling js-->\r\n");
      out.write("\t<script src=\"js/bootstrap.js\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- mother grid end here-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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