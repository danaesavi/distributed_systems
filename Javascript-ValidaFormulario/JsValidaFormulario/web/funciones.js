
function validateFormB(){
    var x=document.forms["myFormB"]["fname"].value;
    if (x==null || x=="") {
        alert("First name must be filled out");
        return false;
    }
    return true;
}

function validateName(obj){
    var x = obj.value;
    var y = x.charAt(x.length-1);
    if(isNaN(y)){
        x=x.toUpperCase();
        obj.value=x;
    } else{
        obj.value=x.substring(0,x.length-1);
    }

}

function validateSurname(obj){
    var x = obj.value;
    var y = x.charAt(x.length-1);
    if(isNaN(y)){
        x=x.toUpperCase();
        obj.value=x;
    } else{
        obj.value=x.substring(0,x.length-1);
    }

}

function validateForm(){
    var x=document.forms["myForm"]["nombre"].value;
    if (x==null || x=="") {
        alert("El campo de nombre es requerido");
        return false;
    }
    x=document.forms["myForm"]["apellido"].value;
    if (x==null || x=="") {
        alert("El campo de apellido es requerido");
        return false;
    }
    x=document.forms["myForm"]["correo"].value;
    if (x==null || x=="") {
        alert("El campo de correo es requerido");
        return false;
    }
    x=document.forms["myForm"]["correo"].value;
    if (x.indexOf("@")==-1 ||
            x.lastIndexOf(".")<x.indexOf("@")) {
        alert("Direccion de correo invalida");
        return false;
    }
    x=document.forms["myForm"]["gen"];
    if (!x[0].checked && !x[1].checked) {
        alert("El campo de genero es requerido");
        return false;
    }
    x=document.forms["myForm"]["region"].value;
    if (x==null || x=="") {
        alert("El campo de region es requerido");
        return false;
    }
    x=document.forms["myForm"]["vacunado"].value;
    if (!x.checked) {
        alert("El campo de VACUNADO es requerido");
        return false;
    }
    x=document.forms["myForm"]["comentarios"].value;
    if (x==null || x=="") {
        alert("El campo de comentarios es requerido");
        return false;
    }
    return true;
    
}
