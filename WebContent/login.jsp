<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background: rgb(221,132,171);
    background: radial-gradient(circle, rgba(221,132,171,1) 0%, rgba(84,100,119,1) 100%);
}

form {
	border: 3px solid #f1f1f1;
}

input {
	width: 50%;
	padding: 12px 20px;
	margin: 8px 0;
	text-align: center;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	background-color: #b0a68b;
   box-shadow: 5px 5px 5px lightblue inset;
}

button {
	background-color: #594c27;
	color: white;
	text-align: center;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	cursor: pointer;
	width: 20%;
}
label{
padding:10px;
}

button:hover {
	opacity: 0.8;
}

.container {
	padding: 8px;
}

.dropdown{
margin:10px;
padding:10px;
align:  center;


}

.outer{
  width:auto;
  height: auto;
  margin-left: 15%;
  margin-right: 15%;
  background-color: #917288;
  box-shadow: 10px 10px 5px lightblue;
}

select{
width:400px;
height: 150px;
padding:5px;
background-color: #b0a68b;
box-shadow: 5px 5px 5px lightblue inset;
font-size:20px;
}

span.psw {
	float: right;
	padding-top: 8px;
}


h1 {
  text-shadow: 0 0 3px #FF0000;
  font-style:italic;
  font-family: georgia;
  font-size: 50px;

}


</style>
</head>
<body>
	<h1 align="center" > Sorting Algorithms  </h1>
	<div class = "outer" align="center">
		
		<form action="sort" method="post">
			<div class="container">
				<label for="count"><b>Count: </b></label> <input type="text"
					placeholder="Enter Count" name="count"><br> <label
					for="order"><b>Order: </b></label> <input type="text"
					placeholder="Enter Order(ex: asc,desc,random)" name="order"><br>

             <div class="dropdown">
				<select name="sortingalgorithms" multiple>
					<option value="InsertionSort">InsertionSort</option>
					<option value="MergeSort">MergeSort</option>
					<option value="SelectionSort">SelectionSort</option>
					<option value="BubbleSort">BubbleSort</option>
					<option value="HeapSort">HeapSort</option>
					<option value="QuickSort">QuickSort</option>
					<option value="ExtendedQuickSort">ExtendedQuickSort(Using 3 median)</option>
				</select>
				<h6> Note:To select multiple algorithms click on "ctrl" key and select the algorithm you need.<br>
				To select all algorithms select "ctrl+all algos" in the dropdown menu!!
				</h6>
				</div>
				
				<button type="submit">Submit</button>
			</div>

		</form>

	</div>
</body>
</html>
