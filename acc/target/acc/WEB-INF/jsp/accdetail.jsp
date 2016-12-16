<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery-3.0.0.js"></script>
<script type="text/javascript">
	$(function(){
		
	});
	function change(){
		var k = $('#s1').val();
		if(k==0){
			alert('不能为0');
			return false;
		}
		$('#hid').val(k);
	}
</script>
</head>
<body>
	<form action="update" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input name="id" value="${account.id }"  readonly/></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input name="name" value="${account.name }"/></td>
			</tr>
			<tr>
				<td>remark</td>
				<td><input name="remark" value="${account.remark }"/></td>
			</tr>
			<tr>
				<td>type</td>
				<td>
					<select id="s1" onchange="change()" >
						<option value="0">请选择</option>
						<option value="1">企业</option>
						<option value="2">个人</option>
					</select>
				<input type="hidden" name="acc_id" id="hid"/>
				</td>
			</tr>
		</table>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>