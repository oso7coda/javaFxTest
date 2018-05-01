package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.ProdVo;

public class ProdDao implements ProdDaoInf {

	SqlMapClient smc;

	private static ProdDaoInf dao = new ProdDao();

	// 싱글턴 적용
	public static ProdDaoInf getInstance() {
		if (dao == null)
			dao = new ProdDao();
		return dao;
	}

	{
		smc = SqlMapClientFactory.getSqlMapClient();
	}

	@Override
	public List<ProdVo> listProdNames(String lprod_gu) throws SQLException {
		List<ProdVo> list = null;
		list=smc.queryForList("prod.listProdNames",lprod_gu);
		return list;
	}

	@Override
	public ProdVo detailProd(String prod_id) throws SQLException {
		ProdVo vo = null;
		vo =(ProdVo) smc.queryForObject("prod.detailProd",prod_id);
		return vo;
	}

}
