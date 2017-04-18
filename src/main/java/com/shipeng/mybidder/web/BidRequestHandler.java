package com.shipeng.mybidder.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class BidRequestHandler implements HttpRequestHandler {

	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

		// writing html in the stream
		pw.println("<html><body>");
		pw.println("Welcome to my bidder");
		pw.println("</body></html>");

		pw.close();// closing the stream

	}

}