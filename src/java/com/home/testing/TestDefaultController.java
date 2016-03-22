package com.home.testing;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDefaultController {
	
	Controller controller;
	Request request;
	RequestHandler handler;
	
	@Before
	public void instantiate()
	{
		request = new SimpleRequest();
		handler = new SimpleHandler();
		controller = new DefaultController();
		controller.addHandler(request, handler);
	}
	
	@Test
	public void testProcess()
	{
		Response response = controller.processRequest(request);
		org.junit.Assert.assertEquals("Equal Response", SimpleResponse.class, response.getClass());
	}
	
	@Test
	public void testAddHandler()
	{
		RequestHandler h = controller.getHandler(request);
		org.junit.Assert.assertSame("Handlers are Same", handler, h);
	}
	
	@Test(expected=RuntimeException.class)
	public void testExceptionRaised()
	{
		throw new RuntimeException();
	}
	
	class SimpleRequest implements Request
	{

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "getEmployee";
		}
		
	}
	
	class SimpleHandler implements RequestHandler
	{

		@Override
		public Response process(Request request) throws Exception {
			// TODO Auto-generated method stub
			return new SimpleResponse();
		}
		
	}
	
	class SimpleResponse implements Response
	{
		
	}

}
