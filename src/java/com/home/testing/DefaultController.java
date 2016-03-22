package com.home.testing;

import java.util.HashMap;
import java.util.Map;


public class DefaultController implements Controller {

	Map<String, RequestHandler> handlers;
	
	public DefaultController()
	{
		handlers = new HashMap<String, RequestHandler>();
	}
	
	@Override
	public void addHandler(Request request, RequestHandler handler) {
		if(!handlers.containsKey(request.getName()))
		{
			handlers.put(request.getName(), handler);
		}
	}
	
	@Override
	public RequestHandler getHandler(Request request)
	{
		if(handlers.containsKey(request.getName()))
		{
			return (RequestHandler)handlers.get(request.getName());
		}
		else
			
		{
			throw new RuntimeException("RequestHanlder for " + request.getName() + " Not Found.");
		}
	}

	@Override
	public Response processRequest(Request request) {
		Response response = null;
		try
		{
			response = this.getHandler(request).process(request);
		}catch(Exception ex)
		{
			System.out.println("Exception occurred");
		}
		return response;
	}
	

}
