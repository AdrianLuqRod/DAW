document.addEventListener("keydown", function (event) {
  let output = `Tecla pulsada: ${event.key}`;
  if (event.key === "Alt" || event.key === "Shift" || event.key === "Control") {
    output = "Tecla pulsada:";
  }
  if (event.altKey) {
    output += " + Alt";
  }
  if (event.shiftKey) {
    output += " + Shift";
  }
  if (event.ctrlKey) {
    output += " + Control";
  }
  document.getElementById("output").innerText = output;
});
