package fr.editions_eni.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaPremiereServlet
 */
//@WebServlet(value="/MaPremiereServlet",
//			initParams= {@WebInitParam(description="un auteur",name="auteur",value="Shenshenko")})
public class MaPremiereServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String auteur;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaPremiereServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
    public void init() throws ServletException{
    	System.out.println("Appel de la méthode init de la servlet");
    	setAuteur(this.getInitParameter("auteur"));
    	
    }
	

	@Override
	protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Appel de la méthode service de la servlet");
		super.service(httpServletRequest, httpServletResponse);
	}
	@Override
	public void destroy() {
		System.out.println("Appel de la méthode destroy de la servlet");
		super.destroy();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Appel de la méthode doGet de la servlet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Page crée par: ").append(getAuteur());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
