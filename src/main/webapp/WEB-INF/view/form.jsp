<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login JSP</title>
<style>
body {
  background-color: #5DADE2;
}

.rainbow {
  background-image: -webkit-gradient( linear, left top, right top, color-stop(0, #f22), color-stop(0.15, #f2f), color-stop(0.3, #22f), color-stop(0.45, #2ff), color-stop(0.6, #2f2),color-stop(0.75, #2f2), color-stop(0.9, #ff2), color-stop(1, #f22) );
  background-image: gradient( linear, left top, right top, color-stop(0, #f22), color-stop(0.15, #f2f), color-stop(0.3, #22f), color-stop(0.45, #2ff), color-stop(0.6, #2f2),color-stop(0.75, #2f2), color-stop(0.9, #ff2), color-stop(1, #f22) );
  color:transparent;
  -webkit-background-clip: text;
  background-clip: text;
  animation: animatedBackground 1s linear infinite;
    -moz-animation: animatedBackground 1s linear infinite;
    -webkit-animation: animatedBackground 1s linear infinite;
    -ms-animation: animatedBackground 1s linear infinite;
    -o-animation: animatedBackground 1s linear infinite;
}
</style>
</head>

<body>
<h1 class="rainbow"><center>Welcome to login page</center></h1>
<center><form action="/hello" method= "post">
   UserName: <input type="text" name="username" /><br><br>
   Password: <input type="password" name="password" /><br><br><br>
   <input type= "submit"/>
</form></center>

</body>
</html>