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
<title>Insert title here</title>
<base href="<%=basePath%>">

<script type="text/javascript" src="scripts/jquery-3.0.0.js"></script>
<script type="text/javascript" >

	$(function(){
		//alert(123);
		$("#bn").click(function(){
			//var name = $('#name').val();
			//alert(name);
			//var remark = $('#remark').val();
			window.location="listAll";
		});
	});
</script>
</head>

<body>    
		Welcome !!
		<input type="button"  id="bn" value="点击查看所有账户">

</body>
</html>