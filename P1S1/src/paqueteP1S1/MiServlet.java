package paqueteP1S1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/MiServlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Especificamos formato de respuesta
		PrintWriter salida= response.getWriter();
		
		//Generamos la respuesta de la petición
		
		// Mostramos las cabeceras enviadas 
		// en la peticion

		salida.println ("<html>");
		salida.println ("<body>");	
		salida.println ("<h1>Cabeceras</h1>");
		salida.println ("<br>");

		Enumeration cabeceras = request.getHeaderNames();

		while (cabeceras.hasMoreElements())
		{		
			String nombre = (String)(cabeceras.nextElement());
			salida.println ("Nombre: " + nombre + 
			   ", Valor: " + request.getHeader(nombre));
			salida.println ("<br><br>");
		}

		salida.println ("</body>");			
		salida.println ("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
