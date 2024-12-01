const botonComienzo = document.getElementById("boton-inicio");
let dificultad;

botonComienzo.addEventListener("click", () => {
    const dificultadSeleccionada = document.getElementById("dificultad").value;
    dificultad = dificultadSeleccionada === "1" ? "facil" : dificultadSeleccionada === "2" ? "normal" : "dificil";
    console.log(dificultad);

    // Guardamos el valor de dificultad en localStorage para poder acceder a él en juego.js
    localStorage.setItem("dificultad", dificultad);

});

function mostrarInfo() {
    info.style.display = "block";
}
function ocultarInfo() {
    info.style.display = "none";
}
