const caja = document.getElementById("caja");

document.body.addEventListener("mousedown", function () {
    caja.style.backgroundColor = "#FFFF00";
});

document.body.addEventListener("keydown", function () {
    caja.style.backgroundColor = "#CCE6FF";
});

document.body.addEventListener("mousemove", function () {
    caja.style.backgroundColor = "#FFFFFF";
});