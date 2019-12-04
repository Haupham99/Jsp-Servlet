package com.hau.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hau.model.UserModel;
import com.hau.service.ICategoryService;
import com.hau.service.INewService;

@WebServlet("/trang-chu")

public class HomeController extends HttpServlet {
	
	@Inject 
	private ICategoryService categoryService;
	
	@Inject
	private INewService newService; 
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long categoryId = 1L;
		
		UserModel userModel = new UserModel();
		userModel.setUserName("Hậu Phạm");
		userModel.setFullName("Phạm Văn Hậu");
		request.setAttribute("model", userModel);
		request.setAttribute("news", newService.findByCategoryId(categoryId));
		request.setAttribute("categories", categoryService.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
