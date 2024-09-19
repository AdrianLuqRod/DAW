function validaNombre(){
    let nombre = prompt("Dime tu nombre");
    if(nombre.length<3 || nombre===""){
        return "invalid";
    }else{
        return nombre;
    }
}

console.log(validaNombre());