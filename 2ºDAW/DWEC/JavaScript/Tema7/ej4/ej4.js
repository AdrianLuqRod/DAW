document.querySelectorAll(".pregunta").forEach((pregunta) => {

    pregunta.addEventListener("click", function () {
        let pregunta = this;
        pregunta.style.color = "red";

        document.querySelectorAll(".respuesta").forEach((respuesta) => {
            respuesta.style.visibility = "hidden";
            respuesta.style.position = "absolute";
        });

        let respuesta = this.nextElementSibling;
        respuesta.style.visibility = "visible";
        respuesta.style.position = "relative";
        respuesta.textContent = respuesta.textContent.startsWith("R ") ? respuesta.textContent : "R " + respuesta.textContent;

    });
});