package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();



		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Formulario en Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Formulario de Ejemplo</h1>");
		out.println("<hr/>");
		out.println("<form action='/myServlet2' method='GET'>");
		out.println("<label for='name'>Introduce tu nombre:</label>");
		out.println("<br/>");
		out.println("<input type='text' id='name' name='name' placeholder='Nombre'>");
		out.println("<br/>");
		out.println("<input type='text' id='lastName' name='lastName' placeholder='Apellido'>");
		out.println("<br/>");
		out.println("<input type='submit' value='Enviar'>");
		out.println("</form>");
		out.println("</body></html>");
	}

}