<!-- Product Details -->
<div class="container content">
  <form:form modelAttribute="prod" action="cart">
<div style="height:20%"></div>
       <div class="row well">
             <div class="col-md-3">
             <div id="${prod.productId}"></div>
                    <div>
                           <img src="${images}/${prod.productImage}" height="300" width="200">
                    </div>
             </div>
             <div class="col-md-6">
                    <div class="row">
                           <p><h1 style="color:blue;font-weight:bold">${prod.productName}</h1></p>
                    </div>
                     <div class="row">
                           <p><h4><b>Category : </b>${prod.productCategory}</h2></p>
                    </div>
                     <div class="row">
                           <p><h4>Keywords : ${prod.productKeyword}</h4></p>
                    </div>
                    <div class="row">
                           <br/>
                           <p><h4><b>DESCRIPTION</b><br/>${prod.productDescription}</h4></p>
                    </div>
                    <div class="row">
                           <p><b></b><h4 style="color:red">&#8377 ${prod.productPrice}</h4></b></p>
                    </div>
                     <div class="row">
                           <p><b></b><h4 style="color:orange"> ${prod.productQuantity} pieces left .</h4></b></p>
                    </div>
                    <div class="row">
                           <p>
                                 <button  style="text-size:30px" class="btn btn-danger btn-md" ><span class="glyphicon glyphicon-shopping-cart" style="text-size:30px"></span> Add to Cart</button>
                                 
                                        
                           </p>
                    </div>
             </div>
             
       </div>
       </form:form>
</div>
