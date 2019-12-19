<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="RTGSCss.css">

</head>
<body>
	<h2>RTGS Fund Transfer</h2>
	<form action="RTGSController">
		<table border="5">
			<tr>
				<td>From Account No:</td>
				<td><input type="text" name="fAccNo"></td>
			</tr>
			<tr>
				<td>Beneficiary Account No:</td>
				<td><input type="text" name="bAccNo"></td>
			</tr>
			<tr>
				<td>Beneficiary IFSC Code:</td>
				<td><input type="text" name="bIFSCCode"></td>
			</tr>
			<tr>
				<td>Beneficiary Account Type:</td>
				<td><input type="text" name="bAccType"></td>
			</tr>
			<tr>
				<td>Amount:</td>
				<td><input type="text" name="amt"></td>
			</tr>
			<tr>
				<td>Remark:</td>
				<td><input type="text" name="remark"></td>
			</tr>
			
						
		</table>
			<div id="pay-id"><input type="submit" value="Pay" ></div>
			
	</form>
</body>
</html>