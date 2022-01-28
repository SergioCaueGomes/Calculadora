package br.com.rd.calculadoraCompleta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculadora
 */
@WebServlet("/calculadora")
public class calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		process3 (request, response);
		
		
	}
	private void process3 (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if((request.getParameter("val1") != null) && (request.getParameter("val2") != null)) {
			//leitura de parametros
			int valor1 = Integer.parseInt(request.getParameter("val1"));
			int valor2 = Integer.parseInt(request.getParameter("val2"));
			
			//chamada da regra de negocio
			Calcular calc = new Calcular(valor1,valor2); 
			int total;
			
			
			if(request.getParameter("somar") != null) {
				 total = calc.somar();
			} else if (request.getParameter("subtrair") != null) {
				 total = calc.subtrair();
			}else if (request.getParameter("Multi") != null) {
				 total = calc.multiplicar();
			}else {
				total = calc.dividir();
			}
			
			//resultado da regra de negocio
			request.setAttribute("resultado", total); //requestScope - forward
	
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response); // rediciona para ele mesmo 
	} 
	

}

}
