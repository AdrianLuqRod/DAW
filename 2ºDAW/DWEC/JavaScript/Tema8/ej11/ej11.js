function mostrarPrompt(inputId) {
  var userInput = prompt("Por favor, introduce la información:");
  if (userInput !== null) {
    document.getElementById(inputId).value = userInput;
  }
}
