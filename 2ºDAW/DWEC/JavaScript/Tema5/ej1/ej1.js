let abrirVentana = () => {
  window.open("", "nueva Ventana", "height=300, width=600");
  let nuevaVentana = window.open("", "nueva Ventana", "height=300, width=600");
  nuevaVentana.location.href = "nuevaVentana.html";
};

let valor = Number(window.opener.document.getElementById("valor").value);

let moverIzquierda = () => {
  window.moveBy(-valor, 0);
};
let moverDerecha = () => {
  window.moveBy(valor, 0);
};
