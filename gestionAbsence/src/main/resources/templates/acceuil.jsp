<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login V18</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="icon" type="image/png" href="/assests/images/icons/favicon.ico"></link>
	<link rel="stylesheet" type="text/css" href="/assests/vendor/bootstrap/css/bootstrap.min.css"></link>
	<link rel="stylesheet" type="text/css" href="../assests/fonts/font-awesome-4.7.0/css/font-awesome.min.css"></link>

	<link rel="stylesheet" type="text/css" href="assests/fonts/Linearicons-Free-v1.0.0/icon-font.min.css"></link>

	<link rel="stylesheet" type="text/css" href="assests/vendor/animate/animate.css"></link>
	<link rel="stylesheet" type="text/css" href="assests/vendor/css-hamburgers/hamburgers.min.css"></link>
	<link rel="stylesheet" type="text/css" href="assests/vendor/animsition/css/animsition.min.css"></link>
	<link rel="stylesheet" type="text/css" href="assests/vendor/select2/select2.min.css"></link>	
	<link rel="stylesheet" type="text/css" href="assests/vendor/daterangepicker/daterangepicker.css"></link>
	<link rel="stylesheet" type="text/css" href="assests/css/util.css"></link>
	<link rel="stylesheet" type="text/css" href="assests/css/main.css"></link>
</head>
<body style="background-color: #666666;">
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form" th:action="@{/login}">
					<span class="login100-form-title p-b-43">
						Se connecter
					</span>
					
					
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="username">
						<span class="focus-input100"></span>
						<span class="label-input100">Email</span>
					</div>
					
					
					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="password">
						<span class="focus-input100"></span>
						<span class="label-input100">Mot de passe</span>
					</div>

					<!-- <div class="flex-sb-m w-full p-t-3 p-b-32">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Remember me
							</label>
						</div>

						<div>
							<a href="#" class="txt1">
								Forgot Password?
							</a>
						</div>
					</div> -->
			

					<div class="container-login100-form-btn">

						<!-- <button class="login100-form-btn" action>
							Se connecter
						</button> -->
						<input type="submit" class="login100-form-btn" value="Se connecter">
						 
					</div>
				
				</form>

				<div class="login100-more" style="background-image: url('assests/images/empty-classroom.jpg');">
				</div>
			</div>
		</div>
	</div>
	
	

	
	
<!--===============================================================================================-->
	<script src="assests/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="assests/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="assests/vendor/bootstrap/js/popper.js"></script>
	<script src="assests/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="assests/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="assests/vendor/daterangepicker/moment.min.js"></script>
	<script src="assests/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="assests/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="assests/js/main.js"></script>

</body>
</html>