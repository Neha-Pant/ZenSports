$(document).ready(function() {
$('#myDataTable').DataTable( {
	"lengthMenu": [[1, 3, 5, 7, -1], [1, 3, 5, 7, "All"]],
	ajax: {
	        url: '/ZenSportsFrontEnd/product',
	        dataSrc: ''
	    },
    columns: [
        { data: 'productId' },
        { data: 'productName' },
        { data: null,
        	mRender: function ( data, type, row ) {
                return '<img src="/ZenSportsFrontEnd/resources/images/'+ row.productImage +'" height="70" width="70">'; }
        },
        { data: 'productCategory' },
        { data: 'productKeyword' },
        { data: 'productPrice' },
        {data: null,
        	mRender: function ( data, type, row ) {
                return '<a  href="#" role="button" class="btn btn-default btn-lg" data-toggle="modal" data-target="#'+row.productId+'">View Item</a>';}
        },
        {data: null,
        	mRender: function ( data, type, row ) {
                return '<a class="btn btn-primary" href="'+data+'">Add To Cart</a>';}
        }
    ]
} );
});