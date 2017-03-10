<div class="container">
  <br/><br/><br/>
<div class="row">
  <div class="col-xs-8" style="height:40%;width:70%">
    <div class="form-container col-md-8 jumbotron">
					<form:form class="form-horizontal" method="POST" modelAttribute="payment">
    <div style="height:50px;background:rgb(73, 186, 142);border-radius:5px;"><h3 style="margin-left:20px;margin-top:20px">
      Share your contact details
    </h3></div>
      <div class="form-group" style="margin-top:20px">
<!--        <input type="text" placeholder="Name" class="form-control" id="name" name="name" style="width:25%;display:inline"/>-->
        <form:input path="email" type="text" class="form-control" placeholder="abc@xyz.com" class="form-control" id="emailid" name="emailid" style="width:45%;display:inline"/>
        <input type="text" placeholder="+919945678902" class="form-control" id="phoneno" name="phoneno" maxlength="13" minlength="13" style="width:25%;display:inline"/>
      </div>
    <div style="height:50px;background:rgb(73, 186, 142);border-radius:5px;"><h3 style="margin-left:20px;margin-top:20px">
      Payment Details
    </h3></div>
    <div style="padding:20px">
    <div class="jumbotron" style="height:80%;width:80%">
      <div class="form-group">
      <label for="cno" style="color:gray">
          Card Number <img src="Images/img.png" style="display:inline;height:20%;width:20%;float:right"/>
        </label>
        <input type="text" class="form-control" id="cno" placeholder="XXXX-XXXX-XXXX-XXXX" maxlength="16" minlength="16"/>
      </div>
      <div class="form-group">
        <label for="name" style="color:gray">
          Name on the card
        </label>
        <input type="text" class="form-control" id="name" placeholder="Name On The Card"/>
      </div>
      <div class="form-group">
        <label for="mm" style="color:gray;display:inline">
          Expiry
        </label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label for="cvv" style="color:gray">
          CVV
        </label><br/>
        <input type="number" min="1" max="12" class="form-control" id="mm" style="width:65px;display:inline" maxlength="3" placeholder="mm"/>
        <input type="number" id="yy" min="2017" max="2027" class="form-control" maxlength="4" style="width:75px;display:inline" placeholder="yy"/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" minlength="3" maxlength="3" id="cvv" length="3" class="form-control" style="width:75px;display:inline" placeholder="CVV"/>
      </div>
  </div>
  <div class="form-group">
  <button class="btn btn-danger" >
    Make Payment
  </button>
</div>
</form:form>
<p style="color:gray">By clicking on 'Make Payment' you are agreeing to terms and conditions .</p>
    </div>
  </div>
  
  </div>
