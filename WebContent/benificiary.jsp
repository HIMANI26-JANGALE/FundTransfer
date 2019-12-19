<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="d1.css">
<title>Insert title here</title>
</head>
<body>
	<form action="benificiController" method="post">
	
	
	<h2>Beneficiary Type: Transfer to other Bank</h2>
	
	<table>
	
	<tr>
	<td>Beneficiary Account No :</td><td><input type="text" name="baccNo"></td>
	</tr>
	<tr>
	<td>Re-Enter Beneficiary No:</td><td><input type="text" name="rbaccNo"></td>
	</tr>
	<tr>
	<td>Beneficiary account Type:</td><td><input type="text" name="type"></td>
	</tr>
	<tr>
	<td>IFSC No :</td><td><input type="text" name="ifscNo"></td>
	</tr>
	<tr>
	<td>Beneficiary Name :</td><td><input type="text" name="benefiName"></td>
	</tr>
	<tr>
	<td>Email ID :</td><td><input type="text" name="eId"></td>
	</tr>
	<tr>
	<td><a href="FundTransfer.jsp">Back</a></td>
	<td><input type="submit" value="Submit" ></td>
	</tr>
	</table>
	</form>

</body>
</html>