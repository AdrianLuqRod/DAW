function redirigir() {
  window.location.href = "https://www.google.es";
}

function limpiarFormulario() {
  document.querySelector("form").reset();
}

function actualizarAccionFormulario() {
  const formulario = document.querySelector("form");
  const asignatura = document.getElementById("asignatura").value;

  switch (asignatura) {
    case "matematicas":
      formulario.action = "mailto:profesor_matematicas@example.com";
      break;
    case "ciencias":
      formulario.action = "mailto:profesor_ciencias@example.com";
      break;
    case "historia":
      formulario.action = "mailto:profesor_historia@example.com";
      break;
    default:
      formulario.action = "mailto:aluqrod494@g.educaand.es";
  }
}

function actualizarDiaPreferente() {
  const checkboxes = document.querySelectorAll('input[name="dias"]:checked');
  const diaPreferente = checkboxes[checkboxes.length - 1]?.value || "";
  document.getElementById("dia_preferente").value = diaPreferente;
}

function cambiarColorFondo() {
  const form = document.querySelector("form");
  const colorSeleccionado = document.querySelector(
    'input[name="color"]:checked'
  ).value;
  form.style.backgroundColor = colorSeleccionado;
}
