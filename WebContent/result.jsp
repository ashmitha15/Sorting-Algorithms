<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.uta.daa.SortClass"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<style>


body{
background: rgb(82,117,109);
background: radial-gradient(circle, rgba(82,117,109,1) 0%, rgba(218,119,119,1) 100%);
}


#sorting {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#sorting td, #sorting th {
	border: 1px solid #ddd;
	padding: 8px;
	background-color: #799b9c;
}

 tr:nth-child(even) {
	 background-color: #dddddd;
}

#sorting tr:hover {
	background-color: #ddd;
}

#sorting th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #116466;
	color: white;
}


#sorting td {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #799b9c;
	color: white;
}



#giveinput td, th {
	border: 1px solid #ddd;
	padding: 8px;
}

#giveinput tr:nth-child(even) {
	background-color: #799b9c;
}

#giveinput tr {
	background-color: #116466;
	color:white; 
}


#giveinput table {
	width: 80%;
	border-collapse: collapse;
	border: 1px solid #ddd;
	padding: 8px;
}

h1,.container{
  color: #7f9799;
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
}

.container{
  display: flex;
  justify-content: flex-end;  
  font-size: 30px;
 color: white;
}



</style>
</head>
</head>
<body>
   <header>
    <div class ="back">
     <nav>
       <a  class= "container" href="login.jsp" > Back </a>
      </nav>
    </div>
   
     
	   <h1>Given Input:</h1>
	</header>
    <section>
	<table id="giveinput">

		<tr>
			<th>Length</th>
			<th>Input</th>
		</tr>
		<tr>
			<td>${count}</td>
			<td>${giveninput}</td>
		</tr>

	</table>

	<br>
	<br>
	<br>
	<br>
	<br>
	<h1>Sorting Algorithm Comparison:</h1>
	<jsp:useBean id="SortClass" type="java.util.List<SortClass>"
		scope="request" />
	<table id="sorting"  style="width:100%">
		<tr>
			<th>Algorithm</th>
			<th>Execution Time(Milli Seconds)</th>
			<th>Sorted Array</th>
		</tr>
		<%
		for (Iterator it = SortClass.iterator(); it.hasNext();) {
			SortClass row = (SortClass) it.next();
		%>
		<tr>
			<td><%=row.getName()%></td>
			<td><%=row.getSortime()%></td>
			<td><%=row.getSortarray()%></td>
		</tr>
		<%
		}
		%>
	</table>
  </section>
</body>
</html>
