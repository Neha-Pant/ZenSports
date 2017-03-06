<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form class="form-horizontal" action="userData.do" method="POST"
	commandname="user" modelattribute="user">
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8 well">
				<h1>Register</h1>

				<div class="form-group">
					<label>UserName</label> <form:input path="userName" type="text" class="form-control" placeholder="flint" required/>
						<div class="has-error">
								<form:errors style="color:red" path="userName" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Role</label> <form:select path="userRole" type="text" class="form-control" required>
						<form:option value="User">User</form:option>
						<form:option value="Supplier">Supplier</form:option>
						</form:select>
						<div class="has-error">
								<form:errors style="color:red" path="userRole" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Password</label> <form:input path="userPassword" type="password" class="form-control" placeholder="pass@123" required/>
						<div class="has-error">
								<form:errors style="color:red" path="userPassword" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Confirm Password</label> <form:input path="userConPassword" type="password"
						class="form-control" placeholder="pass@123"
						required/>
						<div class="has-error">
								<form:errors style="color:red" path="userConPassword" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Address</label> <form:input path="userAddress" type="text" class="form-control" placeholder="flat no,society name,city,country"
						required/>
						<div class="has-error">
								<form:errors style="color:red" path="userAddress" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Email</label> <form:input path="userEmail" type="email" placeholder="abc@xyz.com"
						class="form-control"/>
						<div class="has-error">
								<form:errors style="color:red" path="userEmail" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Mobile Number</label> <form:input path="userMobile" type="text"
						placeholder="+919945678902" class="form-control" maxlength="13" minlength="13"/>
						<div class="has-error">
								<form:errors style="color:red" path="userMobile" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Security Question</label> <form:select path="userSecurityQ" class="form-control">
						<form:option value="Name of the first pet" selected>Name of
							the first pet</form:option>
						<form:option value="Name of the favourite book">Name of the
							favourite book</form:option>
						<form:option value="Name of the favourite sport">Name of the
							favourite sport</form:option>
					</form:select>
					<div class="has-error">
								<form:errors style="color:red" path="userSecurityQ" class="help-inline" />
							</div>
				</div>
				<div class="form-group">
					<label>Security Answer</label> <form:input path="userSecurityA" type="text"
						placeholder="demo" class="form-control"/>
						<div class="has-error">
								<form:errors style="color:red" path="userSecurityA" class="help-inline" />
							</div>
				</div>
				<div>
					<button type="submit" class="btn btn-default">Register</button>
					<div class="shadow"></div>
				</div>
</form>
</div>
<div class="col-md-2"></div>
</div>
</div>
