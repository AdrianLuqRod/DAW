function ocultaMuestraTexto() {
  alert("Hola mundo");
}

let nodeDiv = document.getElementById("text-div");
let actualClass = nodeDiv?.className;
if (nodeDiv !== null) {
  if (actualClass === "ocultarTexto") {
    nodeDiv.className = "mostrarTexto";
  } else {
    nodeDiv.className = "ocultarTexto";
  }
}
