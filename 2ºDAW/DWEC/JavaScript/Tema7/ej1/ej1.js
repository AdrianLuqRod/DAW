document.getElementById("aplicar").addEventListener("click", () => {
  const tipoElemento = document.getElementById("elemento").value;
  const color = document.getElementById("color-input").value;
  const fontSize = document.getElementById("tamanyo-input").value + "px";
  const visibilidad = document.getElementById("visibilidad-select").value;
  const align = document.getElementById("align-select").value;

  const elementos = document.querySelectorAll(tipoElemento);

  elementos.forEach((element) => {
    element.style.color = color;
    element.style.fontSize = fontSize;
    element.style.visibility = visibilidad;
    element.style.textAlign = align;
  });
});
