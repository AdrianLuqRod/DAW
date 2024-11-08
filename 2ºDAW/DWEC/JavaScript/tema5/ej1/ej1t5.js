let nuevaVentana = () => {
    window.open("", "ventana", "width=600,height=300");
    let ventana = window.open("", "ventana", "width=600,height=300");
    ventana.location.href = "nuevaVentana.html";
}


let valor = Number(window.opener.document.getElementById("valor").value);
let moverIzquierda = () => {
    window.moveBy(-valor, 0);
}

let moverDerecha = () => {
    window.moveBy(valor, 0);
}