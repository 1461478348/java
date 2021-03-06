<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.List, com.thzm.eye025.bean.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>科室介绍</title>
	<style>
	*{
		padding: 0;
		margin: 0;
	}
	.top{
		width: 400px;
		height: 50px;
		font-size: 34px;
		border: 1px solid red;
		text-align: center;
		line-height: 50px;
		font-weight: bold;
		margin: auto;
	}
		.main{
			display: flex;
			flex-direction: row;
			width: 1073px;
			height: 300px;
			border: 1px solid red;
			margin: auto;
			margin-top: 90px;
			font-family: "微软雅黑";
		}
		.eyeground {
			width: 350px;
			height: 300px;
			background: #f6f6f6;
		}
		.imgs{
			width: 350px;
			height: 150px;
			border: 1px solid red;
		}
		span{
			display: block;
			font-size: 24px;
			font-weight: bold;
			color: #50ca2a;
			margin-top: 10px;
			margin-left: 10px;
		}
		p{
			margin-left: 10px;
			font-size: 14px;
			color: #5c5c5c;
		}
	</style>
</head>
<body>
	<div class="top">科室介绍</div>
	<div class="main">
		<div class="eyeground">
			
			<%
			List<Department> depa = (List<Department>)request.getAttribute("depa");
			if(depa != null){
				for(int i=0; i<depa.size(); i++){
					Department b = depa.get(i);
			
			%>
			<div class="imgs"><img src="<%=b.getPictuer() %>>""></div>
			<span><%=b.getName() %></span>
			<p><%=b.getConten() %></p>
		</div>
		<%
				}
			}
		%>
		
		
	</div>
</body>
</html>