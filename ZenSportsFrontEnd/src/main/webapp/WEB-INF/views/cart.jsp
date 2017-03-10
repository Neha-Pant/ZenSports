<div class="container content">
  <form:form modelAttribute="prod">
  <div class="row">
       <div class="col-md-12" style="height:5%: border-bottom:1px solid black">
             <h2>Shopping Cart <span>(<!-- ${cart.itemCount} --> Item(s))</span></h2>
       </div>       
  </div>
  <div class="row">
  <div class="col-md-12">
  <table class="table table-responsive table-sripped">
       <tr>
             <th colspan="2" style="color:darkgrey">Item</th>
             <th style="color:darkgrey">Quantity</th>
             <th style="color:darkgrey">Price</th>
             <th style="color:darkgrey">Sub Total</th>
             <th></th>
       </tr>
       <tr>
       <td><img src="${images}/${prod.productImage}" width="70px" height="70px"/></td>
       <td>${prod.productName}</td>
       <td>
             <select id="Quantity">
                    <c:forEach var="i" begin="1" end="${prod.productQuantity}">
                    <option value="${i}">${i}</option>
                    </c:forEach>
             </select>
       </td>
       <td>&#8377; ${prod.productPrice} </td>
       <td></td>
       <td><span class="glyphicon glyphicon-remove-sign" style="text-size:30px; color:crimson"></span></div></td>
       </tr>
  </table>
  </div>
  </div>
   <div class="row">
  <div class="col-md-12">
  <table class="table table-responsive">
  <tr>
   <td></td>
  <td></td>
  <td>Grand Total</td>
  <td></td>
  </tr>
  <tr>
  <td></td>
  <td></td>
  <td><button class="btn btn-danger btn-lg">Continue Shopping</button> </td>
  <td><button class="btn btn-danger btn-lg">Place Order</button></td>
  </tr>
  </table>
  </div>
  </div>
       
 
  </form:form>
  </div>
  </div>
