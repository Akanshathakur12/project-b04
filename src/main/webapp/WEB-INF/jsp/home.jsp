<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
    
    
    <style type="text/css">
    body,td,th{
        color: #000000;
    }
    
    body{
        background-color: #F0F0F0;
    }
    
    .style1
    {
        font-family: arial;
        font-size: 14px;
        padding: 12px;
        line-height: 25px;
        border-radius: 4px;
        text-decoration: none;
        
    }
    
    .style2
    {
        font-family: arial;
        font-size: 17px;
        padding: 12px;
        line-height: 25px;
        border-radius: 4px;
        text-decoration: none;
        
    }
    
    
</style>
</head>
<body>

   <h1>Welcome to FOOD CORNER</h1>
   <div id="buttonContainer">
			<a class="press" href="/login">Login</a><br> <a class="press"
				href="/registerUser">Register As User</a><br> <a class="press"
				href="/registerSeller">Register As Seller</a>
		</div>
   
<!--    <form th:action="@{/logout}" method="post">
        <input type="submit" class="btn btn-info" value="Logout" />
    </form>
     -->
</body>
</html>