package com.xworkz.sports_managament_system.runner;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class RegisterServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Register Servlet constructor");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Get Servlet COnfigu");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("Get Servlet information");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("For init servlet ");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("username= " + req.getParameter("username"));
		System.out.println("email= " + req.getParameter("email"));
		System.out.println("password= " + req.getParameter("password"));
		System.out.println("confirm password= " + req.getParameter("confirm password"));

	}

}
