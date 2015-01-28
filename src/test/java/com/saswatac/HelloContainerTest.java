package com.saswatac;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

public class HelloContainerTest extends TestCase {
	
	 public void testHandleRequestView() throws Exception{
	        HelloWorldController controller = new HelloWorldController();
	        ModelAndView modelAndView = controller.handleRequest(null, null);
	        assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
	        String nowValue = (String) modelAndView.getModel().get("now");
	        assertNotNull(nowValue);
	    }

}
