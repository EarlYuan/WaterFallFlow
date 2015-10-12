<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 style="text-align: center;">教师列表</h1>
<div style="width:800px;height:400px;background-color:yellow;margin-top:10px;">
	<table border="1px solid black" width="800px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
		</tr>
		<c:forEach items="${teacherList }" var="s">
		<tr>
			<td>${s.id }</td>
			<td>${s.name }</td>
			<td>${s.age }</td>
		</tr>
		</c:forEach>
	</table>
</div>
<div style="width:800px;height:350px;background-color:pink;margin-top:10px;">
	<table border="1px solid black" width="800px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
		</tr>
		<c:forEach items="${teacherList }" var="s">
		<tr>
			<td>${s.id }</td>
			<td>${s.name }</td>
			<td>${s.age }</td>
		</tr>
		</c:forEach>
	</table>
</div>
