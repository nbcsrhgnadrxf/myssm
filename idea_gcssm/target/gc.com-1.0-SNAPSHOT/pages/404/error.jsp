<%@  page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>ロジスティックスcloud系統</title>
	<meta http-equiv="pragma" content="no-cache">  
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style>html, body {height:95%;}body{background: #0f3854;background: -webkit-radial-gradient(center ellipse, #0a2e38 0%, #000000 70%);background: radial-gradient(ellipse at center, #0a2e38 0%, #000000 70%);background-size: 100%;}p{margin:0;padding:0;}#clock{font-family: 'Share Tech Mono', monospace;color: #ffffff;text-align: center;position: absolute;left: 50%;top: 50%;-webkit-transform: translate(-50%, -50%);transform: translate(-50%, -50%);color: #daf6ff;text-shadow: 0 0 20px #0aafe6, 0 0 20px rgba(10, 175, 230, 0);}#clock .time{letter-spacing: 0.05em;font-size: 60px;padding: 5px 0;}#clock .date{letter-spacing:0.1em;font-size:15px;}#clock .text{letter-spacing: 0.1em;font-size:12px;padding:20px 0 0;}</style>
    <script type="text/javascript" src="${pageContext.request.contextPath}/pages/404/js/time.js"></script>
  </head>
  <body>
   <div id="clock">
    <p class="date">程序发生异常，请联系系统管理员......</p></br>
       <p class="time">${message }</p>
    <p class="time"><h3>当前时间： {{ time }}</h3></p>
    <p class="text"><h3>当前日期： {{ date }}</h3></p>
</div>
<script>
var clock = new Vue({
    el: '#clock',
    data: {
        time: '',
        date: ''
    }
});
var week = ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'];
var timerID = setInterval(updateTime, 1000);
updateTime();
function updateTime() {
    var cd = new Date();
    clock.time = zeroPadding(cd.getHours(), 2) + ':' + zeroPadding(cd.getMinutes(), 2) + ':' + zeroPadding(cd.getSeconds(), 2);
    clock.date = zeroPadding(cd.getFullYear(), 4) + '-' + zeroPadding(cd.getMonth()+1, 2) + '-' + zeroPadding(cd.getDate(), 2) + ' ' + week[cd.getDay()];
};
function zeroPadding(num, digit) {
    var zero = '';
    for(var i = 0; i < digit; i++) {
        zero += '0';
    }
    return (zero + num).slice(-digit);
}</script>
   
  </body>
</html>
