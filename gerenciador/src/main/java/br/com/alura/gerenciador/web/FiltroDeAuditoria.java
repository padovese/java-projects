package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns = "/*")
public class FiltroDeAuditoria implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		String requestURI = req.getRequestURI();

		String usuario = getUsuario(req);

		System.out.println(usuario + " acessando: " + requestURI);
		arg2.doFilter(arg0, arg1);
	}

	private String getUsuario(HttpServletRequest req) {
		Usuario usuario = (Usuario) req.getSession().getAttribute("usuario.logado");
		if (usuario == null)
			return "<deslogado>";
		return usuario.getEmail();
		// String usuario = "<deslogado>";
		// if(req.getCookies() == null) return usuario;
		// Cookie[] cookies = req.getCookies();
		// for(Cookie cookie : cookies) {
		// if(cookie.getName().equals("usuario.logado")) {
		// usuario = cookie.getValue();
		// }
		// }
		// return usuario;
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
