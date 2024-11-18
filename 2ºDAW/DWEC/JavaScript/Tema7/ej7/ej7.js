document.addEventListener("DOMContentLoaded", function () {
    let filas = prompt("Introduce el número de filas:");
    let columnas = prompt("Introduce el número de columnas:");

    let tabla = document.createElement("table");
    tabla.style.border = "1px solid black";
    tabla.style.borderCollapse = "collapse";

    for (let i = 0; i < filas; i++) {
        let tr = document.createElement("tr");
        for (let j = 0; j < columnas; j++) {
            let td = document.createElement("td");
            td.style.border = "1px solid black";
            td.style.padding = "5px";
            td.textContent = prompt(
                `Introduce el valor para la celda (${i + 1}, ${j + 1}):`
            );
            tr.appendChild(td);
        }
        tabla.appendChild(tr);
    }

    document.body.appendChild(tabla);

    let botonAgregarFila = document.createElement("button");
    botonAgregarFila.textContent = "Agregar Fila";
    botonAgregarFila.addEventListener("click", function () {
        let tr = document.createElement("tr");
        for (let j = 0; j < columnas; j++) {
            let td = document.createElement("td");
            td.style.border = "1px solid black";
            td.style.padding = "5px";
            td.textContent = prompt(
                `Introduce el valor para la nueva fila celda (${tabla.rows.length + 1}, ${j + 1}):`
            );
            tr.appendChild(td);
        }
        tabla.appendChild(tr);
    });
    document.body.appendChild(botonAgregarFila);

    let botonEliminarFila = document.createElement("button");
    botonEliminarFila.textContent = "Eliminar Fila";
    botonEliminarFila.addEventListener("click", function () {
        let numeroFila = prompt("Introduce el número de fila a eliminar:");
        if (numeroFila > 0 && numeroFila <= tabla.rows.length) {
            tabla.deleteRow(numeroFila - 1);
        } else {
            alert("Número de fila inválido");
        }
    });
    document.body.appendChild(botonEliminarFila);
});
