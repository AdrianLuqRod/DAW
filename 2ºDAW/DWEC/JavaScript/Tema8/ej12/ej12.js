function mostrarPrompt(inputId) {
  var userInput = prompt("Por favor, introduce la información:");
  if (userInput !== null) {
    document.getElementById(inputId).value = userInput;
  }
}

function limpiarFormulario() {
  document.querySelector("form").reset();
  alert("Comenzamos de nuevo");
}
