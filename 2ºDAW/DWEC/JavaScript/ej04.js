function lanzarDados() {
    let valor1 = parseInt(document.getElementById("valor1").value) || 0;
    let valor2 = parseInt(document.getElementById("valor2").value) || 0;
    let numLanzamientos = valor1 + valor2;

    if (numLanzamientos <= 0) {
        alert("Introduce números válidos");
        return;
    }

    let resultados = [];
    let sumaTotal = 0;

    for (let i = 0; i < numLanzamientos; i++) {
        let dado1 = Math.floor(Math.random() * 6) + 1;
        let dado2 = Math.floor(Math.random() * 6) + 1;
        let suma = dado1 + dado2;
        resultados.push(suma);
        sumaTotal += suma;
    }

    mostrarResultados(resultados);
}

function mostrarResultados(resultados) {
    let resultadosDiv = document.getElementById("resultados");
    let conteoResultados = Array(13).fill(0);

    resultados.forEach((resultado) => {
        conteoResultados[resultado]++;
    });

    for (let i = 2; i <= 12; i++) {
        resultadosDiv.innerHTML += `<p>El resultado ${i} ha salido: ${conteoResultados[i]} veces</p>`;
    }
}