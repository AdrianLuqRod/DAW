let lista = new Array();

let sumarElemento = () => {
  let elemento = document.getElementById("input").value;
  lista.push(elemento);
  mostrarElementos();
};

let borrarVacios = () => {
  lista = lista.filter((elemento) => elemento.trim() !== "");
  mostrarElementos();
};

let clonarUltimo = () => {
  let ultimo = lista[lista.length - 1];
  lista.push(ultimo);
  mostrarElementos();
};
let mostrarElementos = () => {
  let span = document.getElementById("output");
  span.textContent = lista.join(", ");
};
