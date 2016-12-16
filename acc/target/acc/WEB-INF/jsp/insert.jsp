<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		
	});
</script>
</head>

<body>    
	
	<form action="new" method="post" >
		名：<input name="name" id="name"/><br/>
		备注：<input name="remark" id="remark"/><br/>
		账号类型：<select name="acctype.acctype_id">
								<option  value="1">企业</option>
								<option value="2">个人</option>
		</select><br/>
		<input type="submit"  id="bn" value="确认">
	</form>
</body>
</html>