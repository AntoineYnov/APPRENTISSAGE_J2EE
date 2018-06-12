package fr.editions_eni.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InscriptionServlet
 */
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("Appel de la méthode init de la servlet");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Appel de la méthode destroy de la servlet");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		System.out.println("Appel de la méthode service de la servlet");
		super.service(httpServletRequest, httpServletResponse);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
	 */
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		System.out.println("Appel de la méthode get de la servlet");
//		httpServletResponse.getWriter().append("Served at: ").append(httpServletRequest.getContextPath());
		this.getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(httpServletRequest,httpServletResponse);
//		getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(httpServletRequest, httpServletResponse);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Appel de la méthode post de la servlet");
		System.out.println(response.getStatus());
		doGet(request, response);
	}

}
