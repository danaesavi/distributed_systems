<%-- 
    Document   : index
    Created on : 5/04/2016, 08:17:19 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script>
            function loadNewContent(id, target) {
                 
            var ajaxRequest;
            if (window.XMLHttpRequest){
                ajaxRequest=new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
            } else {
                ajaxRequest=new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
            }
            
            ajaxRequest.onreadystatechange = function(){
            if (ajaxRequest.readyState==4 && ajaxRequest.status==200){
                 //alert("texto"+ajaxRequest.responseText);
            var JSONArray = JSON.parse(ajaxRequest.responseText);
      
            var txt="";
            for (var i = 0; i < JSONArray.clientes.length; i++) {
                txt=txt+"<option>"+JSONArray.clientes[i].name+"</option>";
            }
            //alert(txt);
            document.getElementById(id).innerHTML=txt;
            }

            }
            ajaxRequest.open("GET",target,true/*async*/);
            ajaxRequest.send();

            } 
            function getDetails(id,name,target) {
                 
            var ajaxRequest;
            if (window.XMLHttpRequest){
                ajaxRequest=new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
            } else {
                ajaxRequest=new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
            }
            
            ajaxRequest.onreadystatechange = function(){
            if (ajaxRequest.readyState==4 && ajaxRequest.status==200){
                 //alert("texto"+ajaxRequest.responseText);
            var JSONArray = JSON.parse(ajaxRequest.responseText);
 
            var txt="";
            var i=0;
            var name1=document.getElementById(name).value;
            //alert(name1+" "+JSONArray.clientes[i].name==name1);
    /*        while(i < JSONArray.clientes.length)) {
                
                i++;
            }*/
           
            if(JSONArray.clientes[i].name==name1){
                
                
                txt=txt+"<p>"+"name: "+ JSONArray.clientes[i].name+"</BR>"
                +"address: "+JSONArray.clientes[i].address+"</BR>"
                +"id: "+JSONArray.clientes[i].id+"</BR>"
                +"balance: "+JSONArray.clientes[i].balance+"</BR>"
                +"premium: "+JSONArray.clientes[i].premium+"</BR>"
                        +"</p>";
            }else
                if(JSONArray.clientes[i+1].name==name1){
                
                
                txt=txt+"<p>"+"name: "+ JSONArray.clientes[i+1].name+"</BR>"
                +"address: "+JSONArray.clientes[i+1].address+"</BR>"
                +"id: "+JSONArray.clientes[i+1].id+"</BR>"
                +"balance: "+JSONArray.clientes[i+1].balance+"</BR>"
                +"premium: "+JSONArray.clientes[i+1].premium+"</BR>"
                        +"</p>";
            }else
                if(JSONArray.clientes[i+2].name==name1){
                
                
                txt=txt+"<p>"+"name: "+ JSONArray.clientes[i+2].name+"</BR>"
                +"address: "+JSONArray.clientes[i+2].address+"</BR>"
                +"id: "+JSONArray.clientes[i+2].id+"</BR>"
                +"balance: "+JSONArray.clientes[i+2].balance+"</BR>"
                +"premium: "+JSONArray.clientes[i+2].premium+"</BR>"
                        +"</p>";
            }
          
            document.getElementById(id).innerHTML=txt;
            }

            }
            ajaxRequest.open("GET",target,true/*async*/);
           ajaxRequest.send();

            } 
            </script>
    </head>
    
    <body onload="loadNewContent('customers', 'Clientes')">
        
        <select id="customers" onchange="getDetails('orale','customers','Clientes')" >

            </select>
        <div id="orale">No details</div>
    </body>
</html>

