let generarNumeros = () => {
    let numero = Math.floor(Math.random() * 9) + 1;
    let numero2 = Math.floor(Math.random() * 9) + 1;

    document.querySelectorAll(".num").forEach((elemento) => {
        if (elemento.id === "num1") {
            elemento.innerHTML = numero;
        } else {
            elemento.innerHTML = numero2;
        }
    }
    );
}

let compararNumeros = () => {
    let numero1 = parseInt(document.getElementById("num1").innerHTML);
    let numero2 = parseInt(document.getElementById("num2").innerHTML);

    if (isNaN(numero1) || isNaN(numero2)) {

        return;
    } else {
        let numMayor = numero1 > numero2 ? numero1 : numero2;
        document.querySelectorAll(".num").forEach((elemento) => {
            elemento.innerHTML = elemento.innerHTML === numMayor.toString() ? "" : elemento.innerHTML;
        });
        let resultado = document.querySelector(".resul");
        resultado.innerHTML = numMayor.toString();
    }
}