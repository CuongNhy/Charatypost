<%@page import="modle.bean.SinhVien"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xem Thông Tin Sinh Viên</title>
</head>
<body>
	<table>
		<%
			ArrayList <SinhVien> sinhVienArray = (ArrayList<SinhVien>)request.getAttribute("sinhVienArray");
			for ( int i=0; i< sinhVienArray.size(); i++){
		%>
		<tr>
			<td> <%= sinhVienArray.get(i).getIDSV() %></td>
			<td> <%= sinhVienArray.get(i).getName() %></td>
			<td> <%= sinhVienArray.get(i).getAge() %></td>
			<td> <%= sinhVienArray.get(i).getUniversity() %></td>
		
		</tr>
		
		<% }
		%>
	</table> 
</body>
</html>