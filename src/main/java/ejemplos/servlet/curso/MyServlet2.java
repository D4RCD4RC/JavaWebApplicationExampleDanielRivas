package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Obtener los campos enviado desde el formulario
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Bienvenid@</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenid@ " + name + ' ' + lastName + "</h1>");
		out.println("</body></html>");
	}

}