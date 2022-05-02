<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
</head>
<body>
 
    
    
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

<form action="/saveSeller" method="post">
         	<label for="s_id">Enter seller id: &nbsp;</label> <input
				type="text" name="s_id" id="" placeholder="s_id"><br>
			<label for="userName">Enter a Username: &nbsp;</label> <input
				type="text" name="userName" id="" placeholder="Username"><br>
			<label for="address">Enter your Address: &nbsp;</label> <input
				type="text" name="address" id="" placeholder="Address"><br>
			<label for="mobileNumber">Enter your mobile number: &nbsp;</label> <input
				type="text" name="mobileNumber" id="" placeholder="MobileNumber"><br>
			<label for="email">Enter your Email: &nbsp;</label> <input
				type="email" name="email" id="" placeholder="Email"><br>
			<label for="password">Enter a Password: &nbsp;</label> <input
				type="password" name="password1" id="" placeholder="Password"><br>
			<label for="password">Confirm Password: &nbsp;</label> <input
				type="password" name="password2" id="" placeholder="Password"><br>
			<input type="submit" id="login" value="Register">

		</form>

</body>
</html>