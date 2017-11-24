/**
 * Utilily library
 */

function ajaxCall(action, type, parameters, successCallback, errorCallback) {
	if (type == 'POST') {
		data = JSON.stringify(parameters);
	} else {
		data = parameters;
	}

	$.ajax({
		url : action,
		type : type,
		data : data,
		contentType : 'application/json',
		dataType : 'json',
		success : successCallback,
		error : errorCallback
	});
}

function postRedirect(action, parameters) {
    method = "POST";

    var form = document.createElement("form");
    form.setAttribute("method", method);
    form.setAttribute("action", action);

    for(var key in parameters) {
        if(parameters.hasOwnProperty(key)) {
            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", key);
            hiddenField.setAttribute("value", parameters[key]);

            form.appendChild(hiddenField);
        }
    }

    document.body.appendChild(form);
    form.submit();
}



