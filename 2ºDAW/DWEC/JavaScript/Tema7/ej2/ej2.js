let mostrarDesc = (num) => {
  let descripciones = document.getElementsByClassName("descripcion");
  if (descripciones[num - 1].style.visibility === "visible") {
    descripciones[num - 1].style.visibility = "hidden";
  } else {
    descripciones[num - 1].style.visibility = "visible";
  }
};
