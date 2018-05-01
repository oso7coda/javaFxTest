package kr.or.ddit.prod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.dao.ProdDao;
import kr.or.ddit.prod.dao.ProdDaoInf;
import kr.or.ddit.prod.vo.ProdVo;

public class ProdService implements ProdServiceInf{
	ProdDaoInf dao = ProdDao.getInstance();
	
	private static ProdServiceInf service = new ProdService();

	// 싱글턴 적용
	public static ProdServiceInf getInstance() {
		if (service == null)
			service = new ProdService();
		return service;
	}
	
	@Override
	public List<ProdVo> listProdNames(String lprod_gu) {
		List<ProdVo> list = null;
		try {
			list = dao.listProdNames(lprod_gu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ProdVo detailProd(String prod_id) {
		ProdVo vo = null;
		try {
			vo =  dao.detailProd(prod_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

}
