<html>
<header>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!-- JQuerry library -->
</header>
<body>
<h2>Hello World!</h2>
<button onclick="myFunction()">Send request</button>
<p id="paragraph"></p>
<script type="text/javascript">
	const restUrl = "api/myrequest";
	function url(u){
		return "<%=request.getContextPath()%>/" + u;
	}
	function myFunction() {
	//function which send ajax request to the server
	$.ajax({
		url : url(restUrl),
		datatype : 'json',
		type : "post",
		contentType : "application/json",
		data : JSON.stringify({
			message : 'Hi there',
			id : 1
		}),
		success : function(data) {
			console.log(data);
			 $("#paragraph").text(data.message);
		}
	});
}
</script>
</body>
</html>
