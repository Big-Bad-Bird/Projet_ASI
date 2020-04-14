$('input#submitButton').click( function() {
    $.ajax({
        url: '/add',
        type: 'post',
        dataType: 'json',
        data: $('#form').serialize(),
        success: function(data) {
        	if(data['request'] == 'success'){
        		$('#result')[0].innerText="Ajout Réussi";
        	}
         }
    });   
});