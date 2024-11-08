let lanzarDados = () => {
    let dado1 = Math.floor(Math.random() * 6) + 1;
    let dado2 = Math.floor(Math.random() * 6) + 1;

    return dado1 + dado2;
}

let mostrarEstadistica = (arr) => {
    let resultadosDiv = document.getElementById("resultado");
    let conteoResultados = Array(13).fill(0);

    arr.forEach(resul => {
        conteoResultados[resul]++;
    });

    for (let i = 2; i <= 12; i++) {
        resultadosDiv.innerHTML += `El número ${i} ha salido ${conteoResultados[i]} veces<br>`;

    }
}

let calcularLanzamientos = () => {
    let resultados = [];
    for (let i = 0; i < 10; i++) {
        resultados.push(lanzarDados());
    }
    mostrarEstadistica(resultados);
}