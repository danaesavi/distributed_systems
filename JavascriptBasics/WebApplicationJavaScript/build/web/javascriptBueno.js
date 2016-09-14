/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function cambiarTexto(elementId){
    var element = document.getElementById(elementId);
    element.innerHTML = "0";
}
            
function cambiarTexto2(elementId){
    var element = document.getElementById(elementId);
    element.innerHTML = "123";
}

function changeImage() {
    element=document.getElementById('myimage')
    if (element.src.match("down")) {
        element.src="images/fucks.gif";
    } else {
        element.src="images/steve.gif";
    }
}

function myFunction(input1, mensajeId) {
    var y=document.getElementById(mensajeId);
    y.innerHTML="";
    try {
        var x=document.getElementById(input1).value;
        alert(x);
        if(x=="") throw "empty";
        if(isNaN(x)) throw "not a number";
        if(x>10) throw "too high";
        if(x<5) throw "too low";
    } catch(err) {
        y.innerHTML="Error: " + err + ".";
    }
}