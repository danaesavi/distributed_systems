<%-- 
    Document   : index
    Created on : 15/03/2016, 08:53:29 PM
    Author     : CassPratt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AJAX example</title>
        
        <script>
            function loadNewContent(id0,id1,id2,id3,id4, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest){
                    ajaxRequest=new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest=new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                
                ajaxRequest.onreadystatechange = function(){
                    if (ajaxRequest.readyState==0) {
                        document.getElementById(id0).innerHTML="Status 0";
                    } else if (ajaxRequest.readyState==1) {
                        document.getElementById(id1).innerHTML="Status 1";
                    } else if (ajaxRequest.readyState==2) {
                        document.getElementById(id2).innerHTML="Status 2";
                    } else if (ajaxRequest.readyState==3) {
                        document.getElementById(id3).innerHTML="Status 3";
                    } else if (ajaxRequest.readyState==4 && ajaxRequest.status==200){
                        document.getElementById(id4).innerHTML=ajaxRequest.responseText;
                    }
                }
                ajaxRequest.open("GET", target+"?nombre=Danae", true /*async*/);
                ajaxRequest.send();
            }
        </script>
        
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <div id="etiqueta0"> Este texto se va a actualizar 0</div> <BR>
        <div id="etiqueta1"> Este texto se va a actualizar 1</div> <BR>
        <div id="etiqueta2"> Este texto se va a actualizar 2</div> <BR>
        <div id="etiqueta3"> Este texto se va a actualizar 3</div> <BR>
        <div id="etiqueta4"> Este texto se va a actualizar 4</div> <BR>
        <input type="button" value="Ejecutar AJAX" onclick="loadNewContent('etiqueta0','etiqueta1','etiqueta2','etiqueta3','etiqueta4','ServletPrueba')" />
        
    </body>
</html>
