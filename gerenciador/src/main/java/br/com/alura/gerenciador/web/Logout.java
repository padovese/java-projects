package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().removeAttribute("usuario.logado");
		PrintWriter writer = resp.getWriter();
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/paginas/logout.html");
		dispatcher.forward(req, resp);

		// resp.sendRedirect("WEB-INF/paginas/logout.html");
		// writer.println("<html><body>Deslogado com sucesso.</body></html>");
	}
	// @Override
	// protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	// throws ServletException, IOException {
	// Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();
	//
	// Usuario usuario = Login.USUARIOS_LOGADOS.get(cookie.getValue());
	//
	// PrintWriter writer = resp.getWriter();
	// if (cookie == null) {
	// writer.println("<html><body>Usuario nao estava logado.</body></html>");
	// return;
	// }
	// cookie.setMaxAge(0);
	// resp.addCookie(cookie);
	// writer.println("<html><body>Deslogado com sucesso</body></html>");
	// }
}
