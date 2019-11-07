<%@  page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>HTML5极简线条404自适应模板</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/pages/404/assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="${pageContext.request.contextPath}/pages/404/assets/css/ie9.css" /><![endif]-->
		<noscript><link rel="stylesheet" href="${pageContext.request.contextPath}/pages/404/assets/css/noscript.css" /></noscript>
	<script type="text/javascript">
	var num=4;
	function redirect(){
		num--;
		document.getElementById("num").innerHTML=num;
		if(num<0){
			document.getElementById("num").innerHTML=0;
				//location.href="javascript:history.back(-1)";
			}
		}
	setInterval("redirect()", 1000);
</script>
	</head>
	
<body onLoad="redirect();">

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<div class="logo">
							<span class="icon fa-diamond"></span>
						</div>
						<div class="content">
							<div class="inner">
								<h1>404</h1>
								<p><!--[-->您访问的的页面不知道怎么了，就找不到了，不过放心，尽在我掌握之中！！！<!--]--></p>
							
							<!-- 定时自动跳转 -->
							  <div class="b">
									<p>
							            <span ><strong id="num" style="font-size: 45px;color:#F00;"></strong></span>秒后自动返回
									</p>
								</div>
							
							</div>
						</div>
						<nav>
							<ul>
								<li><a href="#">首页</a></li>
								<li><a href="#">博客</a></li>
								<li><a href="#">联系</a></li>
								<li><a href="#">关于</a></li>
								<!--<li><a href="#elements">Elements</a></li>-->
							</ul>
						</nav>
					</header>

				<!-- Main -->
				
				<!-- Footer -->
					<footer id="footer">
						<p class="copyright">&copy; Untitled. Design: <a href="https://404.life">404.LIFE</a>.</p>
					</footer>

			</div>

		<!-- BG -->
			<div id="bg"></div>

		<!-- Scripts -->
			<script src="${pageContext.request.contextPath}/pages/404/assets/js/jquery.min.js"></script>
			<script src="${pageContext.request.contextPath}/pages/404/assets/js/skel.min.js"></script>
			<script src="${pageContext.request.contextPath}/pages/404/assets/js/util.js"></script>
			<!-- 画面动态 -->
			<%-- <script src="${pageContext.request.contextPath}/pages/404/assets/js/main.js"></script> --%>

	</body>
</html>
