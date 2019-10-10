package ssm.webapp;

import java.util.ArrayList;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * message 処理
 * @author admin
 *
 */
public class BaseController{
	
	//log
    protected transient final Log log = LogFactory.getLog(getClass());
    
    @Autowired
    protected static HttpServletRequest request;

    /**
     * Save the message in the session, appending if messages already exist
     * @param msg the message to put in the session
     */
    @SuppressWarnings("unchecked")
    protected  void saveMessage(String msg) {
        List<String> messages = (List) request.getSession().getAttribute("messages");
        if (messages == null) {
            messages = new ArrayList<String>();
        }
        messages.add(msg);
      
        request.getSession().setAttribute("messages", messages);
    }

   
}
