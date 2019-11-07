package gc.com.exception;

import gc.com.util.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CloudException {

	@Autowired
	protected HttpServletRequest request;
	
	@ExceptionHandler(value=Exception.class)
	//@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView toExceptionView(Exception e ) {
		e.printStackTrace();
		//获取异常信息 
		//String message = e.getMessage() ;
		String message = MessageSource.getText(request, "LVB-009001");
		ModelAndView mav = new ModelAndView("404/error");
		mav.addObject("message", message) ;
		return mav ;
	}
	
	@ExceptionHandler(value=Throwable.class)
	public ModelAndView toExceptionView2(Exception e ) {
		e.printStackTrace();
		//获取异常信息 
		//String message = e.getMessage() ;
		String message = MessageSource.getText(request, "LVB-009001");
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("message", message) ;
		return mav ;
	}
	
	
	/*@ControllerAdvice注解下的类，里面的方法用@ExceptionHandler注解修饰的方法，会将对应的异常交给对应的方法处理。
	@ExceptionHandler({IOException.class})
	public Result handleException(IOExceptione) {
	    log.error("[handleException] ", e);
	    return ResultUtil.failureDefaultError();
	  }*/

}
