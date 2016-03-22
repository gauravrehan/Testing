package com.home.testing;

public interface Controller {
	void addHandler(Request request, RequestHandler handler);
	Response processRequest(Request request);
	RequestHandler getHandler(Request request);

}
