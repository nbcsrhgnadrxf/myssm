package ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import ssm.model.Gcuser;

public interface GcuserService {

	public  List<Gcuser> findGcuser();
	
	public  boolean LoginGcuser(String uTel, String uPwd,HttpServletRequest request);
	
}
