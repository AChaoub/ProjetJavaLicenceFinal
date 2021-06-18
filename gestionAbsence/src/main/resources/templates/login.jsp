<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
	
</head>
<body>

	<!-- create navigation bar ( header) -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#" th:href="@{/}"></a>
			</div>
		</div>
	</nav>
	
	<br>
	<br>
	<div class = "container">
		<div class = "row">
			<div class = "col-md-6 col-md-offset-3">
				
				<h1> Authentification Etudiant </h1>
				<form th:action="@{/login}" method="post">
					
					<!-- error message -->
					<div th:if="${param.error}">
						<div class="alert alert-danger">Invalid username or
							password.</div>
					</div>
				
					<!-- logout message -->
					<div th:if="${param.logout}">
						<div class="alert alert-info">You have been logged out.</div>
					</div>
					
					<div class = "form-group">
						<label for ="username"> Email </label> :
						<input type="text" class = "form-control" id ="username" name = "username"
						placeholder="Enter Email ID" autofocus="autofocus">
					</div>
					
					<div class="form-group">
						<label for="password">Password</label>: <input type="password"
							id="password" name="password" class="form-control"
							placeholder="Enter Password" />
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<input type="submit" name="login-submit" id="login-submit"
									class="form-control btn btn-primary" value="Log In" />
							</div>
						</div>
					</div>
				</form>
				
			</div>
		</div>
	</div>
</body>
</html>