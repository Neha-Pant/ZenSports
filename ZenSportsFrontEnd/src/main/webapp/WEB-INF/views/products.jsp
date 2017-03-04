<div class="row" style="height: 20%">
					<div class="col-md-12">
						<div id="custom-search-input">
							<div class="input-group col-md-12">
								<input type="text" class="  search-query form-control"
									placeholder="Search" /> <span class="input-group-btn">
									<button class="btn btn-danger" type="button">
										<span class=" glyphicon glyphicon-search"></span>
									</button>
								</span>
							</div>
						</div>
					</div>
				</div>

				<div class="row jumbotron" style="height: 70%">
					<div class="col-md-12">
						<table id="myDataTable" class="table table-striped">
							<thead>
								<tr>
									<th>Product ID</th>
									<th>Product Image</th>
									<th>Product Name</th>
									<th>Product Category</th>
									<th>Keywords</th>
									<th>Price</th>
									<th>View Product</th>
									<th>Add to Cart</th>
								</tr>
							</thead>
													</table>
					</div>
				</div>
			</div>

 <!--Product modal code. -->
 <c:forEach var="p" items="${list}">
  <div class="modal fade" id="${p.productId}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
       <div class="modal-header"  >
        
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h2 class="modal-title" id="myModalLabel">Product Details</h2>
        
      </div>
      <div class="modal-body">
       <div class="col-sm-12" id="letv">
          <div class="thumbnail">
            <img src="${images}/${p.productImage}" alt="Image not found" >
              <div class="caption">
                <h2>${p.productName}</h2>
                <h2> ${p.productPrice}</h2>
                <p>${p.productDescription} </p>
                <p><a href="#" class="btn btn-info btn-xs" role="button">close</a></p>
            </div>
          </div>
        </div>
      </div>
      
    </div>
  </div>
</div> 
   </c:forEach>
 <!-- end product modal code. -->