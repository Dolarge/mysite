package com.bit2020.mysite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2020.mvc.util.MVCUtil;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("a");

		if("joinform".equals(action)) {
			MVCUtil.forward("user/joinform", request, response);
		} else if("join".equals(action)) {
			// ..
			// ..
			MVCUtil.redirect("/mysite02/user?a=joinsuccess", request, response);
		} else if("joinsuccess".equals(action)) {
			MVCUtil.forward("user/joinsuccess", request, response);
		} else {
			MVCUtil.redirect(request.getContextPath(), request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
