<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>评价结果</title>
	<base href="<%=basePath%>">
	<link rel="stylesheet" href="styles/listAll.css">
	<script type="text/javascript" src="scripts/jquery-3.0.0.js"></script>
	<script type="text/javascript">
		$(function(){
			$('#b1').click(function(){
				window.location = "insert";
			});
			
		});
	</script>
	

	<style type="text/css">
		.selected{
			background-color: #CEDDED;
		}
	</style>
</head>
<body>
	<form:form>
		<div class="header">
			<span>类型查询</span>
			<select id="s" onchange="change()" >
				<option value="0">全部</option>
				<option value="1">批评</option>
				<option value="2">建议</option>
				<option value="3">表扬</option>
			</select>
			<input type="hidden" value="${key }" id="keyvalue" />
		</div>
		<div class="container">
			<table>
				<thead>
					<td>编码</td>
					<td>名称</td>
					<td>备注</td>
					<td>状态</td>
					<td>创建时间</td>
					<td>最后登陆</td>
					<td>账号类型</td>
					<td>操作</td>
				</thead>
			<c:forEach items="${list }"  var="acc" varStatus="sta">
				<tr>
						<td>${acc.id}</td>
						<td>${acc.name }</td>
						<td>${acc.remark}</td>
						<td>${acc.status==1?"开启":"封闭"}&nbsp;<a href="upsta?id=${acc.id }">开启</a></td>
						<td><input value="${acc.newtime}" pattern="yyyy-MM-dd HH:mm:ss" readonly/></td>
						<td>${acc.lastlogintime}</td>
						<td>${acc.acctype.acctype}</td>
						<td><a href="accdetail?id=${acc.id }">修改</a>&nbsp;&nbsp;<a href="delete?id=${acc.id }">删除</a></td>
					</tr>
			</c:forEach>
			</table>
		</div>
		<div class="button">
			<input type="button" value="添加" id="b1"/>
		</div>
		</form:form>
	
</body>
</html>