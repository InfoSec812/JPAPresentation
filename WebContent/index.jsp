<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="margin: 0px;">
	<div style="width: 100%; height: 100%; border: 0px; text-align: center;">
		<br />
		<span style="font-size: 18pt; font-weight: bold; text-decoration: underline;">JPA Demonstration App</span>
		<br />
		<br />
		<div style="border-top: 1px solid black; height: 100%;">
			<div style="width: 33%; float: left; border: 0px; border-right: 1px solid black; border-bottom: 1px solid black;">
				<span style="font-size: 14pt; font-weight: bold;">Add Employee</span>
				<br /><br />
				<div style="width: 70%;">
					<form action="people" method="POST">
						<div style="width: 100%; text-align: right;">Forename: <input style="width: 120px;" name="forename" id="personForename"><br /></div>
						<div style="width: 100%; text-align: right;">Surname: <input style="width: 120px;" name="surname" id="personSurname"><br /></div>
						<div style="width: 100%; text-align: right;">Street Address: <input style="width: 120px;" name="address" id="personAddr"><br /></div>
						<div style="width: 100%; text-align: right;">City: <input style="width: 120px;" name="city" id="personCity"><br /></div>
						<div style="width: 100%; text-align: right;">State: <input style="width: 120px;" name="state" id="personState"><br /></div>
						<div style="width: 100%; text-align: right;">Post Code: <input style="width: 120px;" name="postalCode" id="personZip"><br /></div>
						<div style="width: 100%; text-align: right;">Age: <input style="width: 120px;" name="age" id="personAge"><br /></div>
						<div style="width: 100%; text-align: right;">
							Department: <select name="department" style="width: 120px;" id="personDepartment">
							</select>
						</div>
					</form>
				</div>
			</div>
			<div style="width: 33%; height: 100%; float: left; border: 0px; border-right: 1px solid black; border-bottom: 1px solid black;">
				<span style="font-size: 14pt; font-weight: bold;">Add Department</span>
				<br /><br />
				<br /><br />
				<div style="width: 70%;">
					<form action="departments" method="POST">
						<div style="width: 100%; text-align: right;">Name: <input style="width: 120px;" name="deptName" id="deptName"><br /></div>
						<div style="width: 100%; text-align: right;">Description: <textarea style="width: 120px; height: 120px;" name="deptDescription" id="description"></textarea></div>
						<div style="width: 100%; text-align: right;">
							Department: <select name="manager" style="width: 120px;" id="deptManager">
							</select>
						</div>
					</form>
				</div>
			</div>
			<div style="width: 33%; height: 100%; float: left; border: 0px; border-bottom: 1px solid black;">
				<span style="font-size: 14pt; font-weight: bold;">Search</span>
				<br /><br />
				<form action="search" method="POST">
				</form>
			</div>
		</div>
	</div>
</body>
</html>