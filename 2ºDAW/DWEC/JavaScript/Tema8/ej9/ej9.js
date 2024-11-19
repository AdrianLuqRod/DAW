function actualizarDimensiones() {
  const width = window.innerWidth;
  const height = window.innerHeight;
  document.getElementById(
    "dimensions"
  ).textContent = `Ancho: ${width}px, Alto: ${height}px`;
}

window.addEventListener("resize", actualizarDimensiones);

actualizarDimensiones();
