package gc.com.util;


import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * messages_ja_JP.properties により�?�メッセージを取得する�??
 * 
 * @author admin
 *
 */
public class MessageSource {

	/**
	 * 文字置換があ�?
	 * @param request
	 * @param key キー
	 * @param args 引数
	 * @return
	 */
	
	
	public static String getText(HttpServletRequest request, String key, Object[] args){
		RequestContext requestContext = new RequestContext(request);
		String value = requestContext.getMessage(key, args);
		return value;
	}
	
	/**
	 * 文字置換があるな�?
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getText(HttpServletRequest request, String key){
		
		RequestContext requestContext = new RequestContext(request);
		String value = requestContext.getMessage(key);
		return value;
	}
	
}
