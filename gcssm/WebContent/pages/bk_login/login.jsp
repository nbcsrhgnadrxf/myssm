<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
<title>html5响应式后台登录界面模板</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- CSS -->

<link rel="stylesheet" href="${pageContext.request.contextPath}/pages/bk_login/css/supersized.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/pages/bk_login/css/login.css">
<link href="${pageContext.request.contextPath}/pages/bk_login/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/pages/bk_login/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/bk_login/js/jquery.form.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/bk_login/js/tooltips.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/bk_login/js/login.js?v=1.0"></script>
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
	<script src="js/html5.js"></script>
<![endif]-->

   <style>
    #tip_message {
        z-index: 9999;
        position: fixed;
        left: 0;
        top: 40%;
        text-align: center;
        width: 100%;
    }
     
    #tip_message span {
        background-color: #03C440;
        opacity: .8;
        padding: 20px 50px;
        border-radius: 5px;
        text-align: center;
        color: #fff;
        font-size: 20px;
    }
     
    #tip_message span.error {
        background-color: #EAA000;
    }
</style>

<script type="text/javascript">

function changeImg() { 
	 
    var imgSrc = $("#imgObj");    
    var src = imgSrc.attr("src");     
    imgSrc.attr("src", chgUrl(src));

 }

  // 时间戳
 // 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
 function chgUrl(url) {
     var timestamp = (new Date()).valueOf();
     url = url.substring(0, 20);
    if ((url.indexOf("&") >= 0)) {
         url = url + "×tamp=" + timestamp;
    } else {
         url = url + "?timestamp=" + timestamp;
     }
     return url;
   }  
 
</script>	
</head>

<body >
	
			
<div class="page-container">
	<div class="main_box">
		<div class="login_box">
			<div class="login_logo">
				<img src="${pageContext.request.contextPath}/pages/bk_login/images/bk_03.jpg" >
			</div>
		
			<div class="login_form">
			
				<form action="" id="login_form" method="post">
				 <input id="pageContext" value="${pageContext.request.contextPath}" type="hidden">
					<div class="form-group">
						<label for="j_username" class="t">用户名：</label> 
						<input id="uTel" value="" name="uTel" type="text" class="form-control x319 in" 
						autocomplete="off" placeholder="手机号">
					</div>
					
					
					<div class="form-group">
						<label for="j_password" class="t">密　码：</label> 
						<input id="uPwd" value="" name="uPwd" type="password" 
						class="password form-control x319 in" placeholder="密码">
					</div>
					
					
					<div class="form-group">
						<label for="j_captcha" class="t">验证码：</label>
						 <input id="code" name="code" type="text" class="form-control x164 in" placeholder="请输入验证码" value="">
						<img id="imgObj" alt="验证码" src="${pageContext.request.contextPath}/getCode">
						<input  type="button" onclick="changeImg()" value="换一张">  
						
					</div>
				
					<div class="form-group">
						<label class="t"></label>
						<label for="j_remember" class="m">
						<input id="j_remember" type="checkbox" value="true">&nbsp;记住密码!</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<label><input id="j_remember" type="checkbox" value="true">&nbsp;自动登陆!</label>
					</div>
					<div class="form-group space">
						<label class="t"></label>　　　
						<button type="submit"  id="submit_btn" 
						class="btn btn-primary btn-lg" >&nbsp;登&nbsp;录&nbsp; </button>
						<input type="reset" value="&nbsp;重&nbsp;置&nbsp;" class="btn btn-default btn-lg">
					</div>
				</form>
			</div>
		</div>
		<div class="bottom">还没有账号？&copy;<a href="register.jsp" style="font-size: 20px;">点击注册</a></div>
	</div>
	
	<!-- Javascript -->
	
 <script src="${pageContext.request.contextPath}/pages/bk_login/js/supersized.3.2.7.min.js"></script> 
 <script src="${pageContext.request.contextPath}/pages/bk_login/js/supersized-init.js"></script>  

<div style="text-align:center;">
<p>来源:<a href="http://www.mycodes.net/" target="_blank">www.gc.com</a></p>
</div>
</div>
</body>
</html>