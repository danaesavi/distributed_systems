<%-- 
    Document   : index
    Created on : 17/03/2016, 09:11:23 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
                   
            function load(id,input,target) {
                var ajaxRequest;
                if (window.XMLHttpRequest){
                    ajaxRequest=new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest=new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function(){
                    if (ajaxRequest.readyState==4 && ajaxRequest.status==200){
                        var texto=ajaxRequest.responseText;
                        document.getElementById("estados").innerHTML=texto;
                    }
                }
                ajaxRequest.open("GET", target+"?input="+input, true /*async*/);
                ajaxRequest.send();
            }
        </script>
    </head>
    <body>
        <h3>Indica un estado y te doy la capital! NBP</h3>
        <br>
        <input type="text" name="input" value="" onkeyup="load('estados',this.value,'ServletAutocompleta')" />
        <br>
        <div id="estados"></div>
    </body>
</html>
