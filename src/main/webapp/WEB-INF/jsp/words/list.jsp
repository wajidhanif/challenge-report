<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<form method="get" action="counts">
	
		 Select File: 
		 <select id="FileID" name="fileID">
			<c:forEach var="item" items="${fileList}">
	        	<option value="${item.id}">${item.name}</option>
			</c:forEach>
		</select> &nbsp;&nbsp;&nbsp;
		<input type="text" name="limit" value="10" />&nbsp;&nbsp;&nbsp;
		<select id="order" name="order">
			<option value="0">Most Common</option>
			<option value="1">Least Common</option>
			
		</select> &nbsp;&nbsp;&nbsp;
		<input type="submit" value="Submit"/>		
	</form>
	
	<h1>Word Count List</h1>

	<h2>Word Count:${fn:length(listWords)}</h2>
		<table border="1">
			<thead>
				<tr>
					<th>Word</th>
					<th> Count </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${listWords}">
					<tr>
						<td>${item.id.word}</td>
						<td>${item.value}</td>
					</tr>						
					</c:forEach>				
			</tbody>
		
		</table>
</body>
</html>