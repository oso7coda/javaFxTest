package kr.or.ddit.prod.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.ProdService;
import kr.or.ddit.prod.service.ProdServiceInf;
import kr.or.ddit.prod.vo.ProdVo;

/**
 * Servlet implementation class prodServlet
 */
@WebServlet("/prodServlet")
public class prodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prodServlet() {
        super();
    }
    ProdServiceInf service = ProdService.getInstance();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String lprod_gu = request.getParameter("prod_gu");
		List<ProdVo> list = service.listProdNames(lprod_gu);
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("0501/prodJsp.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prod_id = request.getParameter("prod_id");
		ProdVo prodVo = service.detailProd(prod_id);
		request.setAttribute("prodVo", prodVo);
		
		RequestDispatcher rd = request.getRequestDispatcher("0501/prodJsp2.jsp");
		rd.forward(request, response);
		
	}

}
