<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="bean.LoginBean" scope="request" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
 検索ツール
 <%=bean.getLoginInfo() %><br><br>
 <form  method="GET" action="KeySrvlet">
 	従業員ID<input name="userid" type="text" ><br>
	<input type="submit" value="従業員表示">
</form>
<br>
全データ表示
<form  method="GET" action="AllSrvlet">
	<input type="submit" value="全従業員表示">
</form>

</body>
</html>