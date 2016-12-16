<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>gggg</title>
<base href="<%=basePath%>">
<script type="text/javascript" src="scripts/jquery-3.0.0.js"></script>
<script type="text/javascript" >


</script>
</head>
<body>
	添加成功Account： ${account.name }
		<a href="listAll">确定</a>
</body>
</html>