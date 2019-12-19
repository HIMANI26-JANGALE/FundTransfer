<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AccountController" method=post>
<table border="5">
<tr>
<td>Account_no</td>
<td><input type="text" name="account_no"></td>
</tr>
<tr>
<td>Account_Balance</td>
<td><input type="text" name="account_balance"></td>
</tr>
<tr>
<td>Cust_id</td>
<td><input type="text" name="cust_id"></td>
</tr>
<tr>
<td>Branch_name</td>
<td><input type="text" name="branch_name"></td>
</tr>
<tr>
<td>Branch_code</td>
<td><input type="text" name="branch_code"></td>
</tr>
<tr>
<td>ifsc_code</td>
<td><input type="text" name="ifsc_code"></td>
</tr>
<tr>
<td>micr_code</td>
<td><input type="text" name="micr_code"></td>
</tr>
<tr>
<td>Account_type</td>
<td><input type="text" name="account_type"></td>
</tr>
</table>
<input type="submit" value="add">
</form>
</body>
</html>