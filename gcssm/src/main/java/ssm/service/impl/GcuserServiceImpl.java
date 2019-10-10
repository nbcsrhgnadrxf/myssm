package ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.mapper.GcuserMapper;
import ssm.model.Gcuser;
import ssm.service.GcuserService;

@Service
public class GcuserServiceImpl implements GcuserService{
	

	
    @Autowired 
    GcuserMapper gcuserMapper;
	
	@Override
	public List<Gcuser> findGcuser() {
		
		return gcuserMapper.findGcuser();
	}

	@Override
	public boolean LoginGcuser(String uTel,String uPwd,HttpServletRequest request) {
		
	   Gcuser loginGcuser = gcuserMapper.LoginGcuser(uTel);
	   
	  if(uTel.equals(loginGcuser.getuTel())&&uPwd.equals(loginGcuser.getuPwd())&&!("0".equals(loginGcuser.getuFb()))) {
		   
			//使用request对象的getSession()获取session，如果session不存在则创建一个
			HttpSession session = request.getSession();
			 //将数据存储到session中
			session.setAttribute("loginGcuser", loginGcuser);
			
			session.setMaxInactiveInterval(60*60); //单位秒
			
		    return true;
		    
	  }
	  else
	      return false;
 
	}
	

}
