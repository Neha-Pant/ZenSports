<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<form:form action="productData.do" method="POST"
				commandName="product" modelAttribute="product">
				<table border="1" align="center">
					<caption></caption>
					<tr>
						<th>Product Name</th>
						<td><form:input path="productName" />
							<div class="has-error">
								<form:errors path="productName" class="help-inline" />
							</div></td>
					</tr>
					<tr>
						<th>Product Category</th>
						<td><form:input path="productCategory" />
							<div class="has-error">
								<form:errors path="productCategory" class="help-inline" />
							</div></td>
					</tr>
					<tr>
						<th>Product Description</th>
						<td><form:input path="productDescription" />
							<div class="has-error">
								<form:errors path="productDescription" class="help-inline" />
							</div></td>
					</tr>
					<tr>
						<th>Product Keyword</th>
						<td><form:input path="productKeyword" />
							<div class="has-error">
								<form:errors path="productKeyword" class="help-inline" />
							</div></td>
					</tr>
					<tr>
						<th>Product Image</th>
						<td><form:input path="productImage" />
							<div class="has-error">
								<form:errors path="productImage" class="help-inline" />
							</div></td>
					</tr>
					<tr>
						<th>Product Price</th>
						<td><form:input path="productPrice" />
							<div class="has-error">
								<form:errors path="productPrice" class="help-inline" />
							</div></td>
					</tr>
					<tr>
						<th>Product Quantity</th>
						<td><form:input path="productQuantity" />
							<div class="has-error">
								<form:errors path="productQuantity" class="help-inline" />
							</div></td>
					</tr>
					<tr>
						<th colspan="2" align="center"><input type="submit"
							name="action" value="Add" /></th>
					</tr>
				</table>
		</div>
		<div class="col-md-3"></div>
	</div>
	<br> <br />
	<div class="row">
		<div class="table-responsive col-md-12">

			<table id="myDataTable1" class="table table-striped">
				<thead>
					<tr>
						<th>Product ID</th>
						<th>Product Image</th>
						<th>Product Name</th>
						<th>Product Category</th>
						<th>Keywords</th>
						<th>Price</th>
						<th>Quantity</th>
						<th>Edit Product</th>
						<th>Delete Product</th>
					</tr>
				</thead>
			</table>
		</div>
		</form:form>
	</div>

</div>
