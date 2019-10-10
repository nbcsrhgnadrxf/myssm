	
    $(function(){ 
    	
    	var pageContext=$('#pageContext').val();
    	
    	//支持Enter键登录
    	document.onkeydown = function(e){
    				if($(".bac").length==0)
    				{
    					if(!e) e = window.event;
    					if((e.keyCode || e.which) == 13){
    						var obtnLogin=document.getElementById("submit_btn")
    						obtnLogin.focus();
    					}
    				}
    			}

  
    $("#submit_btn").click(function(){
    		
    	    var loginflag = false;
    	    
    		var aurl = pageContext+"/gcuserController/loginGcuser";
    		
    		var burl = pageContext+"/gcuserController/checkCode";
    		
    		var curl = pageContext+"/pages/bk_zy/mini/index.jsp";
    		
    		//var myReg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/; //邮件正则
    		
    		var myReg = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/ //手机号正则
    			
    		if($('#uTel').val() == ''){
    			alert("手机号还没填呢！");	
    			$('#uTel').focus();
    		}else if(!myReg.test($('#uTel').val())){
    			alert("您的手机号格式错咯！");
    			$('#uTel').focus();
    		}else if($('#uPwd').val() == ''){
    			alert("密码还没填呢！");
    			$('#uPwd').focus();
    		}else{
    			
    			//账号密码验证
				 $.ajax({
					    url:aurl,
					    data:{
		    			'uTel':$('#uTel').val(),
		    			'uPwd':$('#uPwd').val()
		                      },     
	 	    	    type:"POST",
	 	    	    dataType:"json",
	 	    	    async: false,
	 	    	    success:function(backData)
	 	    	    {	 	    	    	
	 	    	    	 if(backData){
	 	    	    		 
	 	    	    		loginflag = true;
	 	    	    		
	 	    	    		return loginflag;
	 	    	    		
	 	    	    	 }else{
	 	    	    		 
	 	    	    		alert("账号或密码错误!");
	 	    	    		
	 	    	    		return loginflag
	 	    	    		
	 	    	    	 }
    	    	 
	 	    	   
	 	    	   },
				      error: function(obj){
				    	  
				    	  alert("uTel ajax请求失败");   
				      } 
	 	    	   		
					});	
				 
		 //验证码验证
				 
				 $.ajax({
	 	   			    url:burl,
	 	   			    data:{
	 	       			'code':$('#code').val()
	 	                         },     
	 	   	    	    type:"POST",
	 	   	    	    dataType:"json",
	 	   	    	    async: false,
	 	   	    	    success:function(backData)
	 	   	    	    {
	 	   	    	    	
		 	   	    	    if(backData&&loginflag){
		 	   	    	    
		 	   	    	     ShowSuccessMessage("登陆成功!", 1000);	
		 	   	    	      window.location=curl;
		 	   	    	      window.event.returnValue=false; 
		 	   	    	    	
		 	    	    	 }else{
		 	    	    		 
		 	    	    		alert("验证码错误!");
		 	    	    		return loginflag
		 	    	    	 }
	 	                   
	 	   	    	   },
	 	   		      error: function(obj){
	 	   		    	  
	 	   		    	 alert("code ajax请求失败");
	 	   		      } 
	 	   	    	   		
	 	   	    	   
	 	   			});	
  
    		   }
    		 
				 
    			});
    
    $(document).ready(function(){
    	  
    	//提示成功信息    
          ShowSuccessMessage = function(message, life) {
              var time = 3000;
              if (!life) {
                  time = life;
              }
               
              if ($("#tip_message").text().length > 0) {
                  var msg = "<span>" + message + "</span>";
                  $("#tip_message").empty().append(msg);
              } else {
                  var msg = '<div id="tip_message"><span>' + message + "</span></div>";
                  $("body").append(msg);
              }
               
              $("#tip_message").fadeIn(time);
              $("#tip_message").fadeOut(time);
       
          };

      });
          

 
    }); 
    

    
   