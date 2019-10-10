package ssm.mapper;

import java.util.List;
import ssm.model.Gcuser;




public interface GcuserMapper {

	public  List<Gcuser> findGcuser();
	
	public  Gcuser LoginGcuser(String uTel);
	
}
