package ssm.webapp.controller.Gcuser;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.model.Gcuser;
import ssm.service.GcuserService;



@Controller
@RequestMapping("/gcuserController")
public class GcuserController {
	
	
	@Autowired
	GcuserService gcuserService;
	
	@RequestMapping(value = "/findGcuser")
	@ResponseBody
	public  List<Gcuser> findGcuser(){
		
		List<Gcuser> findGcuser = gcuserService.findGcuser();
		return findGcuser;
	}
	
	@RequestMapping(value = "/loginGcuser")
	@ResponseBody
	public  boolean LoginGcuser(String uTel,String uPwd,HttpServletRequest request){
		
		System.out.println("=========="+uTel+"   "+uPwd);
	    boolean loginGcuser = gcuserService.LoginGcuser(uTel,uPwd, request);
		
		return loginGcuser;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request){
		
		HttpSession session = request.getSession();//获取当前session
		if(session!=null){
			Gcuser gcuser = (Gcuser)session.getAttribute("loginGcuser");//从当前session中获取用户信息
			session.invalidate();//关闭session
				
			return "bk_zy/mini/index";
			
		}else
			return null;
		
	}

	@RequestMapping(value="/checkCode")
	@ResponseBody
	public boolean CheckCode(String code,HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		System.err.println(code +" 33333333333333 "+code);
		
		
		 // 验证验证码
        String sessionCode = request.getSession().getAttribute("code").toString();
        
        response.setContentType("text/html;charset=utf-8");
        
        if (code != null && !"".equals(code) && sessionCode != null && !"".equals(sessionCode)) {
        	
        	/*1、使用equals( )方法比较两个字符串是否相等（区分大小写）
        	2、使用equalsIgnoreCase( )方法比较两个字符串是否相等（不区分大小写）*/
        	
            if (code.equalsIgnoreCase(sessionCode)) {
            	
            	return true;
            	
            } else {
            	
            	return false;
            }
        } else {
        	return false;
        }
		
	}
}
