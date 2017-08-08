package br.com.fiap.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class UsuarioFilter
 */
@WebFilter("/*")
public class UsuarioFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		long tempoInicial = System.currentTimeMillis();

		chain.doFilter(request, response);

		long tempoFinal = System.currentTimeMillis();
		HttpSession session;
		session.setAttribute("ultimoAcesso", System.currentTimeMillis());
		String uri = ((HttpServletRequest) request).getRequestURI();
		String parametros = ((HttpServletRequest) request).getParameter("ultimoAcesso");
		System.out.println("Tempo da requisicao de " + uri + "?ultimoAcesso=" + parametros + " demorou (ms): "
				+ (tempoFinal - tempoInicial));

	}

	// métodos init e destroy omitidos
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
