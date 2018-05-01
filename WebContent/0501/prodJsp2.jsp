<%@page import="kr.or.ddit.prod.vo.ProdVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
{
<%
	ProdVo vo = (ProdVo)request.getAttribute("prodVo");
%>
		<%-- "id" : "<%=vo.getProd_id()%>", --%>
		"id" : "전병현",
		"name" : "<%=vo.getProd_name() %>" ,
		"lgu" : "<%=vo.getProd_lgu() %>" ,
		"prod_buyer" : "<%=vo.getProd_buyer() %>" ,
		"prod_cost" : "<%=vo.getProd_cost() %>" ,
		"prod_price" : "<%=vo.getProd_price() %>" ,
		"prod_sale" : "<%=vo.getProd_sale() %>" ,
		"prod_outline" : "<%=vo.getProd_outline() %>" ,
		"prod_detail" : "<%=vo.getProd_detail() %>" ,
		"prod_img" : "<%=vo.getProd_img() %>" ,
		"prod_totalstock" : "<%=vo.getProd_totalstock() %>" ,
		"prod_insdate" : "<%=vo.getProd_insdate() %>" ,
		"prod_properstock" : "<%=vo.getProd_properstock() %>" ,
		"prod_size" : "<%=vo.getProd_size() %>" ,
		"prod_color" : "<%=vo.getProd_color() %>" ,
		"prod_delivery" : "<%=vo.getProd_delivery() %>" ,
		"prod_unit" : "<%=vo.getProd_unit() %>" ,
		"prod_qtyin" : "<%=vo.getProd_qtyin() %>" ,
		"prod_qtysale" : "<%=vo.getProd_qtysale() %>" ,
		"prod_mileage" : "<%=vo.getProd_mileage() %>" 
}