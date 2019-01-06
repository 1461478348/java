<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style>
	body{
		font-family: "微软雅黑";
		}
		h1{
			font-size: 34px;
			margin-left: 200px;
		}
		div{
			width: 500px;
			height: 500px;
			text-align: right;
		}
		
	</style>
</head>
<body>
	<h1>预约管理</h1>
	<div>

		<form action="sub" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>姓名:<input type="text" name="Name"> </td>
				</tr>
				<tr>
					<td>联系电话:<input type="text" name="connect"> </td>
				</tr>
				<tr>
					<td>E-mail:<input type="text" name="email"></td>
				</tr>
				<tr>
					<td>性别:<input type="text" name="gender"></td>
				</tr>
				<tr>
					<td>年龄:<input type="text" name="age"></td>
				</tr>
				<tr>
					<td>预约项目:<input type="text" name="item"></td>
				</tr>
				<tr>
					<td>预约日期:<input type="text" name="date"></td>
				</tr>
				<tr>
					<td>病情描述:<textarea rows="10" cols="50" name="description"></textarea> </td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
				</tr>
			</table>

		</form>
	</div>

</body>
</html>