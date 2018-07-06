<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="com.njbdqn.myfirst.entity.*" %>

<%@ page import="com.njbdqn.myfirst.dao.*" %>
<!DOCTYPE html>
<html>
	<head>
	</head>
	<body>
		<%
			UserinfosDAO udao = new UserinfosDAO();
			List<Userinfos> uss = udao.findAll();
			for(int i=0;i<uss.size();i++){
				out.println(uss.get(i).getUsername());
			}
		%>
	</body>
</html>