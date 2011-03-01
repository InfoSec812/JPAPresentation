package com.dns.jpa.example.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class Init
 */
public class Init extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger log = null ;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Init() {
		super();
		log = Logger.getLogger(Init.class) ;
		log.info("Creating EJB3 Configuration");
		log.info("Class Path: "+System.getProperty("java.class.path")) ;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager mgr = emf.createEntityManager();
		mgr.createNativeQuery("SELECT 1").getFirstResult();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
