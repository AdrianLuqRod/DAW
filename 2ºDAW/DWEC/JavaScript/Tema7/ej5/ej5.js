const images = document.querySelectorAll("#diapositivas img");
let indexActual = 0;

function mostrarImagen(index) {
    images.forEach((img, i) => {
        img.style.display = i === index ? "block" : "none";
    });
}

document.querySelectorAll("a")[0].addEventListener("click", () => {
    indexActual = (indexActual - 1 + images.length) % images.length;
    mostrarImagen(indexActual);
});

document.querySelectorAll("a")[1].addEventListener("click", () => {
    indexActual = (indexActual + 1) % images.length;
    mostrarImagen(indexActual);
});

mostrarImagen(indexActual);