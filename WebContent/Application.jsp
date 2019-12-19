<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"  type="text/css" href="application.css"/>
<h1><center>APPLICATION FORM</center></h1>
<p align="center">Please fill in this form to create an account.</p>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:\Users\tsdes\Desktop\b3.jpg">
<center>
<b>
<form action="ApplicationController" method="post">
<table>
<tr>
<td>Cust_id</td>
<td><input type="text" name="app_no">
<tr>
<td>ACCOUNT TYPE</td>
<td>
<select>
<option>Select Any One</option>
<option value="saving">Saving</option>
<option value="current">Current</option>
</select>
</td>
<tr>
<td>Branch Name</td>
<td><input type="text" name="branch_name">
<tr>

<td>FULL NAME *</td>

<tr>
<td>SURNAME</td>
<td><input type="text" name="surname">


<td>FIRSTNAME</td>
<td><input type="text" name="firstname">

<td>MIDDLENAME</td>
<td><input type="text" name="middlename">
</td>
<tr>
<td>DATE OF BIRTH</td>
<td><input type="text" name="date">
</td>
<tr>
<td>Mobile No</td>
<td><input type="text" name="mobile_no">
</td>
<tr>
<td>EMAIL*</td>
<td><input type="text" name="email">
</td>
<tr>

<tr>
<td>NATIONALITY</td>
<td><input type="text" name="nationality">
</td>
<tr>
<td>OCCUPATION</td>
<td><input type="text" name="occupation">
</td>
<tr>
<td>ADDRESS*</td>
<tr>
<td>CITY</td>
<td><input type="text" name="city">

<td>STATE</td>
<td><input type="text" name="state">

<td>DISTRICT</td>
<td><input type="text" name="district">
</td>
<tr>
<td>PINCODE</td>
<td><input type="text" name="pincode">
</td>
<tr>
<td>AADHAR NO*</td>
<td><input type="text" name="aadhar_no">
</td>
<tr>
<td>PAN NO</td>
<td><input type="text" name="pan_no">
</td>

</tr>
</table>
<center>
<center>
</b>
<div1 class= "d">
<input type="submit" value="SUBMIT" >
</div1>
</center>

</form>

</body>
</html>